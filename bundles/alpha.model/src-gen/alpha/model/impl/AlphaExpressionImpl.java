/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.ModelPackage;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AlphaExpressionImpl#getExpressionDomain <em>Expression Domain</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaExpressionImpl#getContextDomain <em>Context Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AlphaExpressionImpl extends MinimalEObjectImpl.Container implements AlphaExpression {
	/**
	 * The default value of the '{@link #getExpressionDomain() <em>Expression Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionDomain()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLSet EXPRESSION_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionDomain() <em>Expression Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionDomain()
	 * @generated
	 * @ordered
	 */
	protected JNIISLSet expressionDomain = EXPRESSION_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextDomain() <em>Context Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextDomain()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLSet CONTEXT_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextDomain() <em>Context Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextDomain()
	 * @generated
	 * @ordered
	 */
	protected JNIISLSet contextDomain = CONTEXT_DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALPHA_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getExpressionDomain() {
		return expressionDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionDomain(JNIISLSet newExpressionDomain) {
		JNIISLSet oldExpressionDomain = expressionDomain;
		expressionDomain = newExpressionDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_EXPRESSION__EXPRESSION_DOMAIN, oldExpressionDomain, expressionDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getContextDomain() {
		return contextDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextDomain(JNIISLSet newContextDomain) {
		JNIISLSet oldContextDomain = contextDomain;
		contextDomain = newContextDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_EXPRESSION__CONTEXT_DOMAIN, oldContextDomain, contextDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(AlphaExpressionVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ALPHA_EXPRESSION__EXPRESSION_DOMAIN:
				return getExpressionDomain();
			case ModelPackage.ALPHA_EXPRESSION__CONTEXT_DOMAIN:
				return getContextDomain();
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
			case ModelPackage.ALPHA_EXPRESSION__EXPRESSION_DOMAIN:
				setExpressionDomain((JNIISLSet)newValue);
				return;
			case ModelPackage.ALPHA_EXPRESSION__CONTEXT_DOMAIN:
				setContextDomain((JNIISLSet)newValue);
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
			case ModelPackage.ALPHA_EXPRESSION__EXPRESSION_DOMAIN:
				setExpressionDomain(EXPRESSION_DOMAIN_EDEFAULT);
				return;
			case ModelPackage.ALPHA_EXPRESSION__CONTEXT_DOMAIN:
				setContextDomain(CONTEXT_DOMAIN_EDEFAULT);
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
			case ModelPackage.ALPHA_EXPRESSION__EXPRESSION_DOMAIN:
				return EXPRESSION_DOMAIN_EDEFAULT == null ? expressionDomain != null : !EXPRESSION_DOMAIN_EDEFAULT.equals(expressionDomain);
			case ModelPackage.ALPHA_EXPRESSION__CONTEXT_DOMAIN:
				return CONTEXT_DOMAIN_EDEFAULT == null ? contextDomain != null : !CONTEXT_DOMAIN_EDEFAULT.equals(contextDomain);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expressionDomain: ");
		result.append(expressionDomain);
		result.append(", contextDomain: ");
		result.append(contextDomain);
		result.append(')');
		return result.toString();
	}

} //AlphaExpressionImpl
