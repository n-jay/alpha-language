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
 *   <li>{@link alpha.model.impl.JNIRelationImpl#getIslMap <em>Isl Map</em>}</li>
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
	 * The default value of the '{@link #getIslMap() <em>Isl Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslMap()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLMap ISL_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIslMap() <em>Isl Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslMap()
	 * @generated
	 * @ordered
	 */
	protected JNIISLMap islMap = ISL_MAP_EDEFAULT;

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
	public JNIISLMap getIslMap() {
		return islMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIslMap(JNIISLMap newIslMap) {
		JNIISLMap oldIslMap = islMap;
		islMap = newIslMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_RELATION__ISL_MAP, oldIslMap, islMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POLY_OBJECT_TYPE getType() {
		return POLY_OBJECT_TYPE.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIObject getISLObject() {
		return this.getIslMap().copy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		JNIISLMap _islMap = this.getIslMap();
		boolean _tripleNotEquals = (_islMap != null);
		if (_tripleNotEquals) {
			return this.getIslMap().toString(ISL_FORMAT.ISL);
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
			case ModelPackage.JNI_RELATION__ISL_MAP:
				return getIslMap();
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
			case ModelPackage.JNI_RELATION__ISL_MAP:
				setIslMap((JNIISLMap)newValue);
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
			case ModelPackage.JNI_RELATION__ISL_MAP:
				setIslMap(ISL_MAP_EDEFAULT);
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
			case ModelPackage.JNI_RELATION__ISL_MAP:
				return ISL_MAP_EDEFAULT == null ? islMap != null : !ISL_MAP_EDEFAULT.equals(islMap);
		}
		return super.eIsSet(featureID);
	}

} //JNIRelationImpl
