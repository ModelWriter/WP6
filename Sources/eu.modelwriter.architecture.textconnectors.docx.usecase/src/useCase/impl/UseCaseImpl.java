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

import useCase.Actor;
import useCase.Interest;
import useCase.UseCase;
import useCase.UseCasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link useCase.impl.UseCaseImpl#getPrimaryActor <em>Primary Actor</em>}</li>
 *   <li>{@link useCase.impl.UseCaseImpl#getOwnedStakeholderInterest <em>Owned Stakeholder Interest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends NamedElementImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getPrimaryActor() <em>Primary Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryActor()
	 * @generated
	 * @ordered
	 */
	protected Actor primaryActor;

	/**
	 * The cached value of the '{@link #getOwnedStakeholderInterest() <em>Owned Stakeholder Interest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStakeholderInterest()
	 * @generated
	 * @ordered
	 */
	protected EList<Interest> ownedStakeholderInterest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasePackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getPrimaryActor() {
		if (primaryActor != null && primaryActor.eIsProxy()) {
			InternalEObject oldPrimaryActor = (InternalEObject)primaryActor;
			primaryActor = (Actor)eResolveProxy(oldPrimaryActor);
			if (primaryActor != oldPrimaryActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UseCasePackage.USE_CASE__PRÝMARY_ACTOR, oldPrimaryActor, primaryActor));
			}
		}
		return primaryActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetPrimaryActor() {
		return primaryActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryActor(Actor newPrimaryActor) {
		Actor oldPrimaryActor = primaryActor;
		primaryActor = newPrimaryActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.USE_CASE__PRÝMARY_ACTOR, oldPrimaryActor, primaryActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interest> getOwnedStakeholderInterest() {
		if (ownedStakeholderInterest == null) {
			ownedStakeholderInterest = new EObjectContainmentEList<Interest>(Interest.class, this, UseCasePackage.USE_CASE__OWNED_STAKEHOLDER_INTEREST);
		}
		return ownedStakeholderInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UseCasePackage.USE_CASE__OWNED_STAKEHOLDER_INTEREST:
				return ((InternalEList<?>)getOwnedStakeholderInterest()).basicRemove(otherEnd, msgs);
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
			case UseCasePackage.USE_CASE__PRÝMARY_ACTOR:
				if (resolve) return getPrimaryActor();
				return basicGetPrimaryActor();
			case UseCasePackage.USE_CASE__OWNED_STAKEHOLDER_INTEREST:
				return getOwnedStakeholderInterest();
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
			case UseCasePackage.USE_CASE__PRÝMARY_ACTOR:
				setPrimaryActor((Actor)newValue);
				return;
			case UseCasePackage.USE_CASE__OWNED_STAKEHOLDER_INTEREST:
				getOwnedStakeholderInterest().clear();
				getOwnedStakeholderInterest().addAll((Collection<? extends Interest>)newValue);
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
			case UseCasePackage.USE_CASE__PRÝMARY_ACTOR:
				setPrimaryActor((Actor)null);
				return;
			case UseCasePackage.USE_CASE__OWNED_STAKEHOLDER_INTEREST:
				getOwnedStakeholderInterest().clear();
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
			case UseCasePackage.USE_CASE__PRÝMARY_ACTOR:
				return primaryActor != null;
			case UseCasePackage.USE_CASE__OWNED_STAKEHOLDER_INTEREST:
				return ownedStakeholderInterest != null && !ownedStakeholderInterest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseCaseImpl
