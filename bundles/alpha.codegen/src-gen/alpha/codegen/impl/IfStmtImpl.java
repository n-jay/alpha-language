/**
 */
package alpha.codegen.impl;

import alpha.codegen.Branch;
import alpha.codegen.CodegenPackage;
import alpha.codegen.ConditionalBranch;
import alpha.codegen.IfStmt;

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
	 * The cached value of the '{@link #getIfBranch() <em>If Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBranch()
	 * @generated
	 * @ordered
	 */
	protected ConditionalBranch ifBranch;

	/**
	 * The cached value of the '{@link #getElseIfBranches() <em>Else If Branches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalBranch> elseIfBranches;

	/**
	 * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' reference.
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
		if (ifBranch != null && ifBranch.eIsProxy()) {
			InternalEObject oldIfBranch = (InternalEObject)ifBranch;
			ifBranch = (ConditionalBranch)eResolveProxy(oldIfBranch);
			if (ifBranch != oldIfBranch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.IF_STMT__IF_BRANCH, oldIfBranch, ifBranch));
			}
		}
		return ifBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalBranch basicGetIfBranch() {
		return ifBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBranch(ConditionalBranch newIfBranch) {
		ConditionalBranch oldIfBranch = ifBranch;
		ifBranch = newIfBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.IF_STMT__IF_BRANCH, oldIfBranch, ifBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalBranch> getElseIfBranches() {
		if (elseIfBranches == null) {
			elseIfBranches = new EObjectResolvingEList<ConditionalBranch>(ConditionalBranch.class, this, CodegenPackage.IF_STMT__ELSE_IF_BRANCHES);
		}
		return elseIfBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getElseBranch() {
		if (elseBranch != null && elseBranch.eIsProxy()) {
			InternalEObject oldElseBranch = (InternalEObject)elseBranch;
			elseBranch = (Branch)eResolveProxy(oldElseBranch);
			if (elseBranch != oldElseBranch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.IF_STMT__ELSE_BRANCH, oldElseBranch, elseBranch));
			}
		}
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch basicGetElseBranch() {
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBranch(Branch newElseBranch) {
		Branch oldElseBranch = elseBranch;
		elseBranch = newElseBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.IF_STMT__ELSE_BRANCH, oldElseBranch, elseBranch));
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
				if (resolve) return getIfBranch();
				return basicGetIfBranch();
			case CodegenPackage.IF_STMT__ELSE_IF_BRANCHES:
				return getElseIfBranches();
			case CodegenPackage.IF_STMT__ELSE_BRANCH:
				if (resolve) return getElseBranch();
				return basicGetElseBranch();
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
