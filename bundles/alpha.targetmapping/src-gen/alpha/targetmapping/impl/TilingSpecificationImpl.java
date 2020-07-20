/**
 */
package alpha.targetmapping.impl;

import alpha.model.JNIFunction;
import alpha.model.POLY_OBJECT_TYPE;

import alpha.targetmapping.TargetmappingPackage;
import alpha.targetmapping.TilingSpecification;

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
 * An implementation of the model object '<em><b>Tiling Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.TilingSpecificationImpl#getLoopScheduleExpr <em>Loop Schedule Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TilingSpecificationImpl extends MinimalEObjectImpl.Container implements TilingSpecification {
	/**
	 * The cached value of the '{@link #getLoopScheduleExpr() <em>Loop Schedule Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopScheduleExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIFunction loopScheduleExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TilingSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.TILING_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIFunction getLoopScheduleExpr() {
		return loopScheduleExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopScheduleExpr(JNIFunction newLoopScheduleExpr, NotificationChain msgs) {
		JNIFunction oldLoopScheduleExpr = loopScheduleExpr;
		loopScheduleExpr = newLoopScheduleExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TILING_SPECIFICATION__LOOP_SCHEDULE_EXPR, oldLoopScheduleExpr, newLoopScheduleExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopScheduleExpr(JNIFunction newLoopScheduleExpr) {
		if (newLoopScheduleExpr != loopScheduleExpr) {
			NotificationChain msgs = null;
			if (loopScheduleExpr != null)
				msgs = ((InternalEObject)loopScheduleExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TILING_SPECIFICATION__LOOP_SCHEDULE_EXPR, null, msgs);
			if (newLoopScheduleExpr != null)
				msgs = ((InternalEObject)newLoopScheduleExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TILING_SPECIFICATION__LOOP_SCHEDULE_EXPR, null, msgs);
			msgs = basicSetLoopScheduleExpr(newLoopScheduleExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TILING_SPECIFICATION__LOOP_SCHEDULE_EXPR, newLoopScheduleExpr, newLoopScheduleExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLMultiAff getLoopSchedule() {
		ISLMultiAff _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getLoopScheduleExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.FUNCTION));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getLoopScheduleExpr().getISLObject();
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
			case TargetmappingPackage.TILING_SPECIFICATION__LOOP_SCHEDULE_EXPR:
				return basicSetLoopScheduleExpr(null, msgs);
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
			case TargetmappingPackage.TILING_SPECIFICATION__LOOP_SCHEDULE_EXPR:
				return getLoopScheduleExpr();
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
			case TargetmappingPackage.TILING_SPECIFICATION__LOOP_SCHEDULE_EXPR:
				setLoopScheduleExpr((JNIFunction)newValue);
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
			case TargetmappingPackage.TILING_SPECIFICATION__LOOP_SCHEDULE_EXPR:
				setLoopScheduleExpr((JNIFunction)null);
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
			case TargetmappingPackage.TILING_SPECIFICATION__LOOP_SCHEDULE_EXPR:
				return loopScheduleExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //TilingSpecificationImpl
