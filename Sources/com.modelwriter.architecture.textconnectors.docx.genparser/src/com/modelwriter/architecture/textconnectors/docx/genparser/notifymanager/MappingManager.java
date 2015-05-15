package com.modelwriter.architecture.textconnectors.docx.genparser.notifymanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFRun;

public class MappingManager {
	
	private static Map<String, List<XWPFRun>> map = new HashMap<String, List<XWPFRun>>();

	// Singleton
	private static MappingManager instance = null;
	
	public static MappingManager getInstance() {
	      if(instance == null) {
	         instance = new MappingManager();
	      }
	      return instance;
	   }
	
	public void mapRuns(String paragraphId, List<XWPFRun> runList){
			map.put(paragraphId, runList);
	}
	
	public void printMap(){
		
		for (Map.Entry <String, List<XWPFRun>> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + "---------------");
			
			for(XWPFRun run : entry.getValue()){
				
				System.out.println("Run : " + run.toString());
			}
		}
	}
}
