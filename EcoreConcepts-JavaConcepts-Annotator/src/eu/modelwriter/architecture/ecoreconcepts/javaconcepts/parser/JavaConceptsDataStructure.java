package eu.modelwriter.architecture.ecoreconcepts.javaconcepts.parser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * Java Concepts Data Structure
 * @author Samuel Cruz-Lara (LORIA)
 *
 */
public class JavaConceptsDataStructure implements Serializable {
	private static HashMap<String, ArrayList<Integer>> dataStructure;
	private static String modelsBasePath;
	private static String javaConceptsParseredFile;
	private static ArrayList<Integer> lineNumbers;
	
	public JavaConceptsDataStructure(){
		JavaConceptsDataStructure.modelsBasePath = "ModelsContents/";
		JavaConceptsDataStructure.javaConceptsParseredFile = modelsBasePath + "JavaConceptsParsered.txt";
		JavaConceptsDataStructure.dataStructure = new HashMap<String, ArrayList<Integer>>();
	}
	
	public ArrayList<Integer> retrieveArrayLineNumbers(String str) throws FileNotFoundException, IOException, Exception{
		if (!JavaConceptsDataStructure.dataStructure.containsKey(str)) {
			JavaConceptsDataStructure.dataStructure.put(str, this.findLineNumbers(str));
		}
		return (JavaConceptsDataStructure.dataStructure.get(str));
	}

	private ArrayList<Integer> findLineNumbers (String token) throws FileNotFoundException, IOException, Exception{
		lineNumbers = new ArrayList<Integer>();
		BufferedReader bfr = new BufferedReader(new FileReader(JavaConceptsDataStructure.javaConceptsParseredFile));
		String ligne, regex;
		int lineNumber = 0;
		while ((ligne = bfr.readLine()) != null) {
			lineNumber++;
			regex = "(.*)(" + token + ")([s]?)";
			if (Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(ligne).find()){
			//if (Pattern.compile(Pattern.quote(token), Pattern.CASE_INSENSITIVE).matcher(ligne).find()){
			// Pattern.compile(token+"?s"+"[A-Z][A-Z0-9]*(_[A-Z0-9]+)*"
			//if (Pattern.compile(token+"?s", Pattern.CASE_INSENSITIVE).matcher(ligne).find()){
				JavaConceptsDataStructure.lineNumbers.add(new Integer(lineNumber));
			}
		}
		bfr.close();
		return JavaConceptsDataStructure.lineNumbers;
	}
	
	public void saveDataStructureAsFile(String s) throws IOException, Exception {
		System.out.println("\nSaving data structure in "+ s + "file.");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(s));
		oos.writeObject(this);
		oos.close();
	}
	
	public static JavaConceptsDataStructure charger(String s) throws IOException,Exception {
		System.out.println("\nRetrieving data structure from "+ s + " file.");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(s));
		Object obj=ois.readObject();
		ois.close();
		return (JavaConceptsDataStructure)obj;
	}

	public static HashMap<String, ArrayList<Integer>> getDataStructure() {
		return dataStructure;
	}

	public static void setDataStructure(HashMap<String, ArrayList<Integer>> dataStructure) {
		JavaConceptsDataStructure.dataStructure = dataStructure;
	}
}
