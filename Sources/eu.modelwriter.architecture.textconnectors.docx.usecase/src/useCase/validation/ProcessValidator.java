/**
 *
 * $Id$
 */
package useCase.validation;

import org.eclipse.emf.common.util.EList;

import useCase.FlowElement;
import useCase.UseCase;

/**
 * A sample validator interface for {@link useCase.Process}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProcessValidator {
	boolean validate();

	boolean validateDefinedAt(UseCase value);
	boolean validateOwnedFlowElements(EList<FlowElement> value);
}
