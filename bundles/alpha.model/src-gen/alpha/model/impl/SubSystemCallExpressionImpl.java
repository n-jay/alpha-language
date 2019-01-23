/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaSystem;
import alpha.model.JNIFunctionInArrayNotation;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.SubSystemCallExpression;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub System Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.SubSystemCallExpressionImpl#getSystem <em>System</em>}</li>
 *   <li>{@link alpha.model.impl.SubSystemCallExpressionImpl#getCallParamsExpr <em>Call Params Expr</em>}</li>
 *   <li>{@link alpha.model.impl.SubSystemCallExpressionImpl#getInputExprs <em>Input Exprs</em>}</li>
 *   <li>{@link alpha.model.impl.SubSystemCallExpressionImpl#getOutputExprs <em>Output Exprs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSystemCallExpressionImpl extends UseExpressionImpl implements SubSystemCallExpression {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected AlphaSystem system;

	/**
	 * The cached value of the '{@link #getCallParamsExpr() <em>Call Params Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallParamsExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIFunctionInArrayNotation callParamsExpr;

	/**
	 * The cached value of the '{@link #getInputExprs() <em>Input Exprs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputExprs()
	 * @generated
	 * @ordered
	 */
	protected EList<AlphaExpression> inputExprs;

	/**
	 * The cached value of the '{@link #getOutputExprs() <em>Output Exprs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputExprs()
	 * @generated
	 * @ordered
	 */
	protected EList<AlphaExpression> outputExprs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystemCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SUB_SYSTEM_CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaSystem getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (AlphaSystem)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaSystem basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(AlphaSystem newSystem) {
		AlphaSystem oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIFunctionInArrayNotation getCallParamsExpr() {
		return callParamsExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallParamsExpr(JNIFunctionInArrayNotation newCallParamsExpr, NotificationChain msgs) {
		JNIFunctionInArrayNotation oldCallParamsExpr = callParamsExpr;
		callParamsExpr = newCallParamsExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__CALL_PARAMS_EXPR, oldCallParamsExpr, newCallParamsExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallParamsExpr(JNIFunctionInArrayNotation newCallParamsExpr) {
		if (newCallParamsExpr != callParamsExpr) {
			NotificationChain msgs = null;
			if (callParamsExpr != null)
				msgs = ((InternalEObject)callParamsExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__CALL_PARAMS_EXPR, null, msgs);
			if (newCallParamsExpr != null)
				msgs = ((InternalEObject)newCallParamsExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__CALL_PARAMS_EXPR, null, msgs);
			msgs = basicSetCallParamsExpr(newCallParamsExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__CALL_PARAMS_EXPR, newCallParamsExpr, newCallParamsExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphaExpression> getInputExprs() {
		if (inputExprs == null) {
			inputExprs = new EObjectContainmentEList<AlphaExpression>(AlphaExpression.class, this, ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__INPUT_EXPRS);
		}
		return inputExprs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphaExpression> getOutputExprs() {
		if (outputExprs == null) {
			outputExprs = new EObjectContainmentEList<AlphaExpression>(AlphaExpression.class, this, ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__OUTPUT_EXPRS);
		}
		return outputExprs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMultiAff getCallParams() {
		JNIISLMultiAff _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getCallParamsExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.FUNCTION));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getCallParamsExpr().getISLObject();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__CALL_PARAMS_EXPR:
				return basicSetCallParamsExpr(null, msgs);
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__INPUT_EXPRS:
				return ((InternalEList<?>)getInputExprs()).basicRemove(otherEnd, msgs);
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__OUTPUT_EXPRS:
				return ((InternalEList<?>)getOutputExprs()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__CALL_PARAMS_EXPR:
				return getCallParamsExpr();
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__INPUT_EXPRS:
				return getInputExprs();
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__OUTPUT_EXPRS:
				return getOutputExprs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__SYSTEM:
				setSystem((AlphaSystem)newValue);
				return;
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__CALL_PARAMS_EXPR:
				setCallParamsExpr((JNIFunctionInArrayNotation)newValue);
				return;
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__INPUT_EXPRS:
				getInputExprs().clear();
				getInputExprs().addAll((Collection<? extends AlphaExpression>)newValue);
				return;
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__OUTPUT_EXPRS:
				getOutputExprs().clear();
				getOutputExprs().addAll((Collection<? extends AlphaExpression>)newValue);
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
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__SYSTEM:
				setSystem((AlphaSystem)null);
				return;
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__CALL_PARAMS_EXPR:
				setCallParamsExpr((JNIFunctionInArrayNotation)null);
				return;
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__INPUT_EXPRS:
				getInputExprs().clear();
				return;
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__OUTPUT_EXPRS:
				getOutputExprs().clear();
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
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__SYSTEM:
				return system != null;
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__CALL_PARAMS_EXPR:
				return callParamsExpr != null;
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__INPUT_EXPRS:
				return inputExprs != null && !inputExprs.isEmpty();
			case ModelPackage.SUB_SYSTEM_CALL_EXPRESSION__OUTPUT_EXPRS:
				return outputExprs != null && !outputExprs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubSystemCallExpressionImpl
