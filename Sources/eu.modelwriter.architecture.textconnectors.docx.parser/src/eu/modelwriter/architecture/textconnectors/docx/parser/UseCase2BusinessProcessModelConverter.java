/**
 * 
 * todo
 * 
 * numberingleri req gibi düþün, peek a ekle, stacke ekleme
 */

package eu.modelwriter.architecture.textconnectors.docx.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.poi.extractor.ExtractorFactory;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFNum;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFStyle;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;

import ParseTree.Document;
import ParseTree.Documentation;
import ParseTree.NamedNode;
import ParseTree.Node;
import ParseTree.ParseTreeFactory;


public class UseCase2BusinessProcessModelConverter {

	/*
	 * private final static String PRIMARY_ACTOR = "primary actor";
	private final static String STAKEHOLDERS_AND_INTERESTS = "stakeholders and interests";
	private final static String PRECONDITION = "precondition";
	private final static String SUCCESS_GUARANTEE = "success guarantee";
	private final static String POSTCONDITION = "postcondition";
	private final static String MAIN_SUCCESS_SCENARIO = "sain success scenario";
	private final static String BASIC_FLOW = "basic flow";
	private final static String EXTENSIONS = "extensions";
	private final static String ALTERNATIVE_FLOWS = "alternative flows";



	 */
	private static Document useCaseDocument;

	private final static String filename = "C:/Users/2/Desktop/UseCaseDocumentation2.docx"; 

	// Maps styles and their levels
	private static Map<String,Integer> headingMap;

	// Stores levels 
	private static Stack<NamedNode> nodeHiararchyStack;

	public static ParseTreeFactory factory;

	public static Iterator<XWPFParagraph> paraIter; 

	/** the paragraph style. */
	public static CTPPr pPr;

	/** for tab */
	//CTR ctrRun = CTR.Factory.newInstance();

	/** the paragraph run style. */
	public static CTRPr rPr;

	/*
	 * create tab
	 * CTR ctr = run.getCTR();
	   ctr.addNewTab();
	   run.setText("abcd");
	 */
	//tab space &#09;
	public static List<Documentation> documentationList;
	public static boolean keyValue;
	public static Node previousNode = null;
	public static Node currentNode = null;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub


		nodeHiararchyStack = new Stack<NamedNode>();
		headingMap = new HashMap<String,Integer>();

		headingMap.put("NoSpacing", 0);
		headingMap.put("Heading1", 1);
		headingMap.put("Heading2", 2);
		headingMap.put("Heading3", 3);
		headingMap.put("Heading4", 4);
		headingMap.put("Heading5", 5);
		headingMap.put("Heading6", 6);
		headingMap.put("Heading7", 7);
		headingMap.put("Heading8", 8);
		headingMap.put("Heading9", 9);

		File file = null; 
		FileInputStream fis = null; 
		XWPFDocument document = null; 
		XWPFNumbering numbering = null; 
		XWPFParagraph paragraph = null; 
		XWPFNum num = null; 
		List<XWPFParagraph> paraList = null; 
		BigInteger numID = null; 
		int numberingID = -1;

		file = new File(filename); 
		fis = new FileInputStream(file); 
		document = new XWPFDocument(fis); 

		numbering = document.getNumbering();

		factory = ParseTreeFactory.eINSTANCE;
		useCaseDocument = factory.createDocument();
		useCaseDocument.setName("UseCaseSpecification");


		paraList = document.getParagraphs(); 
		paraIter = paraList.iterator(); 
		String loweredText = "";
		int firstParagraphCounter = 0;
		boolean flag = false;

		String pattern = "(EM-HLR-F-REQ-[0-9]{3})";
		Pattern p = Pattern.compile(pattern);
		documentationList = new ArrayList<Documentation>();



		while(paraIter.hasNext()) {

			paragraph = paraIter.next(); 
			numID = paragraph.getNumID();
			loweredText = paragraph.getText().toLowerCase();

			String style = paragraph.getStyle();
			firstParagraphCounter++;
			//extractParagraphStyle(paragraph);

			if( paragraph != null && paragraph.getText().trim() != ""){

				// first paragraph element
				if(firstParagraphCounter == 1){

					NamedNode nn = factory.createNamedNode();
					currentNode = nn;
					nn.setName(paragraph.getText());
					Documentation documentation = factory.createDocumentation();
					documentation.setText(paragraph.getText());
					nn.getDocumentation().add(documentation);

					nodeHiararchyStack.push(nn);
					swapNodes(nn);

					useCaseDocument.getOwnedNode().add(nn);

				}else {

					// If the paragraph is a plain text, key-value pair or requirement
					if(paragraph.getStyle() == null) {

						Matcher matcher = p.matcher(paragraph.getText());

						// Requirement
						if(matcher.matches()){

							if(!nodeHiararchyStack.isEmpty()){

								concatDocumentations();
							}
							createNamedNode(paragraph);
						}

						//Plain text or key-value pair
						else{

							//paragraph is in the list
							if(numID != null){

								// List inside list
								if(numID.intValue() != numberingID) { 
									num = numbering.getNum(numID); 
									numberingID = numID.intValue(); 
									//System.out.println("Getting details of the new numbering system " + numberingID); 
									//System.out.println("It's abstract numID is " + num.getCTNum().getAbstractNumId().getVal().intValue()); 

								} 
								else { 

									System.out.println("Iterating through the numbers."); 
								} 


							}else{

								String[] values = paragraph.getText().split(":");


								for(XWPFRun run : paragraph.getRuns()){

									String runText = run.getText(0);
									String key = values[0] + ":";

									// key-value 
									if(key.equals(runText) && run.isBold()){

										keyValue = true;
										createKeyValue(paragraph);
										break;
									}else{
										keyValue = false;
									}


								}

								// plain text
								if(!isKeyValue()){

									Documentation d = factory.createDocumentation();
									d.setText(paragraph.getText());
									documentationList.add(d);
								}
							}


						}

					}

					// headings
					else{

					}
				}


			}



		} 

