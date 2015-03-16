/**
 */
package DocModel;

import org.apache.poi.xwpf.usermodel.XWPFRun;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DocModel.Part#getRawText <em>Raw Text</em>}</li>
 *   <li>{@link DocModel.Part#getAggregatedRun <em>Aggregated Run</em>}</li>
 *   <li>{@link DocModel.Part#getNextPart <em>Next Part</em>}</li>
 *   <li>{@link DocModel.Part#getPrevPart <em>Prev Part</em>}</li>
 *   <li>{@link DocModel.Part#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see DocModel.DocModelPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends NamedElement {
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
	 * @see DocModel.DocModelPackage#getPart_RawText()
	 * @model
	 * @generated
	 */
	String getRawText();

	/**
	 * Sets the value of the '{@link DocModel.Part#getRawText <em>Raw Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Text</em>' attribute.
	 * @see #getRawText()
	 * @generated
	 */
	void setRawText(String value);

	/**
	 * Returns the value of the '<em><b>Aggregated Run</b></em>' attribute list.
	 * The list contents are of type {@link org.apache.poi.xwpf.usermodel.XWPFRun}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Run</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Run</em>' attribute list.
	 * @see DocModel.DocModelPackage#getPart_AggregatedRun()
	 * @model dataType="DocModel.XWPFRun"
	 * @generated
	 */
	EList<XWPFRun> getAggregatedRun();

	/**
	 * Returns the value of the '<em><b>Next Part</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DocModel.Part#getPrevPart <em>Prev Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Part</em>' reference.
	 * @see #setNextPart(Part)
	 * @see DocModel.DocModelPackage#getPart_NextPart()
	 * @see DocModel.Part#getPrevPart
	 * @model opposite="prevPart"
	 * @generated
	 */
	Part getNextPart();

	/**
	 * Sets the value of the '{@link DocModel.Part#getNextPart <em>Next Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Part</em>' reference.
	 * @see #getNextPart()
	 * @generated
	 */
	void setNextPart(Part value);

	/**
	 * Returns the value of the '<em><b>Prev Part</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DocModel.Part#getNextPart <em>Next Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Part</em>' reference.
	 * @see #setPrevPart(Part)
	 * @see DocModel.DocModelPackage#getPart_PrevPart()
	 * @see DocModel.Part#getNextPart
	 * @model opposite="nextPart"
	 * @generated
	 */
	Part getPrevPart();

	/**
	 * Sets the value of the '{@link DocModel.Part#getPrevPart <em>Prev Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Part</em>' reference.
	 * @see #getPrevPart()
	 * @generated
	 */
	void setPrevPart(Part value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DocModel.Node#getFirstPart <em>First Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see DocModel.DocModelPackage#getPart_Node()
	 * @see DocModel.Node#getFirstPart
	 * @model opposite="firstPart"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link DocModel.Part#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // Part
