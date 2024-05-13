/**
 */
package alpha.codegen.impl;

import alpha.codegen.Branch;
import alpha.codegen.CodegenPackage;
import alpha.codegen.ConditionalBranch;
import alpha.codegen.IfStmt;

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
 * An implementation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.impl.IfStmtImpl#getIfBranch <em>If Branch</em>}</li>
 *   <li>{@link alpha.codegen.impl.IfStmtImpl#getElseIfBranches <em>Else If Branches</em>}</li>
 *   <li>{@link alpha.codegen.impl.IfStmtImpl#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStmtImpl extends MinimalEObjectImpl.Container implements IfStmt {
	/**
	 * The cached value of the '{@link #getIfBranch() <em>If Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBranch()
	 * @generated
	 * @ordered
	 */
	protected ConditionalBranch ifBranch;

	/**
	 * The cached value of the '{@link #getElseIfBranches() <em>Else If Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalBranch> elseIfBranches;

	/**
	 * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBranch()
	 * @generated
	 * @ordered
	 */
	protected Branch elseBranch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.IF_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalBranch getIfBranch() {
		return ifBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfBranch(ConditionalBranch newIfBranch, NotificationChain msgs) {
		ConditionalBranch oldIfBranch = ifBranch;
		ifBranch = newIfBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.IF_STMT__IF_BRANCH, oldIfBranch, newIfBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBranch(ConditionalBranch newIfBranch) {
		if (newIfBranch != ifBranch) {
			NotificationChain msgs = null;
			if (ifBranch != null)
				msgs = ((InternalEObject)ifBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.IF_STMT__IF_BRANCH, null, msgs);
			if (newIfBranch != null)
				msgs = ((InternalEObject)newIfBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.IF_STMT__IF_BRANCH, null, msgs);
			msgs = basicSetIfBranch(newIfBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.IF_STMT__IF_BRANCH, newIfBranch, newIfBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalBranch> getElseIfBranches() {
		if (elseIfBranches == null) {
			elseIfBranches = new EObjectContainmentEList<ConditionalBranch>(ConditionalBranch.class, this, CodegenPackage.IF_STMT__ELSE_IF_BRANCHES);
		}
		return elseIfBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getElseBranch() {
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBranch(Branch newElseBranch, NotificationChain msgs) {
		Branch oldElseBranch = elseBranch;
		elseBranch = newElseBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.IF_STMT__ELSE_BRANCH, oldElseBranch, newElseBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBranch(Branch newElseBranch) {
		if (newElseBranch != elseBranch) {
			NotificationChain msgs = null;
			if (elseBranch != null)
				msgs = ((InternalEObject)elseBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.IF_STMT__ELSE_BRANCH, null, msgs);
			if (newElseBranch != null)
				msgs = ((InternalEObject)newElseBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.IF_STMT__ELSE_BRANCH, null, msgs);
			msgs = basicSetElseBranch(newElseBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.IF_STMT__ELSE_BRANCH, newElseBranch, newElseBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.IF_STMT__IF_BRANCH:
				return basicSetIfBranch(null, msgs);
			case CodegenPackage.IF_STMT__ELSE_IF_BRANCHES:
				return ((InternalEList<?>)getElseIfBranches()).basicRemove(otherEnd, msgs);
			case CodegenPackage.IF_STMT__ELSE_BRANCH:
				return basicSetElseBranch(null, msgs);
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
			case CodegenPackage.IF_STMT__IF_BRANCH:
				return getIfBranch();
			case CodegenPackage.IF_STMT__ELSE_IF_BRANCHES:
				return getElseIfBranches();
			case CodegenPackage.IF_STMT__ELSE_BRANCH:
				return getElseBranch();
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
			case CodegenPackage.IF_STMT__IF_BRANCH:
				setIfBranch((ConditionalBranch)newValue);
				return;
			case CodegenPackage.IF_STMT__ELSE_IF_BRANCHES:
				getElseIfBranches().clear();
				getElseIfBranches().addAll((Collection<? extends ConditionalBranch>)newValue);
				return;
			case CodegenPackage.IF_STMT__ELSE_BRANCH:
				setElseBranch((Branch)newValue);
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
			case CodegenPackage.IF_STMT__IF_BRANCH:
				setIfBranch((ConditionalBranch)null);
				return;
			case CodegenPackage.IF_STMT__ELSE_IF_BRANCHES:
				getElseIfBranches().clear();
				return;
			case CodegenPackage.IF_STMT__ELSE_BRANCH:
				setElseBranch((Branch)null);
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
			case CodegenPackage.IF_STMT__IF_BRANCH:
				return ifBranch != null;
			case CodegenPackage.IF_STMT__ELSE_IF_BRANCHES:
				return elseIfBranches != null && !elseIfBranches.isEmpty();
			case CodegenPackage.IF_STMT__ELSE_BRANCH:
				return elseBranch != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStmtImpl
