package com.modelwriter.architecture.textconnectors.docx.genparser;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import DocModel.DocModelFactory;

public class ModelComparator {

	public static void main(String[] args) {

		Comparison comparison = compare();
		List<Diff> differences = comparison.getDifferences();

		for(Diff d: differences)
		{
			System.err.println("d.getKind(): "+d.getKind());
			System.err.println("d.getMatch(): " + d.getMatch());
			System.err.println("State: " + d.getState());
		}

	}

	public static Comparison compare(){

		//Loading models
		ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();
		String xmi1 = "testdata/SampleRequirementDocument.xmi";
		String xmi2 = "parsed/SampleRequirementDocument.xmi";
		//File file1 = new File(xmi1);
		//String absolutePath = file1.getAbsolutePath();
		load(xmi1 ,resourceSet1);
		load(xmi2 ,resourceSet2);

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
