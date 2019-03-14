/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.IfExpression;
import alpha.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.IfExpressionImpl#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link alpha.model.impl.IfExpressionImpl#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link alpha.model.impl.IfExpressionImpl#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfExpressionImpl extends AlphaExpressionImpl implements IfExpression {
	/**
	 * The cached value of the '{@link #getCondExpr() <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondExpr()
	 * @generated
	 * @ordered
	 */
	protected AlphaExpression condExpr;

	/**
	 * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenExpr()
	 * @generated
	 * @ordered
	 */
	protected AlphaExpression thenExpr;

	/**
	 * The cached value of the '{@link #getElseExpr() <em>Else Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseExpr()
	 * @generated
	 * @ordered
	 */
	protected AlphaExpression elseExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.IF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaExpression getCondExpr() {
		return condExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondExpr(AlphaExpression newCondExpr, NotificationChain msgs) {
		AlphaExpression oldCondExpr = condExpr;
		condExpr = newCondExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.IF_EXPRESSION__COND_EXPR, oldCondExpr, newCondExpr);
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
	public void setCondExpr(AlphaExpression newCondExpr) {
		if (newCondExpr != condExpr) {
			NotificationChain msgs = null;
			if (condExpr != null)
				msgs = ((InternalEObject)condExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IF_EXPRESSION__COND_EXPR, null, msgs);
			if (newCondExpr != null)
				msgs = ((InternalEObject)newCondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IF_EXPRESSION__COND_EXPR, null, msgs);
			msgs = basicSetCondExpr(newCondExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IF_EXPRESSION__COND_EXPR, newCondExpr, newCondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaExpression getThenExpr() {
		return thenExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenExpr(AlphaExpression newThenExpr, NotificationChain msgs) {
		AlphaExpression oldThenExpr = thenExpr;
		thenExpr = newThenExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.IF_EXPRESSION__THEN_EXPR, oldThenExpr, newThenExpr);
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
	public void setThenExpr(AlphaExpression newThenExpr) {
		if (newThenExpr != thenExpr) {
			NotificationChain msgs = null;
			if (thenExpr != null)
				msgs = ((InternalEObject)thenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IF_EXPRESSION__THEN_EXPR, null, msgs);
			if (newThenExpr != null)
				msgs = ((InternalEObject)newThenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IF_EXPRESSION__THEN_EXPR, null, msgs);
			msgs = basicSetThenExpr(newThenExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IF_EXPRESSION__THEN_EXPR, newThenExpr, newThenExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaExpression getElseExpr() {
		return elseExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseExpr(AlphaExpression newElseExpr, NotificationChain msgs) {
		AlphaExpression oldElseExpr = elseExpr;
		elseExpr = newElseExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.IF_EXPRESSION__ELSE_EXPR, oldElseExpr, newElseExpr);
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
	public void setElseExpr(AlphaExpression newElseExpr) {
		if (newElseExpr != elseExpr) {
			NotificationChain msgs = null;
			if (elseExpr != null)
				msgs = ((InternalEObject)elseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IF_EXPRESSION__ELSE_EXPR, null, msgs);
			if (newElseExpr != null)
				msgs = ((InternalEObject)newElseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IF_EXPRESSION__ELSE_EXPR, null, msgs);
			msgs = basicSetElseExpr(newElseExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IF_EXPRESSION__ELSE_EXPR, newElseExpr, newElseExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitIfExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.IF_EXPRESSION__COND_EXPR:
				return basicSetCondExpr(null, msgs);
			case ModelPackage.IF_EXPRESSION__THEN_EXPR:
				return basicSetThenExpr(null, msgs);
			case ModelPackage.IF_EXPRESSION__ELSE_EXPR:
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
			case ModelPackage.IF_EXPRESSION__COND_EXPR:
				return getCondExpr();
			case ModelPackage.IF_EXPRESSION__THEN_EXPR:
				return getThenExpr();
			case ModelPackage.IF_EXPRESSION__ELSE_EXPR:
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
			case ModelPackage.IF_EXPRESSION__COND_EXPR:
				setCondExpr((AlphaExpression)newValue);
				return;
			case ModelPackage.IF_EXPRESSION__THEN_EXPR:
				setThenExpr((AlphaExpression)newValue);
				return;
			case ModelPackage.IF_EXPRESSION__ELSE_EXPR:
				setElseExpr((AlphaExpression)newValue);
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
			case ModelPackage.IF_EXPRESSION__COND_EXPR:
				setCondExpr((AlphaExpression)null);
				return;
			case ModelPackage.IF_EXPRESSION__THEN_EXPR:
				setThenExpr((AlphaExpression)null);
				return;
			case ModelPackage.IF_EXPRESSION__ELSE_EXPR:
				setElseExpr((AlphaExpression)null);
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
			case ModelPackage.IF_EXPRESSION__COND_EXPR:
				return condExpr != null;
			case ModelPackage.IF_EXPRESSION__THEN_EXPR:
				return thenExpr != null;
			case ModelPackage.IF_EXPRESSION__ELSE_EXPR:
				return elseExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //IfExpressionImpl
