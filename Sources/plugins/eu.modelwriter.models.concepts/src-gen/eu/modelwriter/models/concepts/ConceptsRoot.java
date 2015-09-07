/**
 */
package eu.modelwriter.models.concepts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptsRoot#getJavaConcepts <em>Java Concepts</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptsRoot#getEcoreResources <em>Ecore Resources</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.ConceptsRoot#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptsRoot()
 * @model
 * @generated
 */
public interface ConceptsRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link eu.modelwriter.models.concepts.JavaConceptsContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Concepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Concepts</em>' containment reference list.
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptsRoot_JavaConcepts()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaConceptsContainer> getJavaConcepts();

	/**
	 * Returns the value of the '<em><b>Ecore Resources</b></em>' containment reference list.
	 * The list contents are of type {@link eu.modelwriter.models.concepts.resourcesConcepts}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Resources</em>' containment reference list.
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptsRoot_EcoreResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<resourcesConcepts> getEcoreResources();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link eu.modelwriter.models.concepts.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getConceptsRoot_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // ConceptsRoot
