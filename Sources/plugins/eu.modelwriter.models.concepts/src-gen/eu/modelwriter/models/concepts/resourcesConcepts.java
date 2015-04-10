/**
 */
package eu.modelwriter.models.concepts;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>resources Concepts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.resourcesConcepts#getEcoreResource <em>Ecore Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.modelwriter.models.concepts.ConceptsPackage#getresourcesConcepts()
 * @model
 * @generated
 */
public interface resourcesConcepts extends EObject {
	/**
	 * Returns the value of the '<em><b>Ecore Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Resource</em>' attribute.
	 * @see #setEcoreResource(Resource)
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getresourcesConcepts_EcoreResource()
	 * @model dataType="eu.modelwriter.models.concepts.EMFResource" required="true"
	 * @generated
	 */
	Resource getEcoreResource();

	/**
	 * Sets the value of the '{@link eu.modelwriter.models.concepts.resourcesConcepts#getEcoreResource <em>Ecore Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Resource</em>' attribute.
	 * @see #getEcoreResource()
	 * @generated
	 */
	void setEcoreResource(Resource value);

} // resourcesConcepts
