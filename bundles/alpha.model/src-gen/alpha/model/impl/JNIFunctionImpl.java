/**
 */
package alpha.model.impl;

import alpha.model.CalculatorExpressionVisitor;
import alpha.model.JNIFunction;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JNI Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.JNIFunctionImpl#getAlphaString <em>Alpha String</em>}</li>
 *   <li>{@link alpha.model.impl.JNIFunctionImpl#getZ__internal_cache_islMAff <em>Zinternal cache isl MAff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JNIFunctionImpl extends CalculatorExpressionImpl implements JNIFunction {
	/**
	 * The default value of the '{@link #getAlphaString() <em>Alpha String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaString()
	 * @generated
	 * @ordered
	 */
	protected static final String ALPHA_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlphaString() <em>Alpha String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaString()
	 * @generated
	 * @ordered
	 */
	protected String alphaString = ALPHA_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ__internal_cache_islMAff() <em>Zinternal cache isl MAff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islMAff()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLMultiAff ZINTERNAL_CACHE_ISL_MAFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_islMAff() <em>Zinternal cache isl MAff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islMAff()
	 * @generated
	 * @ordered
	 */
	protected JNIISLMultiAff z__internal_cache_islMAff = ZINTERNAL_CACHE_ISL_MAFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JNIFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.JNI_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlphaString() {
		return alphaString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphaString(String newAlphaString) {
		String oldAlphaString = alphaString;
		alphaString = newAlphaString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_FUNCTION__ALPHA_STRING, oldAlphaString, alphaString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMultiAff getZ__internal_cache_islMAff() {
		return z__internal_cache_islMAff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_islMAff(JNIISLMultiAff newZ__internal_cache_islMAff) {
		JNIISLMultiAff oldZ__internal_cache_islMAff = z__internal_cache_islMAff;
		z__internal_cache_islMAff = newZ__internal_cache_islMAff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_FUNCTION__ZINTERNAL_CACHE_ISL_MAFF, oldZ__internal_cache_islMAff, z__internal_cache_islMAff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMultiAff getISLMultiAff() {
		JNIISLMultiAff _xifexpression = null;
		JNIISLMultiAff _z__internal_cache_islMAff = this.getZ__internal_cache_islMAff();
		boolean _tripleNotEquals = (_z__internal_cache_islMAff != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_islMAff().copy();
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
	public void setISLMultiAff(final JNIISLMultiAff islMAff) {
		this.setZ__internal_cache_islMAff(islMAff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POLY_OBJECT_TYPE getType() {
		POLY_OBJECT_TYPE _xifexpression = null;
		JNIISLMultiAff _z__internal_cache_islMAff = this.getZ__internal_cache_islMAff();
		boolean _tripleNotEquals = (_z__internal_cache_islMAff != null);
		if (_tripleNotEquals) {
			_xifexpression = POLY_OBJECT_TYPE.FUNCTION;
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
		return this.getISLMultiAff();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final CalculatorExpressionVisitor visitor) {
		visitor.visitJNIFunction(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String plainToString() {
		return this.getAlphaString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.JNI_FUNCTION__ALPHA_STRING:
				return getAlphaString();
			case ModelPackage.JNI_FUNCTION__ZINTERNAL_CACHE_ISL_MAFF:
				return getZ__internal_cache_islMAff();
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
			case ModelPackage.JNI_FUNCTION__ALPHA_STRING:
				setAlphaString((String)newValue);
				return;
			case ModelPackage.JNI_FUNCTION__ZINTERNAL_CACHE_ISL_MAFF:
				setZ__internal_cache_islMAff((JNIISLMultiAff)newValue);
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
			case ModelPackage.JNI_FUNCTION__ALPHA_STRING:
				setAlphaString(ALPHA_STRING_EDEFAULT);
				return;
			case ModelPackage.JNI_FUNCTION__ZINTERNAL_CACHE_ISL_MAFF:
				setZ__internal_cache_islMAff(ZINTERNAL_CACHE_ISL_MAFF_EDEFAULT);
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
			case ModelPackage.JNI_FUNCTION__ALPHA_STRING:
				return ALPHA_STRING_EDEFAULT == null ? alphaString != null : !ALPHA_STRING_EDEFAULT.equals(alphaString);
			case ModelPackage.JNI_FUNCTION__ZINTERNAL_CACHE_ISL_MAFF:
				return ZINTERNAL_CACHE_ISL_MAFF_EDEFAULT == null ? z__internal_cache_islMAff != null : !ZINTERNAL_CACHE_ISL_MAFF_EDEFAULT.equals(z__internal_cache_islMAff);
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
		result.append(" (alphaString: ");
		result.append(alphaString);
		result.append(", z__internal_cache_islMAff: ");
		result.append(z__internal_cache_islMAff);
		result.append(')');
		return result.toString();
	}

} //JNIFunctionImpl
