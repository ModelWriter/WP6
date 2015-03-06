package eu.modelwriter.architecture.textconnectors.docx.usecase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFNum;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class UseCase2BusinessProcessModelConverter {

	private final static String filename = "C:/Users/2/Desktop/UseCaseDocumentation2.docx"; 

	// Maps styles and their levels
	private static Map<String,Integer> headingMap;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		headingMap = new HashMap<String,Integer>();

		headingMap.put("Heading1", 1);
		headingMap.put("Heading2", 2);
		headingMap.put("Heading3", 3);
		headingMap.put("Heading4", 4);
		headingMap.put("Heading5", 5);
		headingMap.put("Heading6", 6);
		headingMap.put("Heading7", 7);
		headingMap.put("Heading8", 8);
		headingMap.put("Heading9", 9);

		File file = null; 
		FileInputStream fis = null; 
		XWPFDocument document = null; 
		XWPFNumbering numbering = null; 
		XWPFParagraph paragraph = null; 
		XWPFNum num = null; 
		List<XWPFParagraph> paraList = null; 
		Iterator<XWPFParagraph> paraIter = null; 
		BigInteger numID = null; 
		int numberingID = -1; 
		
		
		
		try { 
			file = new File(filename); 
			fis = new FileInputStream(file); 
			document = new XWPFDocument(fis); 

			fis.close(); 
			fis = null; 

			numbering = document.getNumbering(); 

			paraList = document.getParagraphs(); 
			paraIter = paraList.iterator(); 
			while(paraIter.hasNext()) {

				paragraph = paraIter.next(); 
				numID = paragraph.getNumID();
				
				// If the paragraph is the header of the ucecase
				if(headingMap.get(paragraph.getStyle()) == 1){
					
					
				} else{
					
					// If the paragraph is in the list
					if(numID != null) { 
						System.out.println("Iterating through the numbers."); 
						/*
						 * if(numID.intValue() != numberingID) { 
							num = numbering.getNum(numID); 
							numberingID = numID.intValue(); 
							System.out.println("Getting details of the new numbering system " + numberingID); 
							System.out.println("It's abstract numID is " + num.getCTNum().getAbstractNumId().getVal().intValue()); 
						} 
						else { 
							System.out.println("Iterating through the numbers."); 
						} 
						 */
					}
					
					else{
						
						
					}
				}
				 
				
			} 
		} 

		finally { 
			if(fis != null) { 
				fis.close(); 
				fis = null; 
			} 
		}
	}

}
