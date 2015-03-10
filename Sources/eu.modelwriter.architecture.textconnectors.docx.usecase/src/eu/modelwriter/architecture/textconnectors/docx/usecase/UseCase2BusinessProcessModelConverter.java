package eu.modelwriter.architecture.textconnectors.docx.usecase;

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
import javax.swing.text.Document;

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

import useCase.Activity;
import useCase.Actor;
import useCase.EndEvent;
import useCase.Interest;
import useCase.Process;
import useCase.SequenceFlow;
import useCase.Specification;
import useCase.StartEvent;
import useCase.UseCase;
import useCase.UseCaseFactory;
import useCase.Documentation;


public class UseCase2BusinessProcessModelConverter {


	private final static String PRIMARY_ACTOR = "Primary Actor";
	private final static String STAKEHOLDERS_AND_INTERESTS = "Stakeholders and Interests";
	private final static String PRECONDITION = "Preconditions";
	private final static String SUCCESS_GUARANTEE = "Success Guarantee";
	private final static String POSTCONDITION = "Postcondition";
	private final static String MAIN_SUCCESS_SCENARIO = "Main Success Scenario (or Basic Flow)";
	private final static String BASIC_FLOW = "Basic Flow";
	private final static String EXTENSIONS = "Extensions";
	private final static String ALTERNATIVE_FLOWS = "Alternative Flows";


	private final static String filename = "C:/Users/2/Desktop/UseCaseDocumentation2.docx"; 

	public static UseCaseFactory factory;

	private static Specification specification;

	public static Iterator<XWPFParagraph> paraIter; 

	public static List<Documentation> documentationList;

	public static boolean keyValue;

	// Maps styles and their levels
	private static Map<String,Integer> headingMap;

	private static XWPFNumbering numbering = null; 

	private static XWPFParagraph handledParagraph = null;

	private static boolean paragraphNotHandled = false;

	private static XWPFParagraph paragraph; 

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		headingMap = new HashMap<String,Integer>();

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
		headingMap.put("ListParagraph", 99);

		File file = null; 
		FileInputStream fis = null; 
		XWPFDocument document = null; 

		XWPFNum num = null; 
		List<XWPFParagraph> paraList = null; 
		BigInteger numID = null; 
		int numberingID = -1;

		file = new File(filename); 
		fis = new FileInputStream(file); 
		document = new XWPFDocument(fis); 

		numbering = document.getNumbering();

		factory = UseCaseFactory.eINSTANCE;
		specification = factory.createSpecification();
		specification.setName("UseCaseSpecification");


		paraList = document.getParagraphs(); 
		paraIter = paraList.iterator(); 
		String loweredText = "";
		int firstParagraphCounter = 0;
		boolean flag = false;


		documentationList = new ArrayList<Documentation>();
		UseCase useCase = null;

