/**
 */
package ParseTree.impl;

import ParseTree.Node;
import ParseTree.ParseTreePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link ParseTree.impl.NodeImpl#getOwnedNode <em>Owned Node</em>}</li>
 *   <li>{@link ParseTree.impl.NodeImpl#getNextNode <em>Next Node</em>}</li>
 *   <li>{@link ParseTree.impl.NodeImpl#getPrevNode <em>Prev Node</em>}</li>
 *   <li>{@link ParseTree.impl.NodeImpl#getParentNode <em>Parent Node</em>}</li>
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
		return ParseTreePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getOwnedNode() {
		if (ownedNode == null) {
			ownedNode = new EObjectContainmentWithInverseEList<Node>(Node.class, this, ParseTreePackage.NODE__OWNED_NODE, ParseTreePackage.NODE__PARENT_NODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParseTreePackage.NODE__NEXT_NODE, oldNextNode, newNextNode);
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
				msgs = ((InternalEObject)nextNode).eInverseRemove(this, ParseTreePackage.NODE__PREV_NODE, Node.class, msgs);
			if (newNextNode != null)
				msgs = ((InternalEObject)newNextNode).eInverseAdd(this, ParseTreePackage.NODE__PREV_NODE, Node.class, msgs);
			msgs = basicSetNextNode(newNextNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParseTreePackage.NODE__NEXT_NODE, newNextNode, newNextNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getPrevNode() {
		if (eContainerFeatureID() != ParseTreePackage.NODE__PREV_NODE) return null;
		return (Node)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevNode(Node newPrevNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrevNode, ParseTreePackage.NODE__PREV_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevNode(Node newPrevNode) {
		if (newPrevNode != eInternalContainer() || (eContainerFeatureID() != ParseTreePackage.NODE__PREV_NODE && newPrevNode != null)) {
			if (EcoreUtil.isAncestor(this, newPrevNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrevNode != null)
				msgs = ((InternalEObject)newPrevNode).eInverseAdd(this, ParseTreePackage.NODE__NEXT_NODE, Node.class, msgs);
			msgs = basicSetPrevNode(newPrevNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParseTreePackage.NODE__PREV_NODE, newPrevNode, newPrevNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParentNode() {
		if (eContainerFeatureID() != ParseTreePackage.NODE__PARENT_NODE) return null;
		return (Node)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNode(Node newParentNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNode, ParseTreePackage.NODE__PARENT_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(Node newParentNode) {
		if (newParentNode != eInternalContainer() || (eContainerFeatureID() != ParseTreePackage.NODE__PARENT_NODE && newParentNode != null)) {
			if (EcoreUtil.isAncestor(this, newParentNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNode != null)
				msgs = ((InternalEObject)newParentNode).eInverseAdd(this, ParseTreePackage.NODE__OWNED_NODE, Node.class, msgs);
			msgs = basicSetParentNode(newParentNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParseTreePackage.NODE__PARENT_NODE, newParentNode, newParentNode));
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
			case ParseTreePackage.NODE__OWNED_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedNode()).basicAdd(otherEnd, msgs);
			case ParseTreePackage.NODE__NEXT_NODE:
				if (nextNode != null)
					msgs = ((InternalEObject)nextNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParseTreePackage.NODE__NEXT_NODE, null, msgs);
				return basicSetNextNode((Node)otherEnd, msgs);
			case ParseTreePackage.NODE__PREV_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrevNode((Node)otherEnd, msgs);
			case ParseTreePackage.NODE__PARENT_NODE:
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
			case ParseTreePackage.NODE__OWNED_NODE:
				return ((InternalEList<?>)getOwnedNode()).basicRemove(otherEnd, msgs);
			case ParseTreePackage.NODE__NEXT_NODE:
				return basicSetNextNode(null, msgs);
			case ParseTreePackage.NODE__PREV_NODE:
				return basicSetPrevNode(null, msgs);
			case ParseTreePackage.NODE__PARENT_NODE:
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
			case ParseTreePackage.NODE__PREV_NODE:
				return eInternalContainer().eInverseRemove(this, ParseTreePackage.NODE__NEXT_NODE, Node.class, msgs);
			case ParseTreePackage.NODE__PARENT_NODE:
				return eInternalContainer().eInverseRemove(this, ParseTreePackage.NODE__OWNED_NODE, Node.class, msgs);
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
			case ParseTreePackage.NODE__OWNED_NODE:
				return getOwnedNode();
			case ParseTreePackage.NODE__NEXT_NODE:
				return getNextNode();
			case ParseTreePackage.NODE__PREV_NODE:
				return getPrevNode();
			case ParseTreePackage.NODE__PARENT_NODE:
				return getParentNode();
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
			case ParseTreePackage.NODE__OWNED_NODE:
				getOwnedNode().clear();
				getOwnedNode().addAll((Collection<? extends Node>)newValue);
				return;
			case ParseTreePackage.NODE__NEXT_NODE:
				setNextNode((Node)newValue);
				return;
			case ParseTreePackage.NODE__PREV_NODE:
				setPrevNode((Node)newValue);
				return;
			case ParseTreePackage.NODE__PARENT_NODE:
				setParentNode((Node)newValue);
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
			case ParseTreePackage.NODE__OWNED_NODE:
				getOwnedNode().clear();
				return;
			case ParseTreePackage.NODE__NEXT_NODE:
				setNextNode((Node)null);
				return;
			case ParseTreePackage.NODE__PREV_NODE:
				setPrevNode((Node)null);
				return;
			case ParseTreePackage.NODE__PARENT_NODE:
				setParentNode((Node)null);
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
			case ParseTreePackage.NODE__OWNED_NODE:
				return ownedNode != null && !ownedNode.isEmpty();
			case ParseTreePackage.NODE__NEXT_NODE:
				return nextNode != null;
			case ParseTreePackage.NODE__PREV_NODE:
				return getPrevNode() != null;
			case ParseTreePackage.NODE__PARENT_NODE:
				return getParentNode() != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
