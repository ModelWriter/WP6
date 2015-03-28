package com.modelwriter.architecture.textconnectors.docx.genparser.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;

import DocModel.Document;

import com.modelwriter.architecture.textconnectors.docx.genparser.Doc2ParseModel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

public class DocumentModelTest extends TestCase{

	// Headers with heading styles(headings) must be organized hierarchically.
	private static String REQ2 = "test cases/REQ-2";

	// Fully bold headers which have not heading styles must be handled
	// as a child of last heading.
	private static String REQ4 = "test cases/REQ-4";

	// Listed paragraphs must be handled as a child of last styled paragraph.
	private static String REQ5 = "test cases/REQ-5";

	// Tabbed hierarchy for only not styled paragraphs must be handled.
	private static String REQ6 = "test cases/REQ-6";

	// Tabbed hierarchy for paragraphs included both styled and not styled must be handled.
	private static String REQ7 = "test cases/REQ-7";

	// If bold, every paragraphs until a new fully bold, styled with headings or 
	// bold key-value paragraph become.
	private static String REQ8 = "test cases/REQ-8";

	// If not bold, paragraph must be moved under previous styled paragraph.
	private static String REQ9 = "test cases/REQ-9";

	// Fully bold paragraphs, bold key-value paragraphs and paragraphs with heading styles 
	//must be considered as hierarchic levels.
	private static String REQ11 = "test cases/REQ-11";

	public Resource parsedResource;

	protected void setUp() {

	}

	public void testREQ2() throws IOException{
		
		try {
			parsedResource = Doc2ParseModel.parse(REQ2);
			Resource modelResource = getResourceFromModel("model/" + REQ2);
			
			assertEquals(modelResource, parsedResource);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testREQ4(){

	}
	public void testREQ5(){

	}
	public void testREQ6(){

	}
	public void testREQ7(){

	}
	public void testREQ8(){

	}
	public void testREQ9(){

	}
	public void testREQ11(){

	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	/**
	 * Returns the EMF model instance .xmi file
	 * 
	 * @return Resource
	 */
	@SuppressWarnings("unchecked")
	private static Resource getResourceFromModel(String modelPath) {
		// TODO Auto-generated method stub

		// Register the XMI resource factory for the .graph extension
		URI uri = URI.createURI(modelPath);

		ResourceSet resourceSet = new ResourceSetImpl();

		// register UML
		Map packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(DocModel.DocModelPackage.eNS_URI, 
				DocModel.DocModelPackage.eINSTANCE);

		// Register XML resource as UMLResource.Factory.Instance
		Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());

		return (Resource)resourceSet.createResource(uri);
	}

}
