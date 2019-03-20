/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpression;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitor;
import alpha.model.CalculatorExpression;
import alpha.model.JNIDomain;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.PolyhedralObject;
import alpha.model.SystemBody;
import alpha.model.Variable;

import com.google.common.base.Objects;

import com.google.common.collect.Iterables;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getParameterDomainExpr <em>Parameter Domain Expr</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getDefinedObjects <em>Defined Objects</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getLocals <em>Locals</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getWhileDomainExpr <em>While Domain Expr</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getTestExpression <em>Test Expression</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaSystemImpl#getSystemBodies <em>System Bodies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaSystemImpl extends AlphaNodeImpl implements AlphaSystem {
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
	 * The cached value of the '{@link #getParameterDomainExpr() <em>Parameter Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDomainExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIDomain parameterDomainExpr;

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
	protected EList<Variable> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> outputs;

	/**
	 * The cached value of the '{@link #getLocals() <em>Locals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocals()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> locals;

	/**
	 * The cached value of the '{@link #getWhileDomainExpr() <em>While Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileDomainExpr()
	 * @generated
	 * @ordered
	 */
	protected CalculatorExpression whileDomainExpr;

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
	 * The cached value of the '{@link #getSystemBodies() <em>System Bodies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemBody> systemBodies;

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
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public JNIDomain getParameterDomainExpr() {
		return parameterDomainExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterDomainExpr(JNIDomain newParameterDomainExpr, NotificationChain msgs) {
		JNIDomain oldParameterDomainExpr = parameterDomainExpr;
		parameterDomainExpr = newParameterDomainExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN_EXPR, oldParameterDomainExpr, newParameterDomainExpr);
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
	public void setParameterDomainExpr(JNIDomain newParameterDomainExpr) {
		if (newParameterDomainExpr != parameterDomainExpr) {
			NotificationChain msgs = null;
			if (parameterDomainExpr != null)
				msgs = ((InternalEObject)parameterDomainExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN_EXPR, null, msgs);
			if (newParameterDomainExpr != null)
				msgs = ((InternalEObject)newParameterDomainExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN_EXPR, null, msgs);
			msgs = basicSetParameterDomainExpr(newParameterDomainExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN_EXPR, newParameterDomainExpr, newParameterDomainExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EList<Variable> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Variable>(Variable.class, this, ModelPackage.ALPHA_SYSTEM__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Variable>(Variable.class, this, ModelPackage.ALPHA_SYSTEM__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getLocals() {
		if (locals == null) {
			locals = new EObjectContainmentEList<Variable>(Variable.class, this, ModelPackage.ALPHA_SYSTEM__LOCALS);
		}
		return locals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculatorExpression getWhileDomainExpr() {
		return whileDomainExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhileDomainExpr(CalculatorExpression newWhileDomainExpr, NotificationChain msgs) {
		CalculatorExpression oldWhileDomainExpr = whileDomainExpr;
		whileDomainExpr = newWhileDomainExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN_EXPR, oldWhileDomainExpr, newWhileDomainExpr);
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
	public void setWhileDomainExpr(CalculatorExpression newWhileDomainExpr) {
		if (newWhileDomainExpr != whileDomainExpr) {
			NotificationChain msgs = null;
			if (whileDomainExpr != null)
				msgs = ((InternalEObject)whileDomainExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN_EXPR, null, msgs);
			if (newWhileDomainExpr != null)
				msgs = ((InternalEObject)newWhileDomainExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN_EXPR, null, msgs);
			msgs = basicSetWhileDomainExpr(newWhileDomainExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN_EXPR, newWhileDomainExpr, newWhileDomainExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
	public EList<SystemBody> getSystemBodies() {
		if (systemBodies == null) {
			systemBodies = new EObjectContainmentWithInverseEList<SystemBody>(SystemBody.class, this, ModelPackage.ALPHA_SYSTEM__SYSTEM_BODIES, ModelPackage.SYSTEM_BODY__SYSTEM);
		}
		return systemBodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariables() {
		EList<Variable> _inputs = this.getInputs();
		EList<Variable> _outputs = this.getOutputs();
		Iterable<Variable> _plus = Iterables.<Variable>concat(_inputs, _outputs);
		EList<Variable> _locals = this.getLocals();
		return ECollections.<Variable>unmodifiableEList(ECollections.<Variable>asEList(((Variable[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(Iterables.<Variable>concat(_plus, _locals), Variable.class))));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIISLSet getParameterDomain() {
		return this.getParameterDomainExpr().getISLSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JNIISLSet getWhileDomain() {
		JNIISLSet _xifexpression = null;
		if (((this.getWhileDomainExpr() == null) || (!Objects.equal(this.getWhileDomainExpr().getType(), POLY_OBJECT_TYPE.SET)))) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getWhileDomainExpr().getISLObject();
			_xifexpression = ((JNIISLSet) _iSLObject).copy();
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getVariable(final String varName) {
		final Function1<Variable, Boolean> _function = new Function1<Variable, Boolean>() {
			public Boolean apply(final Variable v) {
				return Boolean.valueOf(v.getName().contentEquals(varName));
			}
		};
		return IterableExtensions.<Variable>findFirst(this.getVariables(), _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFullyQualifiedName() {
		String _xblockexpression = null;
		{
			final IQualifiedNameProvider provider = new DefaultDeclarativeQualifiedNameProvider();
			_xblockexpression = provider.getFullyQualifiedName(this).toString();
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(final AlphaVisitor visitor) {
		visitor.visitAlphaSystem(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_SYSTEM__SYSTEM_BODIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystemBodies()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN_EXPR:
				return basicSetParameterDomainExpr(null, msgs);
			case ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS:
				return ((InternalEList<?>)getDefinedObjects()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__LOCALS:
				return ((InternalEList<?>)getLocals()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN_EXPR:
				return basicSetWhileDomainExpr(null, msgs);
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				return basicSetTestExpression(null, msgs);
			case ModelPackage.ALPHA_SYSTEM__SYSTEM_BODIES:
				return ((InternalEList<?>)getSystemBodies()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN_EXPR:
				return getParameterDomainExpr();
			case ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS:
				return getDefinedObjects();
			case ModelPackage.ALPHA_SYSTEM__INPUTS:
				return getInputs();
			case ModelPackage.ALPHA_SYSTEM__OUTPUTS:
				return getOutputs();
			case ModelPackage.ALPHA_SYSTEM__LOCALS:
				return getLocals();
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN_EXPR:
				return getWhileDomainExpr();
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				return getTestExpression();
			case ModelPackage.ALPHA_SYSTEM__SYSTEM_BODIES:
				return getSystemBodies();
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
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN_EXPR:
				setParameterDomainExpr((JNIDomain)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS:
				getDefinedObjects().clear();
				getDefinedObjects().addAll((Collection<? extends PolyhedralObject>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Variable>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Variable>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__LOCALS:
				getLocals().clear();
				getLocals().addAll((Collection<? extends Variable>)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN_EXPR:
				setWhileDomainExpr((CalculatorExpression)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				setTestExpression((AlphaExpression)newValue);
				return;
			case ModelPackage.ALPHA_SYSTEM__SYSTEM_BODIES:
				getSystemBodies().clear();
				getSystemBodies().addAll((Collection<? extends SystemBody>)newValue);
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
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN_EXPR:
				setParameterDomainExpr((JNIDomain)null);
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
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN_EXPR:
				setWhileDomainExpr((CalculatorExpression)null);
				return;
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				setTestExpression((AlphaExpression)null);
				return;
			case ModelPackage.ALPHA_SYSTEM__SYSTEM_BODIES:
				getSystemBodies().clear();
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
			case ModelPackage.ALPHA_SYSTEM__PARAMETER_DOMAIN_EXPR:
				return parameterDomainExpr != null;
			case ModelPackage.ALPHA_SYSTEM__DEFINED_OBJECTS:
				return definedObjects != null && !definedObjects.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__LOCALS:
				return locals != null && !locals.isEmpty();
			case ModelPackage.ALPHA_SYSTEM__WHILE_DOMAIN_EXPR:
				return whileDomainExpr != null;
			case ModelPackage.ALPHA_SYSTEM__TEST_EXPRESSION:
				return testExpression != null;
			case ModelPackage.ALPHA_SYSTEM__SYSTEM_BODIES:
				return systemBodies != null && !systemBodies.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AlphaSystemImpl
