/*******************************************************************************
 * Copyright (c) 2015 UNIT Information Technologies R&D
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    A. Furkan Tanriverdi (UNIT) - initial API and implementation
 *******************************************************************************/
package com.modelwriter.architecture.textconnectors.docx.genparser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;

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

		Map<Integer,XWPFRun> runMap = new HashMap<Integer,XWPFRun>();;

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

		Stack<XWPFRun> runStack = new Stack<XWPFRun>();

		while(paraIter.hasNext()) {

			paragraph = paraIter.next();
			runIter = paragraph.getRuns().iterator();

			printRuns();
			runIter = paragraph.getRuns().iterator();

			String paragraphText = paragraph.getText();
			List<String> partList = getPartList(paragraphText);

			List<XWPFRun> runList;

			String runConcat = "";

			int partIndex = 0;
			int position = 0;
			int runCount = 0;
			String partText = "";
			String cuttedText = "";
			boolean nextRunFlag = false;

			XWPFRun prevRun = null;
			XWPFRun currentRun = null;
			XWPFRun tempRun = null;
			XWPFRun lastRun = null;

			while(runIter.hasNext() || (partIndex <= partList.size()-1 && partList.get(partIndex) != "")){

				prevRun = currentRun;

				if(runIter.hasNext()){
					currentRun = runIter.next();
					runCount++;

					if(!cuttedText.equals("")){
						String newText = cuttedText;
						cuttedText = "";
						newText += currentRun.toString();
						currentRun.setText(newText,0);
					}



					runConcat += currentRun.toString();
					partText = partList.get(partIndex);

					if(nextRunFlag){
						currentRun.setText(runConcat, 0);
						nextRunFlag = false;
					}

					if(runConcat.equals(partText)){


						runStack.add(currentRun);	
						runConcat = "";
						partIndex++;
						emptyStackToList(runStack, partAndRun);
					}

					else if(runConcat.contains(partText)){
						boolean flag = false;

						if(currentRun.toString().contains(":")){

							String[] values = currentRun.toString().split(":");

							if(values[0].equals("")){
								currentRun.setText(":" + values[1],0);
							}else{
								currentRun.setText(values[0] + ":",0);
							}

							// copy last runs properties
							if(!runStack.isEmpty()){

								copyRunProp(currentRun,runStack.peek(),currentRun.toString());
							}

							runStack.add(currentRun);

							// TODO values[1] null olabilir
							cuttedText = values[1];

							emptyStackToList(runStack, partAndRun);
						}
						else if(currentRun.toString().contains(",")){

							String[] values = currentRun.toString().split(",");
							//String[] values = runConcat.split(",");

							if(values[0].equals("")){
								currentRun.setText("," + values[1],0);
							}else{
								currentRun.setText(values[0] + ",",0);
							}

							// copy last runs properties
							if(!runStack.isEmpty()){

								copyRunProp(currentRun,runStack.peek(),currentRun.toString());
							}

							runStack.add(currentRun);
							emptyStackToList(runStack, partAndRun);

							if(values.length > 2){

								for(int i = 1; i < values.length-1; i++){

									runCount++;
									//tempRun = runIter.next();
									XWPFRun newRun = createNewRun(values[i],currentRun);
									//newRun.setText(values[i], 0);
									runMap.put(runCount, newRun);
									runStack.add(newRun);
									emptyStackToList(runStack, partAndRun);
									partIndex++;
									flag = true;

									//nextRunFlag = false;

								}
								runConcat = values[values.length-1];
								nextRunFlag = true;

							}else{
								if(values.length > 1){
									cuttedText = values[1];
								}
								//runConcat = values[1];
							}

						}

						if(!flag){
							runConcat = "";
						}
						partIndex++;
					}

					else{
						//currentRun.setText(runConcat, 0);
						if(!runStack.isEmpty()){

							copyRunProp(currentRun,runStack.peek(),currentRun.toString());
						}
						runStack.add(currentRun);
					}	

				}else{

					XWPFRun newRun = createNewRun(partList.get(partIndex), currentRun);
					handle(runCount,newRun,runMap);
					runStack.add(newRun);
					emptyStackToList(runStack, partAndRun);
					partIndex++;
					runCount++;
				}

			}

		}
		organizeRuns(runMap,runStack,partAndRun);
		print(partAndRun);

	}

	private static void copyRunProp(XWPFRun currentRun, XWPFRun prevRun, String string) {

		CTRPr rPr = prevRun.getCTR().isSetRPr() ? prevRun.getCTR().getRPr() : prevRun.getCTR().addNewRPr();
		rPr.set(currentRun.getCTR().getRPr());
		//prevRun.setText(string + ",",0);

	}

	private static void handle(int runCount, XWPFRun xwpfRun, Map<Integer, XWPFRun> runMap) {

		runMap.put(runCount, xwpfRun);
	}

	private static void organizeRuns(Map<Integer, XWPFRun> runMap, Stack<XWPFRun> runStack, List<List<XWPFRun>> partAndRun) {

		for (Entry<Integer, XWPFRun> entry : runMap.entrySet())
		{
			XWPFRun run = paragraph.insertNewRun(entry.getKey());
			CTRPr rPr = entry.getValue().getCTR().isSetRPr() ? entry.getValue().getCTR().getRPr() : entry.getValue().getCTR().addNewRPr();
			rPr.set(entry.getValue().getCTR().getRPr());
			run.setText(entry.getValue().toString(),0);
			//runStack.add(run);
			//emptyStackToList(runStack,partAndRun);
		}

	}

	private static XWPFRun createNewRun(String string, XWPFRun currentRun) {

		XWPFDocument newDocument = new XWPFDocument();
		XWPFParagraph newParagraph = newDocument.createParagraph();;
		XWPFRun newRun = newParagraph.createRun();
		CTRPr rPr = newRun.getCTR().isSetRPr() ? newRun.getCTR().getRPr() : newRun.getCTR().addNewRPr();
		rPr.set(currentRun.getCTR().getRPr());

		if(runIter.hasNext()){
			newRun.setText(string + ",",0);
		}else{
			newRun.setText(string,0);
		}

		return newRun;
		/*
		 * newRun.setBold(currentRun.isBold());
		newRun.setColor(currentRun.getColor());
		newRun.setFontFamily(currentRun.getFontFamily());
		newRun.setFontSize(currentRun.getFontSize());
		new
		 */
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
