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

		/*
		Iterator<XWPFParagraph> paragraphIterator = docx.getParagraphsIterator();

		while(paragraphIterator.hasNext()){
			XWPFParagraph para = paragraphIterator.next();

			System.out.println(para.getText() + " - " + para.getStyle());

		}*/

		List<XWPFParagraph> paragraphList = docx.getParagraphs();

		SimpleRequirementMMFactory factory = SimpleRequirementMMFactory.eINSTANCE;

		int currentIndex = 0;
		//method(paragraphList, currentIndex);

		/*
		Product p = factory.createProduct();
		p.getOwnedRequirementLevel().add(e);
		 */

		int controller = 0;
		Product product = factory.createProduct();
		boolean reqFlag = false;
		Requirement r = null;
		
		for(XWPFParagraph para : paragraphList){

			controller++;
			String t = para.getText();

			if( para != null){

				if(controller == 1){

					RequirementLevel rl = factory.createRequirementLevel();
					rl.setName(para.getText());

					product.getOwnedRequirementLevel().add(rl);

					requirementLevelStack.push(rl);
					requirementLevelMap.put(rl, headingMap.get(para.getStyle()));					
				}				

				else {

					// bu en alt seviyede yer alan req informations ise
					if(para.getStyle() == null){
						
						if(reqFlag == false){
							
							r = factory.createRequirement();
							r.setName(requirementLevelStack.peek().getName());
							r.setId(reqId++);
							
							reqFlag = true;
						}															

						String[] values = para.getText().split(":");

						if(values[0].equals(REQUIREMENT_NAME)){

							r.setName(values[1]);
						}

						if(values[0].equals(REQUIREMENT_DESCRIPTION)){

							r.setDescription(values[1]);
						}

						if(values[0].equals(REQUIREMENT_DEPENDENCY_TO)){

							// daha tanýmlanmamýþ olan bir req olmasý durumu ?
							// r.setDependencyTo();
						}

						if(values[0].equals(REQUIREMENT_PRIORITY)){

							// priority nasýl baðlýcaz ?
						}


					}else{
						
						if(reqFlag == true){
							
							RequirementLevel poppedReqLvl = requirementLevelStack.pop();
							poppedReqLvl.getOwnedRequirement().add(r);
							requirementLevelStack.peek().getOwnedLevel().add(poppedReqLvl);
							
							reqFlag = false;

						}
						
						
						// yeni okuduðum satýrýn levelý 
						// stackteki en üstte bulunan leveldan seviye olarak daha düþükse
						// map deðeri büyükse

						if(headingMap.get(para.getStyle()) > requirementLevelMap.get(requirementLevelStack.peek())){
							
							RequirementLevel newReqLvl = factory.createRequirementLevel();
							newReqLvl.setName(para.getText());

							product.getOwnedRequirementLevel().add(newReqLvl);

							requirementLevelStack.push(newReqLvl);
							requirementLevelMap.put(newReqLvl, headingMap.get(para.getStyle()));
						}

						// eþit olma durumu

						else if(controller > 1 && (headingMap.get(para.getStyle()) == requirementLevelMap.get(requirementLevelStack.peek()))){
							
							RequirementLevel poppedReqLvl = requirementLevelStack.pop();

							if(!requirementLevelStack.isEmpty()){

								requirementLevelStack.peek().getOwnedLevel().add(poppedReqLvl);
							}else{

								product.getOwnedRequirementLevel().add(poppedReqLvl);
							}

							RequirementLevel newReqLvl = factory.createRequirementLevel();
							newReqLvl.setName(para.getText());

							product.getOwnedRequirementLevel().add(newReqLvl);

							requirementLevelStack.push(newReqLvl);
							requirementLevelMap.put(newReqLvl, headingMap.get(para.getStyle()));
						}

						// geri dönüþ
						// elimizdeki level daha büyükse stackteki req. levellarý(eþit olan da dahil)
						// geri dönük bir þekilde bir üstlerindeki req level listelerine ekliyoruz.

						else{											

							while(headingMap.get(para.getStyle()) <= requirementLevelMap.get(requirementLevelStack.peek())){
								
								RequirementLevel poppedReqLvl = requirementLevelStack.pop();
								requirementLevelStack.peek().getOwnedLevel().add(poppedReqLvl);

							}

							// elimizdeki yeni req lvl ý oluþturuyoruz.
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
