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
 *   <li>{@link useCase.impl.UseCaseImpl#getMainFlow <em>Main Flow</em>}</li>
 *   <li>{@link useCase.impl.UseCaseImpl#getAlternativeFlows <em>Alternative Flows</em>}</li>
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
	 * The cached value of the '{@link #getMainFlow() <em>Main Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFlow()
	 * @generated
	 * @ordered
	 */
	protected useCase.Process mainFlow;

	/**
	 * The cached value of the '{@link #getAlternativeFlows() <em>Alternative Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<useCase.Process> alternativeFlows;

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
	public useCase.Process getMainFlow() {
		if (mainFlow != null && mainFlow.eIsProxy()) {
			InternalEObject oldMainFlow = (InternalEObject)mainFlow;
			mainFlow = (useCase.Process)eResolveProxy(oldMainFlow);
			if (mainFlow != oldMainFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UseCasePackage.USE_CASE__MAÝN_FLOW, oldMainFlow, mainFlow));
			}
		}
		return mainFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public useCase.Process basicGetMainFlow() {
		return mainFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainFlow(useCase.Process newMainFlow, NotificationChain msgs) {
		useCase.Process oldMainFlow = mainFlow;
		mainFlow = newMainFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UseCasePackage.USE_CASE__MAÝN_FLOW, oldMainFlow, newMainFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainFlow(useCase.Process newMainFlow) {
		if (newMainFlow != mainFlow) {
			NotificationChain msgs = null;
			if (mainFlow != null)
				msgs = ((InternalEObject)mainFlow).eInverseRemove(this, UseCasePackage.PROCESS__DEFÝNED_AT, useCase.Process.class, msgs);
			if (newMainFlow != null)
				msgs = ((InternalEObject)newMainFlow).eInverseAdd(this, UseCasePackage.PROCESS__DEFÝNED_AT, useCase.Process.class, msgs);
			msgs = basicSetMainFlow(newMainFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.USE_CASE__MAÝN_FLOW, newMainFlow, newMainFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<useCase.Process> getAlternativeFlows() {
		if (alternativeFlows == null) {
			alternativeFlows = new EObjectContainmentEList<useCase.Process>(useCase.Process.class, this, UseCasePackage.USE_CASE__ALTERNATÝVE_FLOWS);
		}
		return alternativeFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UseCasePackage.USE_CASE__MAÝN_FLOW:
				if (mainFlow != null)
					msgs = ((InternalEObject)mainFlow).eInverseRemove(this, UseCasePackage.PROCESS__DEFÝNED_AT, useCase.Process.class, msgs);
				return basicSetMainFlow((useCase.Process)otherEnd, msgs);
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
			case UseCasePackage.USE_CASE__OWNED_STAKEHOLDER_INTEREST:
				return ((InternalEList<?>)getOwnedStakeholderInterest()).basicRemove(otherEnd, msgs);
			case UseCasePackage.USE_CASE__MAÝN_FLOW:
				return basicSetMainFlow(null, msgs);
			case UseCasePackage.USE_CASE__ALTERNATÝVE_FLOWS:
				return ((InternalEList<?>)getAlternativeFlows()).basicRemove(otherEnd, msgs);
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
			case UseCasePackage.USE_CASE__MAÝN_FLOW:
				if (resolve) return getMainFlow();
				return basicGetMainFlow();
			case UseCasePackage.USE_CASE__ALTERNATÝVE_FLOWS:
				return getAlternativeFlows();
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
			case UseCasePackage.USE_CASE__MAÝN_FLOW:
				setMainFlow((useCase.Process)newValue);
				return;
			case UseCasePackage.USE_CASE__ALTERNATÝVE_FLOWS:
				getAlternativeFlows().clear();
				getAlternativeFlows().addAll((Collection<? extends useCase.Process>)newValue);
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
			case UseCasePackage.USE_CASE__MAÝN_FLOW:
				setMainFlow((useCase.Process)null);
				return;
			case UseCasePackage.USE_CASE__ALTERNATÝVE_FLOWS:
				getAlternativeFlows().clear();
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
			case UseCasePackage.USE_CASE__MAÝN_FLOW:
				return mainFlow != null;
			case UseCasePackage.USE_CASE__ALTERNATÝVE_FLOWS:
				return alternativeFlows != null && !alternativeFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseCaseImpl
