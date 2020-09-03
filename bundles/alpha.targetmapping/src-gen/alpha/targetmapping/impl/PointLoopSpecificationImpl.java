/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.FullTileSpecification;
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
 *   <li>{@link alpha.targetmapping.impl.PointLoopSpecificationImpl#getFullTileSpecification <em>Full Tile Specification</em>}</li>
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
	 * The cached value of the '{@link #getFullTileSpecification() <em>Full Tile Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullTileSpecification()
	 * @generated
	 * @ordered
	 */
	protected FullTileSpecification fullTileSpecification;

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
	public FullTileSpecification getFullTileSpecification() {
		return fullTileSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFullTileSpecification(FullTileSpecification newFullTileSpecification, NotificationChain msgs) {
		FullTileSpecification oldFullTileSpecification = fullTileSpecification;
		fullTileSpecification = newFullTileSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.POINT_LOOP_SPECIFICATION__FULL_TILE_SPECIFICATION, oldFullTileSpecification, newFullTileSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullTileSpecification(FullTileSpecification newFullTileSpecification) {
		if (newFullTileSpecification != fullTileSpecification) {
			NotificationChain msgs = null;
			if (fullTileSpecification != null)
				msgs = ((InternalEObject)fullTileSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.POINT_LOOP_SPECIFICATION__FULL_TILE_SPECIFICATION, null, msgs);
			if (newFullTileSpecification != null)
				msgs = ((InternalEObject)newFullTileSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.POINT_LOOP_SPECIFICATION__FULL_TILE_SPECIFICATION, null, msgs);
			msgs = basicSetFullTileSpecification(newFullTileSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.POINT_LOOP_SPECIFICATION__FULL_TILE_SPECIFICATION, newFullTileSpecification, newFullTileSpecification));
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
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__FULL_TILE_SPECIFICATION:
				return basicSetFullTileSpecification(null, msgs);
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
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__FULL_TILE_SPECIFICATION:
				return getFullTileSpecification();
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
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__FULL_TILE_SPECIFICATION:
				setFullTileSpecification((FullTileSpecification)newValue);
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
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__FULL_TILE_SPECIFICATION:
				setFullTileSpecification((FullTileSpecification)null);
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
			case TargetmappingPackage.POINT_LOOP_SPECIFICATION__FULL_TILE_SPECIFICATION:
				return fullTileSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //PointLoopSpecificationImpl
