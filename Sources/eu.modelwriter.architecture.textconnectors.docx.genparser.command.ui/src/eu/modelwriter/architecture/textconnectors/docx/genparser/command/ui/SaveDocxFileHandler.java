package eu.modelwriter.architecture.textconnectors.docx.genparser.command.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

import com.modelwriter.architecture.textconnectors.docx.genparser.notifymanager.MappingManager;

public class SaveDocxFileHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		MappingManager map = MappingManager.getInstance();
		
		FileOutputStream out = null;
		try {
			//"C:/Users/furkan.tanriverdi/Desktop/REQ-5.docx"
			out = new FileOutputStream(new File(map.getDocumentPath()));
			map.getXWPFDocInstance().write(out);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
