/**
 */
package eu.modelwriter.models.concepts.impl;

import eu.modelwriter.models.concepts.Concept;
import eu.modelwriter.models.concepts.ConceptsPackage;
import eu.modelwriter.models.concepts.ContextPackage;
import eu.modelwriter.models.concepts.JavaConceptsContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Concepts Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.modelwriter.models.concepts.impl.JavaConceptsContainerImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link eu.modelwriter.models.concepts.impl.JavaConceptsContainerImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaConceptsContainerImpl extends NamedElementImpl implements JavaConceptsContainer {
	/**
	 * The cached value of the '{@link #getConcepts() <em>Concepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> concepts;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextPackage> contexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaConceptsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptsPackage.Literals.JAVA_CONCEPTS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentEList<Concept>(Concept.class, this, ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONCEPTS);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextPackage> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<ContextPackage>(ContextPackage.class, this, ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONCEPTS:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
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
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONCEPTS:
				return getConcepts();
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONTEXTS:
				return getContexts();
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
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONCEPTS:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends Concept>)newValue);
				return;
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends ContextPackage>)newValue);
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
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONCEPTS:
				getConcepts().clear();
				return;
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONTEXTS:
				getContexts().clear();
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
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONCEPTS:
				return concepts != null && !concepts.isEmpty();
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JavaConceptsContainerImpl
