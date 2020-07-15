/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.CompileTimeConstantTileSize;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compile Time Constant Tile Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.CompileTimeConstantTileSizeImpl#getTileSizeName <em>Tile Size Name</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.CompileTimeConstantTileSizeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompileTimeConstantTileSizeImpl extends TileSizeSpecificationImpl implements CompileTimeConstantTileSize {
	/**
	 * The default value of the '{@link #getTileSizeName() <em>Tile Size Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSizeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TILE_SIZE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTileSizeName() <em>Tile Size Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSizeName()
	 * @generated
	 * @ordered
	 */
	protected String tileSizeName = TILE_SIZE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected int defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompileTimeConstantTileSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.COMPILE_TIME_CONSTANT_TILE_SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTileSizeName() {
		return tileSizeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTileSizeName(String newTileSizeName) {
		String oldTileSizeName = tileSizeName;
		tileSizeName = newTileSizeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__TILE_SIZE_NAME, oldTileSizeName, tileSizeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(int newDefaultValue) {
		int oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__TILE_SIZE_NAME:
				return getTileSizeName();
			case TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__DEFAULT_VALUE:
				return getDefaultValue();
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
			case TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__TILE_SIZE_NAME:
				setTileSizeName((String)newValue);
				return;
			case TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__DEFAULT_VALUE:
				setDefaultValue((Integer)newValue);
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
			case TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__TILE_SIZE_NAME:
				setTileSizeName(TILE_SIZE_NAME_EDEFAULT);
				return;
			case TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
			case TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__TILE_SIZE_NAME:
				return TILE_SIZE_NAME_EDEFAULT == null ? tileSizeName != null : !TILE_SIZE_NAME_EDEFAULT.equals(tileSizeName);
			case TargetmappingPackage.COMPILE_TIME_CONSTANT_TILE_SIZE__DEFAULT_VALUE:
				return defaultValue != DEFAULT_VALUE_EDEFAULT;
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
		result.append(" (tileSizeName: ");
		result.append(tileSizeName);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //CompileTimeConstantTileSizeImpl
