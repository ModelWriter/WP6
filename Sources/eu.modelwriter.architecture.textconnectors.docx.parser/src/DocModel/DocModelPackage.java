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
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.NamedElementImpl
	 * @see DocModel.impl.DocModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

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
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PATH = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.NodeImpl
	 * @see DocModel.impl.DocModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Raw Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RAW_TEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregated Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AGGREGATED_RUN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNED_NODE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT_NODE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAGRAPH = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNED_PART = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>First Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FIRST_PART = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.PartImpl
	 * @see DocModel.impl.DocModelPackageImpl#getPart()
	 * @generated
	 */
	int PART = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Raw Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__RAW_TEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregated Run</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__AGGREGATED_RUN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NEXT_PART = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prev Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__PREV_PART = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NODE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>XWPF Document</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xwpf.usermodel.XWPFDocument
	 * @see DocModel.impl.DocModelPackageImpl#getXWPFDocument()
	 * @generated
	 */
	int XWPF_DOCUMENT = 5;

	/**
	 * The meta object id for the '<em>XWPF Paragraph</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xwpf.usermodel.XWPFParagraph
	 * @see DocModel.impl.DocModelPackageImpl#getXWPFParagraph()
	 * @generated
	 */
	int XWPF_PARAGRAPH = 6;

	/**
	 * The meta object id for the '<em>XWPF Run</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xwpf.usermodel.XWPFRun
	 * @see DocModel.impl.DocModelPackageImpl#getXWPFRun()
	 * @generated
	 */
	int XWPF_RUN = 7;


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
	 * Returns the meta object for the attribute '{@link DocModel.Document#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see DocModel.Document#getPath()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Path();

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
	 * Returns the meta object for the attribute '{@link DocModel.Node#getRawText <em>Raw Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Text</em>'.
	 * @see DocModel.Node#getRawText()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_RawText();

	/**
	 * Returns the meta object for the attribute '{@link DocModel.Node#getAggregatedRun <em>Aggregated Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregated Run</em>'.
	 * @see DocModel.Node#getAggregatedRun()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_AggregatedRun();

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
	 * Returns the meta object for the attribute list '{@link DocModel.Node#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paragraph</em>'.
	 * @see DocModel.Node#getParagraph()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Paragraph();

	/**
	 * Returns the meta object for the containment reference list '{@link DocModel.Node#getOwnedPart <em>Owned Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Part</em>'.
	 * @see DocModel.Node#getOwnedPart()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OwnedPart();

	/**
	 * Returns the meta object for the reference '{@link DocModel.Node#getFirstPart <em>First Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Part</em>'.
	 * @see DocModel.Node#getFirstPart()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FirstPart();

	/**
	 * Returns the meta object for class '{@link DocModel.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see DocModel.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link DocModel.Part#getRawText <em>Raw Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Text</em>'.
	 * @see DocModel.Part#getRawText()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_RawText();

	/**
	 * Returns the meta object for the attribute list '{@link DocModel.Part#getAggregatedRun <em>Aggregated Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aggregated Run</em>'.
	 * @see DocModel.Part#getAggregatedRun()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_AggregatedRun();

	/**
	 * Returns the meta object for the reference '{@link DocModel.Part#getNextPart <em>Next Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Part</em>'.
	 * @see DocModel.Part#getNextPart()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_NextPart();

	/**
	 * Returns the meta object for the reference '{@link DocModel.Part#getPrevPart <em>Prev Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev Part</em>'.
	 * @see DocModel.Part#getPrevPart()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_PrevPart();

	/**
	 * Returns the meta object for the reference '{@link DocModel.Part#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see DocModel.Part#getNode()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Node();

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
	 * Returns the meta object for data type '{@link org.apache.poi.xwpf.usermodel.XWPFRun <em>XWPF Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XWPF Run</em>'.
	 * @see org.apache.poi.xwpf.usermodel.XWPFRun
	 * @model instanceClass="org.apache.poi.xwpf.usermodel.XWPFRun"
	 * @generated
	 */
	EDataType getXWPFRun();

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
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__PATH = eINSTANCE.getDocument_Path();

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
		 * The meta object literal for the '<em><b>Raw Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__RAW_TEXT = eINSTANCE.getNode_RawText();

		/**
		 * The meta object literal for the '<em><b>Aggregated Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__AGGREGATED_RUN = eINSTANCE.getNode_AggregatedRun();

		/**
		 * The meta object literal for the '<em><b>Owned Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OWNED_NODE = eINSTANCE.getNode_OwnedNode();

		/**
		 * The meta object literal for the '<em><b>Parent Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENT_NODE = eINSTANCE.getNode_ParentNode();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PARAGRAPH = eINSTANCE.getNode_Paragraph();

		/**
		 * The meta object literal for the '<em><b>Owned Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OWNED_PART = eINSTANCE.getNode_OwnedPart();

		/**
		 * The meta object literal for the '<em><b>First Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FIRST_PART = eINSTANCE.getNode_FirstPart();

		/**
		 * The meta object literal for the '{@link DocModel.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DocModel.impl.PartImpl
		 * @see DocModel.impl.DocModelPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Raw Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__RAW_TEXT = eINSTANCE.getPart_RawText();

		/**
		 * The meta object literal for the '<em><b>Aggregated Run</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__AGGREGATED_RUN = eINSTANCE.getPart_AggregatedRun();

		/**
		 * The meta object literal for the '<em><b>Next Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__NEXT_PART = eINSTANCE.getPart_NextPart();

		/**
		 * The meta object literal for the '<em><b>Prev Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__PREV_PART = eINSTANCE.getPart_PrevPart();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__NODE = eINSTANCE.getPart_Node();

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

		/**
		 * The meta object literal for the '<em>XWPF Run</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.xwpf.usermodel.XWPFRun
		 * @see DocModel.impl.DocModelPackageImpl#getXWPFRun()
		 * @generated
		 */
		EDataType XWPF_RUN = eINSTANCE.getXWPFRun();

	}

} //DocModelPackage
