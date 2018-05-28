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
 *   <li>{@link alpha.model.impl.AlphaExpressionImpl#getZ__internal_cache_exprDom <em>Zinternal cache expr Dom</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaExpressionImpl#getZ__internal_cache_contextDom <em>Zinternal cache context Dom</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaExpressionImpl#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AlphaExpressionImpl extends MinimalEObjectImpl.Container implements AlphaExpression {
	/**
	 * The default value of the '{@link #getZ__internal_cache_exprDom() <em>Zinternal cache expr Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_exprDom()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLSet ZINTERNAL_CACHE_EXPR_DOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_exprDom() <em>Zinternal cache expr Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_exprDom()
	 * @generated
	 * @ordered
	 */
	protected JNIISLSet z__internal_cache_exprDom = ZINTERNAL_CACHE_EXPR_DOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ__internal_cache_contextDom() <em>Zinternal cache context Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_contextDom()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLSet ZINTERNAL_CACHE_CONTEXT_DOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_contextDom() <em>Zinternal cache context Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_contextDom()
	 * @generated
	 * @ordered
	 */
	protected JNIISLSet z__internal_cache_contextDom = ZINTERNAL_CACHE_CONTEXT_DOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected String errorMessage = ERROR_MESSAGE_EDEFAULT;

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
	public JNIISLSet getZ__internal_cache_exprDom() {
		return z__internal_cache_exprDom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_exprDom(JNIISLSet newZ__internal_cache_exprDom) {
		JNIISLSet oldZ__internal_cache_exprDom = z__internal_cache_exprDom;
		z__internal_cache_exprDom = newZ__internal_cache_exprDom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_EXPR_DOM, oldZ__internal_cache_exprDom, z__internal_cache_exprDom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getZ__internal_cache_contextDom() {
		return z__internal_cache_contextDom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_contextDom(JNIISLSet newZ__internal_cache_contextDom) {
		JNIISLSet oldZ__internal_cache_contextDom = z__internal_cache_contextDom;
		z__internal_cache_contextDom = newZ__internal_cache_contextDom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_CONTEXT_DOM, oldZ__internal_cache_contextDom, z__internal_cache_contextDom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMessage(String newErrorMessage) {
		String oldErrorMessage = errorMessage;
		errorMessage = newErrorMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_EXPRESSION__ERROR_MESSAGE, oldErrorMessage, errorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionDomain(final JNIISLSet dom) {
		this.setZ__internal_cache_exprDom(dom.coalesce());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getExpressionDomain() {
		JNIISLSet _xifexpression = null;
		JNIISLSet _z__internal_cache_exprDom = this.getZ__internal_cache_exprDom();
		boolean _tripleNotEquals = (_z__internal_cache_exprDom != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_exprDom().copy();
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
	public void setContextDomain(final JNIISLSet dom) {
		this.setZ__internal_cache_contextDom(dom.coalesce());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getContextDomain() {
		JNIISLSet _xifexpression = null;
		JNIISLSet _z__internal_cache_contextDom = this.getZ__internal_cache_contextDom();
		boolean _tripleNotEquals = (_z__internal_cache_contextDom != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_contextDom().copy();
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
			case ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_EXPR_DOM:
				return getZ__internal_cache_exprDom();
			case ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_CONTEXT_DOM:
				return getZ__internal_cache_contextDom();
			case ModelPackage.ALPHA_EXPRESSION__ERROR_MESSAGE:
				return getErrorMessage();
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
			case ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_EXPR_DOM:
				setZ__internal_cache_exprDom((JNIISLSet)newValue);
				return;
			case ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_CONTEXT_DOM:
				setZ__internal_cache_contextDom((JNIISLSet)newValue);
				return;
			case ModelPackage.ALPHA_EXPRESSION__ERROR_MESSAGE:
				setErrorMessage((String)newValue);
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
			case ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_EXPR_DOM:
				setZ__internal_cache_exprDom(ZINTERNAL_CACHE_EXPR_DOM_EDEFAULT);
				return;
			case ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_CONTEXT_DOM:
				setZ__internal_cache_contextDom(ZINTERNAL_CACHE_CONTEXT_DOM_EDEFAULT);
				return;
			case ModelPackage.ALPHA_EXPRESSION__ERROR_MESSAGE:
				setErrorMessage(ERROR_MESSAGE_EDEFAULT);
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
			case ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_EXPR_DOM:
				return ZINTERNAL_CACHE_EXPR_DOM_EDEFAULT == null ? z__internal_cache_exprDom != null : !ZINTERNAL_CACHE_EXPR_DOM_EDEFAULT.equals(z__internal_cache_exprDom);
			case ModelPackage.ALPHA_EXPRESSION__ZINTERNAL_CACHE_CONTEXT_DOM:
				return ZINTERNAL_CACHE_CONTEXT_DOM_EDEFAULT == null ? z__internal_cache_contextDom != null : !ZINTERNAL_CACHE_CONTEXT_DOM_EDEFAULT.equals(z__internal_cache_contextDom);
			case ModelPackage.ALPHA_EXPRESSION__ERROR_MESSAGE:
				return ERROR_MESSAGE_EDEFAULT == null ? errorMessage != null : !ERROR_MESSAGE_EDEFAULT.equals(errorMessage);
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
		result.append(" (z__internal_cache_exprDom: ");
		result.append(z__internal_cache_exprDom);
		result.append(", z__internal_cache_contextDom: ");
		result.append(z__internal_cache_contextDom);
		result.append(", errorMessage: ");
		result.append(errorMessage);
		result.append(')');
		return result.toString();
	}

} //AlphaExpressionImpl
