/**
 */
package useCase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link useCase.Documentation#getText <em>Text</em>}</li>
 *   <li>{@link useCase.Documentation#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see useCase.UseCasePackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends Element {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see useCase.UseCasePackage#getDocumentation_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link useCase.Documentation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Text Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Format</em>' attribute.
	 * @see #setTextFormat(String)
	 * @see useCase.UseCasePackage#getDocumentation_TextFormat()
	 * @model
	 * @generated
	 */
	String getTextFormat();

	/**
	 * Sets the value of the '{@link useCase.Documentation#getTextFormat <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Format</em>' attribute.
	 * @see #getTextFormat()
	 * @generated
	 */
	void setTextFormat(String value);

} // Documentation
