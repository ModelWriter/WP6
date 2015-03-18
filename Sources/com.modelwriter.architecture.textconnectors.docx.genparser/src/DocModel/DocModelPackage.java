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
	 * The feature id for the '<em><b>�d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__�D = 0;

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
	 * The meta object id for the '{@link DocModel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.NamedElementImpl
	 * @see DocModel.impl.DocModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>�d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__�D = ELEMENT__�D;

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
	 * The meta object id for the '{@link DocModel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.NodeImpl
	 * @see DocModel.impl.DocModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>�d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__�D = NAMED_ELEMENT__�D;

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
	 * The feature id for the '<em><b>Aggregated Run</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AGGREGATED_RUN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MARK = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.DocumentImpl
	 * @see DocModel.impl.DocModelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>�d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__�D = NAMED_ELEMENT__�D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Paragraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_PARAGRAPH = NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Owned Mark</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_MARK = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.MarkImpl
	 * @see DocModel.impl.DocModelPackageImpl#getMark()
	 * @generated
	 */
	int MARK = 4;

	/**
	 * The feature id for the '<em><b>�d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__�D = ELEMENT__�D;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__NODE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.ParagraphImpl
	 * @see DocModel.impl.DocModelPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 5;

	/**
	 * The feature id for the '<em><b>�d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__�D = NODE__�D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Raw Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__RAW_TEXT = NODE__RAW_TEXT;

	/**
	 * The feature id for the '<em><b>Aggregated Run</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__AGGREGATED_RUN = NODE__AGGREGATED_RUN;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__MARK = NODE__MARK;

	/**
	 * The feature id for the '<em><b>Owned Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__OWNED_NODE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__PARENT_NODE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__PARAGRAPH = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__OWNED_PART = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__F�RST_PART = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DocModel.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DocModel.impl.PartImpl
	 * @see DocModel.impl.DocModelPackageImpl#getPart()
	 * @generated
	 */
	int PART = 6;

	/**
	 * The feature id for the '<em><b>�d</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__�D = NODE__�D;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Raw Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__RAW_TEXT = NODE__RAW_TEXT;

	/**
	 * The feature id for the '<em><b>Aggregated Run</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__AGGREGATED_RUN = NODE__AGGREGATED_RUN;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__MARK = NODE__MARK;

	/**
	 * The feature id for the '<em><b>Next Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NEXT_PART = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prev Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__PREV_PART = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NODE = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '<em>XWPF Run</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xwpf.usermodel.XWPFRun
	 * @see DocModel.impl.DocModelPackageImpl#getXWPFRun()
	 * @generated
	 */
	int XWPF_RUN = 9;


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
	 * Returns the meta object for the attribute '{@link DocModel.Element#get�d <em>�d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>�d</em>'.
	 * @see DocModel.Element#get�d()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_�d();

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
	 * Returns the meta object for the reference '{@link DocModel.Node#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mark</em>'.
	 * @see DocModel.Node#getMark()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Mark();

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
	 * Returns the meta object for the containment reference list '{@link DocModel.Document#getOwnedParagraph <em>Owned Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Paragraph</em>'.
	 * @see DocModel.Document#getOwnedParagraph()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_OwnedParagraph();

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
	 * Returns the meta object for the containment reference list '{@link DocModel.Document#getOwnedMark <em>Owned Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Mark</em>'.
	 * @see DocModel.Document#getOwnedMark()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_OwnedMark();

	/**
	 * Returns the meta object for class '{@link DocModel.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see DocModel.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for the reference '{@link DocModel.Mark#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see DocModel.Mark#getNode()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Node();

	/**
	 * Returns the meta object for class '{@link DocModel.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see DocModel.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link DocModel.Paragraph#getOwnedNode <em>Owned Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Node</em>'.
	 * @see DocModel.Paragraph#getOwnedNode()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_OwnedNode();

	/**
	 * Returns the meta object for the container reference '{@link DocModel.Paragraph#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see DocModel.Paragraph#getParentNode()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_ParentNode();

	/**
	 * Returns the meta object for the attribute '{@link DocModel.Paragraph#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph</em>'.
	 * @see DocModel.Paragraph#getParagraph()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Paragraph();

	/**
	 * Returns the meta object for the containment reference list '{@link DocModel.Paragraph#getOwnedPart <em>Owned Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Part</em>'.
	 * @see DocModel.Paragraph#getOwnedPart()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_OwnedPart();

	/**
	 * Returns the meta object for the reference '{@link DocModel.Paragraph#getFirstPart <em>First Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Part</em>'.
	 * @see DocModel.Paragraph#getFirstPart()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_FirstPart();

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
		 * The meta object literal for the '<em><b>�d</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__�D = eINSTANCE.getElement_�d();

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
		 * The meta object literal for the '<em><b>Aggregated Run</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__AGGREGATED_RUN = eINSTANCE.getNode_AggregatedRun();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MARK = eINSTANCE.getNode_Mark();

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
		 * The meta object literal for the '<em><b>Owned Paragraph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__OWNED_PARAGRAPH = eINSTANCE.getDocument_OwnedParagraph();

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
		 * The meta object literal for the '<em><b>Owned Mark</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__OWNED_MARK = eINSTANCE.getDocument_OwnedMark();

		/**
		 * The meta object literal for the '{@link DocModel.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DocModel.impl.MarkImpl
		 * @see DocModel.impl.DocModelPackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__NODE = eINSTANCE.getMark_Node();

		/**
		 * The meta object literal for the '{@link DocModel.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DocModel.impl.ParagraphImpl
		 * @see DocModel.impl.DocModelPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Owned Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__OWNED_NODE = eINSTANCE.getParagraph_OwnedNode();

		/**
		 * The meta object literal for the '<em><b>Parent Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__PARENT_NODE = eINSTANCE.getParagraph_ParentNode();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__PARAGRAPH = eINSTANCE.getParagraph_Paragraph();

		/**
		 * The meta object literal for the '<em><b>Owned Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__OWNED_PART = eINSTANCE.getParagraph_OwnedPart();

		/**
		 * The meta object literal for the '<em><b>First Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__F�RST_PART = eINSTANCE.getParagraph_FirstPart();

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
