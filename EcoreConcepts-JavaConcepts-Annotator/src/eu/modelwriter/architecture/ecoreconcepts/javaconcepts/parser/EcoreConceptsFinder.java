package eu.modelwriter.architecture.ecoreconcepts.javaconcepts.parser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * Ecore Concepts Finder
 * @author Samuel Cruz-Lara (LORIA)
 *
 */
public class EcoreConceptsFinder {
	private static String textileFilesBasePath;
	private static String textileFile;
	private static String modelsBasePath;
	private static String ecoreConceptsParseredFile;

	public EcoreConceptsFinder() {
		EcoreConceptsFinder.textileFilesBasePath = "EcoreConcepts-JavaConcepts-Annotator/OriginalDocuments/";
		EcoreConceptsFinder.textileFile = textileFilesBasePath + "developer/" + "Architecture.textile";
	}
	
	public void search() throws FileNotFoundException, IOException, Exception { 
		BufferedReader bfr = new BufferedReader(new FileReader(EcoreConceptsFinder.textileFile));
		StringTokenizer st;
		String token, ligne, regex;
		String delim = " " + "-" + "_" + "," + "." + "(" + ")" + "@" + ":";
		
		EcoreConceptsDataStructure ecds = new EcoreConceptsDataStructure();
		
		while ((ligne = bfr.readLine()) != null) {
			st = new StringTokenizer(ligne, delim);
			while (st.hasMoreTokens()){
				token = st.nextToken();
				if (TextileFilesAnnotator.getDataStructure().containsKey(token)) {
					//regex = "(domain)([s]?)";
					regex = "(" + token + ")" + "([s]?)";
					if (Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(token).find()){
						System.out.println(token + " : " + ecds.retrieveArrayLineNumbers(token));
					}
				}
			}
		}
	}
}
