/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.ISLLoopTypeSpecification;
import alpha.targetmapping.TargetmappingPackage;

import fr.irisa.cairn.jnimap.isl.ISLASTLoopType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISL Loop Type Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.ISLLoopTypeSpecificationImpl#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISLLoopTypeSpecificationImpl extends LoopTypeSpecificationImpl implements ISLLoopTypeSpecification {
	/**
	 * The default value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopType()
	 * @generated
	 * @ordered
	 */
	protected static final ISLASTLoopType LOOP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopType()
	 * @generated
	 * @ordered
	 */
	protected ISLASTLoopType loopType = LOOP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISLLoopTypeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.ISL_LOOP_TYPE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLASTLoopType getLoopType() {
		return loopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopType(ISLASTLoopType newLoopType) {
		ISLASTLoopType oldLoopType = loopType;
		loopType = newLoopType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.ISL_LOOP_TYPE_SPECIFICATION__LOOP_TYPE, oldLoopType, loopType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return this.getLoopType().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetmappingPackage.ISL_LOOP_TYPE_SPECIFICATION__LOOP_TYPE:
				return getLoopType();
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
			case TargetmappingPackage.ISL_LOOP_TYPE_SPECIFICATION__LOOP_TYPE:
				setLoopType((ISLASTLoopType)newValue);
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
			case TargetmappingPackage.ISL_LOOP_TYPE_SPECIFICATION__LOOP_TYPE:
				setLoopType(LOOP_TYPE_EDEFAULT);
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
			case TargetmappingPackage.ISL_LOOP_TYPE_SPECIFICATION__LOOP_TYPE:
				return LOOP_TYPE_EDEFAULT == null ? loopType != null : !LOOP_TYPE_EDEFAULT.equals(loopType);
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
		result.append(" (loopType: ");
		result.append(loopType);
		result.append(')');
		return result.toString();
	}

} //ISLLoopTypeSpecificationImpl
