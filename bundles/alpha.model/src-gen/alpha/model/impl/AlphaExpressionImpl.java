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
 *   <li>{@link alpha.model.impl.AlphaExpressionImpl#get__internal_cache_exprDom <em>internal cache expr Dom</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaExpressionImpl#get__internal_cache_contextDom <em>internal cache context Dom</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AlphaExpressionImpl extends MinimalEObjectImpl.Container implements AlphaExpression {
	/**
	 * The default value of the '{@link #get__internal_cache_exprDom() <em>internal cache expr Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__internal_cache_exprDom()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLSet _INTERNAL_CACHE_EXPR_DOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get__internal_cache_exprDom() <em>internal cache expr Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__internal_cache_exprDom()
	 * @generated
	 * @ordered
	 */
	protected JNIISLSet __internal_cache_exprDom = _INTERNAL_CACHE_EXPR_DOM_EDEFAULT;

	/**
	 * The default value of the '{@link #get__internal_cache_contextDom() <em>internal cache context Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__internal_cache_contextDom()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLSet _INTERNAL_CACHE_CONTEXT_DOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get__internal_cache_contextDom() <em>internal cache context Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__internal_cache_contextDom()
	 * @generated
	 * @ordered
	 */
	protected JNIISLSet __internal_cache_contextDom = _INTERNAL_CACHE_CONTEXT_DOM_EDEFAULT;

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
	public JNIISLSet get__internal_cache_exprDom() {
		return __internal_cache_exprDom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__internal_cache_exprDom(JNIISLSet new__internal_cache_exprDom) {
		JNIISLSet old__internal_cache_exprDom = __internal_cache_exprDom;
		__internal_cache_exprDom = new__internal_cache_exprDom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_EXPR_DOM, old__internal_cache_exprDom, __internal_cache_exprDom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet get__internal_cache_contextDom() {
		return __internal_cache_contextDom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__internal_cache_contextDom(JNIISLSet new__internal_cache_contextDom) {
		JNIISLSet old__internal_cache_contextDom = __internal_cache_contextDom;
		__internal_cache_contextDom = new__internal_cache_contextDom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_CONTEXT_DOM, old__internal_cache_contextDom, __internal_cache_contextDom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionDomain(final JNIISLSet dom) {
		this.set__internal_cache_exprDom(dom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getExpressionDomain() {
		JNIISLSet ___internal_cache_exprDom = this.get__internal_cache_exprDom();
		boolean _tripleNotEquals = (___internal_cache_exprDom != null);
		if (_tripleNotEquals) {
			return this.get__internal_cache_exprDom().copy();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextDomain(final JNIISLSet dom) {
		this.set__internal_cache_contextDom(dom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet geContextDomain() {
		JNIISLSet ___internal_cache_contextDom = this.get__internal_cache_contextDom();
		boolean _tripleNotEquals = (___internal_cache_contextDom != null);
		if (_tripleNotEquals) {
			return this.get__internal_cache_contextDom().copy();
		}
		return null;
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
			case ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_EXPR_DOM:
				return get__internal_cache_exprDom();
			case ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_CONTEXT_DOM:
				return get__internal_cache_contextDom();
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
			case ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_EXPR_DOM:
				set__internal_cache_exprDom((JNIISLSet)newValue);
				return;
			case ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_CONTEXT_DOM:
				set__internal_cache_contextDom((JNIISLSet)newValue);
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
			case ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_EXPR_DOM:
				set__internal_cache_exprDom(_INTERNAL_CACHE_EXPR_DOM_EDEFAULT);
				return;
			case ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_CONTEXT_DOM:
				set__internal_cache_contextDom(_INTERNAL_CACHE_CONTEXT_DOM_EDEFAULT);
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
			case ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_EXPR_DOM:
				return _INTERNAL_CACHE_EXPR_DOM_EDEFAULT == null ? __internal_cache_exprDom != null : !_INTERNAL_CACHE_EXPR_DOM_EDEFAULT.equals(__internal_cache_exprDom);
			case ModelPackage.ALPHA_EXPRESSION__INTERNAL_CACHE_CONTEXT_DOM:
				return _INTERNAL_CACHE_CONTEXT_DOM_EDEFAULT == null ? __internal_cache_contextDom != null : !_INTERNAL_CACHE_CONTEXT_DOM_EDEFAULT.equals(__internal_cache_contextDom);
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
		result.append(" (__internal_cache_exprDom: ");
		result.append(__internal_cache_exprDom);
		result.append(", __internal_cache_contextDom: ");
		result.append(__internal_cache_contextDom);
		result.append(')');
		return result.toString();
	}

} //AlphaExpressionImpl
