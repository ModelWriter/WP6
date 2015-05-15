package eu.modelwriter.architecture.textconnectors.docx.genparser.command.ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

public class Convert2DocModelHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		final JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "WRONG FILE TYPE! (expected type: .docx)");
		
		return null;
	}

}
