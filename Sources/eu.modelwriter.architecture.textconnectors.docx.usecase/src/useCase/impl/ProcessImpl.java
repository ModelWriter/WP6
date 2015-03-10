/**
 */
package useCase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import useCase.FlowElement;
import useCase.UseCase;
import useCase.UseCasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link useCase.impl.ProcessImpl#getDefinedAt <em>Defined At</em>}</li>
 *   <li>{@link useCase.impl.ProcessImpl#getOwnedFlowElements <em>Owned Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends NamedElementImpl implements useCase.Process {
	/**
	 * The cached value of the '{@link #getDefinedAt() <em>Defined At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedAt()
	 * @generated
	 * @ordered
	 */
	protected UseCase definedAt;

	/**
	 * The cached value of the '{@link #getOwnedFlowElements() <em>Owned Flow Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFlowElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowElement> ownedFlowElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasePackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getDefinedAt() {
		if (definedAt != null && definedAt.eIsProxy()) {
			InternalEObject oldDefinedAt = (InternalEObject)definedAt;
			definedAt = (UseCase)eResolveProxy(oldDefinedAt);
			if (definedAt != oldDefinedAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UseCasePackage.PROCESS__DEFÝNED_AT, oldDefinedAt, definedAt));
			}
		}
		return definedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetDefinedAt() {
		return definedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedAt(UseCase newDefinedAt, NotificationChain msgs) {
		UseCase oldDefinedAt = definedAt;
		definedAt = newDefinedAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UseCasePackage.PROCESS__DEFÝNED_AT, oldDefinedAt, newDefinedAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedAt(UseCase newDefinedAt) {
		if (newDefinedAt != definedAt) {
			NotificationChain msgs = null;
			if (definedAt != null)
				msgs = ((InternalEObject)definedAt).eInverseRemove(this, UseCasePackage.USE_CASE__MAÝN_FLOW, UseCase.class, msgs);
			if (newDefinedAt != null)
				msgs = ((InternalEObject)newDefinedAt).eInverseAdd(this, UseCasePackage.USE_CASE__MAÝN_FLOW, UseCase.class, msgs);
			msgs = basicSetDefinedAt(newDefinedAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.PROCESS__DEFÝNED_AT, newDefinedAt, newDefinedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowElement> getOwnedFlowElements() {
		if (ownedFlowElements == null) {
			ownedFlowElements = new EObjectContainmentEList<FlowElement>(FlowElement.class, this, UseCasePackage.PROCESS__OWNED_FLOW_ELEMENTS);
		}
		return ownedFlowElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UseCasePackage.PROCESS__DEFÝNED_AT:
				if (definedAt != null)
					msgs = ((InternalEObject)definedAt).eInverseRemove(this, UseCasePackage.USE_CASE__MAÝN_FLOW, UseCase.class, msgs);
				return basicSetDefinedAt((UseCase)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UseCasePackage.PROCESS__DEFÝNED_AT:
				return basicSetDefinedAt(null, msgs);
			case UseCasePackage.PROCESS__OWNED_FLOW_ELEMENTS:
				return ((InternalEList<?>)getOwnedFlowElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UseCasePackage.PROCESS__DEFÝNED_AT:
				if (resolve) return getDefinedAt();
				return basicGetDefinedAt();
			case UseCasePackage.PROCESS__OWNED_FLOW_ELEMENTS:
				return getOwnedFlowElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UseCasePackage.PROCESS__DEFÝNED_AT:
				setDefinedAt((UseCase)newValue);
				return;
			case UseCasePackage.PROCESS__OWNED_FLOW_ELEMENTS:
				getOwnedFlowElements().clear();
				getOwnedFlowElements().addAll((Collection<? extends FlowElement>)newValue);
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
			case UseCasePackage.PROCESS__DEFÝNED_AT:
				setDefinedAt((UseCase)null);
				return;
			case UseCasePackage.PROCESS__OWNED_FLOW_ELEMENTS:
				getOwnedFlowElements().clear();
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
			case UseCasePackage.PROCESS__DEFÝNED_AT:
				return definedAt != null;
			case UseCasePackage.PROCESS__OWNED_FLOW_ELEMENTS:
				return ownedFlowElements != null && !ownedFlowElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
