/**
 */
package useCase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link useCase.UseCase#getPrimaryActor <em>Primary Actor</em>}</li>
 *   <li>{@link useCase.UseCase#getOwnedStakeholderInterest <em>Owned Stakeholder Interest</em>}</li>
 *   <li>{@link useCase.UseCase#getMainFlow <em>Main Flow</em>}</li>
 *   <li>{@link useCase.UseCase#getAlternativeFlows <em>Alternative Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see useCase.UseCasePackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Primary Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Actor</em>' reference.
	 * @see #setPrimaryActor(Actor)
	 * @see useCase.UseCasePackage#getUseCase_PrimaryActor()
	 * @model
	 * @generated
	 */
	Actor getPrimaryActor();

	/**
	 * Sets the value of the '{@link useCase.UseCase#getPrimaryActor <em>Primary Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Actor</em>' reference.
	 * @see #getPrimaryActor()
	 * @generated
	 */
	void setPrimaryActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Owned Stakeholder Interest</b></em>' containment reference list.
	 * The list contents are of type {@link useCase.Interest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Stakeholder Interest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Stakeholder Interest</em>' containment reference list.
	 * @see useCase.UseCasePackage#getUseCase_OwnedStakeholderInterest()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interest> getOwnedStakeholderInterest();

	/**
	 * Returns the value of the '<em><b>Main Flow</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link useCase.Process#getDefinedAt <em>Defined At</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Flow</em>' reference.
	 * @see #setMainFlow(useCase.Process)
	 * @see useCase.UseCasePackage#getUseCase_MainFlow()
	 * @see useCase.Process#getDefinedAt
	 * @model opposite="definedAt"
	 * @generated
	 */
	useCase.Process getMainFlow();

	/**
	 * Sets the value of the '{@link useCase.UseCase#getMainFlow <em>Main Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Flow</em>' reference.
	 * @see #getMainFlow()
	 * @generated
	 */
	void setMainFlow(useCase.Process value);

	/**
	 * Returns the value of the '<em><b>Alternative Flows</b></em>' reference list.
	 * The list contents are of type {@link useCase.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Flows</em>' reference list.
	 * @see useCase.UseCasePackage#getUseCase_AlternativeFlows()
	 * @model
	 * @generated
	 */
	EList<useCase.Process> getAlternativeFlows();

} // UseCase
