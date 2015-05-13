package com.modelwriter.architecture.textconnectors.docx.genparser.notifymanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFRun;

public class MappingManager {
	
	private static Map<String, List<XWPFRun>> map = new HashMap<String, List<XWPFRun>>();

	public void mapRuns(String paragraphId, List<XWPFRun> runList){
		
		for (XWPFRun xwpfRun : runList) {
			map.put(paragraphId, runList);
		}
		
	}
}
