/**
 */
package ParseTree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ParseTree.Node#getOwnedNode <em>Owned Node</em>}</li>
 *   <li>{@link ParseTree.Node#getNextNode <em>Next Node</em>}</li>
 *   <li>{@link ParseTree.Node#getPrevNode <em>Prev Node</em>}</li>
 *   <li>{@link ParseTree.Node#getParentNode <em>Parent Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see ParseTree.ParseTreePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Element {
	/**
	 * Returns the value of the '<em><b>Owned Node</b></em>' containment reference list.
	 * The list contents are of type {@link ParseTree.Node}.
	 * It is bidirectional and its opposite is '{@link ParseTree.Node#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Node</em>' containment reference list.
	 * @see ParseTree.ParseTreePackage#getNode_OwnedNode()
	 * @see ParseTree.Node#getParentNode
	 * @model opposite="parentNode" containment="true"
	 * @generated
	 */
	EList<Node> getOwnedNode();

	/**
	 * Returns the value of the '<em><b>Next Node</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ParseTree.Node#getPrevNode <em>Prev Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Node</em>' containment reference.
	 * @see #setNextNode(Node)
	 * @see ParseTree.ParseTreePackage#getNode_NextNode()
	 * @see ParseTree.Node#getPrevNode
	 * @model opposite="prevNode" containment="true"
	 * @generated
	 */
	Node getNextNode();

	/**
	 * Sets the value of the '{@link ParseTree.Node#getNextNode <em>Next Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Node</em>' containment reference.
	 * @see #getNextNode()
	 * @generated
	 */
	void setNextNode(Node value);

	/**
	 * Returns the value of the '<em><b>Prev Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ParseTree.Node#getNextNode <em>Next Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Node</em>' container reference.
	 * @see #setPrevNode(Node)
	 * @see ParseTree.ParseTreePackage#getNode_PrevNode()
	 * @see ParseTree.Node#getNextNode
	 * @model opposite="nextNode" transient="false"
	 * @generated
	 */
	Node getPrevNode();

	/**
	 * Sets the value of the '{@link ParseTree.Node#getPrevNode <em>Prev Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Node</em>' container reference.
	 * @see #getPrevNode()
	 * @generated
	 */
	void setPrevNode(Node value);

	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ParseTree.Node#getOwnedNode <em>Owned Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' container reference.
	 * @see #setParentNode(Node)
	 * @see ParseTree.ParseTreePackage#getNode_ParentNode()
	 * @see ParseTree.Node#getOwnedNode
	 * @model opposite="ownedNode" transient="false"
	 * @generated
	 */
	Node getParentNode();

	/**
	 * Sets the value of the '{@link ParseTree.Node#getParentNode <em>Parent Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' container reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(Node value);

} // Node
