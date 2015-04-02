package com.modelwriter.architecture.textconnectors.docx.genparser.test;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelComparisonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@Test
	public void testCompare(){
		
		Comparison comparison = compare();
	    EList<org.eclipse.emf.compare.Diff> differences = comparison.getDifferences();

	    for(org.eclipse.emf.compare.Diff d: differences)
	    {
	        System.err.println("d.getKind(): "+((org.eclipse.emf.compare.Diff) d).getKind());
	        System.err.println("d.getMatch(): " + ((org.eclipse.emf.compare.Diff) d).getMatch());
	        System.err.println("State: " + ((org.eclipse.emf.compare.Diff) d).getState());
	    }

	    assertSame(Integer.valueOf(12), Integer.valueOf(differences.size()));
	}
	
	public Comparison compare()
	{
	    // Load the two input models
	    ResourceSet resourceSet1 = new ResourceSetImpl();
	    ResourceSet resourceSet2 = new ResourceSetImpl();
	    
	    URI uri1 = URI.createFileURI("testdata/SampleRequirementDocument.xmi");
		URI uri2 = URI.createFileURI("test cases/SampleRequirementDocument.xmi");
	   
		resourceSet1.getResource(uri1, true);
		resourceSet2.getResource(uri2, true);
		
	    // Configure EMF Compare
	    EMFCompare comparator = EMFCompare.builder().build();

	    // Compare the two models
	    IComparisonScope scope = EMFCompare.createDefaultScope(resourceSet1, resourceSet2);
	    return comparator.compare(scope);
	}

}
