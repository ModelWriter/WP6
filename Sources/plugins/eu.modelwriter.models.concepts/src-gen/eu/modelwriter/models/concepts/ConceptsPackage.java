/**
 */
package eu.modelwriter.models.concepts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.modelwriter.models.concepts.ConceptsFactory
 * @model kind="package"
 * @generated
 */
public interface ConceptsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concepts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.concepts.eu/modelwriter/concepts/0.9";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concepts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptsPackage eINSTANCE = eu.modelwriter.models.concepts.impl.ConceptsPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.ConceptsRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.ConceptsRootImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptsRoot()
	 * @generated
	 */
	int CONCEPTS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Java Concepts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTS_ROOT__JAVA_CONCEPTS = 0;

	/**
	 * The feature id for the '<em><b>Ecore Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTS_ROOT__ECORE_RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTS_ROOT__TYPES = 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTS_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTS_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.resourcesConceptsImpl <em>resources Concepts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.resourcesConceptsImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getresourcesConcepts()
	 * @generated
	 */
	int RESOURCES_CONCEPTS = 2;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.NamedElementImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.JavaConceptsContainerImpl <em>Java Concepts Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.JavaConceptsContainerImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getJavaConceptsContainer()
	 * @generated
	 */
	int JAVA_CONCEPTS_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CONCEPTS_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CONCEPTS_CONTAINER__CONCEPTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CONCEPTS_CONTAINER__CONTEXTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Concepts Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CONCEPTS_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Java Concepts Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CONCEPTS_CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ecore Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONCEPTS__ECORE_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>resources Concepts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONCEPTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>resources Concepts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_CONCEPTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.Concept <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.Concept
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.ContextPackageImpl <em>Context Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.ContextPackageImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getContextPackage()
	 * @generated
	 */
	int CONTEXT_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Context Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.ConceptClassImpl <em>Concept Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.ConceptClassImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptClass()
	 * @generated
	 */
	int CONCEPT_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_CLASS__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_CLASS__CONTEXT = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_CLASS_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concept Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_CLASS_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.DerivedConceptImpl <em>Derived Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.DerivedConceptImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getDerivedConcept()
	 * @generated
	 */
	int DERIVED_CONCEPT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_CONCEPT__NAME = CONCEPT__NAME;

	/**
	 * The number of structural features of the '<em>Derived Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_CONCEPT_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Derived Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_CONCEPT_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.ConceptVariableImpl <em>Concept Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.ConceptVariableImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptVariable()
	 * @generated
	 */
	int CONCEPT_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_VARIABLE__NAME = DERIVED_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_VARIABLE__RETURN_TYPE = DERIVED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_VARIABLE__CONTEXT = DERIVED_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concept Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_VARIABLE_FEATURE_COUNT = DERIVED_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Concept Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_VARIABLE_OPERATION_COUNT = DERIVED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.ConceptMethodImpl <em>Concept Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.ConceptMethodImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptMethod()
	 * @generated
	 */
	int CONCEPT_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METHOD__NAME = DERIVED_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METHOD__RETURN_TYPE = DERIVED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METHOD__PARAMETERS = DERIVED_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METHOD__CONTEXT = DERIVED_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concept Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METHOD_FEATURE_COUNT = DERIVED_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Concept Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METHOD_OPERATION_COUNT = DERIVED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.ConceptParameterImpl <em>Concept Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.ConceptParameterImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptParameter()
	 * @generated
	 */
	int CONCEPT_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_PARAMETER__NAME = DERIVED_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_PARAMETER__TYPE = DERIVED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_PARAMETER__CONTEXT = DERIVED_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concept Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_PARAMETER_FEATURE_COUNT = DERIVED_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Concept Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_PARAMETER_OPERATION_COUNT = DERIVED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.modelwriter.models.concepts.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.modelwriter.models.concepts.impl.TypeImpl
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Referenced Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REFERENCED_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>EMF Resource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getEMFResource()
	 * @generated
	 */
	int EMF_RESOURCE = 12;


	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.ConceptsRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptsRoot
	 * @generated
	 */
	EClass getConceptsRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.modelwriter.models.concepts.ConceptsRoot#getJavaConcepts <em>Java Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java Concepts</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptsRoot#getJavaConcepts()
	 * @see #getConceptsRoot()
	 * @generated
	 */
	EReference getConceptsRoot_JavaConcepts();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.modelwriter.models.concepts.ConceptsRoot#getEcoreResources <em>Ecore Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecore Resources</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptsRoot#getEcoreResources()
	 * @see #getConceptsRoot()
	 * @generated
	 */
	EReference getConceptsRoot_EcoreResources();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.modelwriter.models.concepts.ConceptsRoot#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptsRoot#getTypes()
	 * @see #getConceptsRoot()
	 * @generated
	 */
	EReference getConceptsRoot_Types();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.JavaConceptsContainer <em>Java Concepts Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Concepts Container</em>'.
	 * @see eu.modelwriter.models.concepts.JavaConceptsContainer
	 * @generated
	 */
	EClass getJavaConceptsContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.modelwriter.models.concepts.JavaConceptsContainer#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concepts</em>'.
	 * @see eu.modelwriter.models.concepts.JavaConceptsContainer#getConcepts()
	 * @see #getJavaConceptsContainer()
	 * @generated
	 */
	EReference getJavaConceptsContainer_Concepts();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.modelwriter.models.concepts.JavaConceptsContainer#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see eu.modelwriter.models.concepts.JavaConceptsContainer#getContexts()
	 * @see #getJavaConceptsContainer()
	 * @generated
	 */
	EReference getJavaConceptsContainer_Contexts();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.resourcesConcepts <em>resources Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>resources Concepts</em>'.
	 * @see eu.modelwriter.models.concepts.resourcesConcepts
	 * @generated
	 */
	EClass getresourcesConcepts();

	/**
	 * Returns the meta object for the attribute '{@link eu.modelwriter.models.concepts.resourcesConcepts#getEcoreResource <em>Ecore Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ecore Resource</em>'.
	 * @see eu.modelwriter.models.concepts.resourcesConcepts#getEcoreResource()
	 * @see #getresourcesConcepts()
	 * @generated
	 */
	EAttribute getresourcesConcepts_EcoreResource();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see eu.modelwriter.models.concepts.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.ContextPackage <em>Context Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Package</em>'.
	 * @see eu.modelwriter.models.concepts.ContextPackage
	 * @generated
	 */
	EClass getContextPackage();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.ConceptClass <em>Concept Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Class</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptClass
	 * @generated
	 */
	EClass getConceptClass();

	/**
	 * Returns the meta object for the reference '{@link eu.modelwriter.models.concepts.ConceptClass#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptClass#getContext()
	 * @see #getConceptClass()
	 * @generated
	 */
	EReference getConceptClass_Context();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.ConceptVariable <em>Concept Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Variable</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptVariable
	 * @generated
	 */
	EClass getConceptVariable();

	/**
	 * Returns the meta object for the reference '{@link eu.modelwriter.models.concepts.ConceptVariable#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptVariable#getReturnType()
	 * @see #getConceptVariable()
	 * @generated
	 */
	EReference getConceptVariable_ReturnType();

	/**
	 * Returns the meta object for the reference '{@link eu.modelwriter.models.concepts.ConceptVariable#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptVariable#getContext()
	 * @see #getConceptVariable()
	 * @generated
	 */
	EReference getConceptVariable_Context();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.ConceptMethod <em>Concept Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Method</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptMethod
	 * @generated
	 */
	EClass getConceptMethod();

	/**
	 * Returns the meta object for the reference '{@link eu.modelwriter.models.concepts.ConceptMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptMethod#getReturnType()
	 * @see #getConceptMethod()
	 * @generated
	 */
	EReference getConceptMethod_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link eu.modelwriter.models.concepts.ConceptMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptMethod#getParameters()
	 * @see #getConceptMethod()
	 * @generated
	 */
	EReference getConceptMethod_Parameters();

	/**
	 * Returns the meta object for the reference '{@link eu.modelwriter.models.concepts.ConceptMethod#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptMethod#getContext()
	 * @see #getConceptMethod()
	 * @generated
	 */
	EReference getConceptMethod_Context();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.ConceptParameter <em>Concept Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Parameter</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptParameter
	 * @generated
	 */
	EClass getConceptParameter();

	/**
	 * Returns the meta object for the reference '{@link eu.modelwriter.models.concepts.ConceptParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptParameter#getType()
	 * @see #getConceptParameter()
	 * @generated
	 */
	EReference getConceptParameter_Type();

	/**
	 * Returns the meta object for the reference '{@link eu.modelwriter.models.concepts.ConceptParameter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see eu.modelwriter.models.concepts.ConceptParameter#getContext()
	 * @see #getConceptParameter()
	 * @generated
	 */
	EReference getConceptParameter_Context();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see eu.modelwriter.models.concepts.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference list '{@link eu.modelwriter.models.concepts.Type#getReferencedClass <em>Referenced Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Class</em>'.
	 * @see eu.modelwriter.models.concepts.Type#getReferencedClass()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_ReferencedClass();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see eu.modelwriter.models.concepts.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.modelwriter.models.concepts.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.modelwriter.models.concepts.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.modelwriter.models.concepts.DerivedConcept <em>Derived Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Concept</em>'.
	 * @see eu.modelwriter.models.concepts.DerivedConcept
	 * @generated
	 */
	EClass getDerivedConcept();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>EMF Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EMF Resource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource"
	 * @generated
	 */
	EDataType getEMFResource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConceptsFactory getConceptsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.ConceptsRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.ConceptsRootImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptsRoot()
		 * @generated
		 */
		EClass CONCEPTS_ROOT = eINSTANCE.getConceptsRoot();

		/**
		 * The meta object literal for the '<em><b>Java Concepts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTS_ROOT__JAVA_CONCEPTS = eINSTANCE.getConceptsRoot_JavaConcepts();

		/**
		 * The meta object literal for the '<em><b>Ecore Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTS_ROOT__ECORE_RESOURCES = eINSTANCE.getConceptsRoot_EcoreResources();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTS_ROOT__TYPES = eINSTANCE.getConceptsRoot_Types();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.JavaConceptsContainerImpl <em>Java Concepts Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.JavaConceptsContainerImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getJavaConceptsContainer()
		 * @generated
		 */
		EClass JAVA_CONCEPTS_CONTAINER = eINSTANCE.getJavaConceptsContainer();

		/**
		 * The meta object literal for the '<em><b>Concepts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CONCEPTS_CONTAINER__CONCEPTS = eINSTANCE.getJavaConceptsContainer_Concepts();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CONCEPTS_CONTAINER__CONTEXTS = eINSTANCE.getJavaConceptsContainer_Contexts();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.resourcesConceptsImpl <em>resources Concepts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.resourcesConceptsImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getresourcesConcepts()
		 * @generated
		 */
		EClass RESOURCES_CONCEPTS = eINSTANCE.getresourcesConcepts();

		/**
		 * The meta object literal for the '<em><b>Ecore Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES_CONCEPTS__ECORE_RESOURCE = eINSTANCE.getresourcesConcepts_EcoreResource();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.Concept <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.Concept
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.ContextPackageImpl <em>Context Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.ContextPackageImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getContextPackage()
		 * @generated
		 */
		EClass CONTEXT_PACKAGE = eINSTANCE.getContextPackage();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.ConceptClassImpl <em>Concept Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.ConceptClassImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptClass()
		 * @generated
		 */
		EClass CONCEPT_CLASS = eINSTANCE.getConceptClass();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_CLASS__CONTEXT = eINSTANCE.getConceptClass_Context();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.ConceptVariableImpl <em>Concept Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.ConceptVariableImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptVariable()
		 * @generated
		 */
		EClass CONCEPT_VARIABLE = eINSTANCE.getConceptVariable();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_VARIABLE__RETURN_TYPE = eINSTANCE.getConceptVariable_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_VARIABLE__CONTEXT = eINSTANCE.getConceptVariable_Context();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.ConceptMethodImpl <em>Concept Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.ConceptMethodImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptMethod()
		 * @generated
		 */
		EClass CONCEPT_METHOD = eINSTANCE.getConceptMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_METHOD__RETURN_TYPE = eINSTANCE.getConceptMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_METHOD__PARAMETERS = eINSTANCE.getConceptMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_METHOD__CONTEXT = eINSTANCE.getConceptMethod_Context();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.ConceptParameterImpl <em>Concept Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.ConceptParameterImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getConceptParameter()
		 * @generated
		 */
		EClass CONCEPT_PARAMETER = eINSTANCE.getConceptParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_PARAMETER__TYPE = eINSTANCE.getConceptParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_PARAMETER__CONTEXT = eINSTANCE.getConceptParameter_Context();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.TypeImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Referenced Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__REFERENCED_CLASS = eINSTANCE.getType_ReferencedClass();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.NamedElementImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link eu.modelwriter.models.concepts.impl.DerivedConceptImpl <em>Derived Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.modelwriter.models.concepts.impl.DerivedConceptImpl
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getDerivedConcept()
		 * @generated
		 */
		EClass DERIVED_CONCEPT = eINSTANCE.getDerivedConcept();

		/**
		 * The meta object literal for the '<em>EMF Resource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see eu.modelwriter.models.concepts.impl.ConceptsPackageImpl#getEMFResource()
		 * @generated
		 */
		EDataType EMF_RESOURCE = eINSTANCE.getEMFResource();

	}

} //ConceptsPackage
