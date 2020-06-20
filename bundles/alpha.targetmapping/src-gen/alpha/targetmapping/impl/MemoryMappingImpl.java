/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.MemoryMapping;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.MemoryMappingImpl#getMemorySpaceName <em>Memory Space Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryMappingImpl extends AbstractMappingImpl implements MemoryMapping {
	/**
	 * The default value of the '{@link #getMemorySpaceName() <em>Memory Space Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySpaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_SPACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemorySpaceName() <em>Memory Space Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySpaceName()
	 * @generated
	 * @ordered
	 */
	protected String memorySpaceName = MEMORY_SPACE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.MEMORY_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemorySpaceName() {
		return memorySpaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySpaceName(String newMemorySpaceName) {
		String oldMemorySpaceName = memorySpaceName;
		memorySpaceName = newMemorySpaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.MEMORY_MAPPING__MEMORY_SPACE_NAME, oldMemorySpaceName, memorySpaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetmappingPackage.MEMORY_MAPPING__MEMORY_SPACE_NAME:
				return getMemorySpaceName();
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
			case TargetmappingPackage.MEMORY_MAPPING__MEMORY_SPACE_NAME:
				setMemorySpaceName((String)newValue);
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
			case TargetmappingPackage.MEMORY_MAPPING__MEMORY_SPACE_NAME:
				setMemorySpaceName(MEMORY_SPACE_NAME_EDEFAULT);
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
			case TargetmappingPackage.MEMORY_MAPPING__MEMORY_SPACE_NAME:
				return MEMORY_SPACE_NAME_EDEFAULT == null ? memorySpaceName != null : !MEMORY_SPACE_NAME_EDEFAULT.equals(memorySpaceName);
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
		result.append(" (memorySpaceName: ");
		result.append(memorySpaceName);
		result.append(')');
		return result.toString();
	}

} //MemoryMappingImpl
