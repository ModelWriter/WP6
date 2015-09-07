package eu.modelwriter.architecture.ecoreconcepts.javaconcepts.parser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * Ecore Concepts Data Structure
 * @author Samuel Cruz-Lara (LORIA)
 *
 */
public class EcoreConceptsDataStructure {
	private static HashMap<String, ArrayList<Integer>> dataStructure;
	private static String modelsBasePath;
	private static String ecoreConceptsParseredFile;
	private static ArrayList<Integer> lineNumbers;
	
	public EcoreConceptsDataStructure(){
		EcoreConceptsDataStructure.modelsBasePath = "ModelsContents/";
		//EcoreConceptsDataStructure.ecoreConceptsParseredFile = modelsBasePath + "EcoreConceptsParsered.txt";
		EcoreConceptsDataStructure.ecoreConceptsParseredFile = modelsBasePath + "EcoreConcepts.txt";
		EcoreConceptsDataStructure.dataStructure = new HashMap<String, ArrayList<Integer>>();
	}
	
	public ArrayList<Integer> retrieveArrayLineNumbers(String str) throws FileNotFoundException, IOException, Exception{
		if (!EcoreConceptsDataStructure.dataStructure.containsKey(str)) {
			EcoreConceptsDataStructure.dataStructure.put(str, this.findLineNumbers(str));
		}
		return (EcoreConceptsDataStructure.dataStructure.get(str));
	}

	private ArrayList<Integer> findLineNumbers (String token) throws FileNotFoundException, IOException, Exception{
		lineNumbers = new ArrayList<Integer>();
		BufferedReader bfr = new BufferedReader(new FileReader(EcoreConceptsDataStructure.ecoreConceptsParseredFile));
		String ligne, regex;
		int lineNumber = 0;
		while ((ligne = bfr.readLine()) != null) {
			lineNumber++;
			regex = "(.*)(" + token + ")([s]?)";
			if (Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(ligne).find()){
				EcoreConceptsDataStructure.lineNumbers.add(new Integer(lineNumber));
			}
		}
		bfr.close();
		return EcoreConceptsDataStructure.lineNumbers;
	}
	
	public void saveDataStructureAsFile(String s) throws IOException, Exception {
		System.out.println("\nSaving data structure in "+ s + "file.");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(s));
		oos.writeObject(this);
		oos.close();
	}
	
	public static EcoreConceptsDataStructure charger(String s) throws IOException,Exception {
		System.out.println("\nRetrieving data structure from "+ s + " file.");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(s));
		Object obj=ois.readObject();
		ois.close();
		return (EcoreConceptsDataStructure)obj;
	}
}
