/**
 */
package alpha.targetmapping.impl;

import alpha.model.JNIDomain;

import alpha.targetmapping.IsolateSpecification;
import alpha.targetmapping.LoopTypeSpecification;
import alpha.targetmapping.TargetmappingPackage;

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
 *   <li>{@link alpha.targetmapping.impl.IsolateSpecificationImpl#getIsolateDomain <em>Isolate Domain</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.IsolateSpecificationImpl#getLoopTypeSpecifications <em>Loop Type Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsolateSpecificationImpl extends MinimalEObjectImpl.Container implements IsolateSpecification {
	/**
	 * The cached value of the '{@link #getIsolateDomain() <em>Isolate Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolateDomain()
	 * @generated
	 * @ordered
	 */
	protected JNIDomain isolateDomain;

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
	public JNIDomain getIsolateDomain() {
		return isolateDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsolateDomain(JNIDomain newIsolateDomain, NotificationChain msgs) {
		JNIDomain oldIsolateDomain = isolateDomain;
		isolateDomain = newIsolateDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN, oldIsolateDomain, newIsolateDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolateDomain(JNIDomain newIsolateDomain) {
		if (newIsolateDomain != isolateDomain) {
			NotificationChain msgs = null;
			if (isolateDomain != null)
				msgs = ((InternalEObject)isolateDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN, null, msgs);
			if (newIsolateDomain != null)
				msgs = ((InternalEObject)newIsolateDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN, null, msgs);
			msgs = basicSetIsolateDomain(newIsolateDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN, newIsolateDomain, newIsolateDomain));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN:
				return basicSetIsolateDomain(null, msgs);
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
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN:
				return getIsolateDomain();
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
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN:
				setIsolateDomain((JNIDomain)newValue);
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
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN:
				setIsolateDomain((JNIDomain)null);
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
			case TargetmappingPackage.ISOLATE_SPECIFICATION__ISOLATE_DOMAIN:
				return isolateDomain != null;
			case TargetmappingPackage.ISOLATE_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				return loopTypeSpecifications != null && !loopTypeSpecifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IsolateSpecificationImpl
