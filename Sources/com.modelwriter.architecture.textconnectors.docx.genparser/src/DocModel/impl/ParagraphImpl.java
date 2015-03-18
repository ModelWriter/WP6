/**
 */
package DocModel.impl;

import DocModel.DocModelPackage;
import DocModel.Paragraph;
import DocModel.Part;

import java.util.Collection;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DocModel.impl.ParagraphImpl#getOwnedNode <em>Owned Node</em>}</li>
 *   <li>{@link DocModel.impl.ParagraphImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link DocModel.impl.ParagraphImpl#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link DocModel.impl.ParagraphImpl#getOwnedPart <em>Owned Part</em>}</li>
 *   <li>{@link DocModel.impl.ParagraphImpl#getFirstPart <em>First Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParagraphImpl extends NodeImpl implements Paragraph {
	/**
	 * The cached value of the '{@link #getOwnedNode() <em>Owned Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> ownedNode;

	/**
	 * The default value of the '{@link #getParagraph() <em>Paragraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected static final XWPFParagraph PARAGRAPH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected XWPFParagraph paragraph = PARAGRAPH_EDEFAULT;

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
	protected ParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocModelPackage.Literals.PARAGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getOwnedNode() {
		if (ownedNode == null) {
			ownedNode = new EObjectContainmentWithInverseEList<Paragraph>(Paragraph.class, this, DocModelPackage.PARAGRAPH__OWNED_NODE, DocModelPackage.PARAGRAPH__PARENT_NODE);
		}
		return ownedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph getParentNode() {
		if (eContainerFeatureID() != DocModelPackage.PARAGRAPH__PARENT_NODE) return null;
		return (Paragraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNode(Paragraph newParentNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNode, DocModelPackage.PARAGRAPH__PARENT_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(Paragraph newParentNode) {
		if (newParentNode != eInternalContainer() || (eContainerFeatureID() != DocModelPackage.PARAGRAPH__PARENT_NODE && newParentNode != null)) {
			if (EcoreUtil.isAncestor(this, newParentNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNode != null)
				msgs = ((InternalEObject)newParentNode).eInverseAdd(this, DocModelPackage.PARAGRAPH__OWNED_NODE, Paragraph.class, msgs);
			msgs = basicSetParentNode(newParentNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.PARAGRAPH__PARENT_NODE, newParentNode, newParentNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XWPFParagraph getParagraph() {
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraph(XWPFParagraph newParagraph) {
		XWPFParagraph oldParagraph = paragraph;
		paragraph = newParagraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.PARAGRAPH__PARAGRAPH, oldParagraph, paragraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getOwnedPart() {
		if (ownedPart == null) {
			ownedPart = new EObjectContainmentEList<Part>(Part.class, this, DocModelPackage.PARAGRAPH__OWNED_PART);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocModelPackage.PARAGRAPH__FÝRST_PART, oldFirstPart, firstPart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocModelPackage.PARAGRAPH__FÝRST_PART, oldFirstPart, newFirstPart);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.PARAGRAPH__FÝRST_PART, newFirstPart, newFirstPart));
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
			case DocModelPackage.PARAGRAPH__OWNED_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedNode()).basicAdd(otherEnd, msgs);
			case DocModelPackage.PARAGRAPH__PARENT_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentNode((Paragraph)otherEnd, msgs);
			case DocModelPackage.PARAGRAPH__FÝRST_PART:
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
			case DocModelPackage.PARAGRAPH__OWNED_NODE:
				return ((InternalEList<?>)getOwnedNode()).basicRemove(otherEnd, msgs);
			case DocModelPackage.PARAGRAPH__PARENT_NODE:
				return basicSetParentNode(null, msgs);
			case DocModelPackage.PARAGRAPH__OWNED_PART:
				return ((InternalEList<?>)getOwnedPart()).basicRemove(otherEnd, msgs);
			case DocModelPackage.PARAGRAPH__FÝRST_PART:
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
			case DocModelPackage.PARAGRAPH__PARENT_NODE:
				return eInternalContainer().eInverseRemove(this, DocModelPackage.PARAGRAPH__OWNED_NODE, Paragraph.class, msgs);
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
			case DocModelPackage.PARAGRAPH__OWNED_NODE:
				return getOwnedNode();
			case DocModelPackage.PARAGRAPH__PARENT_NODE:
				return getParentNode();
			case DocModelPackage.PARAGRAPH__PARAGRAPH:
				return getParagraph();
			case DocModelPackage.PARAGRAPH__OWNED_PART:
				return getOwnedPart();
			case DocModelPackage.PARAGRAPH__FÝRST_PART:
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
			case DocModelPackage.PARAGRAPH__OWNED_NODE:
				getOwnedNode().clear();
				getOwnedNode().addAll((Collection<? extends Paragraph>)newValue);
				return;
			case DocModelPackage.PARAGRAPH__PARENT_NODE:
				setParentNode((Paragraph)newValue);
				return;
			case DocModelPackage.PARAGRAPH__PARAGRAPH:
				setParagraph((XWPFParagraph)newValue);
				return;
			case DocModelPackage.PARAGRAPH__OWNED_PART:
				getOwnedPart().clear();
				getOwnedPart().addAll((Collection<? extends Part>)newValue);
				return;
			case DocModelPackage.PARAGRAPH__FÝRST_PART:
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
			case DocModelPackage.PARAGRAPH__OWNED_NODE:
				getOwnedNode().clear();
				return;
			case DocModelPackage.PARAGRAPH__PARENT_NODE:
				setParentNode((Paragraph)null);
				return;
			case DocModelPackage.PARAGRAPH__PARAGRAPH:
				setParagraph(PARAGRAPH_EDEFAULT);
				return;
			case DocModelPackage.PARAGRAPH__OWNED_PART:
				getOwnedPart().clear();
				return;
			case DocModelPackage.PARAGRAPH__FÝRST_PART:
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
			case DocModelPackage.PARAGRAPH__OWNED_NODE:
				return ownedNode != null && !ownedNode.isEmpty();
			case DocModelPackage.PARAGRAPH__PARENT_NODE:
				return getParentNode() != null;
			case DocModelPackage.PARAGRAPH__PARAGRAPH:
				return PARAGRAPH_EDEFAULT == null ? paragraph != null : !PARAGRAPH_EDEFAULT.equals(paragraph);
			case DocModelPackage.PARAGRAPH__OWNED_PART:
				return ownedPart != null && !ownedPart.isEmpty();
			case DocModelPackage.PARAGRAPH__FÝRST_PART:
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
		result.append(" (paragraph: ");
		result.append(paragraph);
		result.append(')');
		return result.toString();
	}

} //ParagraphImpl
