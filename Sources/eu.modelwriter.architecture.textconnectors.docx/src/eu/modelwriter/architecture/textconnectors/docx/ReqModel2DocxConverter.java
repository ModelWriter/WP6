/**
 * Converts EMF requirement model instance to Requirement File(.docx)
 * 
 * @author furkan.tanriverdi@unitbilisim.com
 */

package eu.modelwriter.architecture.textconnectors.docx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.apache.xmlbeans.XmlException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SimpleRequirementMM.Definition;
import SimpleRequirementMM.Priority;
import SimpleRequirementMM.Product;
import SimpleRequirementMM.Requirement;
import SimpleRequirementMM.RequirementLevel;
import SimpleRequirementMM.TextArea;

public class ReqModel2DocxConverter {

	private static Resource resource;
	private static XWPFDocument document;
	
	// Requirement property keywords
		private final static String REQUIREMENT_NAME = "Name";
		private final static String REQUIREMENT_DESCRIPTION = "Description";
		private final static String REQUIREMENT_REFINE = "Refine";
		private final static String REQUIREMENT_DEPENDENCY_TO = "Dependency to ";
		//private final static String REQUIREMENT_PRIORITY = "Priority";
		//private final static String REQUIREMENT_PRIORITY_MANDATORY = "Mandatory";

	public static void main(String[] args) throws IOException, XmlException {
		// TODO Auto-generated method stub

		// Get template document which includes heading styles
		XWPFDocument template = new XWPFDocument(new FileInputStream("lib/template.docx"));
		
		document = new XWPFDocument(); 
		
		XWPFStyles newStyles = document.createStyles();
		newStyles.setStyles(template.getStyle());
		
		//Write the Document in file system(in this case in project folder)					
		FileOutputStream out = new FileOutputStream(new File("C:/Users/2/Desktop/RequirementModelDocument.docx"));

		try {

			// Get the resource
			resource = getResource();
			// try to load the file into resource
			resource.load(null);

			// Write content of resource file
			//resource.save(System.out, Collections.EMPTY_MAP);

			Iterator<EObject> resourceObjects = resource.getAllContents();	

			while (resourceObjects.hasNext()) {
				Object o = resourceObjects.next();

				// Traversing Product's children
				if(o instanceof Product){
					
					for(RequirementLevel requirementLevelHeading1 : ((Product)o).getOwnedRequirementLevel()){
						
						preOrder(requirementLevelHeading1,1);
					}
					
					break;
				}
							
			}
			
			
		}// end of try
		catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
		
		document.write(out);
		out.close();
		
		final JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame,
			    "File written successfully!");


	}

	/**
	 * Returns the EMF model instance .xmi file
	 * 
	 * @return Resource
	 */
	@SuppressWarnings("unchecked")
	private static Resource getResource() {
		// TODO Auto-generated method stub
		
		// Register the XMI resource factory for the .graph extension
		URI uri = URI.createURI("Model/SimpleRequirementMM.xmi");
		
		ResourceSet resourceSet = new ResourceSetImpl();

		// register UML
		Map packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(SimpleRequirementMM.SimpleRequirementMMPackage.eNS_URI, 
				SimpleRequirementMM.SimpleRequirementMMPackage.eINSTANCE);

		// Register XML resource as UMLResource.Factory.Instance
		Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
		
		return (Resource)resourceSet.createResource(uri);
	}

	/**
	 * Traverse non-binary requirement model tree
	 * 
	 * @param requirementLevel
	 * @param headingLevel
	 */
	public static void preOrder (RequirementLevel requirementLevel, int headingLevel)
	{
	 
	  if(requirementLevel.getOwnedLevel().isEmpty()){
		  
		  // Write Requirement Level to file
		  writeRequirementLevel(requirementLevel,headingLevel);
		  //System.out.println(requirementLevel.getName() + " " + headingLevel);

		  if(!requirementLevel.getOwnedDefinition().isEmpty()){
			  
			  for(Definition definition : requirementLevel.getOwnedDefinition()){
				  
				  // Write Requirement to file
				  writeRequirement(definition);
				  //System.out.println(requirement.getName());
			  }
		  }
		  
		  return;
	  }
	  
	  // Write Requirement Level to file
	  writeRequirementLevel(requirementLevel,headingLevel);
	  //System.out.println(requirementLevel.getName() + " " + headingLevel);
	  
	  headingLevel++;
	  
	  for(RequirementLevel subRequirementLevel : requirementLevel.getOwnedLevel()){
		  
		  preOrder(subRequirementLevel,headingLevel);
		 
	  }
	  
	}
	
	/**
	 * Writes Requirement object to file
	 * 
	 * @param requirement
	 */
	public static void writeRequirement(Definition definition){
		
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run=paragraph.createRun();
		
		if(definition instanceof Requirement){
			
			Requirement requirement = (Requirement)definition;
			
			run.setText(requirement.getId());
			run.setBold(true);
			run.setFontSize(11);
			run.setFontFamily("Calibri (Body)");
			run.addBreak();
			
			XWPFRun runName = paragraph.createRun();
			runName.setText(REQUIREMENT_NAME + " : " + requirement.getName());
			runName.addBreak();
			
			XWPFRun runDescription = paragraph.createRun();
			runDescription.setText(REQUIREMENT_DESCRIPTION + " : " + requirement.getDescription());
			runDescription.addBreak();
			
			XWPFRun runPriority = paragraph.createRun();
			if(requirement.getPriorityType() == Priority.MANDATORY){
				
				runDescription.setText(REQUIREMENT_DESCRIPTION + " : Mandatory");
				
			}else{
				
				runDescription.setText(REQUIREMENT_DESCRIPTION + " : Optional");
				
			}
			runPriority.addBreak();
			
			if(requirement.getDependencyTo() != null){
				
				XWPFRun runDependencyTo = paragraph.createRun();
				runDependencyTo.setText(REQUIREMENT_DEPENDENCY_TO + " : " + requirement.getDependencyTo().getId());
				runDependencyTo.addBreak();
			}
			
			if(requirement.getRefine() != null){
				
				XWPFRun runRefine = paragraph.createRun();
				runRefine.setText(REQUIREMENT_REFINE + " : " + requirement.getRefine().getId());
				runRefine.addBreak();
			}
		}else{
			
			TextArea textArea = (TextArea)definition;
			run.setText(textArea.getText());
			run.setBold(false);
			run.setFontSize(11);
			run.setFontFamily("Calibri (Body)");
			//run.addBreak();
		}
		
	}
	
	/**
	 * Writes RequirementLevel object to file
	 * 
	 * @param requirementLevel
	 * @param heading
	 */
	public static void writeRequirementLevel(RequirementLevel requirementLevel, int heading){
		
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run=paragraph.createRun();
		
		paragraph.setAlignment(ParagraphAlignment.LEFT);
		paragraph.setStyle("Heading" + heading);
		
		run.setText(requirementLevel.getName());
		run.setBold(true);
		run.setColor("000000");
		
		switch(heading){
		
		case 1 : run.setFontSize(18); break;
		case 2 : run.setFontSize(16); break;
		case 3 : run.setFontSize(14); break;
		default : run.setFontSize(12); break;
		}
		
		run.setFontFamily("Calibri Light (Headings)");
		//run.addBreak();
	}
		

}
