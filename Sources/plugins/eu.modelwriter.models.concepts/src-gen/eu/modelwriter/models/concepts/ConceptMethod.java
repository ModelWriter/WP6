/**
 */
package eu.modelwriter.models.concepts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptMethod#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptMethod()
 * @model
 * @generated
 */
public interface ConceptMethod extends DerivedConcept {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptMethod_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link eu.modelwriter.models.concepts.ConceptMethod#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link eu.modelwriter.models.concepts.ConceptParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptMethod_Parameters()
	 * @model
	 * @generated
	 */
	EList<ConceptParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ConceptClass)
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptMethod_Context()
	 * @model required="true"
	 * @generated
	 */
	ConceptClass getContext();

	/**
	 * Sets the value of the '{@link eu.modelwriter.models.concepts.ConceptMethod#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ConceptClass value);

} // ConceptMethod
