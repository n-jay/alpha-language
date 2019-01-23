/**
 */
package alpha.model.impl;

import alpha.model.CalculatorExpression;
import alpha.model.ModelPackage;
import alpha.model.SubSystemRestrictExpression;
import alpha.model.UseExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub System Restrict Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.SubSystemRestrictExpressionImpl#getDomainExpr <em>Domain Expr</em>}</li>
 *   <li>{@link alpha.model.impl.SubSystemRestrictExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSystemRestrictExpressionImpl extends UseExpressionImpl implements SubSystemRestrictExpression {
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
	protected UseExpression expr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystemRestrictExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SUB_SYSTEM_RESTRICT_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__DOMAIN_EXPR, oldDomainExpr, newDomainExpr);
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
				msgs = ((InternalEObject)domainExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__DOMAIN_EXPR, null, msgs);
			if (newDomainExpr != null)
				msgs = ((InternalEObject)newDomainExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__DOMAIN_EXPR, null, msgs);
			msgs = basicSetDomainExpr(newDomainExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__DOMAIN_EXPR, newDomainExpr, newDomainExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseExpression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(UseExpression newExpr, NotificationChain msgs) {
		UseExpression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(UseExpression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__DOMAIN_EXPR:
				return basicSetDomainExpr(null, msgs);
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__DOMAIN_EXPR:
				return getDomainExpr();
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__DOMAIN_EXPR:
				setDomainExpr((CalculatorExpression)newValue);
				return;
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__EXPR:
				setExpr((UseExpression)newValue);
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
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__DOMAIN_EXPR:
				setDomainExpr((CalculatorExpression)null);
				return;
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__EXPR:
				setExpr((UseExpression)null);
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
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__DOMAIN_EXPR:
				return domainExpr != null;
			case ModelPackage.SUB_SYSTEM_RESTRICT_EXPRESSION__EXPR:
				return expr != null;
		}
		return super.eIsSet(featureID);
	}

} //SubSystemRestrictExpressionImpl
