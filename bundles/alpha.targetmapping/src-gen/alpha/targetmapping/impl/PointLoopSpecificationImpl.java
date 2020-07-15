/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.IsolateSpecification;
import alpha.targetmapping.LoopTypeSpecification;
import alpha.targetmapping.PointLoopSpecification;
import alpha.targetmapping.TargetmappingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Loop Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.PointLoopSpecificationImpl#getLoopTypeSpecifications <em>Loop Type Specifications</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.PointLoopSpecificationImpl#getIsolateSpecification <em>Isolate Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointLoopSpecificationImpl extends TilingSpecificationImpl implements PointLoopSpecification {
	/**
	 * The cached value of the '{@link #getLoopTypeSpecifications() <em>Loop Type Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopTypeSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<LoopTypeSpecification> loopTypeSpecifications;

	/**
	 * The cached value of the '{@link #getIsolateSpecification() <em>Isolate Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolateSpecification()
	 * @generated
	 * @ordered
	 */
	protected IsolateSpecification isolateSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointLoopSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.POINT_LOOP_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopTypeSpecification> getLoopTypeSpecifications() {
		if (loopTypeSpecifications == null) {
			loopTypeSpecifications = new EObjectContainmentEList<LoopTypeSpecification>(LoopTypeSpecification.class, this, TargetmappingPackage.POINT_LOOP_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS);
		}
		return loopTypeSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolateSpecification getIsolateSpecification() {
		return isolateSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsolateSpecification(IsolateSpecification newIsolateSpecification, NotificationChain msgs) {
		IsolateSpecification oldIsolateSpecification = isolateSpecification;
		isolateSpecification = newIsolateSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.POINT_LOOP_SPECIFICATION__ISOLATE_SPECIFICATION, oldIsolateSpecification, newIsolateSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolateSpecification(IsolateSpecification newIsolateSpecification) {
		if (newIsolateSpecification != isolateSpecification) {
			NotificationChain msgs = null;
			if (isolateSpecification != null)
				msgs = ((InternalEObject)isolateSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.POINT_LOOP_SPECIFICATION__ISOLATE_SPECIFICATION, null, msgs);
			if (newIsolateSpecification != null)
				msgs = ((InternalEObject)newIsolateSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.POINT_LOOP_SPECIFICATION__ISOLATE_SPECIFICATION, null, msgs);
			msgs = basicSetIsolateSpecification(newIsolateSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.POINT_LOOP_SPECIFICATION__ISOLATE_SPECIFICATION, newIsolateSpecification, newIsolateSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				return ((InternalEList<?>)getLoopTypeSpecifications()).basicRemove(otherEnd, msgs);
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__ISOLATE_SPECIFICATION:
				return basicSetIsolateSpecification(null, msgs);
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
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				return getLoopTypeSpecifications();
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__ISOLATE_SPECIFICATION:
				return getIsolateSpecification();
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
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				getLoopTypeSpecifications().clear();
				getLoopTypeSpecifications().addAll((Collection<? extends LoopTypeSpecification>)newValue);
				return;
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__ISOLATE_SPECIFICATION:
				setIsolateSpecification((IsolateSpecification)newValue);
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
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				getLoopTypeSpecifications().clear();
				return;
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__ISOLATE_SPECIFICATION:
				setIsolateSpecification((IsolateSpecification)null);
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
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__LOOP_TYPE_SPECIFICATIONS:
				return loopTypeSpecifications != null && !loopTypeSpecifications.isEmpty();
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__ISOLATE_SPECIFICATION:
				return isolateSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //PointLoopSpecificationImpl
