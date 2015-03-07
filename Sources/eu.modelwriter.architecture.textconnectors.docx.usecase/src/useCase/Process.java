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
 *   <li>{@link useCase.Process#getDefinedAt <em>Defined At</em>}</li>
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
	 * Returns the value of the '<em><b>Defined At</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link useCase.UseCase#getMainFlow <em>Main Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined At</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined At</em>' reference.
	 * @see #setDefinedAt(UseCase)
	 * @see useCase.UseCasePackage#getProcess_DefinedAt()
	 * @see useCase.UseCase#getMainFlow
	 * @model opposite="mainFlow"
	 * @generated
	 */
	UseCase getDefinedAt();

	/**
	 * Sets the value of the '{@link useCase.Process#getDefinedAt <em>Defined At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined At</em>' reference.
	 * @see #getDefinedAt()
	 * @generated
	 */
	void setDefinedAt(UseCase value);

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
