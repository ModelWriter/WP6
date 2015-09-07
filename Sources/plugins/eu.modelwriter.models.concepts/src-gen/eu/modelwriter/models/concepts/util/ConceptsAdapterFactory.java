/**
 */
package eu.modelwriter.models.concepts.util;

import eu.modelwriter.models.concepts.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.modelwriter.models.concepts.ConceptsPackage
 * @generated
 */
public class ConceptsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConceptsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConceptsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptsSwitch<Adapter> modelSwitch =
		new ConceptsSwitch<Adapter>() {
			@Override
			public Adapter caseConceptsRoot(ConceptsRoot object) {
				return createConceptsRootAdapter();
			}
			@Override
			public Adapter caseJavaConceptsContainer(JavaConceptsContainer object) {
				return createJavaConceptsContainerAdapter();
			}
			@Override
			public Adapter caseresourcesConcepts(resourcesConcepts object) {
				return createresourcesConceptsAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseContextPackage(ContextPackage object) {
				return createContextPackageAdapter();
			}
			@Override
			public Adapter caseConceptClass(ConceptClass object) {
				return createConceptClassAdapter();
			}
			@Override
			public Adapter caseConceptVariable(ConceptVariable object) {
				return createConceptVariableAdapter();
			}
			@Override
			public Adapter caseConceptMethod(ConceptMethod object) {
				return createConceptMethodAdapter();
			}
			@Override
			public Adapter caseConceptParameter(ConceptParameter object) {
				return createConceptParameterAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDerivedConcept(DerivedConcept object) {
				return createDerivedConceptAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.ConceptsRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.ConceptsRoot
	 * @generated
	 */
	public Adapter createConceptsRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.JavaConceptsContainer <em>Java Concepts Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.JavaConceptsContainer
	 * @generated
	 */
	public Adapter createJavaConceptsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.resourcesConcepts <em>resources Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.resourcesConcepts
	 * @generated
	 */
	public Adapter createresourcesConceptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.ContextPackage <em>Context Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.ContextPackage
	 * @generated
	 */
	public Adapter createContextPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.ConceptClass <em>Concept Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.ConceptClass
	 * @generated
	 */
	public Adapter createConceptClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.ConceptVariable <em>Concept Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.ConceptVariable
	 * @generated
	 */
	public Adapter createConceptVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.ConceptMethod <em>Concept Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.ConceptMethod
	 * @generated
	 */
	public Adapter createConceptMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.ConceptParameter <em>Concept Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.ConceptParameter
	 * @generated
	 */
	public Adapter createConceptParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.modelwriter.models.concepts.DerivedConcept <em>Derived Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.modelwriter.models.concepts.DerivedConcept
	 * @generated
	 */
	public Adapter createDerivedConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConceptsAdapterFactory
