/**
 */
package alpha.targetmapping.impl;

import alpha.model.AlphaScheduleTarget;
import alpha.model.JNIFunction;

import alpha.targetmapping.AbstractMapping;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.AbstractMappingImpl#getScheduleTarget <em>Schedule Target</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.AbstractMappingImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractMappingImpl extends MinimalEObjectImpl.Container implements AbstractMapping {
	/**
	 * The cached value of the '{@link #getScheduleTarget() <em>Schedule Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleTarget()
	 * @generated
	 * @ordered
	 */
	protected AlphaScheduleTarget scheduleTarget;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected JNIFunction mapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.ABSTRACT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaScheduleTarget getScheduleTarget() {
		if (scheduleTarget != null && scheduleTarget.eIsProxy()) {
			InternalEObject oldScheduleTarget = (InternalEObject)scheduleTarget;
			scheduleTarget = (AlphaScheduleTarget)eResolveProxy(oldScheduleTarget);
			if (scheduleTarget != oldScheduleTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetmappingPackage.ABSTRACT_MAPPING__SCHEDULE_TARGET, oldScheduleTarget, scheduleTarget));
			}
		}
		return scheduleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaScheduleTarget basicGetScheduleTarget() {
		return scheduleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleTarget(AlphaScheduleTarget newScheduleTarget) {
		AlphaScheduleTarget oldScheduleTarget = scheduleTarget;
		scheduleTarget = newScheduleTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.ABSTRACT_MAPPING__SCHEDULE_TARGET, oldScheduleTarget, scheduleTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIFunction getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(JNIFunction newMapping, NotificationChain msgs) {
		JNIFunction oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.ABSTRACT_MAPPING__MAPPING, oldMapping, newMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(JNIFunction newMapping) {
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.ABSTRACT_MAPPING__MAPPING, null, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.ABSTRACT_MAPPING__MAPPING, null, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.ABSTRACT_MAPPING__MAPPING, newMapping, newMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.ABSTRACT_MAPPING__MAPPING:
				return basicSetMapping(null, msgs);
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
			case TargetmappingPackage.ABSTRACT_MAPPING__SCHEDULE_TARGET:
				if (resolve) return getScheduleTarget();
				return basicGetScheduleTarget();
			case TargetmappingPackage.ABSTRACT_MAPPING__MAPPING:
				return getMapping();
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
			case TargetmappingPackage.ABSTRACT_MAPPING__SCHEDULE_TARGET:
				setScheduleTarget((AlphaScheduleTarget)newValue);
				return;
			case TargetmappingPackage.ABSTRACT_MAPPING__MAPPING:
				setMapping((JNIFunction)newValue);
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
			case TargetmappingPackage.ABSTRACT_MAPPING__SCHEDULE_TARGET:
				setScheduleTarget((AlphaScheduleTarget)null);
				return;
			case TargetmappingPackage.ABSTRACT_MAPPING__MAPPING:
				setMapping((JNIFunction)null);
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
			case TargetmappingPackage.ABSTRACT_MAPPING__SCHEDULE_TARGET:
				return scheduleTarget != null;
			case TargetmappingPackage.ABSTRACT_MAPPING__MAPPING:
				return mapping != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractMappingImpl
