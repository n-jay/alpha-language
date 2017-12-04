/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitor;
import alpha.model.CalculatorExpression;
import alpha.model.JNIFunctionInArrayNotation;
import alpha.model.ModelPackage;
import alpha.model.UseEquation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getSystem <em>System</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getInstantiationDomain <em>Instantiation Domain</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getCallParams <em>Call Params</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getSubsystemDims <em>Subsystem Dims</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getInputExprs <em>Input Exprs</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getOutputExprs <em>Output Exprs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseEquationImpl extends MinimalEObjectImpl.Container implements UseEquation {
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
	 * The cached value of the '{@link #getInstantiationDomain() <em>Instantiation Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiationDomain()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression instantiationDomain;

	/**
	 * The cached value of the '{@link #getCallParams() <em>Call Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallParams()
	 * @generated
	 * @ordered
	 */
	protected JNIFunctionInArrayNotation callParams;

	/**
	 * The cached value of the '{@link #getSubsystemDims() <em>Subsystem Dims</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemDims()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subsystemDims;

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
	protected UseEquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USE_EQUATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.USE_EQUATION__SYSTEM, oldSystem, system));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getInstantiationDomain() {
		return instantiationDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiationDomain(CalculatorExpression newInstantiationDomain, NotificationChain msgs) {
		CalculatorExpression oldInstantiationDomain = instantiationDomain;
		instantiationDomain = newInstantiationDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN, oldInstantiationDomain, newInstantiationDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiationDomain(CalculatorExpression newInstantiationDomain) {
		if (newInstantiationDomain != instantiationDomain) {
			NotificationChain msgs = null;
			if (instantiationDomain != null)
				msgs = ((InternalEObject)instantiationDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN, null, msgs);
			if (newInstantiationDomain != null)
				msgs = ((InternalEObject)newInstantiationDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN, null, msgs);
			msgs = basicSetInstantiationDomain(newInstantiationDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN, newInstantiationDomain, newInstantiationDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIFunctionInArrayNotation getCallParams() {
		return callParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallParams(JNIFunctionInArrayNotation newCallParams, NotificationChain msgs) {
		JNIFunctionInArrayNotation oldCallParams = callParams;
		callParams = newCallParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__CALL_PARAMS, oldCallParams, newCallParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallParams(JNIFunctionInArrayNotation newCallParams) {
		if (newCallParams != callParams) {
			NotificationChain msgs = null;
			if (callParams != null)
				msgs = ((InternalEObject)callParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__CALL_PARAMS, null, msgs);
			if (newCallParams != null)
				msgs = ((InternalEObject)newCallParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__CALL_PARAMS, null, msgs);
			msgs = basicSetCallParams(newCallParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__CALL_PARAMS, newCallParams, newCallParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubsystemDims() {
		if (subsystemDims == null) {
			subsystemDims = new EDataTypeEList<String>(String.class, this, ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS);
		}
		return subsystemDims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphaExpression> getInputExprs() {
		if (inputExprs == null) {
			inputExprs = new EObjectContainmentEList<AlphaExpression>(AlphaExpression.class, this, ModelPackage.USE_EQUATION__INPUT_EXPRS);
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
			outputExprs = new EObjectContainmentEList<AlphaExpression>(AlphaExpression.class, this, ModelPackage.USE_EQUATION__OUTPUT_EXPRS);
		}
		return outputExprs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(AlphaVisitor visitor) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN:
				return basicSetInstantiationDomain(null, msgs);
			case ModelPackage.USE_EQUATION__CALL_PARAMS:
				return basicSetCallParams(null, msgs);
			case ModelPackage.USE_EQUATION__INPUT_EXPRS:
				return ((InternalEList<?>)getInputExprs()).basicRemove(otherEnd, msgs);
			case ModelPackage.USE_EQUATION__OUTPUT_EXPRS:
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
			case ModelPackage.USE_EQUATION__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN:
				return getInstantiationDomain();
			case ModelPackage.USE_EQUATION__CALL_PARAMS:
				return getCallParams();
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				return getSubsystemDims();
			case ModelPackage.USE_EQUATION__INPUT_EXPRS:
				return getInputExprs();
			case ModelPackage.USE_EQUATION__OUTPUT_EXPRS:
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
			case ModelPackage.USE_EQUATION__SYSTEM:
				setSystem((AlphaSystem)newValue);
				return;
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN:
				setInstantiationDomain((CalculatorExpression)newValue);
				return;
			case ModelPackage.USE_EQUATION__CALL_PARAMS:
				setCallParams((JNIFunctionInArrayNotation)newValue);
				return;
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				getSubsystemDims().clear();
				getSubsystemDims().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.USE_EQUATION__INPUT_EXPRS:
				getInputExprs().clear();
				getInputExprs().addAll((Collection<? extends AlphaExpression>)newValue);
				return;
			case ModelPackage.USE_EQUATION__OUTPUT_EXPRS:
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
			case ModelPackage.USE_EQUATION__SYSTEM:
				setSystem((AlphaSystem)null);
				return;
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN:
				setInstantiationDomain((CalculatorExpression)null);
				return;
			case ModelPackage.USE_EQUATION__CALL_PARAMS:
				setCallParams((JNIFunctionInArrayNotation)null);
				return;
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				getSubsystemDims().clear();
				return;
			case ModelPackage.USE_EQUATION__INPUT_EXPRS:
				getInputExprs().clear();
				return;
			case ModelPackage.USE_EQUATION__OUTPUT_EXPRS:
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
			case ModelPackage.USE_EQUATION__SYSTEM:
				return system != null;
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN:
				return instantiationDomain != null;
			case ModelPackage.USE_EQUATION__CALL_PARAMS:
				return callParams != null;
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				return subsystemDims != null && !subsystemDims.isEmpty();
			case ModelPackage.USE_EQUATION__INPUT_EXPRS:
				return inputExprs != null && !inputExprs.isEmpty();
			case ModelPackage.USE_EQUATION__OUTPUT_EXPRS:
				return outputExprs != null && !outputExprs.isEmpty();
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
		result.append(" (subsystemDims: ");
		result.append(subsystemDims);
		result.append(')');
		return result.toString();
	}

} //UseEquationImpl
