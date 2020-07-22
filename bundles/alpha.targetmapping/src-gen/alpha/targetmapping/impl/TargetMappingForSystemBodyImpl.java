/**
 */
package alpha.targetmapping.impl;

import alpha.model.SystemBody;

import alpha.targetmapping.ScheduleTreeExpression;
import alpha.targetmapping.TargetMapping;
import alpha.targetmapping.TargetMappingForSystemBody;
import alpha.targetmapping.TargetMappingVisitor;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Mapping For System Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.TargetMappingForSystemBodyImpl#getTargetBody <em>Target Body</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.TargetMappingForSystemBodyImpl#getTargetMapping <em>Target Mapping</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.TargetMappingForSystemBodyImpl#getScheduleTreeRoot <em>Schedule Tree Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetMappingForSystemBodyImpl extends MinimalEObjectImpl.Container implements TargetMappingForSystemBody {
	/**
	 * The cached value of the '{@link #getTargetBody() <em>Target Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBody()
	 * @generated
	 * @ordered
	 */
	protected SystemBody targetBody;

	/**
	 * The cached value of the '{@link #getScheduleTreeRoot() <em>Schedule Tree Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleTreeRoot()
	 * @generated
	 * @ordered
	 */
	protected ScheduleTreeExpression scheduleTreeRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetMappingForSystemBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.TARGET_MAPPING_FOR_SYSTEM_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemBody getTargetBody() {
		if (targetBody != null && targetBody.eIsProxy()) {
			InternalEObject oldTargetBody = (InternalEObject)targetBody;
			targetBody = (SystemBody)eResolveProxy(oldTargetBody);
			if (targetBody != oldTargetBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_BODY, oldTargetBody, targetBody));
			}
		}
		return targetBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemBody basicGetTargetBody() {
		return targetBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBody(SystemBody newTargetBody) {
		SystemBody oldTargetBody = targetBody;
		targetBody = newTargetBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_BODY, oldTargetBody, targetBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetMapping getTargetMapping() {
		if (eContainerFeatureID() != TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING) return null;
		return (TargetMapping)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetMapping basicGetTargetMapping() {
		if (eContainerFeatureID() != TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING) return null;
		return (TargetMapping)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetMapping(TargetMapping newTargetMapping, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTargetMapping, TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMapping(TargetMapping newTargetMapping) {
		if (newTargetMapping != eInternalContainer() || (eContainerFeatureID() != TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING && newTargetMapping != null)) {
			if (EcoreUtil.isAncestor(this, newTargetMapping))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetMapping != null)
				msgs = ((InternalEObject)newTargetMapping).eInverseAdd(this, TargetmappingPackage.TARGET_MAPPING__SYSTEM_BODY_TMS, TargetMapping.class, msgs);
			msgs = basicSetTargetMapping(newTargetMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING, newTargetMapping, newTargetMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleTreeExpression getScheduleTreeRoot() {
		return scheduleTreeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleTreeRoot(ScheduleTreeExpression newScheduleTreeRoot, NotificationChain msgs) {
		ScheduleTreeExpression oldScheduleTreeRoot = scheduleTreeRoot;
		scheduleTreeRoot = newScheduleTreeRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT, oldScheduleTreeRoot, newScheduleTreeRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleTreeRoot(ScheduleTreeExpression newScheduleTreeRoot) {
		if (newScheduleTreeRoot != scheduleTreeRoot) {
			NotificationChain msgs = null;
			if (scheduleTreeRoot != null)
				msgs = ((InternalEObject)scheduleTreeRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT, null, msgs);
			if (newScheduleTreeRoot != null)
				msgs = ((InternalEObject)newScheduleTreeRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT, null, msgs);
			msgs = basicSetScheduleTreeRoot(newScheduleTreeRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT, newScheduleTreeRoot, newScheduleTreeRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final TargetMappingVisitor visitor) {
		visitor.visitTargetMappingForSystemBody(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTargetMapping((TargetMapping)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING:
				return basicSetTargetMapping(null, msgs);
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT:
				return basicSetScheduleTreeRoot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING:
				return eInternalContainer().eInverseRemove(this, TargetmappingPackage.TARGET_MAPPING__SYSTEM_BODY_TMS, TargetMapping.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_BODY:
				if (resolve) return getTargetBody();
				return basicGetTargetBody();
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING:
				if (resolve) return getTargetMapping();
				return basicGetTargetMapping();
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT:
				return getScheduleTreeRoot();
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
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_BODY:
				setTargetBody((SystemBody)newValue);
				return;
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING:
				setTargetMapping((TargetMapping)newValue);
				return;
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT:
				setScheduleTreeRoot((ScheduleTreeExpression)newValue);
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
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_BODY:
				setTargetBody((SystemBody)null);
				return;
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING:
				setTargetMapping((TargetMapping)null);
				return;
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT:
				setScheduleTreeRoot((ScheduleTreeExpression)null);
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
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_BODY:
				return targetBody != null;
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__TARGET_MAPPING:
				return basicGetTargetMapping() != null;
			case TargetmappingPackage.TARGET_MAPPING_FOR_SYSTEM_BODY__SCHEDULE_TREE_ROOT:
				return scheduleTreeRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetMappingForSystemBodyImpl
