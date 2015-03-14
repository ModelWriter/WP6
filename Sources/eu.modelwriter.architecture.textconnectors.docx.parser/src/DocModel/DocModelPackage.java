/**
 */
package DocModel;

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
 * @see DocModel.DocModelFactory
 * @model kind="package"
 * @generated
 */
public interface DocModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DocModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "eu.modelwriter.architecture.textconnectors.docx.parser.documentmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eu.modelwriter.architecture.textconnectors.docx.parser";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocModelPackage eINSTANCE = DocModel.impl.DocModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link DocModel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.ElementImpl
	 * @see DocModel.impl.DocModelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.NodeImpl
	 * @see DocModel.impl.DocModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TEXT = ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Owned Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNED_NODE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NEXT_NODE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prev Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PREV_NODE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT_NODE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aggregated Run</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AGGREGATED_RUN = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.NamedElementImpl
	 * @see DocModel.impl.DocModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__TEXT = ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.DocumentImpl
	 * @see DocModel.impl.DocModelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TEXT = NAMED_ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_NODE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.NamedNodeImpl <em>Named Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.NamedNodeImpl
	 * @see DocModel.impl.DocModelPackageImpl#getNamedNode()
	 * @generated
	 */
	int NAMED_NODE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__TEXT = NODE__TEXT;

	/**
	 * The feature id for the '<em><b>Owned Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__OWNED_NODE = NODE__OWNED_NODE;

	/**
	 * The feature id for the '<em><b>Next Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__NEXT_NODE = NODE__NEXT_NODE;

	/**
	 * The feature id for the '<em><b>Prev Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__PREV_NODE = NODE__PREV_NODE;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__PARENT_NODE = NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Aggregated Run</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__AGGREGATED_RUN = NODE__AGGREGATED_RUN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paragraf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__PARAGRAF = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.ListedNodeImpl <em>Listed Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.ListedNodeImpl
	 * @see DocModel.impl.DocModelPackageImpl#getListedNode()
	 * @generated
	 */
	int LISTED_NODE = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE__TEXT = NAMED_NODE__TEXT;

	/**
	 * The feature id for the '<em><b>Owned Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE__OWNED_NODE = NAMED_NODE__OWNED_NODE;

	/**
	 * The feature id for the '<em><b>Next Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE__NEXT_NODE = NAMED_NODE__NEXT_NODE;

	/**
	 * The feature id for the '<em><b>Prev Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE__PREV_NODE = NAMED_NODE__PREV_NODE;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE__PARENT_NODE = NAMED_NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Aggregated Run</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE__AGGREGATED_RUN = NAMED_NODE__AGGREGATED_RUN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE__NAME = NAMED_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Paragraf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE__PARAGRAF = NAMED_NODE__PARAGRAF;

	/**
	 * The number of structural features of the '<em>Listed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE_FEATURE_COUNT = NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Listed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTED_NODE_OPERATION_COUNT = NAMED_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>XWPF Run</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xwpf.usermodel.XWPFRun
	 * @see DocModel.impl.DocModelPackageImpl#getXWPFRun()
	 * @generated
	 */
	int XWPF_RUN = 6;

	/**
	 * The meta object id for the '<em>XWPF Document</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xwpf.usermodel.XWPFDocument
	 * @see DocModel.impl.DocModelPackageImpl#getXWPFDocument()
	 * @generated
	 */
	int XWPF_DOCUMENT = 7;

	/**
	 * The meta object id for the '<em>XWPF Paragraph</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xwpf.usermodel.XWPFParagraph
	 * @see DocModel.impl.DocModelPackageImpl#getXWPFParagraph()
	 * @generated
	 */
	int XWPF_PARAGRAPH = 8;


	/**
	 * Returns the meta object for class '{@link DocModel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see DocModel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link DocModel.Element#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see DocModel.Element#getText()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Text();

	/**
	 * Returns the meta object for class '{@link DocModel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see DocModel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link DocModel.Node#getOwnedNode <em>Owned Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Node</em>'.
	 * @see DocModel.Node#getOwnedNode()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OwnedNode();

	/**
	 * Returns the meta object for the containment reference '{@link DocModel.Node#getNextNode <em>Next Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Node</em>'.
	 * @see DocModel.Node#getNextNode()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_NextNode();

	/**
	 * Returns the meta object for the container reference '{@link DocModel.Node#getPrevNode <em>Prev Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Prev Node</em>'.
	 * @see DocModel.Node#getPrevNode()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_PrevNode();

	/**
	 * Returns the meta object for the container reference '{@link DocModel.Node#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see DocModel.Node#getParentNode()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ParentNode();

	/**
	 * Returns the meta object for the attribute list '{@link DocModel.Node#getAggregatedRun <em>Aggregated Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aggregated Run</em>'.
	 * @see DocModel.Node#getAggregatedRun()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_AggregatedRun();

	/**
	 * Returns the meta object for class '{@link DocModel.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see DocModel.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link DocModel.Document#getOwnedNode <em>Owned Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Node</em>'.
	 * @see DocModel.Document#getOwnedNode()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_OwnedNode();

	/**
	 * Returns the meta object for the attribute '{@link DocModel.Document#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document</em>'.
	 * @see DocModel.Document#getDocument()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Document();

	/**
	 * Returns the meta object for class '{@link DocModel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see DocModel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link DocModel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DocModel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link DocModel.NamedNode <em>Named Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Node</em>'.
	 * @see DocModel.NamedNode
	 * @generated
	 */
	EClass getNamedNode();

	/**
	 * Returns the meta object for the attribute '{@link DocModel.NamedNode#getParagraf <em>Paragraf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraf</em>'.
	 * @see DocModel.NamedNode#getParagraf()
	 * @see #getNamedNode()
	 * @generated
	 */
	EAttribute getNamedNode_Paragraf();

	/**
	 * Returns the meta object for class '{@link DocModel.ListedNode <em>Listed Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listed Node</em>'.
	 * @see DocModel.ListedNode
	 * @generated
	 */
	EClass getListedNode();

	/**
	 * Returns the meta object for data type '{@link org.apache.poi.xwpf.usermodel.XWPFRun <em>XWPF Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XWPF Run</em>'.
	 * @see org.apache.poi.xwpf.usermodel.XWPFRun
	 * @model instanceClass="org.apache.poi.xwpf.usermodel.XWPFRun"
	 *        extendedMetaData="name='org.apache.poi.xwpf.usermodel.XWPFRun'"
	 * @generated
	 */
	EDataType getXWPFRun();

	/**
	 * Returns the meta object for data type '{@link org.apache.poi.xwpf.usermodel.XWPFDocument <em>XWPF Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XWPF Document</em>'.
	 * @see org.apache.poi.xwpf.usermodel.XWPFDocument
	 * @model instanceClass="org.apache.poi.xwpf.usermodel.XWPFDocument"
	 * @generated
	 */
	EDataType getXWPFDocument();

	/**
	 * Returns the meta object for data type '{@link org.apache.poi.xwpf.usermodel.XWPFParagraph <em>XWPF Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XWPF Paragraph</em>'.
	 * @see org.apache.poi.xwpf.usermodel.XWPFParagraph
	 * @model instanceClass="org.apache.poi.xwpf.usermodel.XWPFParagraph"
	 * @generated
	 */
	EDataType getXWPFParagraph();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocModelFactory getDocModelFactory();

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
		 * The meta object literal for the '{@link DocModel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DocModel.impl.ElementImpl
		 * @see DocModel.impl.DocModelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TEXT = eINSTANCE.getElement_Text();

		/**
		 * The meta object literal for the '{@link DocModel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DocModel.impl.NodeImpl
		 * @see DocModel.impl.DocModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Owned Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OWNED_NODE = eINSTANCE.getNode_OwnedNode();

		/**
		 * The meta object literal for the '<em><b>Next Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NEXT_NODE = eINSTANCE.getNode_NextNode();

		/**
		 * The meta object literal for the '<em><b>Prev Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PREV_NODE = eINSTANCE.getNode_PrevNode();

		/**
		 * The meta object literal for the '<em><b>Parent Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENT_NODE = eINSTANCE.getNode_ParentNode();

		/**
		 * The meta object literal for the '<em><b>Aggregated Run</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__AGGREGATED_RUN = eINSTANCE.getNode_AggregatedRun();

		/**
		 * The meta object literal for the '{@link DocModel.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DocModel.impl.DocumentImpl
		 * @see DocModel.impl.DocModelPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Owned Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__OWNED_NODE = eINSTANCE.getDocument_OwnedNode();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT = eINSTANCE.getDocument_Document();

		/**
		 * The meta object literal for the '{@link DocModel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DocModel.impl.NamedElementImpl
		 * @see DocModel.impl.DocModelPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link DocModel.impl.NamedNodeImpl <em>Named Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DocModel.impl.NamedNodeImpl
		 * @see DocModel.impl.DocModelPackageImpl#getNamedNode()
		 * @generated
		 */
		EClass NAMED_NODE = eINSTANCE.getNamedNode();

		/**
		 * The meta object literal for the '<em><b>Paragraf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_NODE__PARAGRAF = eINSTANCE.getNamedNode_Paragraf();

		/**
		 * The meta object literal for the '{@link DocModel.impl.ListedNodeImpl <em>Listed Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DocModel.impl.ListedNodeImpl
		 * @see DocModel.impl.DocModelPackageImpl#getListedNode()
		 * @generated
		 */
		EClass LISTED_NODE = eINSTANCE.getListedNode();

		/**
		 * The meta object literal for the '<em>XWPF Run</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.xwpf.usermodel.XWPFRun
		 * @see DocModel.impl.DocModelPackageImpl#getXWPFRun()
		 * @generated
		 */
		EDataType XWPF_RUN = eINSTANCE.getXWPFRun();

		/**
		 * The meta object literal for the '<em>XWPF Document</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.xwpf.usermodel.XWPFDocument
		 * @see DocModel.impl.DocModelPackageImpl#getXWPFDocument()
		 * @generated
		 */
		EDataType XWPF_DOCUMENT = eINSTANCE.getXWPFDocument();

		/**
		 * The meta object literal for the '<em>XWPF Paragraph</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.xwpf.usermodel.XWPFParagraph
		 * @see DocModel.impl.DocModelPackageImpl#getXWPFParagraph()
		 * @generated
		 */
		EDataType XWPF_PARAGRAPH = eINSTANCE.getXWPFParagraph();

	}

} //DocModelPackage
