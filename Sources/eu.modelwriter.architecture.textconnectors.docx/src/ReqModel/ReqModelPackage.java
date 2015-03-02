/**
 */
package ReqModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ReqModel.ReqModelFactory
 * @model kind="package"
 * @generated
 */
public interface ReqModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ReqModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "eu.modelwriter.architecture.textconnectors.docx.reqmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ReqModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReqModelPackage eINSTANCE = ReqModel.impl.ReqModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ReqModel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqModel.impl.NamedElementImpl
	 * @see ReqModel.impl.ReqModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

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
	 * The meta object id for the '{@link ReqModel.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqModel.impl.ProductImpl
	 * @see ReqModel.impl.ReqModelPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__OWNED_DEFÝNÝTÝON = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ReqModel.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqModel.impl.DefinitionImpl
	 * @see ReqModel.impl.ReqModelPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFÝNÝTÝON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFÝNÝTÝON__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFÝNÝTÝON_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ReqModel.impl.RequirementLevelImpl <em>Requirement Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqModel.impl.RequirementLevelImpl
	 * @see ReqModel.impl.ReqModelPackageImpl#getRequirementLevel()
	 * @generated
	 */
	int REQUÝREMENT_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_LEVEL__NAME = DEFÝNÝTÝON__NAME;

	/**
	 * The feature id for the '<em><b>Owned Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_LEVEL__OWNED_DEFÝNÝTÝON = DEFÝNÝTÝON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_LEVEL_FEATURE_COUNT = DEFÝNÝTÝON_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ReqModel.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqModel.impl.RequirementImpl
	 * @see ReqModel.impl.ReqModelPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUÝREMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__NAME = DEFÝNÝTÝON__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__ID = DEFÝNÝTÝON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__DESCRÝPTÝON = DEFÝNÝTÝON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__REFÝNE = DEFÝNÝTÝON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__DEPENDENCY_TO = DEFÝNÝTÝON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__PRÝORÝTY_TYPE = DEFÝNÝTÝON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_FEATURE_COUNT = DEFÝNÝTÝON_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ReqModel.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqModel.impl.TextAreaImpl
	 * @see ReqModel.impl.ReqModelPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NAME = DEFÝNÝTÝON__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__TEXT = DEFÝNÝTÝON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = DEFÝNÝTÝON_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ReqModel.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqModel.Priority
	 * @see ReqModel.impl.ReqModelPackageImpl#getPriority()
	 * @generated
	 */
	int PRÝORÝTY = 6;


	/**
	 * Returns the meta object for class '{@link ReqModel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ReqModel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ReqModel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ReqModel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ReqModel.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see ReqModel.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link ReqModel.Product#getOwnedDefinition <em>Owned Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Definition</em>'.
	 * @see ReqModel.Product#getOwnedDefinition()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_OwnedDefinition();

	/**
	 * Returns the meta object for class '{@link ReqModel.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see ReqModel.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for class '{@link ReqModel.RequirementLevel <em>Requirement Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Level</em>'.
	 * @see ReqModel.RequirementLevel
	 * @generated
	 */
	EClass getRequirementLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link ReqModel.RequirementLevel#getOwnedDefinition <em>Owned Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Definition</em>'.
	 * @see ReqModel.RequirementLevel#getOwnedDefinition()
	 * @see #getRequirementLevel()
	 * @generated
	 */
	EReference getRequirementLevel_OwnedDefinition();

	/**
	 * Returns the meta object for class '{@link ReqModel.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see ReqModel.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ReqModel.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ReqModel.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link ReqModel.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ReqModel.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the reference '{@link ReqModel.Requirement#getRefine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refine</em>'.
	 * @see ReqModel.Requirement#getRefine()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Refine();

	/**
	 * Returns the meta object for the reference '{@link ReqModel.Requirement#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency To</em>'.
	 * @see ReqModel.Requirement#getDependencyTo()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DependencyTo();

	/**
	 * Returns the meta object for the attribute '{@link ReqModel.Requirement#getPriorityType <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Type</em>'.
	 * @see ReqModel.Requirement#getPriorityType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_PriorityType();

	/**
	 * Returns the meta object for class '{@link ReqModel.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see ReqModel.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for the attribute '{@link ReqModel.TextArea#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ReqModel.TextArea#getText()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Text();

	/**
	 * Returns the meta object for enum '{@link ReqModel.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see ReqModel.Priority
	 * @generated
	 */
	EEnum getPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReqModelFactory getReqModelFactory();

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
		 * The meta object literal for the '{@link ReqModel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqModel.impl.NamedElementImpl
		 * @see ReqModel.impl.ReqModelPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link ReqModel.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqModel.impl.ProductImpl
		 * @see ReqModel.impl.ReqModelPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Owned Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__OWNED_DEFÝNÝTÝON = eINSTANCE.getProduct_OwnedDefinition();

		/**
		 * The meta object literal for the '{@link ReqModel.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqModel.impl.DefinitionImpl
		 * @see ReqModel.impl.ReqModelPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFÝNÝTÝON = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '{@link ReqModel.impl.RequirementLevelImpl <em>Requirement Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqModel.impl.RequirementLevelImpl
		 * @see ReqModel.impl.ReqModelPackageImpl#getRequirementLevel()
		 * @generated
		 */
		EClass REQUÝREMENT_LEVEL = eINSTANCE.getRequirementLevel();

		/**
		 * The meta object literal for the '<em><b>Owned Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUÝREMENT_LEVEL__OWNED_DEFÝNÝTÝON = eINSTANCE.getRequirementLevel_OwnedDefinition();

		/**
		 * The meta object literal for the '{@link ReqModel.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqModel.impl.RequirementImpl
		 * @see ReqModel.impl.ReqModelPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUÝREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUÝREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUÝREMENT__DESCRÝPTÝON = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Refine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUÝREMENT__REFÝNE = eINSTANCE.getRequirement_Refine();

		/**
		 * The meta object literal for the '<em><b>Dependency To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUÝREMENT__DEPENDENCY_TO = eINSTANCE.getRequirement_DependencyTo();

		/**
		 * The meta object literal for the '<em><b>Priority Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUÝREMENT__PRÝORÝTY_TYPE = eINSTANCE.getRequirement_PriorityType();

		/**
		 * The meta object literal for the '{@link ReqModel.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqModel.impl.TextAreaImpl
		 * @see ReqModel.impl.ReqModelPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__TEXT = eINSTANCE.getTextArea_Text();

		/**
		 * The meta object literal for the '{@link ReqModel.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqModel.Priority
		 * @see ReqModel.impl.ReqModelPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRÝORÝTY = eINSTANCE.getPriority();

	}

} //ReqModelPackage
