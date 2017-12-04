/**
 */
package alpha.model.impl;

import alpha.model.JNIFunctionInArrayNotation;
import alpha.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JNI Function In Array Notation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.JNIFunctionInArrayNotationImpl#getArrayNotation <em>Array Notation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JNIFunctionInArrayNotationImpl extends JNIFunctionImpl implements JNIFunctionInArrayNotation {
	/**
	 * The default value of the '{@link #getArrayNotation() <em>Array Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayNotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRAY_NOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrayNotation() <em>Array Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayNotation()
	 * @generated
	 * @ordered
	 */
	protected String arrayNotation = ARRAY_NOTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JNIFunctionInArrayNotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.JNI_FUNCTION_IN_ARRAY_NOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrayNotation() {
		return arrayNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayNotation(String newArrayNotation) {
		String oldArrayNotation = arrayNotation;
		arrayNotation = newArrayNotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_FUNCTION_IN_ARRAY_NOTATION__ARRAY_NOTATION, oldArrayNotation, arrayNotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.JNI_FUNCTION_IN_ARRAY_NOTATION__ARRAY_NOTATION:
				return getArrayNotation();
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
			case ModelPackage.JNI_FUNCTION_IN_ARRAY_NOTATION__ARRAY_NOTATION:
				setArrayNotation((String)newValue);
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
			case ModelPackage.JNI_FUNCTION_IN_ARRAY_NOTATION__ARRAY_NOTATION:
				setArrayNotation(ARRAY_NOTATION_EDEFAULT);
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
			case ModelPackage.JNI_FUNCTION_IN_ARRAY_NOTATION__ARRAY_NOTATION:
				return ARRAY_NOTATION_EDEFAULT == null ? arrayNotation != null : !ARRAY_NOTATION_EDEFAULT.equals(arrayNotation);
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
		result.append(" (arrayNotation: ");
		result.append(arrayNotation);
		result.append(')');
		return result.toString();
	}

} //JNIFunctionInArrayNotationImpl
