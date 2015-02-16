/**
 */
package SimpleRequirementMM.impl;

import SimpleRequirementMM.Requirement;
import SimpleRequirementMM.SimpleRequirementMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleRequirementMM.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link SimpleRequirementMM.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SimpleRequirementMM.impl.RequirementImpl#getRefine <em>Refine</em>}</li>
 *   <li>{@link SimpleRequirementMM.impl.RequirementImpl#getDependencyTo <em>Dependency To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends NamedElementImpl implements Requirement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int ýd = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRÝPTÝON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRÝPTÝON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefine() <em>Refine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefine()
	 * @generated
	 * @ordered
	 */
	protected Requirement refine;

	/**
	 * The cached value of the '{@link #getDependencyTo() <em>Dependency To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected Requirement dependencyTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRequirementMMPackage.Literals.REQUÝREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return ýd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = ýd;
		ýd = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRequirementMMPackage.REQUÝREMENT__ID, oldId, ýd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRequirementMMPackage.REQUÝREMENT__DESCRÝPTÝON, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getRefine() {
		if (refine != null && refine.eIsProxy()) {
			InternalEObject oldRefine = (InternalEObject)refine;
			refine = (Requirement)eResolveProxy(oldRefine);
			if (refine != oldRefine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleRequirementMMPackage.REQUÝREMENT__REFÝNE, oldRefine, refine));
			}
		}
		return refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRefine() {
		return refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefine(Requirement newRefine) {
		Requirement oldRefine = refine;
		refine = newRefine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRequirementMMPackage.REQUÝREMENT__REFÝNE, oldRefine, refine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getDependencyTo() {
		if (dependencyTo != null && dependencyTo.eIsProxy()) {
			InternalEObject oldDependencyTo = (InternalEObject)dependencyTo;
			dependencyTo = (Requirement)eResolveProxy(oldDependencyTo);
			if (dependencyTo != oldDependencyTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleRequirementMMPackage.REQUÝREMENT__DEPENDENCY_TO, oldDependencyTo, dependencyTo));
			}
		}
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetDependencyTo() {
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyTo(Requirement newDependencyTo) {
		Requirement oldDependencyTo = dependencyTo;
		dependencyTo = newDependencyTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRequirementMMPackage.REQUÝREMENT__DEPENDENCY_TO, oldDependencyTo, dependencyTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleRequirementMMPackage.REQUÝREMENT__ID:
				return getId();
			case SimpleRequirementMMPackage.REQUÝREMENT__DESCRÝPTÝON:
				return getDescription();
			case SimpleRequirementMMPackage.REQUÝREMENT__REFÝNE:
				if (resolve) return getRefine();
				return basicGetRefine();
			case SimpleRequirementMMPackage.REQUÝREMENT__DEPENDENCY_TO:
				if (resolve) return getDependencyTo();
				return basicGetDependencyTo();
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
			case SimpleRequirementMMPackage.REQUÝREMENT__ID:
				setId((Integer)newValue);
				return;
			case SimpleRequirementMMPackage.REQUÝREMENT__DESCRÝPTÝON:
				setDescription((String)newValue);
				return;
			case SimpleRequirementMMPackage.REQUÝREMENT__REFÝNE:
				setRefine((Requirement)newValue);
				return;
			case SimpleRequirementMMPackage.REQUÝREMENT__DEPENDENCY_TO:
				setDependencyTo((Requirement)newValue);
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
			case SimpleRequirementMMPackage.REQUÝREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case SimpleRequirementMMPackage.REQUÝREMENT__DESCRÝPTÝON:
				setDescription(DESCRÝPTÝON_EDEFAULT);
				return;
			case SimpleRequirementMMPackage.REQUÝREMENT__REFÝNE:
				setRefine((Requirement)null);
				return;
			case SimpleRequirementMMPackage.REQUÝREMENT__DEPENDENCY_TO:
				setDependencyTo((Requirement)null);
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
			case SimpleRequirementMMPackage.REQUÝREMENT__ID:
				return ýd != ID_EDEFAULT;
			case SimpleRequirementMMPackage.REQUÝREMENT__DESCRÝPTÝON:
				return DESCRÝPTÝON_EDEFAULT == null ? description != null : !DESCRÝPTÝON_EDEFAULT.equals(description);
			case SimpleRequirementMMPackage.REQUÝREMENT__REFÝNE:
				return refine != null;
			case SimpleRequirementMMPackage.REQUÝREMENT__DEPENDENCY_TO:
				return dependencyTo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Id: ");
		result.append(ýd);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
