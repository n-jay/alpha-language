/**
 */
package alpha.model.impl;

import alpha.model.AffineFuzzyVariableUse;
import alpha.model.JNIFunctionInArrayNotation;
import alpha.model.ModelPackage;

import fr.irisa.cairn.jnimap.isl.ISLMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affine Fuzzy Variable Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AffineFuzzyVariableUseImpl#getUseFunction <em>Use Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffineFuzzyVariableUseImpl extends FuzzyVariableUseImpl implements AffineFuzzyVariableUse {
	/**
	 * The cached value of the '{@link #getUseFunction() <em>Use Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseFunction()
	 * @generated
	 * @ordered
	 */
	protected JNIFunctionInArrayNotation useFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffineFuzzyVariableUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.AFFINE_FUZZY_VARIABLE_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIFunctionInArrayNotation getUseFunction() {
		return useFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseFunction(JNIFunctionInArrayNotation newUseFunction, NotificationChain msgs) {
		JNIFunctionInArrayNotation oldUseFunction = useFunction;
		useFunction = newUseFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.AFFINE_FUZZY_VARIABLE_USE__USE_FUNCTION, oldUseFunction, newUseFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFunction(JNIFunctionInArrayNotation newUseFunction) {
		if (newUseFunction != useFunction) {
			NotificationChain msgs = null;
			if (useFunction != null)
				msgs = ((InternalEObject)useFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.AFFINE_FUZZY_VARIABLE_USE__USE_FUNCTION, null, msgs);
			if (newUseFunction != null)
				msgs = ((InternalEObject)newUseFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.AFFINE_FUZZY_VARIABLE_USE__USE_FUNCTION, null, msgs);
			msgs = basicSetUseFunction(newUseFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.AFFINE_FUZZY_VARIABLE_USE__USE_FUNCTION, newUseFunction, newUseFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLMap getDependenceRelation() {
		ISLMap _xifexpression = null;
		if ((((this.getUseFunction() != null) && (this.getFuzzyVariable() != null)) && (this.getFuzzyVariable().getRelation() != null))) {
			_xifexpression = this.getUseFunction().getISLMultiAff().toMap().applyRange(this.getFuzzyVariable().getRelation());
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.AFFINE_FUZZY_VARIABLE_USE__USE_FUNCTION:
				return basicSetUseFunction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.AFFINE_FUZZY_VARIABLE_USE__USE_FUNCTION:
				return getUseFunction();
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
			case ModelPackage.AFFINE_FUZZY_VARIABLE_USE__USE_FUNCTION:
				setUseFunction((JNIFunctionInArrayNotation)newValue);
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
			case ModelPackage.AFFINE_FUZZY_VARIABLE_USE__USE_FUNCTION:
				setUseFunction((JNIFunctionInArrayNotation)null);
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
			case ModelPackage.AFFINE_FUZZY_VARIABLE_USE__USE_FUNCTION:
				return useFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //AffineFuzzyVariableUseImpl
