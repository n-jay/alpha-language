/**
 */
package alpha.codegen.impl;

import alpha.codegen.CodegenPackage;
import alpha.codegen.Expression;
import alpha.codegen.TernaryExpr;

import org.eclipse.emf.common.notify.Notification;

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
	 * The cached value of the '{@link #getConditional() <em>Conditional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditional()
	 * @generated
	 * @ordered
	 */
	protected Expression conditional;

	/**
	 * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression thenExpr;

	/**
	 * The cached value of the '{@link #getElseExpr() <em>Else Expr</em>}' reference.
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
		if (conditional != null && conditional.eIsProxy()) {
			InternalEObject oldConditional = (InternalEObject)conditional;
			conditional = (Expression)eResolveProxy(oldConditional);
			if (conditional != oldConditional) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.TERNARY_EXPR__CONDITIONAL, oldConditional, conditional));
			}
		}
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetConditional() {
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditional(Expression newConditional) {
		Expression oldConditional = conditional;
		conditional = newConditional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.TERNARY_EXPR__CONDITIONAL, oldConditional, conditional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThenExpr() {
		if (thenExpr != null && thenExpr.eIsProxy()) {
			InternalEObject oldThenExpr = (InternalEObject)thenExpr;
			thenExpr = (Expression)eResolveProxy(oldThenExpr);
			if (thenExpr != oldThenExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.TERNARY_EXPR__THEN_EXPR, oldThenExpr, thenExpr));
			}
		}
		return thenExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetThenExpr() {
		return thenExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenExpr(Expression newThenExpr) {
		Expression oldThenExpr = thenExpr;
		thenExpr = newThenExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.TERNARY_EXPR__THEN_EXPR, oldThenExpr, thenExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getElseExpr() {
		if (elseExpr != null && elseExpr.eIsProxy()) {
			InternalEObject oldElseExpr = (InternalEObject)elseExpr;
			elseExpr = (Expression)eResolveProxy(oldElseExpr);
			if (elseExpr != oldElseExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.TERNARY_EXPR__ELSE_EXPR, oldElseExpr, elseExpr));
			}
		}
		return elseExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetElseExpr() {
		return elseExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseExpr(Expression newElseExpr) {
		Expression oldElseExpr = elseExpr;
		elseExpr = newElseExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.TERNARY_EXPR__ELSE_EXPR, oldElseExpr, elseExpr));
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
				if (resolve) return getConditional();
				return basicGetConditional();
			case CodegenPackage.TERNARY_EXPR__THEN_EXPR:
				if (resolve) return getThenExpr();
				return basicGetThenExpr();
			case CodegenPackage.TERNARY_EXPR__ELSE_EXPR:
				if (resolve) return getElseExpr();
				return basicGetElseExpr();
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
