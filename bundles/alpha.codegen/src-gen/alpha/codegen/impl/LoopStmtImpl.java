/**
 */
package alpha.codegen.impl;

import alpha.codegen.CodegenPackage;
import alpha.codegen.Expression;
import alpha.codegen.LoopStmt;
import alpha.codegen.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.impl.LoopStmtImpl#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link alpha.codegen.impl.LoopStmtImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link alpha.codegen.impl.LoopStmtImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link alpha.codegen.impl.LoopStmtImpl#getIncrementBy <em>Increment By</em>}</li>
 *   <li>{@link alpha.codegen.impl.LoopStmtImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopStmtImpl extends MinimalEObjectImpl.Container implements LoopStmt {
	/**
	 * The default value of the '{@link #getLoopVariable() <em>Loop Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String LOOP_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopVariable() <em>Loop Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariable()
	 * @generated
	 * @ordered
	 */
	protected String loopVariable = LOOP_VARIABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected Expression initializer;

	/**
	 * The cached value of the '{@link #getConditional() <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditional()
	 * @generated
	 * @ordered
	 */
	protected Expression conditional;

	/**
	 * The cached value of the '{@link #getIncrementBy() <em>Increment By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected Expression incrementBy;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopStmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.LOOP_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoopVariable() {
		return loopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopVariable(String newLoopVariable) {
		String oldLoopVariable = loopVariable;
		loopVariable = newLoopVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__LOOP_VARIABLE, oldLoopVariable, loopVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(Expression newInitializer, NotificationChain msgs) {
		Expression oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__INITIALIZER, oldInitializer, newInitializer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(Expression newInitializer) {
		if (newInitializer != initializer) {
			NotificationChain msgs = null;
			if (initializer != null)
				msgs = ((InternalEObject)initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.LOOP_STMT__INITIALIZER, null, msgs);
			if (newInitializer != null)
				msgs = ((InternalEObject)newInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.LOOP_STMT__INITIALIZER, null, msgs);
			msgs = basicSetInitializer(newInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__INITIALIZER, newInitializer, newInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConditional() {
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditional(Expression newConditional, NotificationChain msgs) {
		Expression oldConditional = conditional;
		conditional = newConditional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__CONDITIONAL, oldConditional, newConditional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditional(Expression newConditional) {
		if (newConditional != conditional) {
			NotificationChain msgs = null;
			if (conditional != null)
				msgs = ((InternalEObject)conditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.LOOP_STMT__CONDITIONAL, null, msgs);
			if (newConditional != null)
				msgs = ((InternalEObject)newConditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.LOOP_STMT__CONDITIONAL, null, msgs);
			msgs = basicSetConditional(newConditional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__CONDITIONAL, newConditional, newConditional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIncrementBy() {
		return incrementBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrementBy(Expression newIncrementBy, NotificationChain msgs) {
		Expression oldIncrementBy = incrementBy;
		incrementBy = newIncrementBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__INCREMENT_BY, oldIncrementBy, newIncrementBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementBy(Expression newIncrementBy) {
		if (newIncrementBy != incrementBy) {
			NotificationChain msgs = null;
			if (incrementBy != null)
				msgs = ((InternalEObject)incrementBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.LOOP_STMT__INCREMENT_BY, null, msgs);
			if (newIncrementBy != null)
				msgs = ((InternalEObject)newIncrementBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.LOOP_STMT__INCREMENT_BY, null, msgs);
			msgs = basicSetIncrementBy(newIncrementBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__INCREMENT_BY, newIncrementBy, newIncrementBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Statement>(Statement.class, this, CodegenPackage.LOOP_STMT__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.LOOP_STMT__INITIALIZER:
				return basicSetInitializer(null, msgs);
			case CodegenPackage.LOOP_STMT__CONDITIONAL:
				return basicSetConditional(null, msgs);
			case CodegenPackage.LOOP_STMT__INCREMENT_BY:
				return basicSetIncrementBy(null, msgs);
			case CodegenPackage.LOOP_STMT__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.LOOP_STMT__LOOP_VARIABLE:
				return getLoopVariable();
			case CodegenPackage.LOOP_STMT__INITIALIZER:
				return getInitializer();
			case CodegenPackage.LOOP_STMT__CONDITIONAL:
				return getConditional();
			case CodegenPackage.LOOP_STMT__INCREMENT_BY:
				return getIncrementBy();
			case CodegenPackage.LOOP_STMT__BODY:
				return getBody();
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
			case CodegenPackage.LOOP_STMT__LOOP_VARIABLE:
				setLoopVariable((String)newValue);
				return;
			case CodegenPackage.LOOP_STMT__INITIALIZER:
				setInitializer((Expression)newValue);
				return;
			case CodegenPackage.LOOP_STMT__CONDITIONAL:
				setConditional((Expression)newValue);
				return;
			case CodegenPackage.LOOP_STMT__INCREMENT_BY:
				setIncrementBy((Expression)newValue);
				return;
			case CodegenPackage.LOOP_STMT__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Statement>)newValue);
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
			case CodegenPackage.LOOP_STMT__LOOP_VARIABLE:
				setLoopVariable(LOOP_VARIABLE_EDEFAULT);
				return;
			case CodegenPackage.LOOP_STMT__INITIALIZER:
				setInitializer((Expression)null);
				return;
			case CodegenPackage.LOOP_STMT__CONDITIONAL:
				setConditional((Expression)null);
				return;
			case CodegenPackage.LOOP_STMT__INCREMENT_BY:
				setIncrementBy((Expression)null);
				return;
			case CodegenPackage.LOOP_STMT__BODY:
				getBody().clear();
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
			case CodegenPackage.LOOP_STMT__LOOP_VARIABLE:
				return LOOP_VARIABLE_EDEFAULT == null ? loopVariable != null : !LOOP_VARIABLE_EDEFAULT.equals(loopVariable);
			case CodegenPackage.LOOP_STMT__INITIALIZER:
				return initializer != null;
			case CodegenPackage.LOOP_STMT__CONDITIONAL:
				return conditional != null;
			case CodegenPackage.LOOP_STMT__INCREMENT_BY:
				return incrementBy != null;
			case CodegenPackage.LOOP_STMT__BODY:
				return body != null && !body.isEmpty();
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
		result.append(" (loopVariable: ");
		result.append(loopVariable);
		result.append(')');
		return result.toString();
	}

} //LoopStmtImpl
