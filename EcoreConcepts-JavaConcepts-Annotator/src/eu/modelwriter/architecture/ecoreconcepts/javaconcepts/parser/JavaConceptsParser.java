package eu.modelwriter.architecture.ecoreconcepts.javaconcepts.parser;

import java.io.*;
import java.util.regex.*;

/**
 * Java Concepts Parser
 * @author Samuel Cruz-Lara (LORIA)
 *
 */
public class JavaConceptsParser {
	private static String basePath;
	private static String javaConceptsFile;
	private static String javaConceptsParseredFile;
	private static Pattern pattern;
	private static Matcher matcher;

	public JavaConceptsParser() {
		JavaConceptsParser.basePath = "EcoreConcepts-JavaConcepts-Annotator/ModelsContents/";
		JavaConceptsParser.javaConceptsFile = basePath + "JavaConcepts.txt";
		JavaConceptsParser.javaConceptsParseredFile = basePath + "JavaConceptsParsered.txt";
		JavaConceptsParser.pattern = Pattern.compile("\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*$");
	}

	public static void main(String[] args) {
		try {
			new JavaConceptsParser().parser();
		} catch (FileNotFoundException e) {
			System.out.println("Error while opening the file: " + JavaConceptsParser.javaConceptsFile);
		} catch (IOException e) {
			System.out.println("I/O Error");
		} catch (Exception e){
			e.printStackTrace();
		}
	}    

	public void parser() throws FileNotFoundException, IOException, Exception { 
		BufferedReader bfr = new BufferedReader(new FileReader(JavaConceptsParser.javaConceptsFile));
		BufferedWriter bfw = new BufferedWriter(new FileWriter(JavaConceptsParser.javaConceptsParseredFile));
		String ligne, strMatcher ;
		//JavaConceptsParser.pattern2 = Pattern.compile("[A-Z][A-Z0-9]*(_[A-Z0-9]+)*$");
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
