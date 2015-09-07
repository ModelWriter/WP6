/**
 */
package eu.modelwriter.models.concepts;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.Type#getReferencedClass <em>Referenced Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.modelwriter.models.concepts.ConceptsPackage#getType()
 * @model
 * @generated
 */
public interface Type extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Referenced Class</b></em>' reference list.
	 * The list contents are of type {@link eu.modelwriter.models.concepts.ConceptClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Class</em>' reference list.
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#getType_ReferencedClass()
	 * @model
	 * @generated
	 */
	EList<ConceptClass> getReferencedClass();
} // Type
