package com.modelwriter.architecture.textconnectors.docx.genparser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.poi.ss.formula.functions.Replace;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import DocModel.DocModelFactory;
import DocModel.Document;
import DocModel.Node;
import DocModel.Paragraph;

public class Doc2ParseModel {

	private final static String filename = "testdata/tabbed doc.docx"; 

	private final static String output = "model/ParseModel.xmi";

	public static DocModelFactory factory;

	public static Iterator<XWPFParagraph> paraIter; 

	private static XWPFParagraph paragraph; 

	// Maps styles and their levels
	private static Map<String,Integer> headingMap;

	private static Document documentObject;

	// Stores levels 
	private static Stack<Paragraph> paragraphStack;

	// Maps requirement level object and their levels
	private static Map<Paragraph,Integer> paragraphLevelMap;

	// Stores tabbed paragraph levels
	private static Stack<Paragraph> plainTextStack;

	private static Map<Paragraph,Integer> plaintTextLevelMap;
	
	public static boolean isPlainText;

	private static boolean paragraphNotHandled = false;

	public static void main(String[] args) throws IOException {

		paragraphStack = new Stack<Paragraph>();
		paragraphLevelMap = new HashMap<Paragraph,Integer>();

		plainTextStack = new Stack<Paragraph>();
		plaintTextLevelMap = new HashMap<Paragraph,Integer>();
		
		headingMap = new HashMap<String,Integer>();

		initializeHeadingMap();

		factory = DocModelFactory.eINSTANCE;
		File file = null; 
		FileInputStream fis = null; 
		XWPFDocument document = null;
		List<XWPFParagraph> paraList = null; 
		file = new File(filename); 
		fis = new FileInputStream(file); 
		document = new XWPFDocument(fis); 
		paraList = document.getParagraphs(); 
		paraIter = paraList.iterator(); 
		documentObject = factory.createDocument();

		BigInteger numID = null; 
		int numberingID = -1;
		String paragraphText = "";
		String paragraphStyle = "";
		int id = 0;
		boolean firstParagraphFlag = true;

		while(paraIter.hasNext()) {

			if(paragraphNotHandled == false){
				paragraph = paraIter.next();
			}

			paragraphNotHandled = false;

			paragraphText = paragraph.getText();
			paragraphStyle = paragraph.getStyle();
			numID = paragraph.getNumID();

			if(paragraphStyle == null){
				paragraphStyle = "null";
			}
			// heading level
			if(headingMap.get(paragraphStyle) > 0 && headingMap.get(paragraphStyle) < 11){

				Paragraph p = factory.createParagraph();
				p.setId(++id);
				p.setName(paragraphText);
				//p.setParagraph(paragraph);
				p.setRawText(paragraphText);
				// headingten sonra normal paragraflar gelirse o headinge ekle

				if(firstParagraphFlag && headingMap.get(paragraphStyle) == 1){					

					paragraphStack.push(p);
					paragraphLevelMap.put(p, headingMap.get(paragraphStyle));
					firstParagraphFlag = false;
				}

				// If the current paragraph's level is lower than the peek's level 
				else if(headingMap.get(paragraphStyle) > paragraphLevelMap.get(paragraphStack.peek())){

					paragraphStack.push(p);
					paragraphLevelMap.put(p, headingMap.get(paragraphStyle));
				}

				// If the current paragraph's level is equal to the peek's level 
				else if(headingMap.get(paragraphStyle) == paragraphLevelMap.get(paragraphStack.peek())){

					Paragraph poppedParagraph = paragraphStack.pop();

					if(!paragraphStack.isEmpty()){

						paragraphStack.peek().getOwnedNode().add(poppedParagraph);

					}else{

						documentObject.getOwnedParagraph().add(poppedParagraph);
					}

					if(headingMap.get(paragraphStyle) == 1){
						documentObject.getOwnedParagraph().add(p);
					}

					paragraphStack.push(p);
					paragraphLevelMap.put(p, headingMap.get(paragraphStyle));

				}

				// If the current paragraph's level is higher than the peek's level 
				// then pop the requirement level and add it to peek's level is higher than
				// current paragraph's level
				else{											

					while(headingMap.get(paragraphStyle) <= paragraphLevelMap.get(paragraphStack.peek())){

						Paragraph poppedParagraph = paragraphStack.pop();

						// Higher level paragraph must be added to product
						if(paragraphLevelMap.get(poppedParagraph) == 1){

							documentObject.getOwnedParagraph().add(poppedParagraph);
							break;

						}else{

							paragraphStack.peek().getOwnedNode().add(poppedParagraph);		
						}


					}

					if(headingMap.get(paragraphStyle) == 1){
						documentObject.getOwnedParagraph().add(p);
					}

					paragraphStack.push(p);
					paragraphLevelMap.put(p, headingMap.get(paragraphStyle));

				}

			}// end if <heading level>
			// normal paragraph
			else if(headingMap.get(paragraphStyle) == 99){

				String[] values = paragraph.getText().split(":");
				isPlainText = true;

				if(!paragraphText.equals("")){

					for(XWPFRun run : paragraph.getRuns()){

						if(run.getText(0) == null){
							continue;
						}
						String runText = run.getText(0).trim();
						String key = values[0] + ":";

						// key-value 
						if(key.contains(runText) && run.isBold()){

							//key-value
							if(paragraph.getText().contains(":")){

								Paragraph keyValueParagraph = factory.createParagraph();
								keyValueParagraph.setId(++id);
								keyValueParagraph.setName(values[0]);

								// paragraph has numberede list
								// ex. Main Success Scenario
								if(values.length < 2 || (values.length > 1 && 
										values[1].replaceAll(" ", "").equals(""))){
									handleNumberedList(keyValueParagraph);

								}
								// ex. Primary Actor: Student.
								else{
									keyValueParagraph.setRawText(values[1]);
								}

								paragraphStack.peek().getOwnedNode().add(keyValueParagraph);		

							}
							//header without heading style ex. EM-HLR-....
							else{

								Paragraph headerParagraph = factory.createParagraph();
								headerParagraph.setId(++id);
								headerParagraph.setName(paragraphText);
								headerParagraph.setRawText(paragraphText);
								paragraphStyle = "SubHeader";
								paragraphStack.peek().getOwnedNode().add(headerParagraph);
								//headerParagraph.setParentNode(paragraphStack.peek());

								// bundan sonra aralýksýz gelen paragraflarý buna ekle

							}

							isPlainText = false;
							break;

						} 
						// key-value not bold
						// TODO handle numbered list
						// ex. Name: Caise Failure.
						else if(paragraph.getText().contains(":")){

							isPlainText = false;

							Paragraph keyValueParagraph = factory.createParagraph();
							keyValueParagraph.setId(++id);
							keyValueParagraph.setName(values[0]);

							if(values.length < 2 || (values.length > 1 && 
									values[1].replaceAll(" ", "").equals(""))){

								handleNumberedList(keyValueParagraph);

							}
							// ex. Primary Actor: Student.
							else{

								keyValueParagraph.setRawText(values[1]);
							}

							//determine heading level or subheader
							int lastParagraphIndex = paragraphStack.peek().getOwnedNode().size() - 1;
							Paragraph lastParagraph = paragraphStack.peek().getOwnedNode().get(lastParagraphIndex);
							//XWPFParagraph p = lastParagraph.getParagraph();
							String name = lastParagraph.getName();
							// if this pair belongs to named paragraph
							if(!name.equals("")){

								lastParagraph.getOwnedNode().add(keyValueParagraph);
							}else{

								paragraphStack.peek().getOwnedNode().add(keyValueParagraph);		

							}

						}
					}
				}

				// plain text
				if(isPlainText && !paragraphText.equals("")){

					Paragraph p = factory.createParagraph();
					p.setId(++id);
					p.setRawText(paragraphText);
					int tabCount = paragraphText.length() - paragraphText.replaceAll("\t", "").length();
					
					// Boþsa ekle
					if(plainTextStack.isEmpty()){
						
						plainTextStack.push(p);
						plaintTextLevelMap.put(p, tabCount);
							
					}
					// yýðýtýn tepesindekinden daha içerdeyse
					else if(plaintTextLevelMap.get(plainTextStack.peek()) < tabCount){
						
						plainTextStack.push(p);
						plaintTextLevelMap.put(p, tabCount);
					}
					// eþitse
					else if(plaintTextLevelMap.get(plainTextStack.peek()) == tabCount){
						
						Paragraph poppedParagraph = plainTextStack.pop();

						if(!plainTextStack.isEmpty()){

							plainTextStack.peek().getOwnedNode().add(poppedParagraph);

						}else{

							if(!isThereNamedParagraph()){
								paragraphStack.peek().getOwnedNode().add(p);

							}else{
								
								int lastParagraphIndex = paragraphStack.peek().getOwnedNode().size() - 1;
								paragraphStack.peek().getOwnedNode().get(lastParagraphIndex).getOwnedNode().add(p);
							}
						}

						plainTextStack.push(p);
						plaintTextLevelMap.put(p, tabCount);
					}
					// daha az indented para geldiyse
					else{
						
						while(tabCount <= plaintTextLevelMap.get(plainTextStack.peek())){

							Paragraph poppedParagraph = plainTextStack.pop();

							// Higher level paragraph must be added to product
							if(plaintTextLevelMap.get(poppedParagraph) == 0){

								if(!isThereNamedParagraph()){
									paragraphStack.peek().getOwnedNode().add(poppedParagraph);

								}else{
									
									int lastParagraphIndex = paragraphStack.peek().getOwnedNode().size() - 1;
									paragraphStack.peek().getOwnedNode().get(lastParagraphIndex).getOwnedNode().add(p);
								}
								break;

							}else{

								plainTextStack.peek().getOwnedNode().add(poppedParagraph);		
							}


						}

						if(!plainTextStack.isEmpty()){

							plainTextStack.push(p);
							plaintTextLevelMap.put(p, tabCount);
						}
					}
					// TODO empty stack
					/*
					 * 
					if(!isThereNamedParagraph()){
						paragraphStack.peek().getOwnedNode().add(p);

					}else{
						
						int lastParagraphIndex = paragraphStack.peek().getOwnedNode().size() - 1;
						paragraphStack.peek().getOwnedNode().get(lastParagraphIndex).getOwnedNode().add(p);
					}

					 */
				}
			}

			//isNumbered() or isListed();
			// TODO nested lists
			else if(numID != null){

				while(numID != null){

					Paragraph numberedParagraph = factory.createParagraph();
					numberedParagraph.setId(++id);
					numberedParagraph.setRawText(paragraph.getText());

					if(isThereNamedParagraph()){

						int lastNamedParagraphIndex = paragraphStack.peek().getOwnedNode().size() - 1;
						paragraphStack.peek().getOwnedNode().get(lastNamedParagraphIndex)
						.getOwnedNode().add(numberedParagraph);

					}else{

						paragraphStack.peek().getOwnedNode().add(numberedParagraph);	
					}

					if(paraIter.hasNext()){
						paragraph = paraIter.next();
						numID = paragraph.getNumID();
						paragraphNotHandled = true;
					}else{
						break;
					}
				}


			}

		}

		// At last, stack must be emptied
		emptyStack();

		// Create and save the model instance to xmi file
		createXMIFile(documentObject);

	}


