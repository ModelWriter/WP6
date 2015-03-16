/**
 */
package DocModel.impl;

import DocModel.DocModelPackage;
import DocModel.Document;
import DocModel.Node;

import java.util.Collection;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DocModel.impl.DocumentImpl#getOwnedNode <em>Owned Node</em>}</li>
 *   <li>{@link DocModel.impl.DocumentImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link DocModel.impl.DocumentImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends NamedElementImpl implements Document {
	/**
	 * The cached value of the '{@link #getOwnedNode() <em>Owned Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> ownedNode;

	/**
	 * The default value of the '{@link #getDocument() <em>Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected static final XWPFDocument DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected XWPFDocument document = DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocModelPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getOwnedNode() {
		if (ownedNode == null) {
			ownedNode = new EObjectContainmentEList<Node>(Node.class, this, DocModelPackage.DOCUMENT__OWNED_NODE);
		}
		return ownedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XWPFDocument getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(XWPFDocument newDocument) {
		XWPFDocument oldDocument = document;
		document = newDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.DOCUMENT__DOCUMENT, oldDocument, document));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.DOCUMENT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocModelPackage.DOCUMENT__OWNED_NODE:
				return ((InternalEList<?>)getOwnedNode()).basicRemove(otherEnd, msgs);
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
			case DocModelPackage.DOCUMENT__OWNED_NODE:
				return getOwnedNode();
			case DocModelPackage.DOCUMENT__DOCUMENT:
				return getDocument();
			case DocModelPackage.DOCUMENT__PATH:
				return getPath();
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
			case DocModelPackage.DOCUMENT__OWNED_NODE:
				getOwnedNode().clear();
				getOwnedNode().addAll((Collection<? extends Node>)newValue);
				return;
			case DocModelPackage.DOCUMENT__DOCUMENT:
				setDocument((XWPFDocument)newValue);
				return;
			case DocModelPackage.DOCUMENT__PATH:
				setPath((String)newValue);
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
			case DocModelPackage.DOCUMENT__OWNED_NODE:
				getOwnedNode().clear();
				return;
			case DocModelPackage.DOCUMENT__DOCUMENT:
				setDocument(DOCUMENT_EDEFAULT);
				return;
			case DocModelPackage.DOCUMENT__PATH:
				setPath(PATH_EDEFAULT);
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
			case DocModelPackage.DOCUMENT__OWNED_NODE:
				return ownedNode != null && !ownedNode.isEmpty();
			case DocModelPackage.DOCUMENT__DOCUMENT:
				return DOCUMENT_EDEFAULT == null ? document != null : !DOCUMENT_EDEFAULT.equals(document);
			case DocModelPackage.DOCUMENT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (document: ");
		result.append(document);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
