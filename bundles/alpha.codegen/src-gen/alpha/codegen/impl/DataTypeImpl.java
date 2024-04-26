/**
 */
package alpha.codegen.impl;

import alpha.codegen.BaseDataType;
import alpha.codegen.CodegenPackage;
import alpha.codegen.DataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.impl.DataTypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link alpha.codegen.impl.DataTypeImpl#getIndirectionLevel <em>Indirection Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType {
	/**
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final BaseDataType BASE_TYPE_EDEFAULT = BaseDataType.VOID;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected BaseDataType baseType = BASE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndirectionLevel() <em>Indirection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirectionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int INDIRECTION_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndirectionLevel() <em>Indirection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirectionLevel()
	 * @generated
	 * @ordered
	 */
	protected int indirectionLevel = INDIRECTION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDataType getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(BaseDataType newBaseType) {
		BaseDataType oldBaseType = baseType;
		baseType = newBaseType == null ? BASE_TYPE_EDEFAULT : newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.DATA_TYPE__BASE_TYPE, oldBaseType, baseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndirectionLevel() {
		return indirectionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndirectionLevel(int newIndirectionLevel) {
		int oldIndirectionLevel = indirectionLevel;
		indirectionLevel = newIndirectionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.DATA_TYPE__INDIRECTION_LEVEL, oldIndirectionLevel, indirectionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.DATA_TYPE__BASE_TYPE:
				return getBaseType();
			case CodegenPackage.DATA_TYPE__INDIRECTION_LEVEL:
				return getIndirectionLevel();
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
			case CodegenPackage.DATA_TYPE__BASE_TYPE:
				setBaseType((BaseDataType)newValue);
				return;
			case CodegenPackage.DATA_TYPE__INDIRECTION_LEVEL:
				setIndirectionLevel((Integer)newValue);
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
			case CodegenPackage.DATA_TYPE__BASE_TYPE:
				setBaseType(BASE_TYPE_EDEFAULT);
				return;
			case CodegenPackage.DATA_TYPE__INDIRECTION_LEVEL:
				setIndirectionLevel(INDIRECTION_LEVEL_EDEFAULT);
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
			case CodegenPackage.DATA_TYPE__BASE_TYPE:
				return baseType != BASE_TYPE_EDEFAULT;
			case CodegenPackage.DATA_TYPE__INDIRECTION_LEVEL:
				return indirectionLevel != INDIRECTION_LEVEL_EDEFAULT;
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
		result.append(" (baseType: ");
		result.append(baseType);
		result.append(", indirectionLevel: ");
		result.append(indirectionLevel);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
