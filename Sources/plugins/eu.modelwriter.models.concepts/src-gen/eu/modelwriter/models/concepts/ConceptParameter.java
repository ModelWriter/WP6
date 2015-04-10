/**
 */
package eu.modelwriter.models.concepts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptParameter#getType <em>Type</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptParameter#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptParameter()
 * @model
 * @generated
 */
public interface ConceptParameter extends DerivedConcept {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link eu.modelwriter.models.concepts.ConceptParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ConceptMethod)
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptParameter_Context()
	 * @model required="true"
	 * @generated
	 */
	ConceptMethod getContext();

	/**
	 * Sets the value of the '{@link eu.modelwriter.models.concepts.ConceptParameter#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ConceptMethod value);

} // ConceptParameter
