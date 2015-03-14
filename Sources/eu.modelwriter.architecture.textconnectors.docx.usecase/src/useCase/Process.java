/**
 */
package useCase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link useCase.Process#getOwnedFlowElements <em>Owned Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see useCase.UseCasePackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link useCase.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Flow Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Flow Elements</em>' containment reference list.
	 * @see useCase.UseCasePackage#getProcess_OwnedFlowElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getOwnedFlowElements();

} // Process
