/**
 */
package alpha.targetmapping.impl;

import alpha.model.JNIFunctionInArrayNotation;

import alpha.targetmapping.BandPiece;
import alpha.targetmapping.ScheduleTargetRestrictDomain;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Band Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.BandPieceImpl#getPieceDomain <em>Piece Domain</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.BandPieceImpl#getPartialSchedule <em>Partial Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BandPieceImpl extends MinimalEObjectImpl.Container implements BandPiece {
	/**
	 * The cached value of the '{@link #getPieceDomain() <em>Piece Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieceDomain()
	 * @generated
	 * @ordered
	 */
	protected ScheduleTargetRestrictDomain pieceDomain;

	/**
	 * The cached value of the '{@link #getPartialSchedule() <em>Partial Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialSchedule()
	 * @generated
	 * @ordered
	 */
	protected JNIFunctionInArrayNotation partialSchedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BandPieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.BAND_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleTargetRestrictDomain getPieceDomain() {
		return pieceDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPieceDomain(ScheduleTargetRestrictDomain newPieceDomain, NotificationChain msgs) {
		ScheduleTargetRestrictDomain oldPieceDomain = pieceDomain;
		pieceDomain = newPieceDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_PIECE__PIECE_DOMAIN, oldPieceDomain, newPieceDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPieceDomain(ScheduleTargetRestrictDomain newPieceDomain) {
		if (newPieceDomain != pieceDomain) {
			NotificationChain msgs = null;
			if (pieceDomain != null)
				msgs = ((InternalEObject)pieceDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_PIECE__PIECE_DOMAIN, null, msgs);
			if (newPieceDomain != null)
				msgs = ((InternalEObject)newPieceDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_PIECE__PIECE_DOMAIN, null, msgs);
			msgs = basicSetPieceDomain(newPieceDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_PIECE__PIECE_DOMAIN, newPieceDomain, newPieceDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIFunctionInArrayNotation getPartialSchedule() {
		return partialSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartialSchedule(JNIFunctionInArrayNotation newPartialSchedule, NotificationChain msgs) {
		JNIFunctionInArrayNotation oldPartialSchedule = partialSchedule;
		partialSchedule = newPartialSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE, oldPartialSchedule, newPartialSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartialSchedule(JNIFunctionInArrayNotation newPartialSchedule) {
		if (newPartialSchedule != partialSchedule) {
			NotificationChain msgs = null;
			if (partialSchedule != null)
				msgs = ((InternalEObject)partialSchedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE, null, msgs);
			if (newPartialSchedule != null)
				msgs = ((InternalEObject)newPartialSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE, null, msgs);
			msgs = basicSetPartialSchedule(newPartialSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE, newPartialSchedule, newPartialSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.BAND_PIECE__PIECE_DOMAIN:
				return basicSetPieceDomain(null, msgs);
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE:
				return basicSetPartialSchedule(null, msgs);
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
			case TargetmappingPackage.BAND_PIECE__PIECE_DOMAIN:
				return getPieceDomain();
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE:
				return getPartialSchedule();
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
			case TargetmappingPackage.BAND_PIECE__PIECE_DOMAIN:
				setPieceDomain((ScheduleTargetRestrictDomain)newValue);
				return;
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE:
				setPartialSchedule((JNIFunctionInArrayNotation)newValue);
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
			case TargetmappingPackage.BAND_PIECE__PIECE_DOMAIN:
				setPieceDomain((ScheduleTargetRestrictDomain)null);
				return;
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE:
				setPartialSchedule((JNIFunctionInArrayNotation)null);
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
			case TargetmappingPackage.BAND_PIECE__PIECE_DOMAIN:
				return pieceDomain != null;
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE:
				return partialSchedule != null;
		}
		return super.eIsSet(featureID);
	}

} //BandPieceImpl
