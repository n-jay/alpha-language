/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.CalculatorExpression;
import alpha.model.ModelPackage;
import alpha.model.RestrictExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restrict Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.RestrictExpressionImpl#getDomainExpr <em>Domain Expr</em>}</li>
 *   <li>{@link alpha.model.impl.RestrictExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictExpressionImpl extends MinimalEObjectImpl.Container implements RestrictExpression {
	/**
	 * The cached value of the '{@link #getDomainExpr() <em>Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainExpr()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression domainExpr;

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
	protected RestrictExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESTRICT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getDomainExpr() {
		return domainExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainExpr(CalculatorExpression newDomainExpr, NotificationChain msgs) {
		CalculatorExpression oldDomainExpr = domainExpr;
		domainExpr = newDomainExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RESTRICT_EXPRESSION__DOMAIN_EXPR, oldDomainExpr, newDomainExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainExpr(CalculatorExpression newDomainExpr) {
		if (newDomainExpr != domainExpr) {
			NotificationChain msgs = null;
			if (domainExpr != null)
				msgs = ((InternalEObject)domainExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESTRICT_EXPRESSION__DOMAIN_EXPR, null, msgs);
			if (newDomainExpr != null)
				msgs = ((InternalEObject)newDomainExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESTRICT_EXPRESSION__DOMAIN_EXPR, null, msgs);
			msgs = basicSetDomainExpr(newDomainExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESTRICT_EXPRESSION__DOMAIN_EXPR, newDomainExpr, newDomainExpr));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RESTRICT_EXPRESSION__EXPR, oldExpr, newExpr);
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
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESTRICT_EXPRESSION__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESTRICT_EXPRESSION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESTRICT_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitRestrictExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RESTRICT_EXPRESSION__DOMAIN_EXPR:
				return basicSetDomainExpr(null, msgs);
			case ModelPackage.RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.RESTRICT_EXPRESSION__DOMAIN_EXPR:
				return getDomainExpr();
			case ModelPackage.RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.RESTRICT_EXPRESSION__DOMAIN_EXPR:
				setDomainExpr((CalculatorExpression)newValue);
				return;
			case ModelPackage.RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.RESTRICT_EXPRESSION__DOMAIN_EXPR:
				setDomainExpr((CalculatorExpression)null);
				return;
			case ModelPackage.RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.RESTRICT_EXPRESSION__DOMAIN_EXPR:
				return domainExpr != null;
			case ModelPackage.RESTRICT_EXPRESSION__EXPR:
				return expr != null;
		}
		return super.eIsSet(featureID);
	}

} //RestrictExpressionImpl
