/**
 */
package useCase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link useCase.Specification#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link useCase.Specification#getOwnedActor <em>Owned Actor</em>}</li>
 *   <li>{@link useCase.Specification#getOwnedProcess <em>Owned Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see useCase.UseCasePackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link useCase.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Use Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see useCase.UseCasePackage#getSpecification_OwnedUseCase()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Owned Actor</b></em>' containment reference list.
	 * The list contents are of type {@link useCase.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actor</em>' containment reference list.
	 * @see useCase.UseCasePackage#getSpecification_OwnedActor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getOwnedActor();

	/**
	 * Returns the value of the '<em><b>Owned Process</b></em>' containment reference list.
	 * The list contents are of type {@link useCase.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process</em>' containment reference list.
	 * @see useCase.UseCasePackage#getSpecification_OwnedProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<useCase.Process> getOwnedProcess();

} // Specification
