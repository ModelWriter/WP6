package com.modelwriter.architecture.textconnectors.docx.genparser;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;

public class Main {

	private final static String SAMPLE_REQUIREMENT_DOCUMENT = "testdata/SampleRequirementDocument.docx"; 
	private final static String SAMPLE_REQUIREMENT_DOCUMENT2 = "testdata/SampleRequirementDocument2.docx"; 
	private final static String TABBED_DOCUMENT = "testdata/tabbed doc.docx"; 
	private final static String USE_CASE_DOCUMENTATION = "testdata/UseCaseDocumentation.docx"; 
	
	//Headers with heading styles(headings) must be organized hierarchically.
	private static String REQ2 = "testdata/REQ-2.docx";

	// Fully bold headers which have not heading styles must be handled
	// as a child of last heading.
	private static String REQ4 = "testdata/REQ-4.docx";

	// Listed paragraphs must be handled as a child of last styled paragraph.
	private static String REQ5 = "testdata/REQ-5.docx";

	// Tabbed hierarchy for only not styled paragraphs must be handled.
	private static String REQ6 = "testdata/REQ-6.docx";

	// Tabbed hierarchy for paragraphs included both styled and not styled must be handled.
	private static String REQ7 = "testdata/REQ-7.docx";

	// If there is a bold key-value pair, every paragraphs until a new fully bold, styled with headings or 
	// bold key-value paragraph become.
	private static String REQ8 = "testdata/REQ-8.docx";

	// If there is a non-bold key-value pair, paragraph must be moved under previous styled paragraph.
	private static String REQ9 = "testdata/REQ-9.docx";

	// Fully bold paragraphs, bold key-value paragraphs and paragraphs with heading styles 
	//must be considered as hierarchic levels.
	private static String REQ11 = "testdata/REQ-11.docx";
	
	private static String number = "testdata/numberin.docx";
	
	private static String plain = "testdata/plaint text.docx";

	
	public static Resource parsedResource;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			parsedResource = Doc2ParseModel.parse(REQ5);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
