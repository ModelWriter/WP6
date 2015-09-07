/**
 */
package eu.modelwriter.models.concepts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptVariable#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptVariable#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptVariable()
 * @model
 * @generated
 */
public interface ConceptVariable extends DerivedConcept {
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
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptVariable_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link eu.modelwriter.models.concepts.ConceptVariable#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

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
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptVariable_Context()
	 * @model required="true"
	 * @generated
	 */
	ConceptClass getContext();

	/**
	 * Sets the value of the '{@link eu.modelwriter.models.concepts.ConceptVariable#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ConceptClass value);

} // ConceptVariable
