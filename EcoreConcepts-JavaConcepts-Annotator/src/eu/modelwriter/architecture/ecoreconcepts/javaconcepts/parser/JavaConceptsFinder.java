package eu.modelwriter.architecture.ecoreconcepts.javaconcepts.parser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * Java Concepts Finder
 * @author Samuel Cruz-Lara (LORIA)
 *
 */
public class JavaConceptsFinder {
	private static String textileFilesBasePath;
	private static String textileFile;
	private static JavaConceptsDataStructure jcds;

	public JavaConceptsFinder() {
		JavaConceptsFinder.textileFilesBasePath = "OriginalDocuments/";
		JavaConceptsFinder.textileFile = textileFilesBasePath + "developer/" + "Architecture.textile";
	}

	public void search() throws FileNotFoundException, IOException, Exception { 
		BufferedReader bfr = new BufferedReader(new FileReader(JavaConceptsFinder.textileFile));
		StringTokenizer st;
		String token, ligne, regex;
		//String delim = " " + "(" + ")" + "[" + "]" + "," + "." + "'" + ":" +"#" +"_" + "@";
		String delim = " " + "-" + "_" + "," + "." + "(" + ")" + "@" + ":" + "{" + "}" + "*";

		JavaConceptsFinder.jcds = new JavaConceptsDataStructure();

		while ((ligne = bfr.readLine()) != null) {
			st = new StringTokenizer(ligne, delim);
			while (st.hasMoreTokens()){
				token = st.nextToken();
				if (TextileFilesAnnotator.getDataStructure().containsKey(token)) {
					regex = "(" + token + ")" + "([s]?)";
					if (Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(token).find()){
						//System.out.println(token + " : " + jcds.retrieveArrayLineNumbers(token));
						jcds.retrieveArrayLineNumbers(token);
					}
				}
			}
		}
		bfr.close();
	}

	public static JavaConceptsDataStructure getJcds() {
		return JavaConceptsFinder.jcds;
	}

	public static void setJcds(JavaConceptsDataStructure jcds) {
		JavaConceptsFinder.jcds = jcds;
	}
}
