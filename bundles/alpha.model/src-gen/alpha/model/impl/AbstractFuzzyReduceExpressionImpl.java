/**
 */
package alpha.model.impl;

import alpha.model.AbstractFuzzyReduceExpression;
import alpha.model.AlphaExpression;
import alpha.model.AlphaExpressionVisitor;
import alpha.model.FuzzyFunction;
import alpha.model.ModelPackage;
import alpha.model.REDUCTION_OP;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Fuzzy Reduce Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AbstractFuzzyReduceExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.impl.AbstractFuzzyReduceExpressionImpl#getProjectionFunction <em>Projection Function</em>}</li>
 *   <li>{@link alpha.model.impl.AbstractFuzzyReduceExpressionImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFuzzyReduceExpressionImpl extends AlphaExpressionImpl implements AbstractFuzzyReduceExpression {
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
	 * The cached value of the '{@link #getProjectionFunction() <em>Projection Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionFunction()
	 * @generated
	 * @ordered
	 */
	protected FuzzyFunction projectionFunction;

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
	protected AbstractFuzzyReduceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ABSTRACT_FUZZY_REDUCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REDUCTION_OP getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(REDUCTION_OP newOperator) {
		REDUCTION_OP oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyFunction getProjectionFunction() {
		return projectionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectionFunction(FuzzyFunction newProjectionFunction, NotificationChain msgs) {
		FuzzyFunction oldProjectionFunction = projectionFunction;
		projectionFunction = newProjectionFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__PROJECTION_FUNCTION, oldProjectionFunction, newProjectionFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectionFunction(FuzzyFunction newProjectionFunction) {
		if (newProjectionFunction != projectionFunction) {
			NotificationChain msgs = null;
			if (projectionFunction != null)
				msgs = ((InternalEObject)projectionFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__PROJECTION_FUNCTION, null, msgs);
			if (newProjectionFunction != null)
				msgs = ((InternalEObject)newProjectionFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__PROJECTION_FUNCTION, null, msgs);
			msgs = basicSetProjectionFunction(newProjectionFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__PROJECTION_FUNCTION, newProjectionFunction, newProjectionFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(AlphaExpression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMap getProjection() {
		JNIISLMap _xifexpression = null;
		FuzzyFunction _projectionFunction = this.getProjectionFunction();
		boolean _tripleNotEquals = (_projectionFunction != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getProjectionFunction().getDependenceRelation();
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
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitAbstractFuzzyReduceExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__PROJECTION_FUNCTION:
				return basicSetProjectionFunction(null, msgs);
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__BODY:
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
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__OPERATOR:
				return getOperator();
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__PROJECTION_FUNCTION:
				return getProjectionFunction();
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__BODY:
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
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__OPERATOR:
				setOperator((REDUCTION_OP)newValue);
				return;
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__PROJECTION_FUNCTION:
				setProjectionFunction((FuzzyFunction)newValue);
				return;
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__BODY:
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
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__PROJECTION_FUNCTION:
				setProjectionFunction((FuzzyFunction)null);
				return;
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__BODY:
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
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__PROJECTION_FUNCTION:
				return projectionFunction != null;
			case ModelPackage.ABSTRACT_FUZZY_REDUCE_EXPRESSION__BODY:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //AbstractFuzzyReduceExpressionImpl
