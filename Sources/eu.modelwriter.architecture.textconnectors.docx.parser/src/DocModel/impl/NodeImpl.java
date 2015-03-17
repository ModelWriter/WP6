/**
 */
package DocModel.impl;

import DocModel.DocModelPackage;
import DocModel.Node;
import DocModel.Part;

import java.util.Collection;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DocModel.impl.NodeImpl#getRawText <em>Raw Text</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getAggregatedRun <em>Aggregated Run</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getOwnedNode <em>Owned Node</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getOwnedPart <em>Owned Part</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getFirstPart <em>First Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends NamedElementImpl implements Node {
	/**
	 * The default value of the '{@link #getRawText() <em>Raw Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawText()
	 * @generated
	 * @ordered
	 */
	protected static final String RAW_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRawText() <em>Raw Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawText()
	 * @generated
	 * @ordered
	 */
	protected String rawText = RAW_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregatedRun() <em>Aggregated Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedRun()
	 * @generated
	 * @ordered
	 */
	protected static final XWPFRun AGGREGATED_RUN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregatedRun() <em>Aggregated Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedRun()
	 * @generated
	 * @ordered
	 */
	protected XWPFRun aggregatedRun = AGGREGATED_RUN_EDEFAULT;

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
	 * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected EList<XWPFParagraph> paragraph;

	/**
	 * The cached value of the '{@link #getOwnedPart() <em>Owned Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPart()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> ownedPart;

	/**
	 * The cached value of the '{@link #getFirstPart() <em>First Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPart()
	 * @generated
	 * @ordered
	 */
	protected Part firstPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocModelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRawText() {
		return rawText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawText(String newRawText) {
		String oldRawText = rawText;
		rawText = newRawText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.NODE__RAW_TEXT, oldRawText, rawText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XWPFRun getAggregatedRun() {
		return aggregatedRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregatedRun(XWPFRun newAggregatedRun) {
		XWPFRun oldAggregatedRun = aggregatedRun;
		aggregatedRun = newAggregatedRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.NODE__AGGREGATED_RUN, oldAggregatedRun, aggregatedRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getOwnedNode() {
		if (ownedNode == null) {
			ownedNode = new EObjectContainmentWithInverseEList<Node>(Node.class, this, DocModelPackage.NODE__OWNED_NODE, DocModelPackage.NODE__PARENT_NODE);
		}
		return ownedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParentNode() {
		if (eContainerFeatureID() != DocModelPackage.NODE__PARENT_NODE) return null;
		return (Node)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNode(Node newParentNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNode, DocModelPackage.NODE__PARENT_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(Node newParentNode) {
		if (newParentNode != eInternalContainer() || (eContainerFeatureID() != DocModelPackage.NODE__PARENT_NODE && newParentNode != null)) {
			if (EcoreUtil.isAncestor(this, newParentNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNode != null)
				msgs = ((InternalEObject)newParentNode).eInverseAdd(this, DocModelPackage.NODE__OWNED_NODE, Node.class, msgs);
			msgs = basicSetParentNode(newParentNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.NODE__PARENT_NODE, newParentNode, newParentNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XWPFParagraph> getParagraph() {
		if (paragraph == null) {
			paragraph = new EDataTypeUniqueEList<XWPFParagraph>(XWPFParagraph.class, this, DocModelPackage.NODE__PARAGRAPH);
		}
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getOwnedPart() {
		if (ownedPart == null) {
			ownedPart = new EObjectContainmentEList<Part>(Part.class, this, DocModelPackage.NODE__OWNED_PART);
		}
		return ownedPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getFirstPart() {
		if (firstPart != null && firstPart.eIsProxy()) {
			InternalEObject oldFirstPart = (InternalEObject)firstPart;
			firstPart = (Part)eResolveProxy(oldFirstPart);
			if (firstPart != oldFirstPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocModelPackage.NODE__FIRST_PART, oldFirstPart, firstPart));
			}
		}
		return firstPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetFirstPart() {
		return firstPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstPart(Part newFirstPart, NotificationChain msgs) {
		Part oldFirstPart = firstPart;
		firstPart = newFirstPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocModelPackage.NODE__FIRST_PART, oldFirstPart, newFirstPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPart(Part newFirstPart) {
		if (newFirstPart != firstPart) {
			NotificationChain msgs = null;
			if (firstPart != null)
				msgs = ((InternalEObject)firstPart).eInverseRemove(this, DocModelPackage.PART__NODE, Part.class, msgs);
			if (newFirstPart != null)
				msgs = ((InternalEObject)newFirstPart).eInverseAdd(this, DocModelPackage.PART__NODE, Part.class, msgs);
			msgs = basicSetFirstPart(newFirstPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.NODE__FIRST_PART, newFirstPart, newFirstPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocModelPackage.NODE__OWNED_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedNode()).basicAdd(otherEnd, msgs);
			case DocModelPackage.NODE__PARENT_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentNode((Node)otherEnd, msgs);
			case DocModelPackage.NODE__FIRST_PART:
				if (firstPart != null)
					msgs = ((InternalEObject)firstPart).eInverseRemove(this, DocModelPackage.PART__NODE, Part.class, msgs);
				return basicSetFirstPart((Part)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocModelPackage.NODE__OWNED_NODE:
				return ((InternalEList<?>)getOwnedNode()).basicRemove(otherEnd, msgs);
			case DocModelPackage.NODE__PARENT_NODE:
				return basicSetParentNode(null, msgs);
			case DocModelPackage.NODE__OWNED_PART:
				return ((InternalEList<?>)getOwnedPart()).basicRemove(otherEnd, msgs);
			case DocModelPackage.NODE__FIRST_PART:
				return basicSetFirstPart(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DocModelPackage.NODE__PARENT_NODE:
				return eInternalContainer().eInverseRemove(this, DocModelPackage.NODE__OWNED_NODE, Node.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocModelPackage.NODE__RAW_TEXT:
				return getRawText();
			case DocModelPackage.NODE__AGGREGATED_RUN:
				return getAggregatedRun();
			case DocModelPackage.NODE__OWNED_NODE:
				return getOwnedNode();
			case DocModelPackage.NODE__PARENT_NODE:
				return getParentNode();
			case DocModelPackage.NODE__PARAGRAPH:
				return getParagraph();
			case DocModelPackage.NODE__OWNED_PART:
				return getOwnedPart();
			case DocModelPackage.NODE__FIRST_PART:
				if (resolve) return getFirstPart();
				return basicGetFirstPart();
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
			case DocModelPackage.NODE__RAW_TEXT:
				setRawText((String)newValue);
				return;
			case DocModelPackage.NODE__AGGREGATED_RUN:
				setAggregatedRun((XWPFRun)newValue);
				return;
			case DocModelPackage.NODE__OWNED_NODE:
				getOwnedNode().clear();
				getOwnedNode().addAll((Collection<? extends Node>)newValue);
				return;
			case DocModelPackage.NODE__PARENT_NODE:
				setParentNode((Node)newValue);
				return;
			case DocModelPackage.NODE__PARAGRAPH:
				getParagraph().clear();
				getParagraph().addAll((Collection<? extends XWPFParagraph>)newValue);
				return;
			case DocModelPackage.NODE__OWNED_PART:
				getOwnedPart().clear();
				getOwnedPart().addAll((Collection<? extends Part>)newValue);
				return;
			case DocModelPackage.NODE__FIRST_PART:
				setFirstPart((Part)newValue);
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
			case DocModelPackage.NODE__RAW_TEXT:
				setRawText(RAW_TEXT_EDEFAULT);
				return;
			case DocModelPackage.NODE__AGGREGATED_RUN:
				setAggregatedRun(AGGREGATED_RUN_EDEFAULT);
				return;
			case DocModelPackage.NODE__OWNED_NODE:
				getOwnedNode().clear();
				return;
			case DocModelPackage.NODE__PARENT_NODE:
				setParentNode((Node)null);
				return;
			case DocModelPackage.NODE__PARAGRAPH:
				getParagraph().clear();
				return;
			case DocModelPackage.NODE__OWNED_PART:
				getOwnedPart().clear();
				return;
			case DocModelPackage.NODE__FIRST_PART:
				setFirstPart((Part)null);
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
			case DocModelPackage.NODE__RAW_TEXT:
				return RAW_TEXT_EDEFAULT == null ? rawText != null : !RAW_TEXT_EDEFAULT.equals(rawText);
			case DocModelPackage.NODE__AGGREGATED_RUN:
				return AGGREGATED_RUN_EDEFAULT == null ? aggregatedRun != null : !AGGREGATED_RUN_EDEFAULT.equals(aggregatedRun);
			case DocModelPackage.NODE__OWNED_NODE:
				return ownedNode != null && !ownedNode.isEmpty();
			case DocModelPackage.NODE__PARENT_NODE:
				return getParentNode() != null;
			case DocModelPackage.NODE__PARAGRAPH:
				return paragraph != null && !paragraph.isEmpty();
			case DocModelPackage.NODE__OWNED_PART:
				return ownedPart != null && !ownedPart.isEmpty();
			case DocModelPackage.NODE__FIRST_PART:
				return firstPart != null;
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
		result.append(" (rawText: ");
		result.append(rawText);
		result.append(", aggregatedRun: ");
		result.append(aggregatedRun);
		result.append(", paragraph: ");
		result.append(paragraph);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
