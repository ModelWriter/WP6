package eu.modelwriter.architecture.textconnectors.docx.usecase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import useCase.Actor;
import useCase.EndEvent;
import useCase.FlowElement;
import useCase.FlowNode;
import useCase.Interest;
import useCase.SequenceFlow;
import useCase.Specification;
import useCase.StartEvent;
import useCase.UseCase;
import useCase.Process;

public class BusinessProcessModel2UseCaseConverter {

	private static Resource resource;
	private static XWPFDocument document;

	public static void main(String[] args) throws IOException, XmlException {

		// Get template document which includes heading styles
		/*
		 * URL url = new URL("platform:/plugin/eu.modelwriter.architecture.textconnectors.docx.usecase/templates/template.docx");   
		XWPFDocument template = new XWPFDocument(url.openConnection().getInputStream());

		 */
		XWPFDocument template = new XWPFDocument(new FileInputStream("templates/template.docx"));

		document = new XWPFDocument(); 

		XWPFStyles newStyles = document.createStyles();
		newStyles.setStyles(template.getStyle());

		FileOutputStream out = null;
		
		try {

			URI uri = URI.createURI("model/TestDocument.xmi");

			ResourceSet resourceSet = new ResourceSetImpl();

			// register UML
			Map packageRegistry = resourceSet.getPackageRegistry();
			packageRegistry.put(useCase.UseCasePackage.eNS_URI, useCase.UseCasePackage.eINSTANCE);

			// Register XML resource as UMLResource.Factory.Instance
			Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
			extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());

			// Get the resource
			resource = (Resource)resourceSet.createResource(uri);
			// try to load the file into resource
			resource.load(null);

			// Write content of resource file
			//resource.save(System.out, Collections.EMPTY_MAP);

			Iterator<EObject> resourceObjects = resource.getAllContents();	

			while (resourceObjects.hasNext()) {
				Object o = resourceObjects.next();

				//System.out.println(o.toString());

				// Traversing Product's children
				if(o instanceof Specification){

					for(UseCase useCase : ((Specification)o).getOwnedUseCase()){

						writeUseCase(useCase);
					}
				}



			}

			document.write(out);
			out.close();
			
			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Docx file created successfully!");
			
		}// end of try
		catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}


		// return document

	}

	private static void writeUseCase(UseCase useCase) {

		writeHeader(useCase.getName());
		writePrimaryActor(useCase.getPrimaryActor());
		writeStakeholdersAndInterests(useCase.getOwnedStakeholderInterest());
		//writePreconditions();
		//writePostconditions();
		writeMainFlow(useCase);
		writeExtensions(useCase);

	}

	private static void writeExtensions(UseCase useCase) {

		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();

		paragraph.setAlignment(ParagraphAlignment.LEFT);

		run.setText("Extensions (or Alternative Flows):");
		run.setBold(true);
		run.addBreak();

		SequenceFlow sequenceFlow = null;
		int tabCount = 0;

		for(Process process : useCase.getAlternativeFlows()){

			for(FlowElement flowElement : process.getOwnedFlowElements()){

				if(flowElement instanceof SequenceFlow){

					sequenceFlow = (SequenceFlow)flowElement;

					FlowNode sourceNode = (FlowNode)sequenceFlow.getSource();
					FlowNode targetNode = (FlowNode)sequenceFlow.getTarget();

					paragraph = document.createParagraph();
					run = paragraph.createRun();

					if(!(sourceNode instanceof StartEvent)){

						if(sourceNode.getDocumentation().get(0).getTextFormat() != null){

							String[] v = sourceNode.getDocumentation().get(0).getTextFormat()
									.split(":");
							tabCount = Integer.parseInt(v[1]);
						}

						String s = "";

						for(int i = 0; i < tabCount; i++){

							s += '\t';
						}

						run = paragraph.createRun();
						run.setText(s + sourceNode.getLabel() + ". " + 
								sourceNode.getDocumentation().get(0));

					}

					if(!(targetNode instanceof EndEvent)){

						if(sourceNode.getDocumentation().get(0).getTextFormat() != null){

							String[] v = sourceNode.getDocumentation().get(0).getTextFormat()
									.split(":");
							tabCount = Integer.parseInt(v[1]);
						}

						String s = "";

						for(int i = 0; i < tabCount; i++){

							s += '\t';
							// TODO CTR ctr = run.getCTR();
							// ctr.addNewTab();
						}

						run = paragraph.createRun();
						run.setText(s + targetNode.getLabel() + ". " + 
								targetNode.getDocumentation().get(0));

					}

				}

			}
		}
	}

	private static void writeMainFlow(UseCase useCase) {

		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();

		paragraph.setAlignment(ParagraphAlignment.LEFT);

		run.setText("Main Success Scenario (or Basic Flow):");
		run.setBold(true);
		run.addBreak();

		SequenceFlow sequenceFlow = null;

		for(FlowElement flowElement : useCase.getMainFlow().getOwnedFlowElements()){

			if(flowElement instanceof SequenceFlow){

				sequenceFlow = (SequenceFlow)flowElement;

				FlowNode sourceNode = (FlowNode)sequenceFlow.getSource();
				FlowNode targetNode = (FlowNode)sequenceFlow.getTarget();

				paragraph = document.createParagraph();
				run = paragraph.createRun();

				if(!(sourceNode instanceof StartEvent)){

					run = paragraph.createRun();
					run.setText(sourceNode.getLabel() + ". " + sourceNode.getDocumentation().get(0));

				}

				if(!(targetNode instanceof EndEvent)){

					run = paragraph.createRun();
					run.setText(targetNode.getLabel() + ". " + targetNode.getDocumentation().get(0));

				}

			}

		}

	}

	private static void writeStakeholdersAndInterests(
			EList<Interest> ownedStakeholderInterest) {

		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();

		paragraph.setAlignment(ParagraphAlignment.LEFT);
		run.setText("Stakeholders and Interests:");
		run.setBold(true);
		run.addBreak();

		for(Interest interest : ownedStakeholderInterest){

			paragraph = document.createParagraph();
			run = paragraph.createRun();

			run.setText(interest.getActor().getName() + " : " + 
					interest.getDocumentation().get(0).getText());

			run.addBreak();
		}

	}

	private static void writePrimaryActor(Actor primaryActor) {

		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();

		paragraph.setAlignment(ParagraphAlignment.LEFT);

		run.setText("Primary Actor : ");
		run.setFontFamily("Calibri");
		run.setBold(true);

		XWPFRun run2 = paragraph.createRun();
		run2.setText(primaryActor.getName());
		run2.addBreak();
	}

	private static void writeHeader(String name) {

		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();

		paragraph.setStyle("Heading1");
		paragraph.setAlignment(ParagraphAlignment.LEFT);

		run.setText(name);
		run.setFontFamily("Calibri Light");
		run.setStrike(true);
		run.addBreak();

	}



}
