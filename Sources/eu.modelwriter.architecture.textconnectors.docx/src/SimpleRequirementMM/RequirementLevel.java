/**
 */
package SimpleRequirementMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleRequirementMM.RequirementLevel#getOwnedDefinition <em>Owned Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleRequirementMM.SimpleRequirementMMPackage#getRequirementLevel()
 * @model
 * @generated
 */
public interface RequirementLevel extends Definition {
	/**
	 * Returns the value of the '<em><b>Owned Definition</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleRequirementMM.Definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Definition</em>' containment reference list.
	 * @see SimpleRequirementMM.SimpleRequirementMMPackage#getRequirementLevel_OwnedDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Definition> getOwnedDefinition();

} // RequirementLevel
