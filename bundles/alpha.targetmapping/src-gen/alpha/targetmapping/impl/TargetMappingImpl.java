/**
 */
package alpha.targetmapping.impl;

import alpha.model.AlphaSystem;

import alpha.targetmapping.MemorySpace;
import alpha.targetmapping.ScheduleTreeExpression;
import alpha.targetmapping.TargetMapping;
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
 * An implementation of the model object '<em><b>Target Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.TargetMappingImpl#getTargetSystem <em>Target System</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.TargetMappingImpl#getScheduleTree <em>Schedule Tree</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.TargetMappingImpl#getMemorySpaces <em>Memory Spaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetMappingImpl extends MinimalEObjectImpl.Container implements TargetMapping {
	/**
	 * The cached value of the '{@link #getTargetSystem() <em>Target System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSystem()
	 * @generated
	 * @ordered
	 */
	protected AlphaSystem targetSystem;

	/**
	 * The cached value of the '{@link #getScheduleTree() <em>Schedule Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleTree()
	 * @generated
	 * @ordered
	 */
	protected ScheduleTreeExpression scheduleTree;

	/**
	 * The cached value of the '{@link #getMemorySpaces() <em>Memory Spaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySpaces()
	 * @generated
	 * @ordered
	 */
	protected EList<MemorySpace> memorySpaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.TARGET_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaSystem getTargetSystem() {
		if (targetSystem != null && targetSystem.eIsProxy()) {
			InternalEObject oldTargetSystem = (InternalEObject)targetSystem;
			targetSystem = (AlphaSystem)eResolveProxy(oldTargetSystem);
			if (targetSystem != oldTargetSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetmappingPackage.TARGET_MAPPING__TARGET_SYSTEM, oldTargetSystem, targetSystem));
			}
		}
		return targetSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaSystem basicGetTargetSystem() {
		return targetSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSystem(AlphaSystem newTargetSystem) {
		AlphaSystem oldTargetSystem = targetSystem;
		targetSystem = newTargetSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TARGET_MAPPING__TARGET_SYSTEM, oldTargetSystem, targetSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleTreeExpression getScheduleTree() {
		return scheduleTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleTree(ScheduleTreeExpression newScheduleTree, NotificationChain msgs) {
		ScheduleTreeExpression oldScheduleTree = scheduleTree;
		scheduleTree = newScheduleTree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TARGET_MAPPING__SCHEDULE_TREE, oldScheduleTree, newScheduleTree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleTree(ScheduleTreeExpression newScheduleTree) {
		if (newScheduleTree != scheduleTree) {
			NotificationChain msgs = null;
			if (scheduleTree != null)
				msgs = ((InternalEObject)scheduleTree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TARGET_MAPPING__SCHEDULE_TREE, null, msgs);
			if (newScheduleTree != null)
				msgs = ((InternalEObject)newScheduleTree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TARGET_MAPPING__SCHEDULE_TREE, null, msgs);
			msgs = basicSetScheduleTree(newScheduleTree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TARGET_MAPPING__SCHEDULE_TREE, newScheduleTree, newScheduleTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemorySpace> getMemorySpaces() {
		if (memorySpaces == null) {
			memorySpaces = new EObjectContainmentEList<MemorySpace>(MemorySpace.class, this, TargetmappingPackage.TARGET_MAPPING__MEMORY_SPACES);
		}
		return memorySpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.TARGET_MAPPING__SCHEDULE_TREE:
				return basicSetScheduleTree(null, msgs);
			case TargetmappingPackage.TARGET_MAPPING__MEMORY_SPACES:
				return ((InternalEList<?>)getMemorySpaces()).basicRemove(otherEnd, msgs);
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
			case TargetmappingPackage.TARGET_MAPPING__TARGET_SYSTEM:
				if (resolve) return getTargetSystem();
				return basicGetTargetSystem();
			case TargetmappingPackage.TARGET_MAPPING__SCHEDULE_TREE:
				return getScheduleTree();
			case TargetmappingPackage.TARGET_MAPPING__MEMORY_SPACES:
				return getMemorySpaces();
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
			case TargetmappingPackage.TARGET_MAPPING__TARGET_SYSTEM:
				setTargetSystem((AlphaSystem)newValue);
				return;
			case TargetmappingPackage.TARGET_MAPPING__SCHEDULE_TREE:
				setScheduleTree((ScheduleTreeExpression)newValue);
				return;
			case TargetmappingPackage.TARGET_MAPPING__MEMORY_SPACES:
				getMemorySpaces().clear();
				getMemorySpaces().addAll((Collection<? extends MemorySpace>)newValue);
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
			case TargetmappingPackage.TARGET_MAPPING__TARGET_SYSTEM:
				setTargetSystem((AlphaSystem)null);
				return;
			case TargetmappingPackage.TARGET_MAPPING__SCHEDULE_TREE:
				setScheduleTree((ScheduleTreeExpression)null);
				return;
			case TargetmappingPackage.TARGET_MAPPING__MEMORY_SPACES:
				getMemorySpaces().clear();
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
			case TargetmappingPackage.TARGET_MAPPING__TARGET_SYSTEM:
				return targetSystem != null;
			case TargetmappingPackage.TARGET_MAPPING__SCHEDULE_TREE:
				return scheduleTree != null;
			case TargetmappingPackage.TARGET_MAPPING__MEMORY_SPACES:
				return memorySpaces != null && !memorySpaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TargetMappingImpl
