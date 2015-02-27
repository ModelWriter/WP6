package eu.modelwriter.architecture.textconnectors.docx.command.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

import ReqModel.Product;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.modelwriter.architecture.textconnectors.docx.Docx2ReqModelConverter;

public class ConvertHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) {
		// TODO Auto-generated method stub


		XWPFDocument document = null;
		// Shell shell = HandlerUtil.getActiveShell(event);
		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;

		Object firstElement = selection.getFirstElement();

		if(firstElement instanceof IFile){

			IFile ifile = (IFile) Platform.getAdapterManager().getAdapter(firstElement, IFile.class);

			if (ifile == null) {
				if (firstElement instanceof IAdaptable) {
					ifile = (IFile) ((IAdaptable) firstElement).getAdapter(IFile.class);
				}
			}

			if (ifile != null) {

				File f = ifile.getLocation().toFile();
				try {
					
					
					document = new XWPFDocument(new FileInputStream(f));
					List<XWPFParagraph> paragraphList = document.getParagraphs();
					for(XWPFParagraph paragraph : paragraphList){
						
						System.out.println(paragraph.getText());
					}
					
					Product p = Docx2ReqModelConverter.Convert(document);
					
					
					//Product p = Docx2ReqModelConverter.Convert(f);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}


		}
		return null;

	}
}