package com.modelwriter.architecture.textconnectors.docx.genparser.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import com.modelwriter.architecture.textconnectors.docx.genparser.Doc2ParseModel;

public class ModelComparisonTest {

	public static ResourceSet resourceSet1; 

	public static ResourceSet resourceSet2;

	private static String REQ2 = "testdata/REQ-2.docx";

	private static String REQ4 = "testdata/REQ-4.docx";

	private static String REQ5 = "testdata/REQ-5.docx";

	private static String REQ6 = "testdata/REQ-6.docx";

	private static String REQ7 = "testdata/REQ-7.docx";

	private static String REQ8 = "testdata/REQ-8.docx";

	private static String REQ9 = "testdata/REQ-9.docx";

	private static String REQ11 = "testdata/REQ-11.docx";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		resourceSet1 = new ResourceSetImpl();
		resourceSet2 = new ResourceSetImpl();
	}
	
	//Headers with heading styles(headings) must be organized hierarchically.
	@Test
	public void testCompareREQ2(){

		// Load ready model
		String xmi = "testmodels/REQ-2.xmi";
		load(xmi ,resourceSet1);
		
		//parse and load
		load(REQ2);
		
		Comparison comparison = compare();
		EList<org.eclipse.emf.compare.Diff> differences = comparison.getDifferences();

		int counter = 0;
		for(org.eclipse.emf.compare.Diff d: differences)
		{
			if(!d.getKind().toString().equals("CHANGE")){
				System.err.println("d.getKind(): "+((org.eclipse.emf.compare.Diff) d).getKind());
				System.err.println("d.getMatch(): " + ((org.eclipse.emf.compare.Diff) d).getMatch());
				System.err.println("State: " + ((org.eclipse.emf.compare.Diff) d).getState());
				counter++;
			}
		}

		assertSame(Integer.valueOf(0), Integer.valueOf(counter));
	}
	
	// Fully bold headers which have not heading styles must be handled
	// as a child of last heading.
	@Test
	public void testCompareREQ4(){

		// Load ready model
		String xmi = "testmodels/REQ-4.xmi";
		load(xmi ,resourceSet1);
		
		//parse and load
		load(REQ4);
		
		Comparison comparison = compare();
		EList<org.eclipse.emf.compare.Diff> differences = comparison.getDifferences();

		int counter = 0;
		for(org.eclipse.emf.compare.Diff d: differences)
		{
			if(!d.getKind().toString().equals("CHANGE")){
				System.err.println("d.getKind(): "+((org.eclipse.emf.compare.Diff) d).getKind());
				System.err.println("d.getMatch(): " + ((org.eclipse.emf.compare.Diff) d).getMatch());
				System.err.println("State: " + ((org.eclipse.emf.compare.Diff) d).getState());
				counter++;
			}
		}

		assertSame(Integer.valueOf(0), Integer.valueOf(counter));
	}
	
	// Listed paragraphs must be handled as a child of last styled paragraph.
	@Test
	public void testCompareREQ5(){

		// Load ready model
		String xmi = "testmodels/REQ-5.xmi";
		load(xmi ,resourceSet1);
		
		//parse and load
		load(REQ5);
		
		Comparison comparison = compare();
		EList<org.eclipse.emf.compare.Diff> differences = comparison.getDifferences();

		int counter = 0;
		for(org.eclipse.emf.compare.Diff d: differences)
		{
			if(!d.getKind().toString().equals("CHANGE")){
				System.err.println("d.getKind(): "+((org.eclipse.emf.compare.Diff) d).getKind());
				System.err.println("d.getMatch(): " + ((org.eclipse.emf.compare.Diff) d).getMatch());
				System.err.println("State: " + ((org.eclipse.emf.compare.Diff) d).getState());
				counter++;
			}
		}

		assertSame(Integer.valueOf(0), Integer.valueOf(counter));
	}
	
	// Tabbed hierarchy for only not styled paragraphs must be handled.
	@Test
	public void testCompareREQ6(){

		// Load ready model
		String xmi = "testmodels/REQ-6.xmi";
		load(xmi ,resourceSet1);
		
		//parse and load
		load(REQ6);
		
		Comparison comparison = compare();
		EList<org.eclipse.emf.compare.Diff> differences = comparison.getDifferences();

		int counter = 0;
		for(org.eclipse.emf.compare.Diff d: differences)
		{
			if(!d.getKind().toString().equals("CHANGE")){
				System.err.println("d.getKind(): "+((org.eclipse.emf.compare.Diff) d).getKind());
				System.err.println("d.getMatch(): " + ((org.eclipse.emf.compare.Diff) d).getMatch());
				System.err.println("State: " + ((org.eclipse.emf.compare.Diff) d).getState());
				counter++;
			}
		}

		assertSame(Integer.valueOf(0), Integer.valueOf(counter));
	}
	
	// Tabbed hierarchy for paragraphs included both styled and 
	// not styled must be handled.
	@Test
	public void testCompareREQ7(){

		// Load ready model
		String xmi = "testmodels/REQ-7.xmi";
		load(xmi ,resourceSet1);
		
		//parse and load
		load(REQ7);
		
		Comparison comparison = compare();
		EList<org.eclipse.emf.compare.Diff> differences = comparison.getDifferences();

		int counter = 0;
		for(org.eclipse.emf.compare.Diff d: differences)
		{
			if(!d.getKind().toString().equals("CHANGE")){
				System.err.println("d.getKind(): "+((org.eclipse.emf.compare.Diff) d).getKind());
				System.err.println("d.getMatch(): " + ((org.eclipse.emf.compare.Diff) d).getMatch());
				System.err.println("State: " + ((org.eclipse.emf.compare.Diff) d).getState());
				counter++;
			}
		}

		assertSame(Integer.valueOf(0), Integer.valueOf(counter));
	}
	
	// If there is a bold key-value pair, every paragraphs until a new fully bold, 
	// styled with headings or bold key-value paragraph become.
	@Test
	public void testCompareREQ8(){

		// Load ready model
		String xmi = "testmodels/REQ-8.xmi";
		load(xmi ,resourceSet1);
		
		//parse and load
		load(REQ8);
		
		Comparison comparison = compare();
		EList<org.eclipse.emf.compare.Diff> differences = comparison.getDifferences();

		int counter = 0;
		for(org.eclipse.emf.compare.Diff d: differences)
		{
			if(!d.getKind().toString().equals("CHANGE")){
				System.err.println("d.getKind(): "+((org.eclipse.emf.compare.Diff) d).getKind());
				System.err.println("d.getMatch(): " + ((org.eclipse.emf.compare.Diff) d).getMatch());
				System.err.println("State: " + ((org.eclipse.emf.compare.Diff) d).getState());
				counter++;
			}
		}

		assertSame(Integer.valueOf(0), Integer.valueOf(counter));
	}
	
	// If there is a non-bold key-value pair, paragraph must be moved 
	// under previous styled paragraph.
	@Test
	public void testCompareREQ9(){

		// Load ready model
		String xmi = "testmodels/REQ-9.xmi";
		load(xmi ,resourceSet1);
		
		//parse and load
		load(REQ9);
		
		Comparison comparison = compare();
		EList<org.eclipse.emf.compare.Diff> differences = comparison.getDifferences();

		int counter = 0;
		for(org.eclipse.emf.compare.Diff d: differences)
		{
			if(!d.getKind().toString().equals("CHANGE")){
				System.err.println("d.getKind(): "+((org.eclipse.emf.compare.Diff) d).getKind());
				System.err.println("d.getMatch(): " + ((org.eclipse.emf.compare.Diff) d).getMatch());
				System.err.println("State: " + ((org.eclipse.emf.compare.Diff) d).getState());
				counter++;
			}
		}

		assertSame(Integer.valueOf(0), Integer.valueOf(counter));
	}
	
	// Fully bold paragraphs, bold key-value paragraphs and paragraphs with heading styles 
		//must be considered as hierarchic levels.
	@Test
	public void testCompareREQ11(){

		// Load ready model
		String xmi = "testmodels/REQ-11.xmi";
		load(xmi ,resourceSet1);
		
		//parse and load
		load(REQ11);
		
		Comparison comparison = compare();
		EList<org.eclipse.emf.compare.Diff> differences = comparison.getDifferences();

		int counter = 0;
		for(org.eclipse.emf.compare.Diff d: differences)
		{
			if(!d.getKind().toString().equals("CHANGE")){
				System.err.println("d.getKind(): "+((org.eclipse.emf.compare.Diff) d).getKind());
				System.err.println("d.getMatch(): " + ((org.eclipse.emf.compare.Diff) d).getMatch());
				System.err.println("State: " + ((org.eclipse.emf.compare.Diff) d).getState());
				counter++;
			}
		}

		assertSame(Integer.valueOf(0), Integer.valueOf(counter));
	}
	
	private void load(String req) {
		
		try {
			resourceSet2 = Doc2ParseModel.parse(req).getResourceSet();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Comparison compare()
	{

		//Creating the comparison scope
		IComparisonScope scope = EMFCompare.createDefaultScope(resourceSet1, resourceSet2);

		//Configuring the comparison
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		// Compare the two models
		return comparator.compare(scope);
	}

	public static void load(String absolutePath, ResourceSet resourceSet) {
		
			URI uri = URI.createFileURI(absolutePath);

			//resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

			// register UML
			Map packageRegistry = resourceSet.getPackageRegistry();
			packageRegistry.put(DocModel.DocModelPackage.eNS_URI, DocModel.DocModelPackage.eINSTANCE);

			// Register XML resource as UMLResource.Factory.Instance
			Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
			extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
			// Resource will be loaded within the resource set
			resourceSet.getResource(uri, true);
		
	}
}