		fis.close(); 
		fis = null; 
		createXMIFile(useCaseDocument);

	} 


	private static void swapNodes(NamedNode nn) {
		// TODO Auto-generated method stub
		previousNode = currentNode;
		currentNode = nn;
	}


	private static boolean isKeyValue() {
		// TODO Auto-generated method stub
		return keyValue;
	}


	private static void concatDocumentations() {

		//Definition definition = requirementLevelStack.peek().getOwnedDefinition().remove(0);
		Documentation documentation = documentationList.remove(0);
		String text = ((Documentation)documentation).getText();

		while(!documentationList.isEmpty()){

			documentation = documentationList.remove(0);
			text += ((Documentation)documentation).getText();
			if(!text.equals("")){
				text += "\n";
			}

		}

		Documentation newDocumentation = factory.createDocumentation();
		newDocumentation.setText(text);
		nodeHiararchyStack.peek().getDocumentation().add(newDocumentation);
		//textCounter = 0;

	}

	// Creates Node and its documentation
	private static void createNamedNode(XWPFParagraph paragraph) {
		// TODO Auto-generated method stub

		String text = paragraph.getText();
		NamedNode nn = factory.createNamedNode();
		Documentation d = factory.createDocumentation();

		nn.setName(text);
		d.setText(text);
		nn.setParentNode(currentNode);
		swapNodes(nn);
		nn.getDocumentation().add(d);
		nodeHiararchyStack.peek().getOwnedNode().add(nn);

	}


	private static void createKeyValue(XWPFParagraph paragraph) {
		// TODO Auto-generated method stub

		String text = paragraph.getText();
		String[] values = text.split(":");
		NamedNode nn = factory.createNamedNode();
		Documentation d = factory.createDocumentation();
		Documentation nd = factory.createDocumentation();
		Node n = factory.createNode();
		XWPFParagraph p = null;

		nn.setName(values[0]);
		d.setText(values[0]);
		//d.setTextFormat(value);
		if(values.length == 1){

			p = paraIter.next();
			nd.setText(p.getText());
			n.getDocumentation().add(nd);

		}else{

			if(paragraph.getNumID() != null){

				n.setPrevNode(nn);
			}

			nd = factory.createDocumentation();
			nd.setText(values[1]);
			n.getDocumentation().add(nd);
		}
		
		nn.setParentNode(currentNode);
		swapNodes(nn);
		nn.getOwnedNode().add(n);
		nn.getDocumentation().add(d);
		nodeHiararchyStack.peek().getOwnedNode().add(nn);
	}


	/**
	 * This extracts a paragraph style.
	 * 
	 * @param paragraph
	 *            the concerned paragraph.
	 */
	private static void extractParagraphStyle(XWPFParagraph paragraph) {
		// handle this paragraph runs contents
		pPr = paragraph.getCTP().getPPr();
		for (XWPFRun run : paragraph.getRuns()) {
			rPr = run.getCTR().getRPr();
			break;
		}
	}

	// unused
	private static void createHighLevelNamedNode(XWPFParagraph paragraph) {
		// TODO Auto-generated method stub

		String text = paragraph.getText();
		String[] values = text.split(":");
		NamedNode nn = factory.createNamedNode();
		Documentation d = factory.createDocumentation();
		Documentation nd = factory.createDocumentation();
		Node n = factory.createNode();
		XWPFParagraph p = null;

		nn.setName(values[0]);
		d.setText(values[0]);
		//d.setTextFormat(value);
		if(values[1].equals("")){

			p = paraIter.next();
			nd.setText(p.getText());
			n.getDocumentation().add(nd);

		}else{

			nd = factory.createDocumentation();
			nd.setText(values[1]);
			n.getDocumentation().add(nd);
		}

		nn.getOwnedNode().add(n);
		nn.getDocumentation().add(d);
		useCaseDocument.getOwnedNode().add(nn);

	}

	/**
	 * Saves the model instance and writes it to xmi file
	 * 
	 * @param product
	 */
	private static void createXMIFile(Document document) {

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML Factory implementation using xmi extension
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"xmi", new  XMLResourceFactoryImpl());


		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createURI("model/TestDocument.xmi"));


		// Add Product to contents list of the resource 

		resource.getContents().add(document);

		try{

			// Save the resource
			resource.save(System.out, Collections.EMPTY_MAP); 
			//resource.save(null);
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Model created successfully!");

		}catch (IOException e) {

			e.printStackTrace();
		}



	}


}
