/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.ALPHA_LOOP_TYPE;
import alpha.targetmapping.AlphaLoopTypeSpecification;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Loop Type Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.AlphaLoopTypeSpecificationImpl#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaLoopTypeSpecificationImpl extends LoopTypeSpecificationImpl implements AlphaLoopTypeSpecification {
	/**
	 * The default value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopType()
	 * @generated
	 * @ordered
	 */
	protected static final ALPHA_LOOP_TYPE LOOP_TYPE_EDEFAULT = ALPHA_LOOP_TYPE.PARALLEL;

	/**
	 * The cached value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopType()
	 * @generated
	 * @ordered
	 */
	protected ALPHA_LOOP_TYPE loopType = LOOP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaLoopTypeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.ALPHA_LOOP_TYPE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALPHA_LOOP_TYPE getLoopType() {
		return loopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopType(ALPHA_LOOP_TYPE newLoopType) {
		ALPHA_LOOP_TYPE oldLoopType = loopType;
		loopType = newLoopType == null ? LOOP_TYPE_EDEFAULT : newLoopType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.ALPHA_LOOP_TYPE_SPECIFICATION__LOOP_TYPE, oldLoopType, loopType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return this.getLoopType().getLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetmappingPackage.ALPHA_LOOP_TYPE_SPECIFICATION__LOOP_TYPE:
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
			case TargetmappingPackage.ALPHA_LOOP_TYPE_SPECIFICATION__LOOP_TYPE:
				setLoopType((ALPHA_LOOP_TYPE)newValue);
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
			case TargetmappingPackage.ALPHA_LOOP_TYPE_SPECIFICATION__LOOP_TYPE:
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
			case TargetmappingPackage.ALPHA_LOOP_TYPE_SPECIFICATION__LOOP_TYPE:
				return loopType != LOOP_TYPE_EDEFAULT;
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

} //AlphaLoopTypeSpecificationImpl
