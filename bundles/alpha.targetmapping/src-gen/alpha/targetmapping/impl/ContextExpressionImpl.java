/**
 */
package alpha.targetmapping.impl;

import alpha.model.JNIDomainInArrayNotation;
import alpha.model.POLY_OBJECT_TYPE;

import alpha.targetmapping.ContextExpression;
import alpha.targetmapping.ScheduleTreeExpression;
import alpha.targetmapping.TargetMappingVisitor;
import alpha.targetmapping.TargetmappingPackage;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.ISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

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
 *   <li>{@link alpha.targetmapping.impl.ContextExpressionImpl#getContextDomainExpr <em>Context Domain Expr</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.ContextExpressionImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextExpressionImpl extends ScheduleTreeExpressionImpl implements ContextExpression {
	/**
	 * The cached value of the '{@link #getContextDomainExpr() <em>Context Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextDomainExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIDomainInArrayNotation contextDomainExpr;

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
	public JNIDomainInArrayNotation getContextDomainExpr() {
		return contextDomainExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextDomainExpr(JNIDomainInArrayNotation newContextDomainExpr, NotificationChain msgs) {
		JNIDomainInArrayNotation oldContextDomainExpr = contextDomainExpr;
		contextDomainExpr = newContextDomainExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR, oldContextDomainExpr, newContextDomainExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextDomainExpr(JNIDomainInArrayNotation newContextDomainExpr) {
		if (newContextDomainExpr != contextDomainExpr) {
			NotificationChain msgs = null;
			if (contextDomainExpr != null)
				msgs = ((InternalEObject)contextDomainExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR, null, msgs);
			if (newContextDomainExpr != null)
				msgs = ((InternalEObject)newContextDomainExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR, null, msgs);
			msgs = basicSetContextDomainExpr(newContextDomainExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR, newContextDomainExpr, newContextDomainExpr));
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
	public ISLSet getContextDomain() {
		ISLSet _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getContextDomainExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.SET));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getContextDomainExpr().getISLObject();
			_xifexpression = ((ISLSet) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final TargetMappingVisitor visitor) {
		visitor.visitContextExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR:
				return basicSetContextDomainExpr(null, msgs);
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
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR:
				return getContextDomainExpr();
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
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR:
				setContextDomainExpr((JNIDomainInArrayNotation)newValue);
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
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR:
				setContextDomainExpr((JNIDomainInArrayNotation)null);
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
			case TargetmappingPackage.CONTEXT_EXPRESSION__CONTEXT_DOMAIN_EXPR:
				return contextDomainExpr != null;
			case TargetmappingPackage.CONTEXT_EXPRESSION__CHILD:
				return child != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextExpressionImpl
