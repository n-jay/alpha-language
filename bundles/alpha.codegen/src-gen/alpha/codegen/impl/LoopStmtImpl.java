/**
 */
package alpha.codegen.impl;

import alpha.codegen.CodegenPackage;
import alpha.codegen.Expression;
import alpha.codegen.LoopStmt;
import alpha.codegen.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected Expression initializer;

	/**
	 * The cached value of the '{@link #getConditional() <em>Conditional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditional()
	 * @generated
	 * @ordered
	 */
	protected Expression conditional;

	/**
	 * The cached value of the '{@link #getIncrementBy() <em>Increment By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected Expression incrementBy;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
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
		if (initializer != null && initializer.eIsProxy()) {
			InternalEObject oldInitializer = (InternalEObject)initializer;
			initializer = (Expression)eResolveProxy(oldInitializer);
			if (initializer != oldInitializer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.LOOP_STMT__INITIALIZER, oldInitializer, initializer));
			}
		}
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(Expression newInitializer) {
		Expression oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__INITIALIZER, oldInitializer, initializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConditional() {
		if (conditional != null && conditional.eIsProxy()) {
			InternalEObject oldConditional = (InternalEObject)conditional;
			conditional = (Expression)eResolveProxy(oldConditional);
			if (conditional != oldConditional) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.LOOP_STMT__CONDITIONAL, oldConditional, conditional));
			}
		}
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetConditional() {
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditional(Expression newConditional) {
		Expression oldConditional = conditional;
		conditional = newConditional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__CONDITIONAL, oldConditional, conditional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIncrementBy() {
		if (incrementBy != null && incrementBy.eIsProxy()) {
			InternalEObject oldIncrementBy = (InternalEObject)incrementBy;
			incrementBy = (Expression)eResolveProxy(oldIncrementBy);
			if (incrementBy != oldIncrementBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.LOOP_STMT__INCREMENT_BY, oldIncrementBy, incrementBy));
			}
		}
		return incrementBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetIncrementBy() {
		return incrementBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementBy(Expression newIncrementBy) {
		Expression oldIncrementBy = incrementBy;
		incrementBy = newIncrementBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.LOOP_STMT__INCREMENT_BY, oldIncrementBy, incrementBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<Statement>(Statement.class, this, CodegenPackage.LOOP_STMT__BODY);
		}
		return body;
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
				if (resolve) return getInitializer();
				return basicGetInitializer();
			case CodegenPackage.LOOP_STMT__CONDITIONAL:
				if (resolve) return getConditional();
				return basicGetConditional();
			case CodegenPackage.LOOP_STMT__INCREMENT_BY:
				if (resolve) return getIncrementBy();
				return basicGetIncrementBy();
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
