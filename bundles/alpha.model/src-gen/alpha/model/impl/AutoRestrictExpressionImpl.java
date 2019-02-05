/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.AutoRestrictExpression;
import alpha.model.ModelPackage;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Restrict Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AutoRestrictExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link alpha.model.impl.AutoRestrictExpressionImpl#getZ__internal_cache_inferredDomain <em>Zinternal cache inferred Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoRestrictExpressionImpl extends AlphaExpressionImpl implements AutoRestrictExpression {
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
	 * The default value of the '{@link #getZ__internal_cache_inferredDomain() <em>Zinternal cache inferred Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_inferredDomain()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLSet ZINTERNAL_CACHE_INFERRED_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_inferredDomain() <em>Zinternal cache inferred Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_inferredDomain()
	 * @generated
	 * @ordered
	 */
	protected JNIISLSet z__internal_cache_inferredDomain = ZINTERNAL_CACHE_INFERRED_DOMAIN_EDEFAULT;

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
	public JNIISLSet getZ__internal_cache_inferredDomain() {
		return z__internal_cache_inferredDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_inferredDomain(JNIISLSet newZ__internal_cache_inferredDomain) {
		JNIISLSet oldZ__internal_cache_inferredDomain = z__internal_cache_inferredDomain;
		z__internal_cache_inferredDomain = newZ__internal_cache_inferredDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.AUTO_RESTRICT_EXPRESSION__ZINTERNAL_CACHE_INFERRED_DOMAIN, oldZ__internal_cache_inferredDomain, z__internal_cache_inferredDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getInferredDomain() {
		JNIISLSet _xifexpression = null;
		JNIISLSet _z__internal_cache_inferredDomain = this.getZ__internal_cache_inferredDomain();
		boolean _tripleNotEquals = (_z__internal_cache_inferredDomain != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_inferredDomain().copy();
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
	public void setInferredDomain(final JNIISLSet islset) {
		this.setZ__internal_cache_inferredDomain(islset);
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
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR:
				return getExpr();
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__ZINTERNAL_CACHE_INFERRED_DOMAIN:
				return getZ__internal_cache_inferredDomain();
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
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR:
				setExpr((AlphaExpression)newValue);
				return;
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__ZINTERNAL_CACHE_INFERRED_DOMAIN:
				setZ__internal_cache_inferredDomain((JNIISLSet)newValue);
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
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR:
				setExpr((AlphaExpression)null);
				return;
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__ZINTERNAL_CACHE_INFERRED_DOMAIN:
				setZ__internal_cache_inferredDomain(ZINTERNAL_CACHE_INFERRED_DOMAIN_EDEFAULT);
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
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__EXPR:
				return expr != null;
			case ModelPackage.AUTO_RESTRICT_EXPRESSION__ZINTERNAL_CACHE_INFERRED_DOMAIN:
				return ZINTERNAL_CACHE_INFERRED_DOMAIN_EDEFAULT == null ? z__internal_cache_inferredDomain != null : !ZINTERNAL_CACHE_INFERRED_DOMAIN_EDEFAULT.equals(z__internal_cache_inferredDomain);
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
		result.append(" (z__internal_cache_inferredDomain: ");
		result.append(z__internal_cache_inferredDomain);
		result.append(')');
		return result.toString();
	}

} //AutoRestrictExpressionImpl
