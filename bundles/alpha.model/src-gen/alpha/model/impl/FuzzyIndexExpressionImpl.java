/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpressionVisitor;
import alpha.model.FuzzyIndexExpression;
import alpha.model.JNIFuzzyFunction;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Index Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.FuzzyIndexExpressionImpl#getFunctionExpr <em>Function Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuzzyIndexExpressionImpl extends AlphaExpressionImpl implements FuzzyIndexExpression {
	/**
	 * The cached value of the '{@link #getFunctionExpr() <em>Function Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIFuzzyFunction functionExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyIndexExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUZZY_INDEX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIFuzzyFunction getFunctionExpr() {
		return functionExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionExpr(JNIFuzzyFunction newFunctionExpr, NotificationChain msgs) {
		JNIFuzzyFunction oldFunctionExpr = functionExpr;
		functionExpr = newFunctionExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_INDEX_EXPRESSION__FUNCTION_EXPR, oldFunctionExpr, newFunctionExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionExpr(JNIFuzzyFunction newFunctionExpr) {
		if (newFunctionExpr != functionExpr) {
			NotificationChain msgs = null;
			if (functionExpr != null)
				msgs = ((InternalEObject)functionExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_INDEX_EXPRESSION__FUNCTION_EXPR, null, msgs);
			if (newFunctionExpr != null)
				msgs = ((InternalEObject)newFunctionExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.FUZZY_INDEX_EXPRESSION__FUNCTION_EXPR, null, msgs);
			msgs = basicSetFunctionExpr(newFunctionExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_INDEX_EXPRESSION__FUNCTION_EXPR, newFunctionExpr, newFunctionExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLUnionMap getFunction() {
		JNIISLUnionMap _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getFunctionExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.UNION_MAP));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getFunctionExpr().getISLObject();
			_xifexpression = ((JNIISLUnionMap) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitFuzzyIndexExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUNCTION_EXPR:
				return basicSetFunctionExpr(null, msgs);
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
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUNCTION_EXPR:
				return getFunctionExpr();
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
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUNCTION_EXPR:
				setFunctionExpr((JNIFuzzyFunction)newValue);
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
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUNCTION_EXPR:
				setFunctionExpr((JNIFuzzyFunction)null);
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
			case ModelPackage.FUZZY_INDEX_EXPRESSION__FUNCTION_EXPR:
				return functionExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //FuzzyIndexExpressionImpl
