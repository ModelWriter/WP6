package com.modelwriter.architecture.textconnectors.docx.genparser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;

public class TableExtractor {

	private final static String filename = "testdata/5 NEDEN  2014-0971.docx"; 
	
	// current paragraph
	private static XWPFParagraph paragraph; 
	
	public static void main(String[] args) throws IOException {
		
		File file = null; 
		FileInputStream fis = null; 
		XWPFDocument document = null;
		List<XWPFParagraph> paraList = null; 
		file = new File(filename); 
		fis = new FileInputStream(file); 
		document = new XWPFDocument(fis); 
		
		Iterator<IBodyElement> bodyElementIterator = document.getBodyElementsIterator();
		while(bodyElementIterator.hasNext()) {
		  IBodyElement element = bodyElementIterator.next();
		  
		  if("PARAGRAPH".equalsIgnoreCase(element.getElementType().name())){
			  System.out.println(element.getElementType().toString());
		  }
		  
		  else if("TABLE".equalsIgnoreCase(element.getElementType().name())) {
			     List<XWPFTable> tableList =  element.getBody().getTables();
			     for (XWPFTable table: tableList){
			        System.out.println("Total Number of Rows of Table:"+table.getNumberOfRows());
				System.out.println(table.getText());
			     }
			  }
		}

	}

}