		while(paraIter.hasNext()) {


			if(paragraphNotHandled == false){
				paragraph = paraIter.next();
			}

			paragraphNotHandled = false;

			numID = paragraph.getNumID();
			loweredText = paragraph.getText().toLowerCase();

			String style = paragraph.getStyle();
			if(style == null){
				style = "null";
			}
			//firstParagraphCounter++;
			//extractParagraphStyle(paragraph);

			if( paragraph != null && paragraph.getText().trim() != ""){

				// Header of the UseCase
				if(headingMap.get(style) == 1){

					// add last usecase to specification
					if(useCase != null){

						specification.getOwnedUseCase().add(useCase);

					}
					//create new usecase
					useCase = factory.createUseCase();
					useCase.setName(paragraph.getText());

				}else {

					// If the paragraph is a plain text or key-value pair 
					if(paragraph.getStyle() == null) {

						//Plain text or key-value pair
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
								if(key.contains(runText) && run.isBold()){

									keyValue = true;
									createKeyValue(useCase);
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

					// if paragraph.getStyle() == null
					else{

					}
				}


			}



		} 

		specification.getOwnedUseCase().add(useCase);
		fis.close(); 
		fis = null; 
		createXMIFile();

	} 

	/*
	 * 
	private static void swapNodes(NamedNode nn) {
		// TODO Auto-generated method stub
		previousNode = currentNode;
		currentNode = nn;
	}
	 */


	private static boolean isKeyValue() {
		return keyValue;
	}


	/*
	 * private static void concatDocumentations() {

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

	 */

	// Creates Node and its documentation
	private static void createNamedNode(XWPFParagraph paragraph) {
		// TODO Auto-generated method stub



	}


	private static void createKeyValue(UseCase useCase) {
		// TODO Auto-generated method stub

		String[] values = paragraph.getText().split(":");
		BigInteger numID = null;
		int numberingID = -1;
		XWPFNum num = null;

		switch(values[0]){

		case PRIMARY_ACTOR : 
			Actor actor = factory.createActor();
			actor.setName(values[1]);
			useCase.setPrimaryActor(actor);
			specification.getOwnedActor().add(actor);
			break;

		case STAKEHOLDERS_AND_INTERESTS : 

			if(values.length < 2 || (values.length > 1 && values[1].trim() == "")){

				paragraph = paraIter.next();
				numID = paragraph.getNumID();

				if(numID != null){

					// Iterating through the numbers
					while(numID != null && paraIter.hasNext()){

						String[] v = paragraph.getText().split(":");

						Interest interest = factory.createInterest();

						Actor interestActor = factory.createActor();
						interestActor.setName(v[0]);

						Documentation doc = factory.createDocumentation();
						doc.setText(v[1]);

						interest.setActor(interestActor);
						interest.getDocumentation().add(doc);

						useCase.getOwnedStakeholderInterest().add(interest);

						specification.getOwnedActor().add(interestActor);

						paragraphNotHandled = true;
						paragraph = paraIter.next();
						numID = paragraph.getNumID();
					}// end while
				}//end if

			}// end if
			break;

		case PRECONDITION :

			if(values.length < 2 || (values.length > 1 && values[1].trim() == "")){

				paragraph = paraIter.next();
				numID = paragraph.getNumID();

				if(numID != null){

					// Iterating through the numbers
					while(numID != null && paraIter.hasNext()){

						StartEvent startEvent = factory.createStartEvent();
						Documentation doc = factory.createDocumentation();
						doc.setText(paragraph.getText());

						Process process = factory.createProcess();
						process.setDefinedAt(useCase);
						startEvent.getDocumentation().add(doc);
						process.getOwnedFlowElements().add(startEvent);

						specification.getOwnedProcess().add(process);

						paragraphNotHandled = true;
						paragraph = paraIter.next();
						numID = paragraph.getNumID();

					}// end while
				}//end if

			}
			break;

		case SUCCESS_GUARANTEE :

			if(values.length < 2 || (values.length > 1 && values[1].trim() == "")){

				paragraph = paraIter.next();
				numID = paragraph.getNumID();

				if(numID != null){

					// Iterating through the numbers
					while(numID != null && paraIter.hasNext()){

						EndEvent endEvent = factory.createEndEvent();
						Documentation doc = factory.createDocumentation();
						doc.setText(paragraph.getText());

						Process process = factory.createProcess();
						process.setDefinedAt(useCase);
						endEvent.getDocumentation().add(doc);
						process.getOwnedFlowElements().add(endEvent);

						specification.getOwnedProcess().add(process);

						paragraphNotHandled = true;
						paragraph = paraIter.next();
						numID = paragraph.getNumID();

					}// end while
				}//end if

			}
			break;

		case MAIN_SUCCESS_SCENARIO :

			paragraph = paraIter.next();
			numID = paragraph.getNumID();
			Activity previousActivity = null;

			/** Activity must start with a positive integer and continue with dot('.')
			 * and there might be a whitespace(only one)
			 */
			String mainFlowActivityPattern = "(([1-9][0-9]*[.][ ]?)[A-Z].*)";
			Pattern p = Pattern.compile(mainFlowActivityPattern);
			Matcher matcher = p.matcher(paragraph.getText());

			int activityCounter = 0;

			Process process = factory.createProcess();
			process.setDefinedAt(useCase);


			if(matcher.matches()){

				// Iterating through the numbers

				StartEvent startEvent = factory.createStartEvent();
				process.getOwnedFlowElements().add(startEvent);

				while(matcher.matches() && paragraph != null){

					activityCounter++;
					// to-do
					SequenceFlow sequenceFlow = factory.createSequenceFlow();
					Activity activity = factory.createActivity();

					String[] v = paragraph.getText().split("\\.");

					activity.setLabel(v[0]);

					Documentation doc = factory.createDocumentation();
					doc.setText(v[1]);
					activity.getDocumentation().add(doc);

					if(activityCounter == 1){

						sequenceFlow.setSource(startEvent);
					}else{
						sequenceFlow.setSource(previousActivity);
					}

					sequenceFlow.setTarget(activity);

					previousActivity = activity;

					process.getOwnedFlowElements().add(sequenceFlow);
					process.getOwnedFlowElements().add(activity);							

					if(paraIter.hasNext()){
						paragraph = paraIter.next();
						matcher = p.matcher(paragraph.getText());
						numID = paragraph.getNumID();
					}else{
						break;
					}
						

				}// end while

				EndEvent endEvent = factory.createEndEvent();
				SequenceFlow sequenceFlow = factory.createSequenceFlow();
				sequenceFlow.setSource(previousActivity);
				sequenceFlow.setTarget(endEvent);
				
				process.getOwnedFlowElements().add(previousActivity);
				process.getOwnedFlowElements().add(endEvent);
				process.getOwnedFlowElements().add(sequenceFlow);

				useCase.setMainFlow(process);
				specification.getOwnedProcess().add(process);

				paragraphNotHandled = true;
			}

			break;

		default: 

			paragraphNotHandled = false; 
			break;


		}

	}


	/**
	 * This extracts a paragraph style.
	 * 
	 * @param paragraph
	 *            the concerned paragraph.
	 */
	/*
	 * private static void extractParagraphStyle(XWPFParagraph paragraph) {
		// handle this paragraph runs contents
		pPr = paragraph.getCTP().getPPr();
		for (XWPFRun run : paragraph.getRuns()) {
			rPr = run.getCTR().getRPr();
			break;
		}
	}
	 */

	// unused
	private static void createHighLevelNamedNode(XWPFParagraph paragraph) {
		// TODO Auto-generated method stub



	}

	/**
	 * Saves the model instance and writes it to xmi file
	 * 
	 * @param product
	 */
	private static void createXMIFile() {

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML Factory implementation using xmi extension
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"xmi", new  XMLResourceFactoryImpl());


		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createURI("model/TestDocument.xmi"));


		// Add Product to contents list of the resource 

		resource.getContents().add(specification);

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


}
