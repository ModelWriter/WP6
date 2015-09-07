package eu.modelwriter.architecture.ecoreconcepts.javaconcepts.parser;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Textile Files Annotator
 * @author Samuel Cruz-Lara (LORIA)
 *
 */
public class TextileFilesAnnotator {
	private static String modelsBasePath;
	private static String termsToAnnotateFile;
	private static final HashMap<String, Boolean> dataStructure = new HashMap<String, Boolean>();
	private static String textileFilesBasePath;
	private static String textileFile;
	private static String textileAnnotatedFilesBasePath;
	private static String textileAnnotatedFile;

	public TextileFilesAnnotator() {
		TextileFilesAnnotator.modelsBasePath = "ModelsContents/";
		TextileFilesAnnotator.termsToAnnotateFile = modelsBasePath + "TermsToAnnotate.txt";
		//TextileFilesAnnotator.dataStructure = new HashMap<String, Boolean>();
		TextileFilesAnnotator.textileFilesBasePath = "OriginalDocuments/";
		TextileFilesAnnotator.textileFile = textileFilesBasePath + "developer/" + "Architecture.textile";
		TextileFilesAnnotator.textileAnnotatedFilesBasePath = "PartiallyAnnotatedDocuments/";
		TextileFilesAnnotator.textileAnnotatedFile = textileAnnotatedFilesBasePath + "developer/" + "ArchitectureAutomaticallyAnnotated.textile";
	}

	public static void main(String[] args) {
		try {
			new TextileFilesAnnotator().buildTermsToAnnotateDataStructure();
			new JavaConceptsFinder().search();
			//new EcoreConceptsFinder().search();
			new TextileFilesAnnotator().annotate();
		} catch (FileNotFoundException e) {
			System.out.println("Error while opening a file");
		} catch (IOException e) {
			System.out.println("I/O Error");
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public void buildTermsToAnnotateDataStructure() throws FileNotFoundException, IOException, Exception { 
		BufferedReader bfr = new BufferedReader(new FileReader(TextileFilesAnnotator.termsToAnnotateFile));
		StringTokenizer st;
		String token, ligne;
		
		while ((ligne = bfr.readLine()) != null) {
			st = new StringTokenizer(ligne);
			while (st.hasMoreTokens()){
				token = st.nextToken();
				TextileFilesAnnotator.dataStructure.put(token, new Boolean(true));
			}
		}
		bfr.close();
	}
	
	public void annotate() throws FileNotFoundException, IOException, Exception { 
		BufferedReader bfr = new BufferedReader(new FileReader(TextileFilesAnnotator.textileFile));
		BufferedWriter bfw = new BufferedWriter(new FileWriter(TextileFilesAnnotator.textileAnnotatedFile));
		StringTokenizer st;
		String token, ligne;
		String delim = " ";
		int i;
		ArrayList<Integer> arrayListLines;
		// + "-" + "_" + "," + "." + "(" + ")" + "@" + ":" + "{" + "}" + "*";
		
		while ((ligne = bfr.readLine()) != null) {
			st = new StringTokenizer(ligne, delim);
			while (st.hasMoreTokens()){
				token = st.nextToken();
				//bfw.write(token + " ");
				if (TextileFilesAnnotator.dataStructure.containsKey(token)) {
					i=0;
					// [EMF{MW:/JavaConcepts-line={}
					bfw.write("[" + token + " {MW:/JavaConcepts-line={");
					arrayListLines = JavaConceptsFinder.getJcds().getDataStructure().get(token);
					for (Integer line :arrayListLines) {
						i++;
						bfw.write(Integer.toString(line));
						if (i<arrayListLines.size())
							bfw.write(", ");
					}
					bfw.write("} ");
				}
				else {
					bfw.write(token + " ");
				}
			}
			bfw.newLine();
		}
		bfr.close();
		bfw.close();
	}

	public static HashMap<String, Boolean> getDataStructure() {
		return dataStructure;
	}

}

