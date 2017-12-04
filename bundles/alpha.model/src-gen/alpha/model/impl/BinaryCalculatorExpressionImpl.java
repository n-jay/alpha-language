/**
 */
package alpha.model.impl;

import alpha.model.BinaryCalculatorExpression;
import alpha.model.CALCULATOR_BINARY_OP;
import alpha.model.CalculatorExpression;
import alpha.model.CalculatorExpressionVisitor;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

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
 * An implementation of the model object '<em><b>Binary Calculator Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.BinaryCalculatorExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.impl.BinaryCalculatorExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link alpha.model.impl.BinaryCalculatorExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link alpha.model.impl.BinaryCalculatorExpressionImpl#get__internal_cache_islObject <em>internal cache isl Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryCalculatorExpressionImpl extends CalculatorExpressionImpl implements BinaryCalculatorExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final CALCULATOR_BINARY_OP OPERATOR_EDEFAULT = CALCULATOR_BINARY_OP.INTERSECT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected CALCULATOR_BINARY_OP operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression right;

	/**
	 * The default value of the '{@link #get__internal_cache_islObject() <em>internal cache isl Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__internal_cache_islObject()
	 * @generated
	 * @ordered
	 */
	protected static final JNIObject _INTERNAL_CACHE_ISL_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get__internal_cache_islObject() <em>internal cache isl Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__internal_cache_islObject()
	 * @generated
	 * @ordered
	 */
	protected JNIObject __internal_cache_islObject = _INTERNAL_CACHE_ISL_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryCalculatorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BINARY_CALCULATOR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CALCULATOR_BINARY_OP getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(CALCULATOR_BINARY_OP newOperator) {
		CALCULATOR_BINARY_OP oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BINARY_CALCULATOR_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(CalculatorExpression newLeft, NotificationChain msgs) {
		CalculatorExpression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.BINARY_CALCULATOR_EXPRESSION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(CalculatorExpression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.BINARY_CALCULATOR_EXPRESSION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.BINARY_CALCULATOR_EXPRESSION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BINARY_CALCULATOR_EXPRESSION__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(CalculatorExpression newRight, NotificationChain msgs) {
		CalculatorExpression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.BINARY_CALCULATOR_EXPRESSION__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(CalculatorExpression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.BINARY_CALCULATOR_EXPRESSION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.BINARY_CALCULATOR_EXPRESSION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BINARY_CALCULATOR_EXPRESSION__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIObject get__internal_cache_islObject() {
		return __internal_cache_islObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__internal_cache_islObject(JNIObject new__internal_cache_islObject) {
		JNIObject old__internal_cache_islObject = __internal_cache_islObject;
		__internal_cache_islObject = new__internal_cache_islObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BINARY_CALCULATOR_EXPRESSION__INTERNAL_CACHE_ISL_OBJECT, old__internal_cache_islObject, __internal_cache_islObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POLY_OBJECT_TYPE getType() {
		JNIObject ___internal_cache_islObject = this.get__internal_cache_islObject();
		if ((___internal_cache_islObject instanceof JNIISLSet)) {
			return POLY_OBJECT_TYPE.SET;
		}
		JNIObject ___internal_cache_islObject_1 = this.get__internal_cache_islObject();
		if ((___internal_cache_islObject_1 instanceof JNIISLMap)) {
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
		return this.get__internal_cache_islObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final CalculatorExpressionVisitor visitor) {
		visitor.visitBinaryCalculatorExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__LEFT:
				return basicSetLeft(null, msgs);
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__RIGHT:
				return basicSetRight(null, msgs);
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
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__OPERATOR:
				return getOperator();
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__LEFT:
				return getLeft();
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__RIGHT:
				return getRight();
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__INTERNAL_CACHE_ISL_OBJECT:
				return get__internal_cache_islObject();
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
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__OPERATOR:
				setOperator((CALCULATOR_BINARY_OP)newValue);
				return;
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__LEFT:
				setLeft((CalculatorExpression)newValue);
				return;
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__RIGHT:
				setRight((CalculatorExpression)newValue);
				return;
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__INTERNAL_CACHE_ISL_OBJECT:
				set__internal_cache_islObject((JNIObject)newValue);
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
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__LEFT:
				setLeft((CalculatorExpression)null);
				return;
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__RIGHT:
				setRight((CalculatorExpression)null);
				return;
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__INTERNAL_CACHE_ISL_OBJECT:
				set__internal_cache_islObject(_INTERNAL_CACHE_ISL_OBJECT_EDEFAULT);
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
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__LEFT:
				return left != null;
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__RIGHT:
				return right != null;
			case ModelPackage.BINARY_CALCULATOR_EXPRESSION__INTERNAL_CACHE_ISL_OBJECT:
				return _INTERNAL_CACHE_ISL_OBJECT_EDEFAULT == null ? __internal_cache_islObject != null : !_INTERNAL_CACHE_ISL_OBJECT_EDEFAULT.equals(__internal_cache_islObject);
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
		result.append(", __internal_cache_islObject: ");
		result.append(__internal_cache_islObject);
		result.append(')');
		return result.toString();
	}

} //BinaryCalculatorExpressionImpl
