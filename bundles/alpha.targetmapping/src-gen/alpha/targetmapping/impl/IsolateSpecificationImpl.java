/**
 */
package alpha.targetmapping.impl;

import alpha.model.JNIDomain;
import alpha.model.POLY_OBJECT_TYPE;

import alpha.targetmapping.IsolateSpecification;
import alpha.targetmapping.LoopTypeSpecification;
import alpha.targetmapping.TargetmappingPackage;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.ISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

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
 * An implementation of the model object '<em><b>Isolate Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.IsolateSpecificationImpl#getIsolateDomainExpr <em>Isolate Domain Expr</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.IsolateSpecificationImpl#getLoopTypeSpecifications <em>Loop Type Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsolateSpecificationImpl extends MinimalEObjectImpl.Container implements IsolateSpecification {
	/**
	 * The cached value of the '{@link #getIsolateDomainExpr() <em>Isolate Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolateDomainExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIDomain isolateDomainExpr;

	/**
	 * The cached value of the '{@link #getLoopTypeSpecifications() <em>Loop Type Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopTypeSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<LoopTypeSpecification> loopTypeSpecifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsolateSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.ISOLATE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIDomain getIsolateDomainExpr() {
		return isolateDomainExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsolateDomainExpr(JNIDomain newIsolateDomainExpr, NotificationChain msgs) {
		JNIDomain oldIsolateDomainExpr = isolateDomainExpr;
		isolateDomainExpr = newIsolateDomainExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR, oldIsolateDomainExpr, newIsolateDomainExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolateDomainExpr(JNIDomain newIsolateDomainExpr) {
		if (newIsolateDomainExpr != isolateDomainExpr) {
			NotificationChain msgs = null;
			if (isolateDomainExpr != null)
				msgs = ((InternalEObject)isolateDomainExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR, null, msgs);
			if (newIsolateDomainExpr != null)
				msgs = ((InternalEObject)newIsolateDomainExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR, null, msgs);
			msgs = basicSetIsolateDomainExpr(newIsolateDomainExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR, newIsolateDomainExpr, newIsolateDomainExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopTypeSpecification> getLoopTypeSpecifications() {
		if (loopTypeSpecifications == null) {
			loopTypeSpecifications = new EObjectContainmentEList<LoopTypeSpecification>(LoopTypeSpecification.class, this, TargetmappingPackage.ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS);
		}
		return loopTypeSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLSet getIsolateDomain() {
		ISLSet _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getIsolateDomainExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.SET));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getIsolateDomainExpr().getISLObject();
			_xifexpression = ((ISLSet) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR:
				return basicSetIsolateDomainExpr(null, msgs);
			case TargetmappingPackage.ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				return ((InternalEList<?>)getLoopTypeSpecifications()).basicRemove(otherEnd, msgs);
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
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR:
				return getIsolateDomainExpr();
			case TargetmappingPackage.ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				return getLoopTypeSpecifications();
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
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR:
				setIsolateDomainExpr((JNIDomain)newValue);
				return;
			case TargetmappingPackage.ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				getLoopTypeSpecifications().clear();
				getLoopTypeSpecifications().addAll((Collection<? extends LoopTypeSpecification>)newValue);
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
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR:
				setIsolateDomainExpr((JNIDomain)null);
				return;
			case TargetmappingPackage.ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				getLoopTypeSpecifications().clear();
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
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN_EXPR:
				return isolateDomainExpr != null;
			case TargetmappingPackage.ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				return loopTypeSpecifications != null && !loopTypeSpecifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IsolateSpecificationImpl
