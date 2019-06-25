/**
 */
package alpha.model.impl;

import alpha.model.CalculatorExpressionVisitor;
import alpha.model.JNIRelation;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import fr.irisa.cairn.jnimap.isl.jni.ISL_FORMAT;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JNI Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.JNIRelationImpl#getIslString <em>Isl String</em>}</li>
 *   <li>{@link alpha.model.impl.JNIRelationImpl#getZ__internal_cache_islMap <em>Zinternal cache isl Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JNIRelationImpl extends CalculatorExpressionImpl implements JNIRelation {
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
	 * The default value of the '{@link #getZ__internal_cache_islMap() <em>Zinternal cache isl Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islMap()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLMap ZINTERNAL_CACHE_ISL_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_islMap() <em>Zinternal cache isl Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islMap()
	 * @generated
	 * @ordered
	 */
	protected JNIISLMap z__internal_cache_islMap = ZINTERNAL_CACHE_ISL_MAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JNIRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.JNI_RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_RELATION__ISL_STRING, oldIslString, islString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMap getZ__internal_cache_islMap() {
		return z__internal_cache_islMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_islMap(JNIISLMap newZ__internal_cache_islMap) {
		JNIISLMap oldZ__internal_cache_islMap = z__internal_cache_islMap;
		z__internal_cache_islMap = newZ__internal_cache_islMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_RELATION__ZINTERNAL_CACHE_ISL_MAP, oldZ__internal_cache_islMap, z__internal_cache_islMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMap getISLMap() {
		JNIISLMap _xifexpression = null;
		JNIISLMap _z__internal_cache_islMap = this.getZ__internal_cache_islMap();
		boolean _tripleNotEquals = (_z__internal_cache_islMap != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_islMap().copy();
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
	public void setISLMap(final JNIISLMap islMap) {
		this.setZ__internal_cache_islMap(islMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POLY_OBJECT_TYPE getType() {
		POLY_OBJECT_TYPE _xifexpression = null;
		JNIISLMap _z__internal_cache_islMap = this.getZ__internal_cache_islMap();
		boolean _tripleNotEquals = (_z__internal_cache_islMap != null);
		if (_tripleNotEquals) {
			_xifexpression = POLY_OBJECT_TYPE.MAP;
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
		return this.getISLMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		JNIISLMap _z__internal_cache_islMap = this.getZ__internal_cache_islMap();
		boolean _tripleNotEquals = (_z__internal_cache_islMap != null);
		if (_tripleNotEquals) {
			return this.getZ__internal_cache_islMap().toString(ISL_FORMAT.ISL);
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
		visitor.visitJNIRelation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.JNI_RELATION__ISL_STRING:
				return getIslString();
			case ModelPackage.JNI_RELATION__ZINTERNAL_CACHE_ISL_MAP:
				return getZ__internal_cache_islMap();
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
			case ModelPackage.JNI_RELATION__ISL_STRING:
				setIslString((String)newValue);
				return;
			case ModelPackage.JNI_RELATION__ZINTERNAL_CACHE_ISL_MAP:
				setZ__internal_cache_islMap((JNIISLMap)newValue);
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
			case ModelPackage.JNI_RELATION__ISL_STRING:
				setIslString(ISL_STRING_EDEFAULT);
				return;
			case ModelPackage.JNI_RELATION__ZINTERNAL_CACHE_ISL_MAP:
				setZ__internal_cache_islMap(ZINTERNAL_CACHE_ISL_MAP_EDEFAULT);
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
			case ModelPackage.JNI_RELATION__ISL_STRING:
				return ISL_STRING_EDEFAULT == null ? islString != null : !ISL_STRING_EDEFAULT.equals(islString);
			case ModelPackage.JNI_RELATION__ZINTERNAL_CACHE_ISL_MAP:
				return ZINTERNAL_CACHE_ISL_MAP_EDEFAULT == null ? z__internal_cache_islMap != null : !ZINTERNAL_CACHE_ISL_MAP_EDEFAULT.equals(z__internal_cache_islMap);
		}
		return super.eIsSet(featureID);
	}

} //JNIRelationImpl
