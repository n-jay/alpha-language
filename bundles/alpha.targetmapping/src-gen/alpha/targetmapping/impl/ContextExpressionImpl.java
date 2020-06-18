/**
 */
package alpha.targetmapping.impl;

import alpha.model.JNIDomainInArrayNotation;

import alpha.targetmapping.ContextExpression;
import alpha.targetmapping.ScheduleTreeExpression;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.ContextExpressionImpl#getContextDomain <em>Context Domain</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.ContextExpressionImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextExpressionImpl extends ScheduleTreeExpressionImpl implements ContextExpression {
	/**
	 * The cached value of the '{@link #getContextDomain() <em>Context Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextDomain()
	 * @generated
	 * @ordered
	 */
	protected JNIDomainInArrayNotation contextDomain;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected ScheduleTreeExpression child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.CONTEXT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIDomainInArrayNotation getContextDomain() {
		return contextDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextDomain(JNIDomainInArrayNotation newContextDomain, NotificationChain msgs) {
		JNIDomainInArrayNotation oldContextDomain = contextDomain;
		contextDomain = newContextDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN, oldContextDomain, newContextDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextDomain(JNIDomainInArrayNotation newContextDomain) {
		if (newContextDomain != contextDomain) {
			NotificationChain msgs = null;
			if (contextDomain != null)
				msgs = ((InternalEObject)contextDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN, null, msgs);
			if (newContextDomain != null)
				msgs = ((InternalEObject)newContextDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN, null, msgs);
			msgs = basicSetContextDomain(newContextDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN, newContextDomain, newContextDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleTreeExpression getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(ScheduleTreeExpression newChild, NotificationChain msgs) {
		ScheduleTreeExpression oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.CONTEXT_EXPRESSION__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(ScheduleTreeExpression newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.CONTEXT_EXPRESSION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.CONTEXT_EXPRESSION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.CONTEXT_EXPRESSION__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN:
				return basicSetContextDomain(null, msgs);
			case TargetmappingPackage.CONTEXT_EXPRESSION__CHILD:
				return basicSetChild(null, msgs);
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
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN:
				return getContextDomain();
			case TargetmappingPackage.CONTEXT_EXPRESSION__CHILD:
				return getChild();
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
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN:
				setContextDomain((JNIDomainInArrayNotation)newValue);
				return;
			case TargetmappingPackage.CONTEXT_EXPRESSION__CHILD:
				setChild((ScheduleTreeExpression)newValue);
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
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN:
				setContextDomain((JNIDomainInArrayNotation)null);
				return;
			case TargetmappingPackage.CONTEXT_EXPRESSION__CHILD:
				setChild((ScheduleTreeExpression)null);
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
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN:
				return contextDomain != null;
			case TargetmappingPackage.CONTEXT_EXPRESSION__CHILD:
				return child != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextExpressionImpl
