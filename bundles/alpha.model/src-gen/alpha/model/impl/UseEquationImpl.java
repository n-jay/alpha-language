/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitor;
import alpha.model.CalculatorExpression;
import alpha.model.JNIFunctionInArrayNotation;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.UseEquation;
import alpha.model.VariableExpression;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getInstantiationDomainExpr <em>Instantiation Domain Expr</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getSubsystemDims <em>Subsystem Dims</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getSystem <em>System</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getCallParamsExpr <em>Call Params Expr</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getInputExprs <em>Input Exprs</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getOutputExprs <em>Output Exprs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseEquationImpl extends EquationImpl implements UseEquation {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstantiationDomainExpr() <em>Instantiation Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiationDomainExpr()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression instantiationDomainExpr;

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
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getInstantiationDomainExpr() {
		return instantiationDomainExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiationDomainExpr(CalculatorExpression newInstantiationDomainExpr, NotificationChain msgs) {
		CalculatorExpression oldInstantiationDomainExpr = instantiationDomainExpr;
		instantiationDomainExpr = newInstantiationDomainExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR, oldInstantiationDomainExpr, newInstantiationDomainExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiationDomainExpr(CalculatorExpression newInstantiationDomainExpr) {
		if (newInstantiationDomainExpr != instantiationDomainExpr) {
			NotificationChain msgs = null;
			if (instantiationDomainExpr != null)
				msgs = ((InternalEObject)instantiationDomainExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR, null, msgs);
			if (newInstantiationDomainExpr != null)
				msgs = ((InternalEObject)newInstantiationDomainExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR, null, msgs);
			msgs = basicSetInstantiationDomainExpr(newInstantiationDomainExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR, newInstantiationDomainExpr, newInstantiationDomainExpr));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__CALL_PARAMS_EXPR, oldCallParamsExpr, newCallParamsExpr);
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
				msgs = ((InternalEObject)callParamsExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__CALL_PARAMS_EXPR, null, msgs);
			if (newCallParamsExpr != null)
				msgs = ((InternalEObject)newCallParamsExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__CALL_PARAMS_EXPR, null, msgs);
			msgs = basicSetCallParamsExpr(newCallParamsExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__CALL_PARAMS_EXPR, newCallParamsExpr, newCallParamsExpr));
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
	public String getName() {
		String _xifexpression = null;
		String _identifier = this.getIdentifier();
		boolean _tripleNotEquals = (_identifier != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getIdentifier();
		}
		else {
			String _xifexpression_1 = null;
			AlphaSystem _system = this.getSystem();
			boolean _tripleNotEquals_1 = (_system != null);
			if (_tripleNotEquals_1) {
				_xifexpression_1 = this.getSystem().getName();
			}
			else {
				_xifexpression_1 = null;
			}
			_xifexpression = _xifexpression_1;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLMultiAff getCallParams() {
		ISLMultiAff _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getCallParamsExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.FUNCTION));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getCallParamsExpr().getISLObject();
			_xifexpression = ((ISLMultiAff) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLSet getInstantiationDomain() {
		ISLSet _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getInstantiationDomainExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.SET));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getInstantiationDomainExpr().getISLObject();
			_xifexpression = ((ISLSet) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<VariableExpression> getAllVariableExpressionsInOutputExpressions() {
		List<VariableExpression> list = new LinkedList<VariableExpression>();
		EList<AlphaExpression> _outputExprs = this.getOutputExprs();
		for (final AlphaExpression expr : _outputExprs) {
			{
				list.addAll(EcoreUtil2.<VariableExpression>getAllContentsOfType(expr, VariableExpression.class));
				if ((expr instanceof VariableExpression)) {
					list.add(((VariableExpression)expr));
				}
			}
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaVisitor visitor) {
		visitor.visitUseEquation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR:
				return basicSetInstantiationDomainExpr(null, msgs);
			case ModelPackage.USE_EQUATION__CALL_PARAMS_EXPR:
				return basicSetCallParamsExpr(null, msgs);
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
			case ModelPackage.USE_EQUATION__IDENTIFIER:
				return getIdentifier();
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR:
				return getInstantiationDomainExpr();
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				return getSubsystemDims();
			case ModelPackage.USE_EQUATION__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case ModelPackage.USE_EQUATION__CALL_PARAMS_EXPR:
				return getCallParamsExpr();
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
			case ModelPackage.USE_EQUATION__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR:
				setInstantiationDomainExpr((CalculatorExpression)newValue);
				return;
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				getSubsystemDims().clear();
				getSubsystemDims().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.USE_EQUATION__SYSTEM:
				setSystem((AlphaSystem)newValue);
				return;
			case ModelPackage.USE_EQUATION__CALL_PARAMS_EXPR:
				setCallParamsExpr((JNIFunctionInArrayNotation)newValue);
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
			case ModelPackage.USE_EQUATION__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR:
				setInstantiationDomainExpr((CalculatorExpression)null);
				return;
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				getSubsystemDims().clear();
				return;
			case ModelPackage.USE_EQUATION__SYSTEM:
				setSystem((AlphaSystem)null);
				return;
			case ModelPackage.USE_EQUATION__CALL_PARAMS_EXPR:
				setCallParamsExpr((JNIFunctionInArrayNotation)null);
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
			case ModelPackage.USE_EQUATION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR:
				return instantiationDomainExpr != null;
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				return subsystemDims != null && !subsystemDims.isEmpty();
			case ModelPackage.USE_EQUATION__SYSTEM:
				return system != null;
			case ModelPackage.USE_EQUATION__CALL_PARAMS_EXPR:
				return callParamsExpr != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", subsystemDims: ");
		result.append(subsystemDims);
		result.append(')');
		return result.toString();
	}

} //UseEquationImpl
