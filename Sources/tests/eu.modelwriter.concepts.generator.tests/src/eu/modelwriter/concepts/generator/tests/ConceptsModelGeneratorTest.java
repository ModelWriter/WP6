package eu.modelwriter.concepts.generator.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import eu.modelwriter.concepts.generator.ConceptsModelGenerator;
import eu.modelwriter.concepts.generator.ConceptsModelGeneratorException;

public class ConceptsModelGeneratorTest {

	@Test
	public void siriusConceptsGeneration()
			throws ConceptsModelGeneratorException {
		File inputFile = new File("resources/Sirius.ariadneorganization");
		ConceptsModelGenerator modelGen = new ConceptsModelGenerator(
				inputFile.getAbsolutePath());
		modelGen.generate();
		File outputFile = new File("resources/Sirius.concepts");
		assertTrue(outputFile.exists());
	}
}
