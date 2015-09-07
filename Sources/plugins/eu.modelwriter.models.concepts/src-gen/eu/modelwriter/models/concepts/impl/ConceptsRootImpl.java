/**
 */
package eu.modelwriter.models.concepts.impl;

import eu.modelwriter.models.concepts.ConceptsPackage;
import eu.modelwriter.models.concepts.ConceptsRoot;
import eu.modelwriter.models.concepts.JavaConceptsContainer;
import eu.modelwriter.models.concepts.Type;
import eu.modelwriter.models.concepts.resourcesConcepts;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.impl.ConceptsRootImpl#getJavaConcepts <em>Java Concepts</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.impl.ConceptsRootImpl#getEcoreResources <em>Ecore Resources</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.impl.ConceptsRootImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptsRootImpl extends MinimalEObjectImpl.Container implements ConceptsRoot {
	/**
	 * The cached value of the '{@link #getJavaConcepts() <em>Java Concepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaConceptsContainer> javaConcepts;

	/**
	 * The cached value of the '{@link #getEcoreResources() <em>Ecore Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreResources()
	 * @generated
	 * @ordered
	 */
	protected EList<resourcesConcepts> ecoreResources;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptsRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptsPackage.Literals.CONCEPTS_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaConceptsContainer> getJavaConcepts() {
		if (javaConcepts == null) {
			javaConcepts = new EObjectContainmentEList<JavaConceptsContainer>(JavaConceptsContainer.class, this, ConceptsPackage.CONCEPTS_ROOT__JAVA_CONCEPTS);
		}
		return javaConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<resourcesConcepts> getEcoreResources() {
		if (ecoreResources == null) {
			ecoreResources = new EObjectContainmentEList<resourcesConcepts>(resourcesConcepts.class, this, ConceptsPackage.CONCEPTS_ROOT__ECORE_RESOURCES);
		}
		return ecoreResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, ConceptsPackage.CONCEPTS_ROOT__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptsPackage.CONCEPTS_ROOT__JAVA_CONCEPTS:
				return ((InternalEList<?>)getJavaConcepts()).basicRemove(otherEnd, msgs);
			case ConceptsPackage.CONCEPTS_ROOT__ECORE_RESOURCES:
				return ((InternalEList<?>)getEcoreResources()).basicRemove(otherEnd, msgs);
			case ConceptsPackage.CONCEPTS_ROOT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case ConceptsPackage.CONCEPTS_ROOT__JAVA_CONCEPTS:
				return getJavaConcepts();
			case ConceptsPackage.CONCEPTS_ROOT__ECORE_RESOURCES:
				return getEcoreResources();
			case ConceptsPackage.CONCEPTS_ROOT__TYPES:
				return getTypes();
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
			case ConceptsPackage.CONCEPTS_ROOT__JAVA_CONCEPTS:
				getJavaConcepts().clear();
				getJavaConcepts().addAll((Collection<? extends JavaConceptsContainer>)newValue);
				return;
			case ConceptsPackage.CONCEPTS_ROOT__ECORE_RESOURCES:
				getEcoreResources().clear();
				getEcoreResources().addAll((Collection<? extends resourcesConcepts>)newValue);
				return;
			case ConceptsPackage.CONCEPTS_ROOT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
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
			case ConceptsPackage.CONCEPTS_ROOT__JAVA_CONCEPTS:
				getJavaConcepts().clear();
				return;
			case ConceptsPackage.CONCEPTS_ROOT__ECORE_RESOURCES:
				getEcoreResources().clear();
				return;
			case ConceptsPackage.CONCEPTS_ROOT__TYPES:
				getTypes().clear();
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
			case ConceptsPackage.CONCEPTS_ROOT__JAVA_CONCEPTS:
				return javaConcepts != null && !javaConcepts.isEmpty();
			case ConceptsPackage.CONCEPTS_ROOT__ECORE_RESOURCES:
				return ecoreResources != null && !ecoreResources.isEmpty();
			case ConceptsPackage.CONCEPTS_ROOT__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptsRootImpl
