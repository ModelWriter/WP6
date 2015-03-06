/**
 */
package useCase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link useCase.ConditionalSequenceFlow#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see useCase.UseCasePackage#getConditionalSequenceFlow()
 * @model
 * @generated
 */
public interface ConditionalSequenceFlow extends SequenceFlow {
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
	 * @see useCase.UseCasePackage#getConditionalSequenceFlow_ConditionExpression()
	 * @model
	 * @generated
	 */
	Expression getConditionExpression();

	/**
	 * Sets the value of the '{@link useCase.ConditionalSequenceFlow#getConditionExpression <em>Condition Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(Expression value);

} // ConditionalSequenceFlow
