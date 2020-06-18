/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.BandPieceForReductionBody;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Band Piece For Reduction Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.BandPieceForReductionBodyImpl#getReductionInitialization <em>Reduction Initialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BandPieceForReductionBodyImpl extends BandPieceImpl implements BandPieceForReductionBody {
	/**
	 * The default value of the '{@link #getReductionInitialization() <em>Reduction Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final String REDUCTION_INITIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReductionInitialization() <em>Reduction Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionInitialization()
	 * @generated
	 * @ordered
	 */
	protected String reductionInitialization = REDUCTION_INITIALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BandPieceForReductionBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.BAND_PIECE_FOR_REDUCTION_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReductionInitialization() {
		return reductionInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReductionInitialization(String newReductionInitialization) {
		String oldReductionInitialization = reductionInitialization;
		reductionInitialization = newReductionInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_PIECE_FOR_REDUCTION_BODY__REDUCTION_INITIALIZATION, oldReductionInitialization, reductionInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetmappingPackage.BAND_PIECE_FOR_REDUCTION_BODY__REDUCTION_INITIALIZATION:
				return getReductionInitialization();
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
			case TargetmappingPackage.BAND_PIECE_FOR_REDUCTION_BODY__REDUCTION_INITIALIZATION:
				setReductionInitialization((String)newValue);
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
			case TargetmappingPackage.BAND_PIECE_FOR_REDUCTION_BODY__REDUCTION_INITIALIZATION:
				setReductionInitialization(REDUCTION_INITIALIZATION_EDEFAULT);
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
			case TargetmappingPackage.BAND_PIECE_FOR_REDUCTION_BODY__REDUCTION_INITIALIZATION:
				return REDUCTION_INITIALIZATION_EDEFAULT == null ? reductionInitialization != null : !REDUCTION_INITIALIZATION_EDEFAULT.equals(reductionInitialization);
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
		result.append(" (reductionInitialization: ");
		result.append(reductionInitialization);
		result.append(')');
		return result.toString();
	}

} //BandPieceForReductionBodyImpl
