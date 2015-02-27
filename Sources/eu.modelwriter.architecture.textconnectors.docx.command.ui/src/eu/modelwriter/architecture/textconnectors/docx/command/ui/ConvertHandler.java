package eu.modelwriter.architecture.textconnectors.docx.command.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class ConvertHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) {
		// TODO Auto-generated method stub


		//XWPFDocument document = null;
		Shell shell = HandlerUtil.getActiveShell(event);
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

				File f = ifile.getFullPath().toFile();
				//document = new XWPFDocument(new FileInputStream(f));


			}


		}
		return null;

	}
}