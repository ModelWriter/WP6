/**
 */
package DocModel;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DocModel.Paragraph#getOwnedNode <em>Owned Node</em>}</li>
 *   <li>{@link DocModel.Paragraph#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link DocModel.Paragraph#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link DocModel.Paragraph#getOwnedPart <em>Owned Part</em>}</li>
 *   <li>{@link DocModel.Paragraph#getFirstPart <em>First Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see DocModel.DocModelPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends Node {
	/**
	 * Returns the value of the '<em><b>Owned Node</b></em>' containment reference list.
	 * The list contents are of type {@link DocModel.Paragraph}.
	 * It is bidirectional and its opposite is '{@link DocModel.Paragraph#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Node</em>' containment reference list.
	 * @see DocModel.DocModelPackage#getParagraph_OwnedNode()
	 * @see DocModel.Paragraph#getParentNode
	 * @model opposite="parentNode" containment="true"
	 * @generated
	 */
	EList<Paragraph> getOwnedNode();

	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DocModel.Paragraph#getOwnedNode <em>Owned Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' container reference.
	 * @see #setParentNode(Paragraph)
	 * @see DocModel.DocModelPackage#getParagraph_ParentNode()
	 * @see DocModel.Paragraph#getOwnedNode
	 * @model opposite="ownedNode" transient="false"
	 * @generated
	 */
	Paragraph getParentNode();

	/**
	 * Sets the value of the '{@link DocModel.Paragraph#getParentNode <em>Parent Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' container reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(Paragraph value);

	/**
	 * Returns the value of the '<em><b>Paragraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph</em>' attribute.
	 * @see #setParagraph(XWPFParagraph)
	 * @see DocModel.DocModelPackage#getParagraph_Paragraph()
	 * @model dataType="DocModel.XWPFParagraph"
	 * @generated
	 */
	XWPFParagraph getParagraph();

	/**
	 * Sets the value of the '{@link DocModel.Paragraph#getParagraph <em>Paragraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph</em>' attribute.
	 * @see #getParagraph()
	 * @generated
	 */
	void setParagraph(XWPFParagraph value);

	/**
	 * Returns the value of the '<em><b>Owned Part</b></em>' containment reference list.
	 * The list contents are of type {@link DocModel.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Part</em>' containment reference list.
	 * @see DocModel.DocModelPackage#getParagraph_OwnedPart()
	 * @model containment="true"
	 * @generated
	 */
	EList<Part> getOwnedPart();

	/**
	 * Returns the value of the '<em><b>First Part</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DocModel.Part#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Part</em>' reference.
	 * @see #setFirstPart(Part)
	 * @see DocModel.DocModelPackage#getParagraph_FirstPart()
	 * @see DocModel.Part#getNode
	 * @model opposite="node"
	 * @generated
	 */
	Part getFirstPart();

	/**
	 * Sets the value of the '{@link DocModel.Paragraph#getFirstPart <em>First Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Part</em>' reference.
	 * @see #getFirstPart()
	 * @generated
	 */
	void setFirstPart(Part value);

} // Paragraph
