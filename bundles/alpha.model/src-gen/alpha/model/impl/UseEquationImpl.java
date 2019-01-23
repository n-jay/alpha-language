/**
 */
package alpha.model.impl;

import alpha.model.AlphaVisitor;
import alpha.model.CalculatorExpression;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.UseEquation;
import alpha.model.UseExpression;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getInstantiationDomainExpr <em>Instantiation Domain Expr</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getSubsystemDims <em>Subsystem Dims</em>}</li>
 *   <li>{@link alpha.model.impl.UseEquationImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseEquationImpl extends MinimalEObjectImpl.Container implements UseEquation {
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
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected UseExpression expr;

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
	public UseExpression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(UseExpression newExpr, NotificationChain msgs) {
		UseExpression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(UseExpression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USE_EQUATION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USE_EQUATION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSet getInstantiationDomain() {
		JNIISLSet _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getInstantiationDomainExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.SET));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getInstantiationDomainExpr().getISLObject();
			_xifexpression = ((JNIISLSet) _iSLObject);
		}
		return _xifexpression;
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
			case ModelPackage.USE_EQUATION__EXPR:
				return basicSetExpr(null, msgs);
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
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR:
				return getInstantiationDomainExpr();
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				return getSubsystemDims();
			case ModelPackage.USE_EQUATION__EXPR:
				return getExpr();
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
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR:
				setInstantiationDomainExpr((CalculatorExpression)newValue);
				return;
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				getSubsystemDims().clear();
				getSubsystemDims().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.USE_EQUATION__EXPR:
				setExpr((UseExpression)newValue);
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
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR:
				setInstantiationDomainExpr((CalculatorExpression)null);
				return;
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				getSubsystemDims().clear();
				return;
			case ModelPackage.USE_EQUATION__EXPR:
				setExpr((UseExpression)null);
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
			case ModelPackage.USE_EQUATION__INSTANTIATION_DOMAIN_EXPR:
				return instantiationDomainExpr != null;
			case ModelPackage.USE_EQUATION__SUBSYSTEM_DIMS:
				return subsystemDims != null && !subsystemDims.isEmpty();
			case ModelPackage.USE_EQUATION__EXPR:
				return expr != null;
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
		result.append(" (subsystemDims: ");
		result.append(subsystemDims);
		result.append(')');
		return result.toString();
	}

} //UseEquationImpl
