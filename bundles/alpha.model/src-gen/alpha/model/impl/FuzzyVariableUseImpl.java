/**
 */
package alpha.model.impl;

import alpha.model.FuzzyVariable;
import alpha.model.FuzzyVariableUse;
import alpha.model.ModelPackage;

import fr.irisa.cairn.jnimap.isl.ISLMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Variable Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.FuzzyVariableUseImpl#getFuzzyIndex <em>Fuzzy Index</em>}</li>
 *   <li>{@link alpha.model.impl.FuzzyVariableUseImpl#getFuzzyVariable <em>Fuzzy Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FuzzyVariableUseImpl extends AlphaNodeImpl implements FuzzyVariableUse {
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
	protected FuzzyVariableUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUZZY_VARIABLE_USE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_VARIABLE_USE__FUZZY_INDEX, oldFuzzyIndex, fuzzyIndex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FUZZY_VARIABLE_USE__FUZZY_VARIABLE, oldFuzzyVariable, fuzzyVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_VARIABLE_USE__FUZZY_VARIABLE, oldFuzzyVariable, fuzzyVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLMap getDependenceRelation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_INDEX:
				return getFuzzyIndex();
			case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_VARIABLE:
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
			case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_INDEX:
				setFuzzyIndex((String)newValue);
				return;
			case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_VARIABLE:
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
			case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_INDEX:
				setFuzzyIndex(FUZZY_INDEX_EDEFAULT);
				return;
			case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_VARIABLE:
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
			case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_INDEX:
				return FUZZY_INDEX_EDEFAULT == null ? fuzzyIndex != null : !FUZZY_INDEX_EDEFAULT.equals(fuzzyIndex);
			case ModelPackage.FUZZY_VARIABLE_USE__FUZZY_VARIABLE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fuzzyIndex: ");
		result.append(fuzzyIndex);
		result.append(')');
		return result.toString();
	}

} //FuzzyVariableUseImpl
