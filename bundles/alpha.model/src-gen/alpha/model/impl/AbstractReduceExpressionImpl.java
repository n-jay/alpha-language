/**
 */
package alpha.model.impl;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.JNIFunction;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.REDUCTION_OP;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Reduce Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AbstractReduceExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.impl.AbstractReduceExpressionImpl#getProjectionExpr <em>Projection Expr</em>}</li>
 *   <li>{@link alpha.model.impl.AbstractReduceExpressionImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractReduceExpressionImpl extends AlphaExpressionImpl implements AbstractReduceExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final REDUCTION_OP OPERATOR_EDEFAULT = REDUCTION_OP.MIN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected REDUCTION_OP operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjectionExpr() <em>Projection Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIFunction projectionExpr;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected AlphaExpression body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractReduceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ABSTRACT_REDUCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public REDUCTION_OP getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(REDUCTION_OP newOperator) {
		REDUCTION_OP oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_REDUCE_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIFunction getProjectionExpr() {
		return projectionExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectionExpr(JNIFunction newProjectionExpr, NotificationChain msgs) {
		JNIFunction oldProjectionExpr = projectionExpr;
		projectionExpr = newProjectionExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_REDUCE_EXPRESSION__PROJECTION_EXPR, oldProjectionExpr, newProjectionExpr);
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
	public void setProjectionExpr(JNIFunction newProjectionExpr) {
		if (newProjectionExpr != projectionExpr) {
			NotificationChain msgs = null;
			if (projectionExpr != null)
				msgs = ((InternalEObject)projectionExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_REDUCE_EXPRESSION__PROJECTION_EXPR, null, msgs);
			if (newProjectionExpr != null)
				msgs = ((InternalEObject)newProjectionExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_REDUCE_EXPRESSION__PROJECTION_EXPR, null, msgs);
			msgs = basicSetProjectionExpr(newProjectionExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_REDUCE_EXPRESSION__PROJECTION_EXPR, newProjectionExpr, newProjectionExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaExpression getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(AlphaExpression newBody, NotificationChain msgs) {
		AlphaExpression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_REDUCE_EXPRESSION__BODY, oldBody, newBody);
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
	public void setBody(AlphaExpression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_REDUCE_EXPRESSION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_REDUCE_EXPRESSION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_REDUCE_EXPRESSION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIISLMultiAff getProjection() {
		JNIISLMultiAff _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getProjectionExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.FUNCTION));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getProjectionExpr().getISLObject();
			_xifexpression = ((JNIISLMultiAff) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitAbstractReduceExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__PROJECTION_EXPR:
				return basicSetProjectionExpr(null, msgs);
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__BODY:
				return basicSetBody(null, msgs);
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
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__OPERATOR:
				return getOperator();
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__PROJECTION_EXPR:
				return getProjectionExpr();
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__BODY:
				return getBody();
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
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__OPERATOR:
				setOperator((REDUCTION_OP)newValue);
				return;
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__PROJECTION_EXPR:
				setProjectionExpr((JNIFunction)newValue);
				return;
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__BODY:
				setBody((AlphaExpression)newValue);
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
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__PROJECTION_EXPR:
				setProjectionExpr((JNIFunction)null);
				return;
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__BODY:
				setBody((AlphaExpression)null);
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
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__PROJECTION_EXPR:
				return projectionExpr != null;
			case ModelPackage.ABSTRACT_REDUCE_EXPRESSION__BODY:
				return body != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //AbstractReduceExpressionImpl
