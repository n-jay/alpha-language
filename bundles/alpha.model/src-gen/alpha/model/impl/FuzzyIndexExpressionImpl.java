/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpressionVisitor;
import alpha.model.FuzzyFunction;
import alpha.model.FuzzyIndexExpression;
import alpha.model.ModelPackage;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Index Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.FuzzyIndexExpressionImpl#getFuzzyFunction <em>Fuzzy Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuzzyIndexExpressionImpl extends AlphaExpressionImpl implements FuzzyIndexExpression {
	/**
	 * The cached value of the '{@link #getFuzzyFunction() <em>Fuzzy Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuzzyFunction()
	 * @generated
	 * @ordered
	 */
	protected FuzzyFunction fuzzyFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyIndexExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUZZY_INDEX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuzzyFunction getFuzzyFunction() {
		return fuzzyFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuzzyFunction(FuzzyFunction newFuzzyFunction, NotificationChain msgs) {
		FuzzyFunction oldFuzzyFunction = fuzzyFunction;
		fuzzyFunction = newFuzzyFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_INDEX_EXPRESSION__FUZZY_FUNCTION, oldFuzzyFunction, newFuzzyFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuzzyFunction(FuzzyFunction newFuzzyFunction) {
		if (newFuzzyFunction != fuzzyFunction) {
			NotificationChain msgs = null;
			if (fuzzyFunction != null)
				msgs = ((InternalEObject)fuzzyFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_INDEX_EXPRESSION__FUZZY_FUNCTION, null, msgs);
			if (newFuzzyFunction != null)
				msgs = ((InternalEObject)newFuzzyFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_INDEX_EXPRESSION__FUZZY_FUNCTION, null, msgs);
			msgs = basicSetFuzzyFunction(newFuzzyFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_INDEX_EXPRESSION__FUZZY_FUNCTION, newFuzzyFunction, newFuzzyFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIISLMap getDependenceRelation() {
		JNIISLMap _xifexpression = null;
		FuzzyFunction _fuzzyFunction = this.getFuzzyFunction();
		boolean _tripleNotEquals = (_fuzzyFunction != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getFuzzyFunction().getDependenceRelation();
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
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitFuzzyIndexExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUZZY_FUNCTION:
				return basicSetFuzzyFunction(null, msgs);
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
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUZZY_FUNCTION:
				return getFuzzyFunction();
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
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUZZY_FUNCTION:
				setFuzzyFunction((FuzzyFunction)newValue);
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
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUZZY_FUNCTION:
				setFuzzyFunction((FuzzyFunction)null);
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
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUZZY_FUNCTION:
				return fuzzyFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //FuzzyIndexExpressionImpl
