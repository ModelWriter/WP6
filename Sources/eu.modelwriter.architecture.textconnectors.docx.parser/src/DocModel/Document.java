/**
 */
package DocModel;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DocModel.Document#getOwnedNode <em>Owned Node</em>}</li>
 *   <li>{@link DocModel.Document#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see DocModel.DocModelPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Node</b></em>' containment reference list.
	 * The list contents are of type {@link DocModel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Node</em>' containment reference list.
	 * @see DocModel.DocModelPackage#getDocument_OwnedNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getOwnedNode();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' attribute.
	 * @see #setDocument(XWPFDocument)
	 * @see DocModel.DocModelPackage#getDocument_Document()
	 * @model dataType="DocModel.XWPFDocument"
	 * @generated
	 */
	XWPFDocument getDocument();

	/**
	 * Sets the value of the '{@link DocModel.Document#getDocument <em>Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' attribute.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(XWPFDocument value);

} // Document
