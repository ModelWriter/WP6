/**
 */
package eu.modelwriter.models.concepts.impl;

import eu.modelwriter.models.concepts.Concept;
import eu.modelwriter.models.concepts.ConceptClass;
import eu.modelwriter.models.concepts.ConceptMethod;
import eu.modelwriter.models.concepts.ConceptParameter;
import eu.modelwriter.models.concepts.ConceptVariable;
import eu.modelwriter.models.concepts.ConceptsFactory;
import eu.modelwriter.models.concepts.ConceptsPackage;
import eu.modelwriter.models.concepts.ConceptsRoot;
import eu.modelwriter.models.concepts.ContextPackage;
import eu.modelwriter.models.concepts.DerivedConcept;
import eu.modelwriter.models.concepts.JavaConceptsContainer;
import eu.modelwriter.models.concepts.NamedElement;
import eu.modelwriter.models.concepts.Type;
import eu.modelwriter.models.concepts.resourcesConcepts;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptsPackageImpl extends EPackageImpl implements ConceptsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptsRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaConceptsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesConceptsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emfResourceEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.modelwriter.models.concepts.ConceptsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConceptsPackageImpl() {
		super(eNS_URI, ConceptsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConceptsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConceptsPackage init() {
		if (isInited) return (ConceptsPackage)EPackage.Registry.INSTANCE.getEPackage(ConceptsPackage.eNS_URI);

		// Obtain or create and register package
		ConceptsPackageImpl theConceptsPackage = (ConceptsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConceptsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConceptsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConceptsPackage.createPackageContents();

		// Initialize created meta-data
		theConceptsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConceptsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConceptsPackage.eNS_URI, theConceptsPackage);
		return theConceptsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptsRoot() {
		return conceptsRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptsRoot_JavaConcepts() {
		return (EReference)conceptsRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptsRoot_EcoreResources() {
		return (EReference)conceptsRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptsRoot_Types() {
		return (EReference)conceptsRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaConceptsContainer() {
		return javaConceptsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaConceptsContainer_Concepts() {
		return (EReference)javaConceptsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaConceptsContainer_Contexts() {
		return (EReference)javaConceptsContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getresourcesConcepts() {
		return resourcesConceptsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getresourcesConcepts_EcoreResource() {
		return (EAttribute)resourcesConceptsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextPackage() {
		return contextPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptClass() {
		return conceptClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptClass_Context() {
		return (EReference)conceptClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptVariable() {
		return conceptVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptVariable_ReturnType() {
		return (EReference)conceptVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptVariable_Context() {
		return (EReference)conceptVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMethod() {
		return conceptMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMethod_ReturnType() {
		return (EReference)conceptMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMethod_Parameters() {
		return (EReference)conceptMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMethod_Context() {
		return (EReference)conceptMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptParameter() {
		return conceptParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptParameter_Type() {
		return (EReference)conceptParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptParameter_Context() {
		return (EReference)conceptParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_ReferencedClass() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedConcept() {
		return derivedConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEMFResource() {
		return emfResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptsFactory getConceptsFactory() {
		return (ConceptsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		conceptsRootEClass = createEClass(CONCEPTS_ROOT);
		createEReference(conceptsRootEClass, CONCEPTS_ROOT__JAVA_CONCEPTS);
		createEReference(conceptsRootEClass, CONCEPTS_ROOT__ECORE_RESOURCES);
		createEReference(conceptsRootEClass, CONCEPTS_ROOT__TYPES);

		javaConceptsContainerEClass = createEClass(JAVA_CONCEPTS_CONTAINER);
		createEReference(javaConceptsContainerEClass, JAVA_CONCEPTS_CONTAINER__CONCEPTS);
		createEReference(javaConceptsContainerEClass, JAVA_CONCEPTS_CONTAINER__CONTEXTS);

		resourcesConceptsEClass = createEClass(RESOURCES_CONCEPTS);
		createEAttribute(resourcesConceptsEClass, RESOURCES_CONCEPTS__ECORE_RESOURCE);

		conceptEClass = createEClass(CONCEPT);

		contextPackageEClass = createEClass(CONTEXT_PACKAGE);

		conceptClassEClass = createEClass(CONCEPT_CLASS);
		createEReference(conceptClassEClass, CONCEPT_CLASS__CONTEXT);

		conceptVariableEClass = createEClass(CONCEPT_VARIABLE);
		createEReference(conceptVariableEClass, CONCEPT_VARIABLE__RETURN_TYPE);
		createEReference(conceptVariableEClass, CONCEPT_VARIABLE__CONTEXT);

		conceptMethodEClass = createEClass(CONCEPT_METHOD);
		createEReference(conceptMethodEClass, CONCEPT_METHOD__RETURN_TYPE);
		createEReference(conceptMethodEClass, CONCEPT_METHOD__PARAMETERS);
		createEReference(conceptMethodEClass, CONCEPT_METHOD__CONTEXT);

		conceptParameterEClass = createEClass(CONCEPT_PARAMETER);
		createEReference(conceptParameterEClass, CONCEPT_PARAMETER__TYPE);
		createEReference(conceptParameterEClass, CONCEPT_PARAMETER__CONTEXT);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__REFERENCED_CLASS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		derivedConceptEClass = createEClass(DERIVED_CONCEPT);

		// Create data types
		emfResourceEDataType = createEDataType(EMF_RESOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		javaConceptsContainerEClass.getESuperTypes().add(this.getNamedElement());
		conceptEClass.getESuperTypes().add(this.getNamedElement());
		contextPackageEClass.getESuperTypes().add(this.getNamedElement());
		conceptClassEClass.getESuperTypes().add(this.getConcept());
		conceptVariableEClass.getESuperTypes().add(this.getDerivedConcept());
		conceptMethodEClass.getESuperTypes().add(this.getDerivedConcept());
		conceptParameterEClass.getESuperTypes().add(this.getDerivedConcept());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		derivedConceptEClass.getESuperTypes().add(this.getConcept());

		// Initialize classes, features, and operations; add parameters
		initEClass(conceptsRootEClass, ConceptsRoot.class, "ConceptsRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptsRoot_JavaConcepts(), this.getJavaConceptsContainer(), null, "javaConcepts", null, 0, -1, ConceptsRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptsRoot_EcoreResources(), this.getresourcesConcepts(), null, "ecoreResources", null, 0, -1, ConceptsRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptsRoot_Types(), this.getType(), null, "types", null, 0, -1, ConceptsRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaConceptsContainerEClass, JavaConceptsContainer.class, "JavaConceptsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaConceptsContainer_Concepts(), this.getConcept(), null, "concepts", null, 1, -1, JavaConceptsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaConceptsContainer_Contexts(), this.getContextPackage(), null, "contexts", null, 0, -1, JavaConceptsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcesConceptsEClass, resourcesConcepts.class, "resourcesConcepts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getresourcesConcepts_EcoreResource(), this.getEMFResource(), "ecoreResource", null, 1, 1, resourcesConcepts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptEClass, Concept.class, "Concept", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextPackageEClass, ContextPackage.class, "ContextPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptClassEClass, ConceptClass.class, "ConceptClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptClass_Context(), this.getContextPackage(), null, "context", null, 1, 1, ConceptClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptVariableEClass, ConceptVariable.class, "ConceptVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptVariable_ReturnType(), this.getType(), null, "returnType", null, 0, 1, ConceptVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptVariable_Context(), this.getConceptClass(), null, "context", null, 1, 1, ConceptVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptMethodEClass, ConceptMethod.class, "ConceptMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptMethod_ReturnType(), this.getType(), null, "returnType", null, 0, 1, ConceptMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptMethod_Parameters(), this.getConceptParameter(), null, "parameters", null, 0, -1, ConceptMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptMethod_Context(), this.getConceptClass(), null, "context", null, 1, 1, ConceptMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptParameterEClass, ConceptParameter.class, "ConceptParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptParameter_Type(), this.getType(), null, "type", null, 1, 1, ConceptParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptParameter_Context(), this.getConceptMethod(), null, "context", null, 1, 1, ConceptParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_ReferencedClass(), this.getConceptClass(), null, "referencedClass", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedConceptEClass, DerivedConcept.class, "DerivedConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(emfResourceEDataType, Resource.class, "EMFResource", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ConceptsPackageImpl
