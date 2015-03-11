package eu.modelwriter.architecture.textconnectors.docx.usecase;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.apache.xmlbeans.XmlException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


public class BusinessProcessModel2UseCaseConverter {

	private static Resource resource;
	private static XWPFDocument document;

	public static void main(String[] args) throws IOException, XmlException {

		// Get template document which includes heading styles
		/*
		 * URL url = new URL("platform:/plugin/eu.modelwriter.architecture.textconnectors.docx.usecase/templates/template.docx");   
		XWPFDocument template = new XWPFDocument(url.openConnection().getInputStream());

		 */
		document = new XWPFDocument(); 

		//XWPFStyles newStyles = document.createStyles();
		//newStyles.setStyles(template.getStyle());
		
		try {

			URI uri = URI.createURI("model/TestDocument.xmi");
			
			ResourceSet resourceSet = new ResourceSetImpl();

			// register UML
			Map packageRegistry = resourceSet.getPackageRegistry();
			packageRegistry.put(useCase.UseCasePackage.eNS_URI, 
					useCase.UseCasePackage.eINSTANCE);

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

				System.out.println(o.toString());

			}


		}// end of try
		catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}

		//document.write(out);
		//out.close();

		/*
		 * final JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame,
			    "File written successfully!");

		 * 
		 */

		
	}

}
