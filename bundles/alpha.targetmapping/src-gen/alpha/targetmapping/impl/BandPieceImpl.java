/**
 */
package alpha.targetmapping.impl;

import alpha.model.JNIFunction;
import alpha.model.POLY_OBJECT_TYPE;

import alpha.targetmapping.BandPiece;
import alpha.targetmapping.ScheduleTargetRestrictDomain;
import alpha.targetmapping.TargetmappingPackage;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.ISLMultiAff;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

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
 *   <li>{@link alpha.targetmapping.impl.BandPieceImpl#getPartialScheduleExpr <em>Partial Schedule Expr</em>}</li>
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
	 * The cached value of the '{@link #getPartialScheduleExpr() <em>Partial Schedule Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialScheduleExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIFunction partialScheduleExpr;

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
	public JNIFunction getPartialScheduleExpr() {
		return partialScheduleExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartialScheduleExpr(JNIFunction newPartialScheduleExpr, NotificationChain msgs) {
		JNIFunction oldPartialScheduleExpr = partialScheduleExpr;
		partialScheduleExpr = newPartialScheduleExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE_EXPR, oldPartialScheduleExpr, newPartialScheduleExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartialScheduleExpr(JNIFunction newPartialScheduleExpr) {
		if (newPartialScheduleExpr != partialScheduleExpr) {
			NotificationChain msgs = null;
			if (partialScheduleExpr != null)
				msgs = ((InternalEObject)partialScheduleExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE_EXPR, null, msgs);
			if (newPartialScheduleExpr != null)
				msgs = ((InternalEObject)newPartialScheduleExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE_EXPR, null, msgs);
			msgs = basicSetPartialScheduleExpr(newPartialScheduleExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE_EXPR, newPartialScheduleExpr, newPartialScheduleExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLMultiAff getPartialSchedule() {
		ISLMultiAff _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getPartialScheduleExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.FUNCTION));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getPartialScheduleExpr().getISLObject();
			_xifexpression = ((ISLMultiAff) _iSLObject);
		}
		return _xifexpression;
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
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE_EXPR:
				return basicSetPartialScheduleExpr(null, msgs);
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
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE_EXPR:
				return getPartialScheduleExpr();
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
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE_EXPR:
				setPartialScheduleExpr((JNIFunction)newValue);
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
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE_EXPR:
				setPartialScheduleExpr((JNIFunction)null);
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
			case TargetmappingPackage.BAND_PIECE__PARTIAL_SCHEDULE_EXPR:
				return partialScheduleExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //BandPieceImpl
