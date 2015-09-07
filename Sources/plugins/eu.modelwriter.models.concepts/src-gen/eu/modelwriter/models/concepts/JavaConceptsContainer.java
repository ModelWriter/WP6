/**
 */
package eu.modelwriter.models.concepts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Concepts Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.JavaConceptsContainer#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.JavaConceptsContainer#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.modelwriter.models.concepts.ConceptsPackage#getJavaConceptsContainer()
 * @model
 * @generated
 */
public interface JavaConceptsContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link eu.modelwriter.models.concepts.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' containment reference list.
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getJavaConceptsContainer_Concepts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Concept> getConcepts();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link eu.modelwriter.models.concepts.ContextPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getJavaConceptsContainer_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextPackage> getContexts();

} // JavaConceptsContainer
