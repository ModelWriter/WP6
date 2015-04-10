/**
 */
package eu.modelwriter.models.concepts.impl;

import eu.modelwriter.models.concepts.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptsFactoryImpl extends EFactoryImpl implements ConceptsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptsFactory init() {
		try {
			ConceptsFactory theConceptsFactory = (ConceptsFactory)EPackage.Registry.INSTANCE.getEFactory(ConceptsPackage.eNS_URI);
			if (theConceptsFactory != null) {
				return theConceptsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConceptsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConceptsPackage.CONCEPTS_ROOT: return createConceptsRoot();
			case ConceptsPackage.JAVA_CONCEPTS_CONTAINER: return createJavaConceptsContainer();
			case ConceptsPackage.RESOURCES_CONCEPTS: return createresourcesConcepts();
			case ConceptsPackage.CONTEXT_PACKAGE: return createContextPackage();
			case ConceptsPackage.CONCEPT_CLASS: return createConceptClass();
			case ConceptsPackage.CONCEPT_VARIABLE: return createConceptVariable();
			case ConceptsPackage.CONCEPT_METHOD: return createConceptMethod();
			case ConceptsPackage.CONCEPT_PARAMETER: return createConceptParameter();
			case ConceptsPackage.TYPE: return createType();
			case ConceptsPackage.NAMED_ELEMENT: return createNamedElement();
			case ConceptsPackage.DERIVED_CONCEPT: return createDerivedConcept();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConceptsPackage.EMF_RESOURCE:
				return createEMFResourceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConceptsPackage.EMF_RESOURCE:
				return convertEMFResourceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptsRoot createConceptsRoot() {
		ConceptsRootImpl conceptsRoot = new ConceptsRootImpl();
		return conceptsRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaConceptsContainer createJavaConceptsContainer() {
		JavaConceptsContainerImpl javaConceptsContainer = new JavaConceptsContainerImpl();
		return javaConceptsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resourcesConcepts createresourcesConcepts() {
		resourcesConceptsImpl resourcesConcepts = new resourcesConceptsImpl();
		return resourcesConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextPackage createContextPackage() {
		ContextPackageImpl contextPackage = new ContextPackageImpl();
		return contextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptClass createConceptClass() {
		ConceptClassImpl conceptClass = new ConceptClassImpl();
		return conceptClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptVariable createConceptVariable() {
		ConceptVariableImpl conceptVariable = new ConceptVariableImpl();
		return conceptVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMethod createConceptMethod() {
		ConceptMethodImpl conceptMethod = new ConceptMethodImpl();
		return conceptMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptParameter createConceptParameter() {
		ConceptParameterImpl conceptParameter = new ConceptParameterImpl();
		return conceptParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedConcept createDerivedConcept() {
		DerivedConceptImpl derivedConcept = new DerivedConceptImpl();
		return derivedConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createEMFResourceFromString(EDataType eDataType, String initialValue) {
		return (Resource)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEMFResourceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptsPackage getConceptsPackage() {
		return (ConceptsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConceptsPackage getPackage() {
		return ConceptsPackage.eINSTANCE;
	}

} //ConceptsFactoryImpl
