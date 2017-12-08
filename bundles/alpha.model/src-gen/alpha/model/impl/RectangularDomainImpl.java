/**
 */
package alpha.model.impl;

import alpha.model.CalculatorExpressionVisitor;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.RectangularDomain;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangular Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.RectangularDomainImpl#getUpperBounds <em>Upper Bounds</em>}</li>
 *   <li>{@link alpha.model.impl.RectangularDomainImpl#getIndexNames <em>Index Names</em>}</li>
 *   <li>{@link alpha.model.impl.RectangularDomainImpl#getIslSet <em>Isl Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangularDomainImpl extends CalculatorExpressionImpl implements RectangularDomain {
	/**
	 * The cached value of the '{@link #getUpperBounds() <em>Upper Bounds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBounds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> upperBounds;

	/**
	 * The cached value of the '{@link #getIndexNames() <em>Index Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> indexNames;

	/**
	 * The default value of the '{@link #getIslSet() <em>Isl Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslSet()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLSet ISL_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIslSet() <em>Isl Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslSet()
	 * @generated
	 * @ordered
	 */
	protected JNIISLSet islSet = ISL_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangularDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RECTANGULAR_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUpperBounds() {
		if (upperBounds == null) {
			upperBounds = new EDataTypeEList<String>(String.class, this, ModelPackage.RECTANGULAR_DOMAIN__UPPER_BOUNDS);
		}
		return upperBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIndexNames() {
		if (indexNames == null) {
			indexNames = new EDataTypeEList<String>(String.class, this, ModelPackage.RECTANGULAR_DOMAIN__INDEX_NAMES);
		}
		return indexNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getIslSet() {
		return islSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIslSet(JNIISLSet newIslSet) {
		JNIISLSet oldIslSet = islSet;
		islSet = newIslSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECTANGULAR_DOMAIN__ISL_SET, oldIslSet, islSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POLY_OBJECT_TYPE getType() {
		return POLY_OBJECT_TYPE.SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIObject getISLObject() {
		return this.getIslSet().copy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final CalculatorExpressionVisitor visitor) {
		visitor.visitRectangularDomain(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RECTANGULAR_DOMAIN__UPPER_BOUNDS:
				return getUpperBounds();
			case ModelPackage.RECTANGULAR_DOMAIN__INDEX_NAMES:
				return getIndexNames();
			case ModelPackage.RECTANGULAR_DOMAIN__ISL_SET:
				return getIslSet();
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
			case ModelPackage.RECTANGULAR_DOMAIN__UPPER_BOUNDS:
				getUpperBounds().clear();
				getUpperBounds().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.RECTANGULAR_DOMAIN__INDEX_NAMES:
				getIndexNames().clear();
				getIndexNames().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.RECTANGULAR_DOMAIN__ISL_SET:
				setIslSet((JNIISLSet)newValue);
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
			case ModelPackage.RECTANGULAR_DOMAIN__UPPER_BOUNDS:
				getUpperBounds().clear();
				return;
			case ModelPackage.RECTANGULAR_DOMAIN__INDEX_NAMES:
				getIndexNames().clear();
				return;
			case ModelPackage.RECTANGULAR_DOMAIN__ISL_SET:
				setIslSet(ISL_SET_EDEFAULT);
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
			case ModelPackage.RECTANGULAR_DOMAIN__UPPER_BOUNDS:
				return upperBounds != null && !upperBounds.isEmpty();
			case ModelPackage.RECTANGULAR_DOMAIN__INDEX_NAMES:
				return indexNames != null && !indexNames.isEmpty();
			case ModelPackage.RECTANGULAR_DOMAIN__ISL_SET:
				return ISL_SET_EDEFAULT == null ? islSet != null : !ISL_SET_EDEFAULT.equals(islSet);
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
		result.append(" (upperBounds: ");
		result.append(upperBounds);
		result.append(", indexNames: ");
		result.append(indexNames);
		result.append(", islSet: ");
		result.append(islSet);
		result.append(')');
		return result.toString();
	}

} //RectangularDomainImpl
