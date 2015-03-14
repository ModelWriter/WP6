/**
 */
package DocModel.impl;

import DocModel.DocModelPackage;
import DocModel.NamedElement;
import DocModel.NamedNode;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DocModel.impl.NamedNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link DocModel.impl.NamedNodeImpl#getParagraf <em>Paragraf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedNodeImpl extends NodeImpl implements NamedNode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParagraf() <em>Paragraf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraf()
	 * @generated
	 * @ordered
	 */
	protected static final XWPFParagraph PARAGRAF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParagraf() <em>Paragraf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraf()
	 * @generated
	 * @ordered
	 */
	protected XWPFParagraph paragraf = PARAGRAF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocModelPackage.Literals.NAMED_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.NAMED_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XWPFParagraph getParagraf() {
		return paragraf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraf(XWPFParagraph newParagraf) {
		XWPFParagraph oldParagraf = paragraf;
		paragraf = newParagraf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocModelPackage.NAMED_NODE__PARAGRAF, oldParagraf, paragraf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocModelPackage.NAMED_NODE__NAME:
				return getName();
			case DocModelPackage.NAMED_NODE__PARAGRAF:
				return getParagraf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocModelPackage.NAMED_NODE__NAME:
				setName((String)newValue);
				return;
			case DocModelPackage.NAMED_NODE__PARAGRAF:
				setParagraf((XWPFParagraph)newValue);
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
			case DocModelPackage.NAMED_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DocModelPackage.NAMED_NODE__PARAGRAF:
				setParagraf(PARAGRAF_EDEFAULT);
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
			case DocModelPackage.NAMED_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DocModelPackage.NAMED_NODE__PARAGRAF:
				return PARAGRAF_EDEFAULT == null ? paragraf != null : !PARAGRAF_EDEFAULT.equals(paragraf);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DocModelPackage.NAMED_NODE__NAME: return DocModelPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case DocModelPackage.NAMED_ELEMENT__NAME: return DocModelPackage.NAMED_NODE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", paragraf: ");
		result.append(paragraf);
		result.append(')');
		return result.toString();
	}

} //NamedNodeImpl
