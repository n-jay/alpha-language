/**
 */
package alpha.codegen.impl;

import alpha.codegen.CodegenPackage;
import alpha.codegen.ConditionalBranch;
import alpha.codegen.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.impl.ConditionalBranchImpl#getConditional <em>Conditional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalBranchImpl extends BranchImpl implements ConditionalBranch {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.CONDITIONAL_BRANCH;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.CONDITIONAL_BRANCH__CONDITIONAL, oldConditional, newConditional);
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
				msgs = ((InternalEObject)conditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.CONDITIONAL_BRANCH__CONDITIONAL, null, msgs);
			if (newConditional != null)
				msgs = ((InternalEObject)newConditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.CONDITIONAL_BRANCH__CONDITIONAL, null, msgs);
			msgs = basicSetConditional(newConditional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.CONDITIONAL_BRANCH__CONDITIONAL, newConditional, newConditional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.CONDITIONAL_BRANCH__CONDITIONAL:
				return basicSetConditional(null, msgs);
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
			case CodegenPackage.CONDITIONAL_BRANCH__CONDITIONAL:
				return getConditional();
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
			case CodegenPackage.CONDITIONAL_BRANCH__CONDITIONAL:
				setConditional((Expression)newValue);
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
			case CodegenPackage.CONDITIONAL_BRANCH__CONDITIONAL:
				setConditional((Expression)null);
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
			case CodegenPackage.CONDITIONAL_BRANCH__CONDITIONAL:
				return conditional != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalBranchImpl
