/**
 */
package useCase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link useCase.ConditionalFlow#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see useCase.UseCasePackage#getConditionalFlow()
 * @model
 * @generated
 */
public interface ConditionalFlow extends Flow {
	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' reference.
	 * @see #setConditionExpression(Expression)
	 * @see useCase.UseCasePackage#getConditionalFlow_ConditionExpression()
	 * @model
	 * @generated
	 */
	Expression getConditionExpression();

	/**
	 * Sets the value of the '{@link useCase.ConditionalFlow#getConditionExpression <em>Condition Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(Expression value);

} // ConditionalFlow
