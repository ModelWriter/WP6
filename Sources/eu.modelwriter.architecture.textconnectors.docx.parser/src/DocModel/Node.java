/**
 */
package DocModel;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DocModel.Node#getRawText <em>Raw Text</em>}</li>
 *   <li>{@link DocModel.Node#getAggregatedRun <em>Aggregated Run</em>}</li>
 *   <li>{@link DocModel.Node#getOwnedNode <em>Owned Node</em>}</li>
 *   <li>{@link DocModel.Node#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link DocModel.Node#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link DocModel.Node#getOwnedPart <em>Owned Part</em>}</li>
 *   <li>{@link DocModel.Node#getFirstPart <em>First Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see DocModel.DocModelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Raw Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Text</em>' attribute.
	 * @see #setRawText(String)
	 * @see DocModel.DocModelPackage#getNode_RawText()
	 * @model
	 * @generated
	 */
	String getRawText();

	/**
	 * Sets the value of the '{@link DocModel.Node#getRawText <em>Raw Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Text</em>' attribute.
	 * @see #getRawText()
	 * @generated
	 */
	void setRawText(String value);

	/**
	 * Returns the value of the '<em><b>Aggregated Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Run</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Run</em>' attribute.
	 * @see #setAggregatedRun(XWPFRun)
	 * @see DocModel.DocModelPackage#getNode_AggregatedRun()
	 * @model dataType="DocModel.XWPFRun"
	 * @generated
	 */
	XWPFRun getAggregatedRun();

	/**
	 * Sets the value of the '{@link DocModel.Node#getAggregatedRun <em>Aggregated Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregated Run</em>' attribute.
	 * @see #getAggregatedRun()
	 * @generated
	 */
	void setAggregatedRun(XWPFRun value);

	/**
	 * Returns the value of the '<em><b>Owned Node</b></em>' containment reference list.
	 * The list contents are of type {@link DocModel.Node}.
	 * It is bidirectional and its opposite is '{@link DocModel.Node#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Node</em>' containment reference list.
	 * @see DocModel.DocModelPackage#getNode_OwnedNode()
	 * @see DocModel.Node#getParentNode
	 * @model opposite="parentNode" containment="true"
	 * @generated
	 */
	EList<Node> getOwnedNode();

	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DocModel.Node#getOwnedNode <em>Owned Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' container reference.
	 * @see #setParentNode(Node)
	 * @see DocModel.DocModelPackage#getNode_ParentNode()
	 * @see DocModel.Node#getOwnedNode
	 * @model opposite="ownedNode" transient="false"
	 * @generated
	 */
	Node getParentNode();

	/**
	 * Sets the value of the '{@link DocModel.Node#getParentNode <em>Parent Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' container reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(Node value);

	/**
	 * Returns the value of the '<em><b>Paragraph</b></em>' attribute list.
	 * The list contents are of type {@link org.apache.poi.xwpf.usermodel.XWPFParagraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph</em>' attribute list.
	 * @see DocModel.DocModelPackage#getNode_Paragraph()
	 * @model dataType="DocModel.XWPFParagraph"
	 * @generated
	 */
	EList<XWPFParagraph> getParagraph();

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
	 * @see DocModel.DocModelPackage#getNode_OwnedPart()
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
	 * @see DocModel.DocModelPackage#getNode_FirstPart()
	 * @see DocModel.Part#getNode
	 * @model opposite="node"
	 * @generated
	 */
	Part getFirstPart();

	/**
	 * Sets the value of the '{@link DocModel.Node#getFirstPart <em>First Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Part</em>' reference.
	 * @see #getFirstPart()
	 * @generated
	 */
	void setFirstPart(Part value);

} // Node
