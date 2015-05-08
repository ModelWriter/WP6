package com.modelwriter.architecture.textconnectors.docx.genparser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;

import DocModel.DocModelFactory;
import DocModel.Node;

public class RunManipulator {

	private final static String filename = "testdata/RunManipulatorTest.docx"; 

	private static Iterator<XWPFParagraph> paraIter; 
	private static Iterator<XWPFRun> runIter;

	private static XWPFParagraph paragraph; 
	private static DocModelFactory factory;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		factory = DocModelFactory.eINSTANCE;
		File file = null; 
		FileInputStream fis = null; 
		XWPFDocument document = null;
		List<XWPFParagraph> paraList = null; 

		file = new File(filename); 
		fis = new FileInputStream(file); 
		document = new XWPFDocument(fis); 
		paraList = document.getParagraphs(); 
		paraIter = paraList.iterator(); 
		List<List<XWPFRun>> partAndRun = new ArrayList<List<XWPFRun>>();

		while(paraIter.hasNext()) {

			paragraph = paraIter.next();
			runIter = paragraph.getRuns().iterator();

			printRuns();
			runIter = paragraph.getRuns().iterator();

			String paragraphText = paragraph.getText();

			List<String> partList = getPartList(paragraphText);
			Stack<XWPFRun> runStack;
			List<XWPFRun> runList;

			String runConcat = "";
			runStack = new Stack<XWPFRun>();
			int partIndex = 0;
			String partText = "";
			String cuttedText = "";

			XWPFRun prevRun = null;
			XWPFRun currentRun = null;

			while(runIter.hasNext() ){

				prevRun = currentRun;
				currentRun = runIter.next();


				if(!cuttedText.equals("")){
					String newText = cuttedText;
					cuttedText = "";
					newText += currentRun.toString();
					currentRun.setText(newText,0);
				}

				runConcat += currentRun.toString();
				partText = partList.get(partIndex);

				if(runConcat.equals(partText)){
					
					runStack.add(currentRun);	
					runConcat = "";
					partIndex++;
					emptyStackToList(runStack, partAndRun);
				}

				else if(runConcat.contains(partText)){
					
					if(currentRun.toString().contains(":")){

						String[] values = currentRun.toString().split(":");
						currentRun.setText(values[0],0);

						runStack.add(currentRun);
						
						// TODO values[1] null olabilir
						cuttedText = values[1];
						
						emptyStackToList(runStack, partAndRun);
					}
					else if(currentRun.toString().contains(",")){

						String[] values = currentRun.toString().split(",");
						currentRun.setText(values[0] + ",",0);

						runStack.add(currentRun);
						cuttedText = values[1];
						
						emptyStackToList(runStack, partAndRun);

					}
					
					runConcat = "";
					partIndex++;
				}
				
				else{
					runStack.add(currentRun);
				}
				
				
			}

		}

		print(partAndRun);

	}

	private static void emptyStackToList(Stack<XWPFRun> runStack, List<List<XWPFRun>> partAndRun) {

		List<XWPFRun> runList = new ArrayList<XWPFRun>();

		while(!runStack.isEmpty()){

			XWPFRun poppedRun = runStack.pop();
			runList.add(poppedRun);
		}

		if(!runList.isEmpty()){
			partAndRun.add(runList);
		}


	}

	private static void printRuns() {

		while(runIter.hasNext()){

			XWPFRun run = runIter.next();

			System.out.println(run.toString());
		}

		System.out.println("---------------------");
	}

	private static void print(List<List<XWPFRun>> partAndRun) {

		for(int i = 0; i < partAndRun.size(); i++){

			System.out.println("Part------");

			for(int j = 0; j < partAndRun.get(i).size(); j++){

				System.out.println("Run : " + partAndRun.get(i).get(j).toString());
			}
		}

	}

	private static List<String> getPartList(String paragraphText) {

		List<String> partList = new ArrayList<String>();
		String[] colon = paragraphText.split(":");

		if(colon.length > 1 && !(colon[1].replaceAll(" ", "").equals(""))){

			
			partList.add(colon[0]);

			if(colon[1].contains(",")){

				String[] comma = colon[1].split(",");

				if(comma.length > 1){

					for(int i = 0;i < comma.length; i++){

						if(i != comma.length - 1){
							partList.add(comma[i]);
						}else{
							partList.add(comma[i]);
						}
					}
				}
			}

			else{
				partList.add(colon[1]);
			}
		}

		return partList;

	}

}
