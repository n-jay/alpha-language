/**
 */
package alpha.model.impl;

import alpha.model.CalculatorExpressionVisitor;
import alpha.model.JNIDomain;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import alpha.model.util.AlphaUtil;

import fr.irisa.cairn.jnimap.isl.jni.ISL_FORMAT;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

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
 *   <li>{@link alpha.model.impl.JNIDomainImpl#getIslSet <em>Isl Set</em>}</li>
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_DOMAIN__ISL_SET, oldIslSet, islSet));
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
		return AlphaUtil.copy(this.getIslSet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		JNIISLSet _islSet = this.getIslSet();
		boolean _tripleNotEquals = (_islSet != null);
		if (_tripleNotEquals) {
			return this.getIslSet().toString(ISL_FORMAT.ISL);
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
			case ModelPackage.JNI_DOMAIN__ISL_SET:
				return getIslSet();
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
			case ModelPackage.JNI_DOMAIN__ISL_SET:
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
			case ModelPackage.JNI_DOMAIN__ISL_STRING:
				setIslString(ISL_STRING_EDEFAULT);
				return;
			case ModelPackage.JNI_DOMAIN__ISL_SET:
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
			case ModelPackage.JNI_DOMAIN__ISL_STRING:
				return ISL_STRING_EDEFAULT == null ? islString != null : !ISL_STRING_EDEFAULT.equals(islString);
			case ModelPackage.JNI_DOMAIN__ISL_SET:
				return ISL_SET_EDEFAULT == null ? islSet != null : !ISL_SET_EDEFAULT.equals(islSet);
		}
		return super.eIsSet(featureID);
	}

} //JNIDomainImpl