	private static boolean isThereNamedParagraph() {
		
		if(paragraphStack.peek().getOwnedNode().size() > 0){
			int lastParagraphIndex = paragraphStack.peek().getOwnedNode().size() - 1;
			Paragraph lastParagraph = paragraphStack.peek().getOwnedNode().get(lastParagraphIndex);
			
			if(lastParagraph.getName() != null){
				return true;
			}
			
		}else{
			return false;
		}
		
		return false;
	}


	private static void handleNumberedList(Paragraph keyValueParagraph) {

		BigInteger numID = null;
		paragraph = paraIter.next();
		numID = paragraph.getNumID();

		/** Activity must start with a positive integer and continue with dot('.')
		 * and there might be a whitespace(only one)
		 */
		String mainFlowActivityPattern = "(([1-9][0-9]*[.][ ]?)[A-Z].*)";
		Pattern pattern = Pattern.compile(mainFlowActivityPattern);
		Matcher matcher = pattern.matcher(paragraph.getText());


		if(matcher.matches()){

			// Iterating through the numbers			
			while(matcher.matches() && paragraph != null){

				String[] v = paragraph.getText().split("\\.");

				Paragraph p = factory.createParagraph();
				p.setName(v[0]);
				p.setRawText(v[1]);
				keyValueParagraph.getOwnedNode().add(p);
				//p.setParentNode(keyValueParagraph);

				if(paraIter.hasNext()){
					paragraph = paraIter.next();
					matcher = pattern.matcher(paragraph.getText());
				}else{
					break;
				}


			}// end while

		}

		// ordered list
		else{
			int activityCounter = 0;

			while(numID != null){	
				activityCounter++;
				Paragraph p = factory.createParagraph();
				p.setName("" + activityCounter);
				p.setRawText(paragraph.getText());
				keyValueParagraph.getOwnedNode().add(p);
				//p.setParentNode(keyValueParagraph);

				paragraph = paraIter.next();
				numID = paragraph.getNumID();
			}
		}

		paragraphNotHandled = true;

	}


	/**
	 * Requirement Levels left at stack must be removed and 
	 * added corresponding levels
	 */
	private static void emptyStack() {

		while(!paragraphStack.isEmpty()){

			Paragraph poppedParagraph = paragraphStack.pop();	

			if(paragraphLevelMap.get(poppedParagraph) == 1){

				documentObject.getOwnedParagraph().add(poppedParagraph);
			}else{

				paragraphStack.peek().getOwnedNode().add(poppedParagraph);			
			}


		}
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
		Resource resource = resourceSet.createResource(URI.createURI(output));


		// Add Product to contents list of the resource 

		resource.getContents().add(document);

		try{

			// Save the resource
			//resource.save(System.out, Collections.EMPTY_MAP); 
			resource.save(null);

			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Model created successfully!");

		}catch (IOException e) {

			e.printStackTrace();
		}
	}

	private static void initializeHeadingMap() {

		headingMap.put("null",99);
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
		headingMap.put("SubHeader", 11);
		headingMap.put("ListParagraph", 12);


	}

}
