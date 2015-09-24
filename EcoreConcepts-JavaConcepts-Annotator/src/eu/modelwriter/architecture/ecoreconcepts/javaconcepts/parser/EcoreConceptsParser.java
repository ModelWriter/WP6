package eu.modelwriter.architecture.ecoreconcepts.javaconcepts.parser;

import java.io.*;
import java.util.regex.*;

/**
 * Ecore Concepts Parser
 * @author Samuel Cruz-Lara (LORIA)
 *
 */
public class EcoreConceptsParser {
	private static String basePath;
	private static String ecoreConceptsFile;
	private static String ecoreConceptsParseredFile;
	private static Pattern pattern;
	private static Matcher matcher;

	public EcoreConceptsParser() {
		EcoreConceptsParser.basePath = "EcoreConcepts-JavaConcepts-Annotator/ModelsContents/";
		EcoreConceptsParser.ecoreConceptsFile = basePath + "EcoreConcepts.txt";
		EcoreConceptsParser.ecoreConceptsParseredFile = basePath + "EcoreConceptsParsered.txt";
		EcoreConceptsParser.pattern = Pattern.compile("\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*$");
	}

	public static void main(String[] args) {
		try {
			new EcoreConceptsParser().parser();
		} catch (FileNotFoundException e) {
			System.out.println("Error while opening the file: " + EcoreConceptsParser.ecoreConceptsFile);
		} catch (IOException e) {
			System.out.println("I/O Error");
		} catch (Exception e){
			e.printStackTrace();
		}
	}    

	public void parser() throws FileNotFoundException, IOException, Exception { 
		BufferedReader bfr = new BufferedReader(new FileReader(EcoreConceptsParser.ecoreConceptsFile));
		BufferedWriter bfw = new BufferedWriter(new FileWriter(EcoreConceptsParser.ecoreConceptsParseredFile));
		String ligne, strMatcher ;
		while ((ligne = bfr.readLine()) != null) {
			matcher = pattern.matcher(ligne);
			if (matcher.find()) {
				strMatcher = matcher.group();
				System.out.println(strMatcher);
				bfw.write(strMatcher);
			}
			bfw.newLine();
		}
		bfr.close();
		bfw.close();
	}
}
