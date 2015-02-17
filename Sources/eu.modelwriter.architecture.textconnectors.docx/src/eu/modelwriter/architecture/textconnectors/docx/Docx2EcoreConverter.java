package eu.modelwriter.architecture.textconnectors.docx;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import SimpleRequirementMM.Product;
import SimpleRequirementMM.Requirement;
import SimpleRequirementMM.RequirementLevel;
import SimpleRequirementMM.SimpleRequirementMMFactory;

public class Docx2EcoreConverter {

	private static Resource resource;
	private static int reqId = 0;
	private final static String REQUIREMENT_NAME = "Name ";
	private final static String REQUIREMENT_DESCRIPTION = "Description ";
	private final static String REQUIREMENT_REFINE = "Refine ";
	private final static String REQUIREMENT_DEPENDENCY_TO = "Dependency to ";
	private final static String REQUIREMENT_PRIORITY = "Priority ";

	private static Map<Requirement,String> requirementsMap;
	private static Stack<RequirementLevel> requirementLevelStack;
	private static Map<RequirementLevel,Integer> requirementLevelMap;
	private static Map<String,Integer> headingMap;

	public static void main(String[] args)throws Exception 
	{
		requirementsMap = new HashMap<Requirement,String>();
		requirementLevelStack = new Stack<RequirementLevel>();

		requirementLevelMap = new HashMap<RequirementLevel, Integer>();
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

		XWPFDocument docx = new XWPFDocument(new FileInputStream("C:/Users/2/Desktop/SampleRequirementDocument.docx"));

		XWPFWordExtractor we = new XWPFWordExtractor(docx);

		XWPFStyles styles = docx.getStyles();

		List<XWPFParagraph> paragraphList = docx.getParagraphs();

		SimpleRequirementMMFactory factory = SimpleRequirementMMFactory.eINSTANCE;

		//int currentIndex = 0;
		int controller = 0;
		Product product = factory.createProduct();
		boolean reqFlag = false;
		Requirement r = null;
		
		for(XWPFParagraph para : paragraphList){

			controller++;
			
			//String paragraphText = para.getText();

			if( para != null){

				// first paragraph
				if(controller == 1){
					
					// Create a new RequirementLevel
					RequirementLevel rl = factory.createRequirementLevel();
					
					// Set requirements' name as paragraphs' name
					rl.setName(para.getText());
					
					// para.getStyle().equals("Heading1")
					// Only biggest headers(Heading 1) should be added Product
					if(headingMap.get(para.getStyle()) == 1){
						product.getOwnedRequirementLevel().add(rl);
					}

					requirementLevelStack.push(rl);
					requirementLevelMap.put(rl, headingMap.get(para.getStyle()));					
				}				

				else {

					// If the paragraph is in the lowest level
					// This paragraph is about one of requirements' properties
					if(para.getStyle() == null){
						
						// If there is no object related the requirement
						if(reqFlag == false){
							
							r = factory.createRequirement();
							r.setName(requirementLevelStack.peek().getName());
							r.setId(reqId++);
							
							reqFlag = true;
						}															

						String[] values = para.getText().split(":");

						// Set requirements' name
						if(values[0].equals(REQUIREMENT_NAME)){

							r.setName(values[1]);
						}

						// Set requirements' description
						if(values[0].equals(REQUIREMENT_DESCRIPTION)){

							r.setDescription(values[1]);
						}

						// Set requirements' dependency
						if(values[0].equals(REQUIREMENT_DEPENDENCY_TO)){

							// daha tanýmlanmamýþ olan bir req olmasý durumu ?
							// r.setDependencyTo();
						}

						// Set requirements' priority
						if(values[0].equals(REQUIREMENT_PRIORITY)){

							// to do
						}


					}else{
						
						// this paragraph is about different level
						// then add requirement to corresponding level
						if(reqFlag == true){
							
							RequirementLevel poppedReqLvl = requirementLevelStack.pop();
							poppedReqLvl.getOwnedRequirement().add(r);
							requirementLevelStack.peek().getOwnedLevel().add(poppedReqLvl);
							
							reqFlag = false;

						}
						
						
						

						
						if(headingMap.get(para.getStyle()) > requirementLevelMap.get(requirementLevelStack.peek())){
							
							RequirementLevel newReqLvl = factory.createRequirementLevel();
							newReqLvl.setName(para.getText());

							if(headingMap.get(para.getStyle()) == 1){
								product.getOwnedRequirementLevel().add(newReqLvl);
							}

							requirementLevelStack.push(newReqLvl);
							requirementLevelMap.put(newReqLvl, headingMap.get(para.getStyle()));
						}

						

						else if(controller > 1 && (headingMap.get(para.getStyle()) == requirementLevelMap.get(requirementLevelStack.peek()))){
							
							RequirementLevel poppedReqLvl = requirementLevelStack.pop();

							if(!requirementLevelStack.isEmpty()){

								requirementLevelStack.peek().getOwnedLevel().add(poppedReqLvl);
							}else{

								product.getOwnedRequirementLevel().add(poppedReqLvl);
							}

							RequirementLevel newReqLvl = factory.createRequirementLevel();
							newReqLvl.setName(para.getText());

							if(headingMap.get(para.getStyle()) == 1){
								product.getOwnedRequirementLevel().add(newReqLvl);
							}

							requirementLevelStack.push(newReqLvl);
							requirementLevelMap.put(newReqLvl, headingMap.get(para.getStyle()));
						}

						
						else{											

							while(headingMap.get(para.getStyle()) <= requirementLevelMap.get(requirementLevelStack.peek())){
								
								RequirementLevel poppedReqLvl = requirementLevelStack.pop();
								
								if(requirementLevelMap.get(poppedReqLvl) == 1){
									
									product.getOwnedRequirementLevel().add(poppedReqLvl);
									break;
									
								}else{
									
									requirementLevelStack.peek().getOwnedLevel().add(poppedReqLvl);			
								}
								

							}

							
							RequirementLevel newReqLvl = factory.createRequirementLevel();
							newReqLvl.setName(para.getText());

							product.getOwnedRequirementLevel().add(newReqLvl);

							requirementLevelStack.push(newReqLvl);
							requirementLevelMap.put(newReqLvl, headingMap.get(para.getStyle()));

						}
					}

					

				}

			}

		}
		
		while(!requirementLevelStack.isEmpty()){
			
			RequirementLevel poppedReqLvl = requirementLevelStack.pop();	
			
			if(requirementLevelMap.get(poppedReqLvl) == 1){
				
				product.getOwnedRequirementLevel().add(poppedReqLvl);
			}else{
				
				requirementLevelStack.peek().getOwnedLevel().add(poppedReqLvl);			
			}
			
			
		}
			
		createXMIFile(product);


	}

	private static void createXMIFile(Product product) {
		// TODO Auto-generated method stub

				ResourceSet resourceSet = new ResourceSetImpl();
				/*
				 * Register XML Factory implementation using DEFAULT_EXTENSION
				 */
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
						"xmi", new  XMLResourceFactoryImpl());

				/*
				 * Create empty resource with the given URI
				 */
				Resource resource = resourceSet.createResource(URI.createURI("Model/SimpleRequirementMM.xmi"));

				/*
				 * Add bookStoreObject to contents list of the resource 
				 */
				resource.getContents().add(product);

				try{
					/*
					 * Save the resource
					 */
					resource.save(null);
				}catch (IOException e) {
					e.printStackTrace();
				}
	}


}
