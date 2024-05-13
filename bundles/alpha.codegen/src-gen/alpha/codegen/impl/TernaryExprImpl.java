/**
 */
package alpha.codegen.impl;

import alpha.codegen.CodegenPackage;
import alpha.codegen.Expression;
import alpha.codegen.TernaryExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ternary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.impl.TernaryExprImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link alpha.codegen.impl.TernaryExprImpl#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link alpha.codegen.impl.TernaryExprImpl#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TernaryExprImpl extends MinimalEObjectImpl.Container implements TernaryExpr {
	/**
	 * The cached value of the '{@link #getConditional() <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditional()
	 * @generated
	 * @ordered
	 */
	protected Expression conditional;

	/**
	 * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression thenExpr;

	/**
	 * The cached value of the '{@link #getElseExpr() <em>Else Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression elseExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TernaryExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.TERNARY_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConditional() {
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditional(Expression newConditional, NotificationChain msgs) {
		Expression oldConditional = conditional;
		conditional = newConditional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.TERNARY_EXPR__CONDITIONAL, oldConditional, newConditional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditional(Expression newConditional) {
		if (newConditional != conditional) {
			NotificationChain msgs = null;
			if (conditional != null)
				msgs = ((InternalEObject)conditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.TERNARY_EXPR__CONDITIONAL, null, msgs);
			if (newConditional != null)
				msgs = ((InternalEObject)newConditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.TERNARY_EXPR__CONDITIONAL, null, msgs);
			msgs = basicSetConditional(newConditional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.TERNARY_EXPR__CONDITIONAL, newConditional, newConditional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThenExpr() {
		return thenExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenExpr(Expression newThenExpr, NotificationChain msgs) {
		Expression oldThenExpr = thenExpr;
		thenExpr = newThenExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.TERNARY_EXPR__THEN_EXPR, oldThenExpr, newThenExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenExpr(Expression newThenExpr) {
		if (newThenExpr != thenExpr) {
			NotificationChain msgs = null;
			if (thenExpr != null)
				msgs = ((InternalEObject)thenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.TERNARY_EXPR__THEN_EXPR, null, msgs);
			if (newThenExpr != null)
				msgs = ((InternalEObject)newThenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.TERNARY_EXPR__THEN_EXPR, null, msgs);
			msgs = basicSetThenExpr(newThenExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.TERNARY_EXPR__THEN_EXPR, newThenExpr, newThenExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseExpr() {
		return elseExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseExpr(Expression newElseExpr, NotificationChain msgs) {
		Expression oldElseExpr = elseExpr;
		elseExpr = newElseExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.TERNARY_EXPR__ELSE_EXPR, oldElseExpr, newElseExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseExpr(Expression newElseExpr) {
		if (newElseExpr != elseExpr) {
			NotificationChain msgs = null;
			if (elseExpr != null)
				msgs = ((InternalEObject)elseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.TERNARY_EXPR__ELSE_EXPR, null, msgs);
			if (newElseExpr != null)
				msgs = ((InternalEObject)newElseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.TERNARY_EXPR__ELSE_EXPR, null, msgs);
			msgs = basicSetElseExpr(newElseExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.TERNARY_EXPR__ELSE_EXPR, newElseExpr, newElseExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.TERNARY_EXPR__CONDITIONAL:
				return basicSetConditional(null, msgs);
			case CodegenPackage.TERNARY_EXPR__THEN_EXPR:
				return basicSetThenExpr(null, msgs);
			case CodegenPackage.TERNARY_EXPR__ELSE_EXPR:
				return basicSetElseExpr(null, msgs);
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
			case CodegenPackage.TERNARY_EXPR__CONDITIONAL:
				return getConditional();
			case CodegenPackage.TERNARY_EXPR__THEN_EXPR:
				return getThenExpr();
			case CodegenPackage.TERNARY_EXPR__ELSE_EXPR:
				return getElseExpr();
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
			case CodegenPackage.TERNARY_EXPR__CONDITIONAL:
				setConditional((Expression)newValue);
				return;
			case CodegenPackage.TERNARY_EXPR__THEN_EXPR:
				setThenExpr((Expression)newValue);
				return;
			case CodegenPackage.TERNARY_EXPR__ELSE_EXPR:
				setElseExpr((Expression)newValue);
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
			case CodegenPackage.TERNARY_EXPR__CONDITIONAL:
				setConditional((Expression)null);
				return;
			case CodegenPackage.TERNARY_EXPR__THEN_EXPR:
				setThenExpr((Expression)null);
				return;
			case CodegenPackage.TERNARY_EXPR__ELSE_EXPR:
				setElseExpr((Expression)null);
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
			case CodegenPackage.TERNARY_EXPR__CONDITIONAL:
				return conditional != null;
			case CodegenPackage.TERNARY_EXPR__THEN_EXPR:
				return thenExpr != null;
			case CodegenPackage.TERNARY_EXPR__ELSE_EXPR:
				return elseExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //TernaryExprImpl
