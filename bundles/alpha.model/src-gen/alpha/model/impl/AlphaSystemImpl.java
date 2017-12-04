/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitor;
import alpha.model.CalculatorExpression;
import alpha.model.FuzzyVariable;
import alpha.model.InputVariable;
import alpha.model.JNIDomain;
import alpha.model.LocalVariable;
import alpha.model.ModelPackage;
import alpha.model.OutputVariable;
import alpha.model.PolyhedralObject;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.Variable;

import com.google.common.collect.Iterables;

import java.lang.Iterable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getParameterDomain <em>Parameter Domain</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getDefinedObjects <em>Defined Objects</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getLocals <em>Locals</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getFuzzyVariables <em>Fuzzy Variables</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getWhileDomain <em>While Domain</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getTestExpression <em>Test Expression</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getUseEquations <em>Use Equations</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getEquations <em>Equations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaSystemImpl extends AlphaElementImpl implements AlphaSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterDomain() <em>Parameter Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDomain()
	 * @generated
	 * @ordered
	 */
	protected JNIDomain parameterDomain;

	/**
	 * The cached value of the '{@link #getDefinedObjects() <em>Defined Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<PolyhedralObject> definedObjects;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputVariable> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputVariable> outputs;

	/**
	 * The cached value of the '{@link #getLocals() <em>Locals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocals()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> locals;

	/**
	 * The cached value of the '{@link #getFuzzyVariables() <em>Fuzzy Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuzzyVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<FuzzyVariable> fuzzyVariables;

	/**
	 * The cached value of the '{@link #getWhileDomain() <em>While Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileDomain()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression whileDomain;

	/**
	 * The cached value of the '{@link #getTestExpression() <em>Test Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestExpression()
	 * @generated
	 * @ordered
	 */
	protected AlphaExpression testExpression;

	/**
	 * The cached value of the '{@link #getUseEquations() <em>Use Equations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseEquations()
	 * @generated
	 * @ordered
	 */
	protected EList<UseEquation> useEquations;

	/**
	 * The cached value of the '{@link #getEquations() <em>Equations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquations()
	 * @generated
	 * @ordered
	 */
	protected EList<StandardEquation> equations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALPHA_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIDomain getParameterDomain() {
		return parameterDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterDomain(JNIDomain newParameterDomain, NotificationChain msgs) {
		JNIDomain oldParameterDomain = parameterDomain;
		parameterDomain = newParameterDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN, oldParameterDomain, newParameterDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterDomain(JNIDomain newParameterDomain) {
		if (newParameterDomain != parameterDomain) {
			NotificationChain msgs = null;
			if (parameterDomain != null)
				msgs = ((InternalEObject)parameterDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN, null, msgs);
			if (newParameterDomain != null)
				msgs = ((InternalEObject)newParameterDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN, null, msgs);
			msgs = basicSetParameterDomain(newParameterDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN, newParameterDomain, newParameterDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolyhedralObject> getDefinedObjects() {
		if (definedObjects == null) {
			definedObjects = new EObjectContainmentEList<PolyhedralObject>(PolyhedralObject.class, this, ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS);
		}
		return definedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputVariable> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputVariable>(InputVariable.class, this, ModelPackage.ALPHA_SYSTEM__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputVariable> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputVariable>(OutputVariable.class, this, ModelPackage.ALPHA_SYSTEM__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getLocals() {
		if (locals == null) {
			locals = new EObjectContainmentEList<LocalVariable>(LocalVariable.class, this, ModelPackage.ALPHA_SYSTEM__LOCALS);
		}
		return locals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuzzyVariable> getFuzzyVariables() {
		if (fuzzyVariables == null) {
			fuzzyVariables = new EObjectContainmentEList<FuzzyVariable>(FuzzyVariable.class, this, ModelPackage.ALPHA_SYSTEM__FUZZY_VARIABLES);
		}
		return fuzzyVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatorExpression getWhileDomain() {
		return whileDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhileDomain(CalculatorExpression newWhileDomain, NotificationChain msgs) {
		CalculatorExpression oldWhileDomain = whileDomain;
		whileDomain = newWhileDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN, oldWhileDomain, newWhileDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileDomain(CalculatorExpression newWhileDomain) {
		if (newWhileDomain != whileDomain) {
			NotificationChain msgs = null;
			if (whileDomain != null)
				msgs = ((InternalEObject)whileDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN, null, msgs);
			if (newWhileDomain != null)
				msgs = ((InternalEObject)newWhileDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN, null, msgs);
			msgs = basicSetWhileDomain(newWhileDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN, newWhileDomain, newWhileDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaExpression getTestExpression() {
		return testExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestExpression(AlphaExpression newTestExpression, NotificationChain msgs) {
		AlphaExpression oldTestExpression = testExpression;
		testExpression = newTestExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION, oldTestExpression, newTestExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestExpression(AlphaExpression newTestExpression) {
		if (newTestExpression != testExpression) {
			NotificationChain msgs = null;
			if (testExpression != null)
				msgs = ((InternalEObject)testExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION, null, msgs);
			if (newTestExpression != null)
				msgs = ((InternalEObject)newTestExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION, null, msgs);
			msgs = basicSetTestExpression(newTestExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION, newTestExpression, newTestExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseEquation> getUseEquations() {
		if (useEquations == null) {
			useEquations = new EObjectContainmentEList<UseEquation>(UseEquation.class, this, ModelPackage.ALPHA_SYSTEM__USE_EQUATIONS);
		}
		return useEquations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StandardEquation> getEquations() {
		if (equations == null) {
			equations = new EObjectContainmentEList<StandardEquation>(StandardEquation.class, this, ModelPackage.ALPHA_SYSTEM__EQUATIONS);
		}
		return equations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		EList<InputVariable> _inputs = this.getInputs();
		EList<OutputVariable> _outputs = this.getOutputs();
		Iterable<Variable> _plus = Iterables.<Variable>concat(_inputs, _outputs);
		EList<LocalVariable> _locals = this.getLocals();
		return ECollections.<Variable>unmodifiableEList(ECollections.<Variable>asEList(((Variable[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(Iterables.<Variable>concat(_plus, _locals), Variable.class))));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaVisitor visitor) {
		visitor.visitAlphaSystem(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN:
				return basicSetParameterDomain(null, msgs);
			case ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS:
				return ((InternalEList<?>)getDefinedObjects()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__LOCALS:
				return ((InternalEList<?>)getLocals()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__FUZZY_VARIABLES:
				return ((InternalEList<?>)getFuzzyVariables()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN:
				return basicSetWhileDomain(null, msgs);
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				return basicSetTestExpression(null, msgs);
			case ModelPackage.ALPHA_SYSTEM__USE_EQUATIONS:
				return ((InternalEList<?>)getUseEquations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__EQUATIONS:
				return ((InternalEList<?>)getEquations()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ALPHA_SYSTEM__NAME:
				return getName();
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN:
				return getParameterDomain();
			case ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS:
				return getDefinedObjects();
			case ModelPackage.ALPHA_SYSTEM__INPUTS:
				return getInputs();
			case ModelPackage.ALPHA_SYSTEM__OUTPUTS:
				return getOutputs();
			case ModelPackage.ALPHA_SYSTEM__LOCALS:
				return getLocals();
			case ModelPackage.ALPHA_SYSTEM__FUZZY_VARIABLES:
				return getFuzzyVariables();
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN:
				return getWhileDomain();
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				return getTestExpression();
			case ModelPackage.ALPHA_SYSTEM__USE_EQUATIONS:
				return getUseEquations();
			case ModelPackage.ALPHA_SYSTEM__EQUATIONS:
				return getEquations();
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
			case ModelPackage.ALPHA_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN:
				setParameterDomain((JNIDomain)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS:
				getDefinedObjects().clear();
				getDefinedObjects().addAll((Collection<? extends PolyhedralObject>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputVariable>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputVariable>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__LOCALS:
				getLocals().clear();
				getLocals().addAll((Collection<? extends LocalVariable>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__FUZZY_VARIABLES:
				getFuzzyVariables().clear();
				getFuzzyVariables().addAll((Collection<? extends FuzzyVariable>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN:
				setWhileDomain((CalculatorExpression)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				setTestExpression((AlphaExpression)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__USE_EQUATIONS:
				getUseEquations().clear();
				getUseEquations().addAll((Collection<? extends UseEquation>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__EQUATIONS:
				getEquations().clear();
				getEquations().addAll((Collection<? extends StandardEquation>)newValue);
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
			case ModelPackage.ALPHA_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN:
				setParameterDomain((JNIDomain)null);
				return;
			case ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS:
				getDefinedObjects().clear();
				return;
			case ModelPackage.ALPHA_SYSTEM__INPUTS:
				getInputs().clear();
				return;
			case ModelPackage.ALPHA_SYSTEM__OUTPUTS:
				getOutputs().clear();
				return;
			case ModelPackage.ALPHA_SYSTEM__LOCALS:
				getLocals().clear();
				return;
			case ModelPackage.ALPHA_SYSTEM__FUZZY_VARIABLES:
				getFuzzyVariables().clear();
				return;
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN:
				setWhileDomain((CalculatorExpression)null);
				return;
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				setTestExpression((AlphaExpression)null);
				return;
			case ModelPackage.ALPHA_SYSTEM__USE_EQUATIONS:
				getUseEquations().clear();
				return;
			case ModelPackage.ALPHA_SYSTEM__EQUATIONS:
				getEquations().clear();
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
			case ModelPackage.ALPHA_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN:
				return parameterDomain != null;
			case ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS:
				return definedObjects != null && !definedObjects.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__LOCALS:
				return locals != null && !locals.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__FUZZY_VARIABLES:
				return fuzzyVariables != null && !fuzzyVariables.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN:
				return whileDomain != null;
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				return testExpression != null;
			case ModelPackage.ALPHA_SYSTEM__USE_EQUATIONS:
				return useEquations != null && !useEquations.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__EQUATIONS:
				return equations != null && !equations.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AlphaSystemImpl
