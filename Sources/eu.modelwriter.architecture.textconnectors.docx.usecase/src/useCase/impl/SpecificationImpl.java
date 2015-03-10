/**
 */
package useCase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import useCase.Actor;
import useCase.Specification;
import useCase.UseCase;
import useCase.UseCasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link useCase.impl.SpecificationImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link useCase.impl.SpecificationImpl#getOwnedActor <em>Owned Actor</em>}</li>
 *   <li>{@link useCase.impl.SpecificationImpl#getOwnedProcess <em>Owned Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationImpl extends NamedElementImpl implements Specification {
	/**
	 * The cached value of the '{@link #getOwnedUseCase() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> ownedUseCase;

	/**
	 * The cached value of the '{@link #getOwnedActor() <em>Owned Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> ownedActor;

	/**
	 * The cached value of the '{@link #getOwnedProcess() <em>Owned Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<useCase.Process> ownedProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasePackage.Literals.SPECÝFÝCATÝON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOwnedUseCase() {
		if (ownedUseCase == null) {
			ownedUseCase = new EObjectContainmentEList<UseCase>(UseCase.class, this, UseCasePackage.SPECÝFÝCATÝON__OWNED_USE_CASE);
		}
		return ownedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getOwnedActor() {
		if (ownedActor == null) {
			ownedActor = new EObjectContainmentEList<Actor>(Actor.class, this, UseCasePackage.SPECÝFÝCATÝON__OWNED_ACTOR);
		}
		return ownedActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<useCase.Process> getOwnedProcess() {
		if (ownedProcess == null) {
			ownedProcess = new EObjectContainmentEList<useCase.Process>(useCase.Process.class, this, UseCasePackage.SPECÝFÝCATÝON__OWNED_PROCESS);
		}
		return ownedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_USE_CASE:
				return ((InternalEList<?>)getOwnedUseCase()).basicRemove(otherEnd, msgs);
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_ACTOR:
				return ((InternalEList<?>)getOwnedActor()).basicRemove(otherEnd, msgs);
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_PROCESS:
				return ((InternalEList<?>)getOwnedProcess()).basicRemove(otherEnd, msgs);
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
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_USE_CASE:
				return getOwnedUseCase();
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_ACTOR:
				return getOwnedActor();
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_PROCESS:
				return getOwnedProcess();
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
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				getOwnedUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_ACTOR:
				getOwnedActor().clear();
				getOwnedActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_PROCESS:
				getOwnedProcess().clear();
				getOwnedProcess().addAll((Collection<? extends useCase.Process>)newValue);
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
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				return;
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_ACTOR:
				getOwnedActor().clear();
				return;
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_PROCESS:
				getOwnedProcess().clear();
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
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_ACTOR:
				return ownedActor != null && !ownedActor.isEmpty();
			case UseCasePackage.SPECÝFÝCATÝON__OWNED_PROCESS:
				return ownedProcess != null && !ownedProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificationImpl
