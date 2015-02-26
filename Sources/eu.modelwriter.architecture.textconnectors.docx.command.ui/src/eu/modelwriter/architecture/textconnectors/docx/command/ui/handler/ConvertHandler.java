package eu.modelwriter.architecture.textconnectors.docx.command.ui.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import ReqModel.Definition;
import ReqModel.Product;
import eu.modelwriter.architecture.textconnectors.docx.Docx2ReqModelConverter;

public class ConvertHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		
		XWPFDocument document = null;
		Shell shell = HandlerUtil.getActiveShell(event);
		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;

		Object firstElement = selection.getFirstElement();

		if(firstElement instanceof IFile){

			try {

				IFile ifile = (IFile) Platform.getAdapterManager().getAdapter(firstElement, IFile.class);

				if (ifile == null) {
					if (firstElement instanceof IAdaptable) {
						ifile = (IFile) ((IAdaptable) firstElement).getAdapter(IFile.class);
					}
				}

				if (ifile != null) {
					
					File f = ifile.getFullPath().toFile();
					document = new XWPFDocument(new FileInputStream(f));
				
					
				}


			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			try {
				Product p = Docx2ReqModelConverter.Convert(document);

				for(Definition d : p.getOwnedDefinition()){

					System.out.println(d.getName());
				}

				IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
				MessageDialog.openInformation(
						window.getShell(),
						"Test",
						"Missing relations were found seccessfully!");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;

	}

}
