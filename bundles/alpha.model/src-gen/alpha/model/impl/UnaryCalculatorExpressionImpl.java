/**
 */
package alpha.model.impl;

import alpha.model.CALCULATOR_UNARY_OP;
import alpha.model.CalculatorExpression;
import alpha.model.CalculatorExpressionVisitor;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.UnaryCalculatorExpression;

import alpha.model.util.AlphaUtil;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Calculator Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.UnaryCalculatorExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.impl.UnaryCalculatorExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link alpha.model.impl.UnaryCalculatorExpressionImpl#getZ__internal_cache_islObject <em>Zinternal cache isl Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryCalculatorExpressionImpl extends CalculatorExpressionImpl implements UnaryCalculatorExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final CALCULATOR_UNARY_OP OPERATOR_EDEFAULT = CALCULATOR_UNARY_OP.GET_DOMAIN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected CALCULATOR_UNARY_OP operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression expr;

	/**
	 * The default value of the '{@link #getZ__internal_cache_islObject() <em>Zinternal cache isl Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islObject()
	 * @generated
	 * @ordered
	 */
	protected static final JNIObject ZINTERNAL_CACHE_ISL_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_islObject() <em>Zinternal cache isl Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islObject()
	 * @generated
	 * @ordered
	 */
	protected JNIObject z__internal_cache_islObject = ZINTERNAL_CACHE_ISL_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryCalculatorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.UNARY_CALCULATOR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CALCULATOR_UNARY_OP getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(CALCULATOR_UNARY_OP newOperator) {
		CALCULATOR_UNARY_OP oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UNARY_CALCULATOR_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(CalculatorExpression newExpr, NotificationChain msgs) {
		CalculatorExpression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.UNARY_CALCULATOR_EXPRESSION__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(CalculatorExpression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.UNARY_CALCULATOR_EXPRESSION__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.UNARY_CALCULATOR_EXPRESSION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UNARY_CALCULATOR_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIObject getZ__internal_cache_islObject() {
		return z__internal_cache_islObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_islObject(JNIObject newZ__internal_cache_islObject) {
		JNIObject oldZ__internal_cache_islObject = z__internal_cache_islObject;
		z__internal_cache_islObject = newZ__internal_cache_islObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UNARY_CALCULATOR_EXPRESSION__ZINTERNAL_CACHE_ISL_OBJECT, oldZ__internal_cache_islObject, z__internal_cache_islObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POLY_OBJECT_TYPE getType() {
		JNIObject _z__internal_cache_islObject = this.getZ__internal_cache_islObject();
		if ((_z__internal_cache_islObject instanceof JNIISLSet)) {
			return POLY_OBJECT_TYPE.SET;
		}
		JNIObject _z__internal_cache_islObject_1 = this.getZ__internal_cache_islObject();
		if ((_z__internal_cache_islObject_1 instanceof JNIISLMap)) {
			return POLY_OBJECT_TYPE.MAP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIObject getISLObject() {
		return AlphaUtil.copy(this.getZ__internal_cache_islObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final CalculatorExpressionVisitor visitor) {
		visitor.visitUnaryCalculatorExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__EXPR:
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
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__OPERATOR:
				return getOperator();
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__EXPR:
				return getExpr();
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__ZINTERNAL_CACHE_ISL_OBJECT:
				return getZ__internal_cache_islObject();
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
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__OPERATOR:
				setOperator((CALCULATOR_UNARY_OP)newValue);
				return;
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__EXPR:
				setExpr((CalculatorExpression)newValue);
				return;
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__ZINTERNAL_CACHE_ISL_OBJECT:
				setZ__internal_cache_islObject((JNIObject)newValue);
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
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__EXPR:
				setExpr((CalculatorExpression)null);
				return;
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__ZINTERNAL_CACHE_ISL_OBJECT:
				setZ__internal_cache_islObject(ZINTERNAL_CACHE_ISL_OBJECT_EDEFAULT);
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
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__EXPR:
				return expr != null;
			case ModelPackage.UNARY_CALCULATOR_EXPRESSION__ZINTERNAL_CACHE_ISL_OBJECT:
				return ZINTERNAL_CACHE_ISL_OBJECT_EDEFAULT == null ? z__internal_cache_islObject != null : !ZINTERNAL_CACHE_ISL_OBJECT_EDEFAULT.equals(z__internal_cache_islObject);
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(", z__internal_cache_islObject: ");
		result.append(z__internal_cache_islObject);
		result.append(')');
		return result.toString();
	}

} //UnaryCalculatorExpressionImpl
