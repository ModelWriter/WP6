/**
 */
package useCase.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import useCase.ConditionalSequenceFlow;
import useCase.Expression;
import useCase.UseCasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link useCase.impl.ConditionalSequenceFlowImpl#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalSequenceFlowImpl extends SequenceFlowImpl implements ConditionalSequenceFlow {
	/**
	 * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression conditionExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalSequenceFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasePackage.Literals.CONDÝTÝONAL_SEQUENCE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConditionExpression() {
		if (conditionExpression != null && conditionExpression.eIsProxy()) {
			InternalEObject oldConditionExpression = (InternalEObject)conditionExpression;
			conditionExpression = (Expression)eResolveProxy(oldConditionExpression);
			if (conditionExpression != oldConditionExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UseCasePackage.CONDÝTÝONAL_SEQUENCE_FLOW__CONDÝTÝON_EXPRESSÝON, oldConditionExpression, conditionExpression));
			}
		}
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetConditionExpression() {
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(Expression newConditionExpression) {
		Expression oldConditionExpression = conditionExpression;
		conditionExpression = newConditionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.CONDÝTÝONAL_SEQUENCE_FLOW__CONDÝTÝON_EXPRESSÝON, oldConditionExpression, conditionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UseCasePackage.CONDÝTÝONAL_SEQUENCE_FLOW__CONDÝTÝON_EXPRESSÝON:
				if (resolve) return getConditionExpression();
				return basicGetConditionExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UseCasePackage.CONDÝTÝONAL_SEQUENCE_FLOW__CONDÝTÝON_EXPRESSÝON:
				setConditionExpression((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UseCasePackage.CONDÝTÝONAL_SEQUENCE_FLOW__CONDÝTÝON_EXPRESSÝON:
				setConditionExpression((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UseCasePackage.CONDÝTÝONAL_SEQUENCE_FLOW__CONDÝTÝON_EXPRESSÝON:
				return conditionExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalSequenceFlowImpl
