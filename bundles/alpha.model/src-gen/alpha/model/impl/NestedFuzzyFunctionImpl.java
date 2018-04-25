/**
 */
package alpha.model.impl;

import alpha.model.FuzzyVariable;
import alpha.model.FuzzyVariableUse;
import alpha.model.ModelPackage;
import alpha.model.NestedFuzzyFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Fuzzy Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.NestedFuzzyFunctionImpl#getFuzzyIndex <em>Fuzzy Index</em>}</li>
 *   <li>{@link alpha.model.impl.NestedFuzzyFunctionImpl#getFuzzyVariable <em>Fuzzy Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedFuzzyFunctionImpl extends FuzzyFunctionImpl implements NestedFuzzyFunction {
	/**
	 * The default value of the '{@link #getFuzzyIndex() <em>Fuzzy Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuzzyIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String FUZZY_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuzzyIndex() <em>Fuzzy Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuzzyIndex()
	 * @generated
	 * @ordered
	 */
	protected String fuzzyIndex = FUZZY_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFuzzyVariable() <em>Fuzzy Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuzzyVariable()
	 * @generated
	 * @ordered
	 */
	protected FuzzyVariable fuzzyVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedFuzzyFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.NESTED_FUZZY_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFuzzyIndex() {
		return fuzzyIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuzzyIndex(String newFuzzyIndex) {
		String oldFuzzyIndex = fuzzyIndex;
		fuzzyIndex = newFuzzyIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_INDEX, oldFuzzyIndex, fuzzyIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyVariable getFuzzyVariable() {
		if (fuzzyVariable != null && fuzzyVariable.eIsProxy()) {
			InternalEObject oldFuzzyVariable = (InternalEObject)fuzzyVariable;
			fuzzyVariable = (FuzzyVariable)eResolveProxy(oldFuzzyVariable);
			if (fuzzyVariable != oldFuzzyVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_VARIABLE, oldFuzzyVariable, fuzzyVariable));
			}
		}
		return fuzzyVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyVariable basicGetFuzzyVariable() {
		return fuzzyVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuzzyVariable(FuzzyVariable newFuzzyVariable) {
		FuzzyVariable oldFuzzyVariable = fuzzyVariable;
		fuzzyVariable = newFuzzyVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_VARIABLE, oldFuzzyVariable, fuzzyVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_INDEX:
				return getFuzzyIndex();
			case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_VARIABLE:
				if (resolve) return getFuzzyVariable();
				return basicGetFuzzyVariable();
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
			case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_INDEX:
				setFuzzyIndex((String)newValue);
				return;
			case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_VARIABLE:
				setFuzzyVariable((FuzzyVariable)newValue);
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
			case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_INDEX:
				setFuzzyIndex(FUZZY_INDEX_EDEFAULT);
				return;
			case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_VARIABLE:
				setFuzzyVariable((FuzzyVariable)null);
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
			case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_INDEX:
				return FUZZY_INDEX_EDEFAULT == null ? fuzzyIndex != null : !FUZZY_INDEX_EDEFAULT.equals(fuzzyIndex);
			case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_VARIABLE:
				return fuzzyVariable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FuzzyVariableUse.class) {
			switch (derivedFeatureID) {
				case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_INDEX: return ModelPackage.FUZZY_VARIABLE_USE__FUZZY_INDEX;
				case ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_VARIABLE: return ModelPackage.FUZZY_VARIABLE_USE__FUZZY_VARIABLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FuzzyVariableUse.class) {
			switch (baseFeatureID) {
				case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_INDEX: return ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_INDEX;
				case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_VARIABLE: return ModelPackage.NESTED_FUZZY_FUNCTION__FUZZY_VARIABLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (fuzzyIndex: ");
		result.append(fuzzyIndex);
		result.append(')');
		return result.toString();
	}

} //NestedFuzzyFunctionImpl
