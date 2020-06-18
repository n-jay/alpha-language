/**
 */
package alpha.targetmapping.impl;

import alpha.model.AlphaScheduleTarget;
import alpha.model.JNIDomainInArrayNotation;

import alpha.targetmapping.ScheduleTargetRestrictDomain;
import alpha.targetmapping.TargetmappingPackage;

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
 * An implementation of the model object '<em><b>Schedule Target Restrict Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.ScheduleTargetRestrictDomainImpl#getScheduleTarget <em>Schedule Target</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.ScheduleTargetRestrictDomainImpl#getIndexNames <em>Index Names</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.ScheduleTargetRestrictDomainImpl#getRestrictDomain <em>Restrict Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleTargetRestrictDomainImpl extends MinimalEObjectImpl.Container implements ScheduleTargetRestrictDomain {
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
	 * The cached value of the '{@link #getIndexNames() <em>Index Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> indexNames;

	/**
	 * The cached value of the '{@link #getRestrictDomain() <em>Restrict Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictDomain()
	 * @generated
	 * @ordered
	 */
	protected JNIDomainInArrayNotation restrictDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleTargetRestrictDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.SCHEDULE_TARGET_RESTRICT_DOMAIN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__SCHEDULE_TARGET, oldScheduleTarget, scheduleTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__SCHEDULE_TARGET, oldScheduleTarget, scheduleTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIndexNames() {
		if (indexNames == null) {
			indexNames = new EDataTypeEList<String>(String.class, this, TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__INDEX_NAMES);
		}
		return indexNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIDomainInArrayNotation getRestrictDomain() {
		return restrictDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestrictDomain(JNIDomainInArrayNotation newRestrictDomain, NotificationChain msgs) {
		JNIDomainInArrayNotation oldRestrictDomain = restrictDomain;
		restrictDomain = newRestrictDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN, oldRestrictDomain, newRestrictDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictDomain(JNIDomainInArrayNotation newRestrictDomain) {
		if (newRestrictDomain != restrictDomain) {
			NotificationChain msgs = null;
			if (restrictDomain != null)
				msgs = ((InternalEObject)restrictDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN, null, msgs);
			if (newRestrictDomain != null)
				msgs = ((InternalEObject)newRestrictDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN, null, msgs);
			msgs = basicSetRestrictDomain(newRestrictDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN, newRestrictDomain, newRestrictDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN:
				return basicSetRestrictDomain(null, msgs);
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
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__SCHEDULE_TARGET:
				if (resolve) return getScheduleTarget();
				return basicGetScheduleTarget();
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__INDEX_NAMES:
				return getIndexNames();
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN:
				return getRestrictDomain();
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
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__SCHEDULE_TARGET:
				setScheduleTarget((AlphaScheduleTarget)newValue);
				return;
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__INDEX_NAMES:
				getIndexNames().clear();
				getIndexNames().addAll((Collection<? extends String>)newValue);
				return;
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN:
				setRestrictDomain((JNIDomainInArrayNotation)newValue);
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
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__SCHEDULE_TARGET:
				setScheduleTarget((AlphaScheduleTarget)null);
				return;
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__INDEX_NAMES:
				getIndexNames().clear();
				return;
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN:
				setRestrictDomain((JNIDomainInArrayNotation)null);
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
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__SCHEDULE_TARGET:
				return scheduleTarget != null;
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__INDEX_NAMES:
				return indexNames != null && !indexNames.isEmpty();
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN__RESTRICT_DOMAIN:
				return restrictDomain != null;
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
		result.append(" (indexNames: ");
		result.append(indexNames);
		result.append(')');
		return result.toString();
	}

} //ScheduleTargetRestrictDomainImpl
