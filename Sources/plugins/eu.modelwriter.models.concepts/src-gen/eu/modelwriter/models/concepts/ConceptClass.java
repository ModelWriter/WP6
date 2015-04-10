/**
 */
package eu.modelwriter.models.concepts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptClass#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptClass()
 * @model
 * @generated
 */
public interface ConceptClass extends Concept {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ContextPackage)
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptClass_Context()
	 * @model required="true"
	 * @generated
	 */
	ContextPackage getContext();

	/**
	 * Sets the value of the '{@link eu.modelwriter.models.concepts.ConceptClass#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ContextPackage value);

} // ConceptClass
