/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.AutoRestrictExpression;
import alpha.model.JNIDomain;
import alpha.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Restrict Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AutoRestrictExpressionImpl#getInferredDomain <em>Inferred Domain</em>}</li>
 *   <li>{@link alpha.model.impl.AutoRestrictExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoRestrictExpressionImpl extends MinimalEObjectImpl.Container implements AutoRestrictExpression {
	/**
	 * The cached value of the '{@link #getInferredDomain() <em>Inferred Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInferredDomain()
	 * @generated
	 * @ordered
	 */
	protected JNIDomain inferredDomain;

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
	protected AutoRestrictExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.AUTO_RESTRICT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIDomain getInferredDomain() {
		return inferredDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInferredDomain(JNIDomain newInferredDomain, NotificationChain msgs) {
		JNIDomain oldInferredDomain = inferredDomain;
		inferredDomain = newInferredDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN, oldInferredDomain, newInferredDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInferredDomain(JNIDomain newInferredDomain) {
		if (newInferredDomain != inferredDomain) {
			NotificationChain msgs = null;
			if (inferredDomain != null)
				msgs = ((InternalEObject)inferredDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN, null, msgs);
			if (newInferredDomain != null)
				msgs = ((InternalEObject)newInferredDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN, null, msgs);
			msgs = basicSetInferredDomain(newInferredDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN, newInferredDomain, newInferredDomain));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR, oldExpr, newExpr);
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
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitAutoRestrictExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN:
				return basicSetInferredDomain(null, msgs);
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN:
				return getInferredDomain();
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN:
				setInferredDomain((JNIDomain)newValue);
				return;
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN:
				setInferredDomain((JNIDomain)null);
				return;
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR:
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
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__INFERRED_DOMAIN:
				return inferredDomain != null;
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR:
				return expr != null;
		}
		return super.eIsSet(featureID);
	}

} //AutoRestrictExpressionImpl
