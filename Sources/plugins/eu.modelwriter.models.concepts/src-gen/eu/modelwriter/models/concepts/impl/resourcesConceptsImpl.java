/**
 */
package eu.modelwriter.models.concepts.impl;

import eu.modelwriter.models.concepts.ConceptsPackage;
import eu.modelwriter.models.concepts.resourcesConcepts;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>resources Concepts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.impl.resourcesConceptsImpl#getEcoreResource <em>Ecore Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class resourcesConceptsImpl extends MinimalEObjectImpl.Container implements resourcesConcepts {
	/**
	 * The default value of the '{@link #getEcoreResource() <em>Ecore Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreResource()
	 * @generated
	 * @ordered
	 */
	protected static final Resource ECORE_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEcoreResource() <em>Ecore Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreResource()
	 * @generated
	 * @ordered
	 */
	protected Resource ecoreResource = ECORE_RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected resourcesConceptsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptsPackage.Literals.RESOURCES_CONCEPTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getEcoreResource() {
		return ecoreResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreResource(Resource newEcoreResource) {
		Resource oldEcoreResource = ecoreResource;
		ecoreResource = newEcoreResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptsPackage.RESOURCES_CONCEPTS__ECORE_RESOURCE, oldEcoreResource, ecoreResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConceptsPackage.RESOURCES_CONCEPTS__ECORE_RESOURCE:
				return getEcoreResource();
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
			case ConceptsPackage.RESOURCES_CONCEPTS__ECORE_RESOURCE:
				setEcoreResource((Resource)newValue);
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
			case ConceptsPackage.RESOURCES_CONCEPTS__ECORE_RESOURCE:
				setEcoreResource(ECORE_RESOURCE_EDEFAULT);
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
			case ConceptsPackage.RESOURCES_CONCEPTS__ECORE_RESOURCE:
				return ECORE_RESOURCE_EDEFAULT == null ? ecoreResource != null : !ECORE_RESOURCE_EDEFAULT.equals(ecoreResource);
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
		result.append(" (ecoreResource: ");
		result.append(ecoreResource);
		result.append(')');
		return result.toString();
	}

} //resourcesConceptsImpl
