/**
 */
package DocModel.impl;

import DocModel.DocModelPackage;
import DocModel.Node;

import java.util.Collection;

import org.apache.poi.xwpf.usermodel.XWPFRun;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link DocModel.impl.NodeImpl#getOwnedNode <em>Owned Node</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getNextNode <em>Next Node</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getPrevNode <em>Prev Node</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link DocModel.impl.NodeImpl#getAggregatedRun <em>Aggregated Run</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends ElementImpl implements Node {
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
	 * The cached value of the '{@link #getNextNode() <em>Next Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextNode()
	 * @generated
	 * @ordered
	 */
	protected Node nextNode;

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
	public Node getNextNode() {
		return nextNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextNode(Node newNextNode, NotificationChain msgs) {
		Node oldNextNode = nextNode;
		nextNode = newNextNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocModelPackage.NODE__NEXT_NODE, oldNextNode, newNextNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextNode(Node newNextNode) {
		if (newNextNode != nextNode) {
			NotificationChain msgs = null;
			if (nextNode != null)
				msgs = ((InternalEObject)nextNode).eInverseRemove(this, DocModelPackage.NODE__PREV_NODE, Node.class, msgs);
			if (newNextNode != null)
				msgs = ((InternalEObject)newNextNode).eInverseAdd(this, DocModelPackage.NODE__PREV_NODE, Node.class, msgs);
			msgs = basicSetNextNode(newNextNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.NODE__NEXT_NODE, newNextNode, newNextNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getPrevNode() {
		if (eContainerFeatureID() != DocModelPackage.NODE__PREV_NODE) return null;
		return (Node)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevNode(Node newPrevNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrevNode, DocModelPackage.NODE__PREV_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevNode(Node newPrevNode) {
		if (newPrevNode != eInternalContainer() || (eContainerFeatureID() != DocModelPackage.NODE__PREV_NODE && newPrevNode != null)) {
			if (EcoreUtil.isAncestor(this, newPrevNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrevNode != null)
				msgs = ((InternalEObject)newPrevNode).eInverseAdd(this, DocModelPackage.NODE__NEXT_NODE, Node.class, msgs);
			msgs = basicSetPrevNode(newPrevNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.NODE__PREV_NODE, newPrevNode, newPrevNode));
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
	public EList<XWPFRun> getAggregatedRun() {
		if (aggregatedRun == null) {
			aggregatedRun = new EDataTypeUniqueEList<XWPFRun>(XWPFRun.class, this, DocModelPackage.NODE__AGGREGATED_RUN);
		}
		return aggregatedRun;
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
			case DocModelPackage.NODE__NEXT_NODE:
				if (nextNode != null)
					msgs = ((InternalEObject)nextNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocModelPackage.NODE__NEXT_NODE, null, msgs);
				return basicSetNextNode((Node)otherEnd, msgs);
			case DocModelPackage.NODE__PREV_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrevNode((Node)otherEnd, msgs);
			case DocModelPackage.NODE__PARENT_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentNode((Node)otherEnd, msgs);
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
			case DocModelPackage.NODE__NEXT_NODE:
				return basicSetNextNode(null, msgs);
			case DocModelPackage.NODE__PREV_NODE:
				return basicSetPrevNode(null, msgs);
			case DocModelPackage.NODE__PARENT_NODE:
				return basicSetParentNode(null, msgs);
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
			case DocModelPackage.NODE__PREV_NODE:
				return eInternalContainer().eInverseRemove(this, DocModelPackage.NODE__NEXT_NODE, Node.class, msgs);
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
			case DocModelPackage.NODE__OWNED_NODE:
				return getOwnedNode();
			case DocModelPackage.NODE__NEXT_NODE:
				return getNextNode();
			case DocModelPackage.NODE__PREV_NODE:
				return getPrevNode();
			case DocModelPackage.NODE__PARENT_NODE:
				return getParentNode();
			case DocModelPackage.NODE__AGGREGATED_RUN:
				return getAggregatedRun();
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
			case DocModelPackage.NODE__OWNED_NODE:
				getOwnedNode().clear();
				getOwnedNode().addAll((Collection<? extends Node>)newValue);
				return;
			case DocModelPackage.NODE__NEXT_NODE:
				setNextNode((Node)newValue);
				return;
			case DocModelPackage.NODE__PREV_NODE:
				setPrevNode((Node)newValue);
				return;
			case DocModelPackage.NODE__PARENT_NODE:
				setParentNode((Node)newValue);
				return;
			case DocModelPackage.NODE__AGGREGATED_RUN:
				getAggregatedRun().clear();
				getAggregatedRun().addAll((Collection<? extends XWPFRun>)newValue);
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
			case DocModelPackage.NODE__OWNED_NODE:
				getOwnedNode().clear();
				return;
			case DocModelPackage.NODE__NEXT_NODE:
				setNextNode((Node)null);
				return;
			case DocModelPackage.NODE__PREV_NODE:
				setPrevNode((Node)null);
				return;
			case DocModelPackage.NODE__PARENT_NODE:
				setParentNode((Node)null);
				return;
			case DocModelPackage.NODE__AGGREGATED_RUN:
				getAggregatedRun().clear();
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
			case DocModelPackage.NODE__OWNED_NODE:
				return ownedNode != null && !ownedNode.isEmpty();
			case DocModelPackage.NODE__NEXT_NODE:
				return nextNode != null;
			case DocModelPackage.NODE__PREV_NODE:
				return getPrevNode() != null;
			case DocModelPackage.NODE__PARENT_NODE:
				return getParentNode() != null;
			case DocModelPackage.NODE__AGGREGATED_RUN:
				return aggregatedRun != null && !aggregatedRun.isEmpty();
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
		result.append(" (aggregatedRun: ");
		result.append(aggregatedRun);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
