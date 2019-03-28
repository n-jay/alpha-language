/**
 */
package alpha.model.impl;

import alpha.model.CalculatorExpressionVisitor;
import alpha.model.JNIPolynomial;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLPWQPolynomial;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JNI Polynomial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.JNIPolynomialImpl#getIslString <em>Isl String</em>}</li>
 *   <li>{@link alpha.model.impl.JNIPolynomialImpl#getZ__internal_cache_islPWQP <em>Zinternal cache isl PWQP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JNIPolynomialImpl extends CalculatorExpressionImpl implements JNIPolynomial {
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
	 * The default value of the '{@link #getZ__internal_cache_islPWQP() <em>Zinternal cache isl PWQP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islPWQP()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLPWQPolynomial ZINTERNAL_CACHE_ISL_PWQP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_islPWQP() <em>Zinternal cache isl PWQP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islPWQP()
	 * @generated
	 * @ordered
	 */
	protected JNIISLPWQPolynomial z__internal_cache_islPWQP = ZINTERNAL_CACHE_ISL_PWQP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JNIPolynomialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.JNI_POLYNOMIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIslString() {
		return islString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIslString(String newIslString) {
		String oldIslString = islString;
		islString = newIslString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_POLYNOMIAL__ISL_STRING, oldIslString, islString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIISLPWQPolynomial getZ__internal_cache_islPWQP() {
		return z__internal_cache_islPWQP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZ__internal_cache_islPWQP(JNIISLPWQPolynomial newZ__internal_cache_islPWQP) {
		JNIISLPWQPolynomial oldZ__internal_cache_islPWQP = z__internal_cache_islPWQP;
		z__internal_cache_islPWQP = newZ__internal_cache_islPWQP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_POLYNOMIAL__ZINTERNAL_CACHE_ISL_PWQP, oldZ__internal_cache_islPWQP, z__internal_cache_islPWQP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIISLPWQPolynomial getISLPWQPolynomial() {
		JNIISLPWQPolynomial _xifexpression = null;
		JNIISLPWQPolynomial _z__internal_cache_islPWQP = this.getZ__internal_cache_islPWQP();
		boolean _tripleNotEquals = (_z__internal_cache_islPWQP != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_islPWQP().copy();
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
	@Override
	public void setISLQPolynomialPiece(final JNIISLPWQPolynomial islQP) {
		this.setZ__internal_cache_islPWQP(islQP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public POLY_OBJECT_TYPE getType() {
		POLY_OBJECT_TYPE _xifexpression = null;
		JNIISLPWQPolynomial _z__internal_cache_islPWQP = this.getZ__internal_cache_islPWQP();
		boolean _tripleNotEquals = (_z__internal_cache_islPWQP != null);
		if (_tripleNotEquals) {
			_xifexpression = POLY_OBJECT_TYPE.POLYNOMIAL;
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
	@Override
	public JNIObject getISLObject() {
		return this.getISLPWQPolynomial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(final CalculatorExpressionVisitor visitor) {
		visitor.visitJNIPolynomial(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String plainToString() {
		return this.getIslString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.JNI_POLYNOMIAL__ISL_STRING:
				return getIslString();
			case ModelPackage.JNI_POLYNOMIAL__ZINTERNAL_CACHE_ISL_PWQP:
				return getZ__internal_cache_islPWQP();
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
			case ModelPackage.JNI_POLYNOMIAL__ISL_STRING:
				setIslString((String)newValue);
				return;
			case ModelPackage.JNI_POLYNOMIAL__ZINTERNAL_CACHE_ISL_PWQP:
				setZ__internal_cache_islPWQP((JNIISLPWQPolynomial)newValue);
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
			case ModelPackage.JNI_POLYNOMIAL__ISL_STRING:
				setIslString(ISL_STRING_EDEFAULT);
				return;
			case ModelPackage.JNI_POLYNOMIAL__ZINTERNAL_CACHE_ISL_PWQP:
				setZ__internal_cache_islPWQP(ZINTERNAL_CACHE_ISL_PWQP_EDEFAULT);
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
			case ModelPackage.JNI_POLYNOMIAL__ISL_STRING:
				return ISL_STRING_EDEFAULT == null ? islString != null : !ISL_STRING_EDEFAULT.equals(islString);
			case ModelPackage.JNI_POLYNOMIAL__ZINTERNAL_CACHE_ISL_PWQP:
				return ZINTERNAL_CACHE_ISL_PWQP_EDEFAULT == null ? z__internal_cache_islPWQP != null : !ZINTERNAL_CACHE_ISL_PWQP_EDEFAULT.equals(z__internal_cache_islPWQP);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (islString: ");
		result.append(islString);
		result.append(", z__internal_cache_islPWQP: ");
		result.append(z__internal_cache_islPWQP);
		result.append(')');
		return result.toString();
	}

} //JNIPolynomialImpl
