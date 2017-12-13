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
 *   <li>{@link alpha.model.impl.RectangularDomainImpl#getZ__internal_cache_islSet <em>Zinternal cache isl Set</em>}</li>
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
	 * The default value of the '{@link #getZ__internal_cache_islSet() <em>Zinternal cache isl Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islSet()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLSet ZINTERNAL_CACHE_ISL_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_islSet() <em>Zinternal cache isl Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islSet()
	 * @generated
	 * @ordered
	 */
	protected JNIISLSet z__internal_cache_islSet = ZINTERNAL_CACHE_ISL_SET_EDEFAULT;

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
	public JNIISLSet getZ__internal_cache_islSet() {
		return z__internal_cache_islSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_islSet(JNIISLSet newZ__internal_cache_islSet) {
		JNIISLSet oldZ__internal_cache_islSet = z__internal_cache_islSet;
		z__internal_cache_islSet = newZ__internal_cache_islSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECTANGULAR_DOMAIN__ZINTERNAL_CACHE_ISL_SET, oldZ__internal_cache_islSet, z__internal_cache_islSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getISLSet() {
		JNIISLSet _xifexpression = null;
		JNIISLSet _z__internal_cache_islSet = this.getZ__internal_cache_islSet();
		boolean _tripleNotEquals = (_z__internal_cache_islSet != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_islSet().copy();
		}
		else {
			_xifexpression = null;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISLSet(final JNIISLSet islset) {
		this.setZ__internal_cache_islSet(islset);
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
		return this.getISLSet();
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
			case ModelPackage.RECTANGULAR_DOMAIN__ZINTERNAL_CACHE_ISL_SET:
				return getZ__internal_cache_islSet();
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
			case ModelPackage.RECTANGULAR_DOMAIN__ZINTERNAL_CACHE_ISL_SET:
				setZ__internal_cache_islSet((JNIISLSet)newValue);
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
			case ModelPackage.RECTANGULAR_DOMAIN__ZINTERNAL_CACHE_ISL_SET:
				setZ__internal_cache_islSet(ZINTERNAL_CACHE_ISL_SET_EDEFAULT);
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
			case ModelPackage.RECTANGULAR_DOMAIN__ZINTERNAL_CACHE_ISL_SET:
				return ZINTERNAL_CACHE_ISL_SET_EDEFAULT == null ? z__internal_cache_islSet != null : !ZINTERNAL_CACHE_ISL_SET_EDEFAULT.equals(z__internal_cache_islSet);
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
		result.append(", z__internal_cache_islSet: ");
		result.append(z__internal_cache_islSet);
		result.append(')');
		return result.toString();
	}

} //RectangularDomainImpl
