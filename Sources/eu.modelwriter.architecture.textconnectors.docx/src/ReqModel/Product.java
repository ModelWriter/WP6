/**
 */
package ReqModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ReqModel.Product#getOwnedDefinition <em>Owned Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see ReqModel.ReqModelPackage#getProduct()
 * @model annotation="gmf.node label='Name'"
 * @generated
 */
public interface Product extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Definition</b></em>' containment reference list.
	 * The list contents are of type {@link ReqModel.Definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Definition</em>' containment reference list.
	 * @see ReqModel.ReqModelPackage#getProduct_OwnedDefinition()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<Definition> getOwnedDefinition();

} // Product
