package eu.modelwriter.architecture.textconnectors.docx;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.eclipse.emf.ecore.resource.Resource;

import SimpleRequirementMM.Requirement;
import SimpleRequirementMM.RequirementLevel;
import SimpleRequirementMM.SimpleRequirementMMFactory;

public class Docx2EcoreConverter {

	private static Resource resource;

	public static void main(String[] args)throws Exception 
	{

		Stack<RequirementLevel> requirementLevelStack = new Stack<RequirementLevel>();

		Map<RequirementLevel,Integer> requirementLevelMap = new HashMap<RequirementLevel, Integer>();
		Map<String,Integer> headingMap = new HashMap<String,Integer>();

		headingMap.put("NoSpacing", 0);
		headingMap.put("Heading1", 1);
		headingMap.put("Heading2", 2);
		headingMap.put("Heading3", 3);
		headingMap.put("Heading4", 4);
		headingMap.put("Heading5", 5);
		headingMap.put("Heading6", 6);
		headingMap.put("Heading7", 7);
		headingMap.put("Heading8", 8);
		headingMap.put("Heading9", 9);

		XWPFDocument docx = new XWPFDocument(new FileInputStream("C:/Users/2/Desktop/SampleRequirementDocument.docx"));

		XWPFWordExtractor we = new XWPFWordExtractor(docx);

		XWPFStyles styles = docx.getStyles();

		/*
		Iterator<XWPFParagraph> paragraphIterator = docx.getParagraphsIterator();

		while(paragraphIterator.hasNext()){
			XWPFParagraph para = paragraphIterator.next();

			System.out.println(para.getText() + " - " + para.getStyle());

		}*/

		List<XWPFParagraph> paragraphList = docx.getParagraphs();

		SimpleRequirementMMFactory factory = SimpleRequirementMMFactory.eINSTANCE;

		int currentIndex = 0;
		//method(paragraphList, currentIndex);

		/*
		Product p = factory.createProduct();
		p.getOwnedRequirementLevel().add(e);
		 */

		int controller = 0;

		for(XWPFParagraph para : paragraphList){

			String t = para.getText();
			
			if( para != null){

				if(controller == 0){

					RequirementLevel rl = factory.createRequirementLevel();
					rl.setName(para.getStyle());
					requirementLevelStack.push(rl);
					requirementLevelMap.put(rl, headingMap.get(para.getStyle()));
					controller++;
				}

				
				
				// yeni okuduðum satýrýn levelý 
				// stackteki en üstte bulunan leveldan seviye olarak daha düþükse
				// map deðeri büyükse

				if(para.getStyle() == null){

					Requirement r = factory.createRequirement();
					String[] values = para.getText().split(":");
					
					

				} else if(headingMap.get(para.getStyle()) > requirementLevelMap.get(requirementLevelStack.peek())){

					RequirementLevel newRl = factory.createRequirementLevel();
					newRl.setName(para.getText());
					requirementLevelStack.push(newRl);
					requirementLevelMap.put(newRl, headingMap.get(para.getStyle()));

				}
				
				// eþit olma durumu
				// geri dönüþ



			}

		}


	}


}
