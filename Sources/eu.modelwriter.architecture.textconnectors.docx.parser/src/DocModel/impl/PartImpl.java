/**
 */
package DocModel.impl;

import DocModel.DocModelPackage;
import DocModel.Node;
import DocModel.Part;

import java.util.Collection;

import org.apache.poi.xwpf.usermodel.XWPFRun;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DocModel.impl.PartImpl#getRawText <em>Raw Text</em>}</li>
 *   <li>{@link DocModel.impl.PartImpl#getAggregatedRun <em>Aggregated Run</em>}</li>
 *   <li>{@link DocModel.impl.PartImpl#getNextPart <em>Next Part</em>}</li>
 *   <li>{@link DocModel.impl.PartImpl#getPrevPart <em>Prev Part</em>}</li>
 *   <li>{@link DocModel.impl.PartImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartImpl extends NamedElementImpl implements Part {
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
	 * The cached value of the '{@link #getAggregatedRun() <em>Aggregated Run</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedRun()
	 * @generated
	 * @ordered
	 */
	protected EList<XWPFRun> aggregatedRun;

	/**
	 * The cached value of the '{@link #getNextPart() <em>Next Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPart()
	 * @generated
	 * @ordered
	 */
	protected Part nextPart;

	/**
	 * The cached value of the '{@link #getPrevPart() <em>Prev Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevPart()
	 * @generated
	 * @ordered
	 */
	protected Part prevPart;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocModelPackage.Literals.PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.PART__RAW_TEXT, oldRawText, rawText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XWPFRun> getAggregatedRun() {
		if (aggregatedRun == null) {
			aggregatedRun = new EDataTypeUniqueEList<XWPFRun>(XWPFRun.class, this, DocModelPackage.PART__AGGREGATED_RUN);
		}
		return aggregatedRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getNextPart() {
		if (nextPart != null && nextPart.eIsProxy()) {
			InternalEObject oldNextPart = (InternalEObject)nextPart;
			nextPart = (Part)eResolveProxy(oldNextPart);
			if (nextPart != oldNextPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocModelPackage.PART__NEXT_PART, oldNextPart, nextPart));
			}
		}
		return nextPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetNextPart() {
		return nextPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextPart(Part newNextPart, NotificationChain msgs) {
		Part oldNextPart = nextPart;
		nextPart = newNextPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocModelPackage.PART__NEXT_PART, oldNextPart, newNextPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPart(Part newNextPart) {
		if (newNextPart != nextPart) {
			NotificationChain msgs = null;
			if (nextPart != null)
				msgs = ((InternalEObject)nextPart).eInverseRemove(this, DocModelPackage.PART__PREV_PART, Part.class, msgs);
			if (newNextPart != null)
				msgs = ((InternalEObject)newNextPart).eInverseAdd(this, DocModelPackage.PART__PREV_PART, Part.class, msgs);
			msgs = basicSetNextPart(newNextPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.PART__NEXT_PART, newNextPart, newNextPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getPrevPart() {
		if (prevPart != null && prevPart.eIsProxy()) {
			InternalEObject oldPrevPart = (InternalEObject)prevPart;
			prevPart = (Part)eResolveProxy(oldPrevPart);
			if (prevPart != oldPrevPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocModelPackage.PART__PREV_PART, oldPrevPart, prevPart));
			}
		}
		return prevPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetPrevPart() {
		return prevPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevPart(Part newPrevPart, NotificationChain msgs) {
		Part oldPrevPart = prevPart;
		prevPart = newPrevPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocModelPackage.PART__PREV_PART, oldPrevPart, newPrevPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevPart(Part newPrevPart) {
		if (newPrevPart != prevPart) {
			NotificationChain msgs = null;
			if (prevPart != null)
				msgs = ((InternalEObject)prevPart).eInverseRemove(this, DocModelPackage.PART__NEXT_PART, Part.class, msgs);
			if (newPrevPart != null)
				msgs = ((InternalEObject)newPrevPart).eInverseAdd(this, DocModelPackage.PART__NEXT_PART, Part.class, msgs);
			msgs = basicSetPrevPart(newPrevPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.PART__PREV_PART, newPrevPart, newPrevPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (Node)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocModelPackage.PART__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		Node oldNode = node;
		node = newNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocModelPackage.PART__NODE, oldNode, newNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		if (newNode != node) {
			NotificationChain msgs = null;
			if (node != null)
				msgs = ((InternalEObject)node).eInverseRemove(this, DocModelPackage.NODE__FIRST_PART, Node.class, msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, DocModelPackage.NODE__FIRST_PART, Node.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.PART__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocModelPackage.PART__NEXT_PART:
				if (nextPart != null)
					msgs = ((InternalEObject)nextPart).eInverseRemove(this, DocModelPackage.PART__PREV_PART, Part.class, msgs);
				return basicSetNextPart((Part)otherEnd, msgs);
			case DocModelPackage.PART__PREV_PART:
				if (prevPart != null)
					msgs = ((InternalEObject)prevPart).eInverseRemove(this, DocModelPackage.PART__NEXT_PART, Part.class, msgs);
				return basicSetPrevPart((Part)otherEnd, msgs);
			case DocModelPackage.PART__NODE:
				if (node != null)
					msgs = ((InternalEObject)node).eInverseRemove(this, DocModelPackage.NODE__FIRST_PART, Node.class, msgs);
				return basicSetNode((Node)otherEnd, msgs);
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
			case DocModelPackage.PART__NEXT_PART:
				return basicSetNextPart(null, msgs);
			case DocModelPackage.PART__PREV_PART:
				return basicSetPrevPart(null, msgs);
			case DocModelPackage.PART__NODE:
				return basicSetNode(null, msgs);
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
			case DocModelPackage.PART__RAW_TEXT:
				return getRawText();
			case DocModelPackage.PART__AGGREGATED_RUN:
				return getAggregatedRun();
			case DocModelPackage.PART__NEXT_PART:
				if (resolve) return getNextPart();
				return basicGetNextPart();
			case DocModelPackage.PART__PREV_PART:
				if (resolve) return getPrevPart();
				return basicGetPrevPart();
			case DocModelPackage.PART__NODE:
				if (resolve) return getNode();
				return basicGetNode();
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
			case DocModelPackage.PART__RAW_TEXT:
				setRawText((String)newValue);
				return;
			case DocModelPackage.PART__AGGREGATED_RUN:
				getAggregatedRun().clear();
				getAggregatedRun().addAll((Collection<? extends XWPFRun>)newValue);
				return;
			case DocModelPackage.PART__NEXT_PART:
				setNextPart((Part)newValue);
				return;
			case DocModelPackage.PART__PREV_PART:
				setPrevPart((Part)newValue);
				return;
			case DocModelPackage.PART__NODE:
				setNode((Node)newValue);
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
			case DocModelPackage.PART__RAW_TEXT:
				setRawText(RAW_TEXT_EDEFAULT);
				return;
			case DocModelPackage.PART__AGGREGATED_RUN:
				getAggregatedRun().clear();
				return;
			case DocModelPackage.PART__NEXT_PART:
				setNextPart((Part)null);
				return;
			case DocModelPackage.PART__PREV_PART:
				setPrevPart((Part)null);
				return;
			case DocModelPackage.PART__NODE:
				setNode((Node)null);
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
			case DocModelPackage.PART__RAW_TEXT:
				return RAW_TEXT_EDEFAULT == null ? rawText != null : !RAW_TEXT_EDEFAULT.equals(rawText);
			case DocModelPackage.PART__AGGREGATED_RUN:
				return aggregatedRun != null && !aggregatedRun.isEmpty();
			case DocModelPackage.PART__NEXT_PART:
				return nextPart != null;
			case DocModelPackage.PART__PREV_PART:
				return prevPart != null;
			case DocModelPackage.PART__NODE:
				return node != null;
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
		result.append(')');
		return result.toString();
	}

} //PartImpl
