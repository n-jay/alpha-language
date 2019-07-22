/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.FuzzyDependenceExpression;
import alpha.model.FuzzyFunction;
import alpha.model.ModelPackage;

import fr.irisa.cairn.jnimap.isl.ISLMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Dependence Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.FuzzyDependenceExpressionImpl#getFuzzyFunction <em>Fuzzy Function</em>}</li>
 *   <li>{@link alpha.model.impl.FuzzyDependenceExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuzzyDependenceExpressionImpl extends AlphaExpressionImpl implements FuzzyDependenceExpression {
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
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected AlphaExpression expr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyDependenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUZZY_DEPENDENCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__FUZZY_FUNCTION, oldFuzzyFunction, newFuzzyFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuzzyFunction(FuzzyFunction newFuzzyFunction) {
		if (newFuzzyFunction != fuzzyFunction) {
			NotificationChain msgs = null;
			if (fuzzyFunction != null)
				msgs = ((InternalEObject)fuzzyFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__FUZZY_FUNCTION, null, msgs);
			if (newFuzzyFunction != null)
				msgs = ((InternalEObject)newFuzzyFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__FUZZY_FUNCTION, null, msgs);
			msgs = basicSetFuzzyFunction(newFuzzyFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__FUZZY_FUNCTION, newFuzzyFunction, newFuzzyFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaExpression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(AlphaExpression newExpr, NotificationChain msgs) {
		AlphaExpression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(AlphaExpression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLMap getDependenceRelation() {
		ISLMap _xifexpression = null;
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
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitFuzzyDependenceExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__FUZZY_FUNCTION:
				return basicSetFuzzyFunction(null, msgs);
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__EXPR:
				return basicSetExpr(null, msgs);
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
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__FUZZY_FUNCTION:
				return getFuzzyFunction();
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__EXPR:
				return getExpr();
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
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__FUZZY_FUNCTION:
				setFuzzyFunction((FuzzyFunction)newValue);
				return;
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__EXPR:
				setExpr((AlphaExpression)newValue);
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
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__FUZZY_FUNCTION:
				setFuzzyFunction((FuzzyFunction)null);
				return;
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__EXPR:
				setExpr((AlphaExpression)null);
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
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__FUZZY_FUNCTION:
				return fuzzyFunction != null;
			case ModelPackage.FUZZY_DEPENDENCE_EXPRESSION__EXPR:
				return expr != null;
		}
		return super.eIsSet(featureID);
	}

} //FuzzyDependenceExpressionImpl
