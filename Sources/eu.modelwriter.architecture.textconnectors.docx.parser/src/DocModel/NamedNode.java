/**
 */
package DocModel;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DocModel.NamedNode#getParagraf <em>Paragraf</em>}</li>
 * </ul>
 * </p>
 *
 * @see DocModel.DocModelPackage#getNamedNode()
 * @model
 * @generated
 */
public interface NamedNode extends Node, NamedElement {
	/**
	 * Returns the value of the '<em><b>Paragraf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraf</em>' attribute.
	 * @see #setParagraf(XWPFParagraph)
	 * @see DocModel.DocModelPackage#getNamedNode_Paragraf()
	 * @model dataType="DocModel.XWPFParagraph"
	 * @generated
	 */
	XWPFParagraph getParagraf();

	/**
	 * Sets the value of the '{@link DocModel.NamedNode#getParagraf <em>Paragraf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraf</em>' attribute.
	 * @see #getParagraf()
	 * @generated
	 */
	void setParagraf(XWPFParagraph value);

} // NamedNode
