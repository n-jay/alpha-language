/**
 */
package alpha.model.impl;

import alpha.model.JNIFunctionInArrayNotation;
import alpha.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
	 * The cached value of the '{@link #getArrayNotation() <em>Array Notation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayNotation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arrayNotation;

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
	public EList<String> getArrayNotation() {
		if (arrayNotation == null) {
			arrayNotation = new EDataTypeEList<String>(String.class, this, ModelPackage.JNI_FUNCTION_IN_ARRAY_NOTATION__ARRAY_NOTATION);
		}
		return arrayNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String plainToString() {
		String _join = IterableExtensions.join(this.getArrayNotation(), ",");
		String _plus = ("[" + _join);
		return (_plus + "]");
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.JNI_FUNCTION_IN_ARRAY_NOTATION__ARRAY_NOTATION:
				getArrayNotation().clear();
				getArrayNotation().addAll((Collection<? extends String>)newValue);
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
				getArrayNotation().clear();
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
				return arrayNotation != null && !arrayNotation.isEmpty();
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
