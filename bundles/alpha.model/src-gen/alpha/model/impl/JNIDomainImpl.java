/**
 */
package alpha.model.impl;

import alpha.model.CalculatorExpressionVisitor;
import alpha.model.JNIDomain;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import fr.irisa.cairn.jnimap.isl.ISLSet;
import fr.irisa.cairn.jnimap.isl.ISL_FORMAT;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JNI Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.JNIDomainImpl#getIslString <em>Isl String</em>}</li>
 *   <li>{@link alpha.model.impl.JNIDomainImpl#getZ__internal_cache_islSet <em>Zinternal cache isl Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JNIDomainImpl extends CalculatorExpressionImpl implements JNIDomain {
	/**
	 * The default value of the '{@link #getIslString() <em>Isl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslString()
	 * @generated
	 * @ordered
	 */
	protected static final String ISL_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIslString() <em>Isl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslString()
	 * @generated
	 * @ordered
	 */
	protected String islString = ISL_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ__internal_cache_islSet() <em>Zinternal cache isl Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islSet()
	 * @generated
	 * @ordered
	 */
	protected static final ISLSet ZINTERNAL_CACHE_ISL_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_islSet() <em>Zinternal cache isl Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islSet()
	 * @generated
	 * @ordered
	 */
	protected ISLSet z__internal_cache_islSet = ZINTERNAL_CACHE_ISL_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JNIDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.JNI_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIslString() {
		return islString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIslString(String newIslString) {
		String oldIslString = islString;
		islString = newIslString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_DOMAIN__ISL_STRING, oldIslString, islString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLSet getZ__internal_cache_islSet() {
		return z__internal_cache_islSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_islSet(ISLSet newZ__internal_cache_islSet) {
		ISLSet oldZ__internal_cache_islSet = z__internal_cache_islSet;
		z__internal_cache_islSet = newZ__internal_cache_islSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_DOMAIN__ZINTERNAL_CACHE_ISL_SET, oldZ__internal_cache_islSet, z__internal_cache_islSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLSet getISLSet() {
		ISLSet _xifexpression = null;
		ISLSet _z__internal_cache_islSet = this.getZ__internal_cache_islSet();
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
	public void setISLSet(final ISLSet islset) {
		this.setZ__internal_cache_islSet(islset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POLY_OBJECT_TYPE getType() {
		POLY_OBJECT_TYPE _xifexpression = null;
		ISLSet _z__internal_cache_islSet = this.getZ__internal_cache_islSet();
		boolean _tripleNotEquals = (_z__internal_cache_islSet != null);
		if (_tripleNotEquals) {
			_xifexpression = POLY_OBJECT_TYPE.SET;
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
	public JNIObject getISLObject() {
		return this.getISLSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		ISLSet _z__internal_cache_islSet = this.getZ__internal_cache_islSet();
		boolean _tripleNotEquals = (_z__internal_cache_islSet != null);
		if (_tripleNotEquals) {
			return this.getZ__internal_cache_islSet().toString(ISL_FORMAT.ISL);
		}
		else {
			return "null ISL object";
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String plainToString() {
		return this.getIslString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final CalculatorExpressionVisitor visitor) {
		visitor.visitJNIDomain(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.JNI_DOMAIN__ISL_STRING:
				return getIslString();
			case ModelPackage.JNI_DOMAIN__ZINTERNAL_CACHE_ISL_SET:
				return getZ__internal_cache_islSet();
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
			case ModelPackage.JNI_DOMAIN__ISL_STRING:
				setIslString((String)newValue);
				return;
			case ModelPackage.JNI_DOMAIN__ZINTERNAL_CACHE_ISL_SET:
				setZ__internal_cache_islSet((ISLSet)newValue);
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
			case ModelPackage.JNI_DOMAIN__ISL_STRING:
				setIslString(ISL_STRING_EDEFAULT);
				return;
			case ModelPackage.JNI_DOMAIN__ZINTERNAL_CACHE_ISL_SET:
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
			case ModelPackage.JNI_DOMAIN__ISL_STRING:
				return ISL_STRING_EDEFAULT == null ? islString != null : !ISL_STRING_EDEFAULT.equals(islString);
			case ModelPackage.JNI_DOMAIN__ZINTERNAL_CACHE_ISL_SET:
				return ZINTERNAL_CACHE_ISL_SET_EDEFAULT == null ? z__internal_cache_islSet != null : !ZINTERNAL_CACHE_ISL_SET_EDEFAULT.equals(z__internal_cache_islSet);
		}
		return super.eIsSet(featureID);
	}

} //JNIDomainImpl
