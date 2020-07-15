/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.TILING_TYPE;
import alpha.targetmapping.TargetmappingPackage;
import alpha.targetmapping.TileLoopSpecification;
import alpha.targetmapping.TileSizeSpecification;
import alpha.targetmapping.TilingSpecification;

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
 * An implementation of the model object '<em><b>Tile Loop Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.TileLoopSpecificationImpl#isParallel <em>Parallel</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.TileLoopSpecificationImpl#getTilingType <em>Tiling Type</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.TileLoopSpecificationImpl#getTileSizeSpecifications <em>Tile Size Specifications</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.TileLoopSpecificationImpl#getTilingSpecification <em>Tiling Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileLoopSpecificationImpl extends TilingSpecificationImpl implements TileLoopSpecification {
	/**
	 * The default value of the '{@link #isParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected boolean parallel = PARALLEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTilingType() <em>Tiling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilingType()
	 * @generated
	 * @ordered
	 */
	protected static final TILING_TYPE TILING_TYPE_EDEFAULT = TILING_TYPE.FIXED;

	/**
	 * The cached value of the '{@link #getTilingType() <em>Tiling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilingType()
	 * @generated
	 * @ordered
	 */
	protected TILING_TYPE tilingType = TILING_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTileSizeSpecifications() <em>Tile Size Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSizeSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<TileSizeSpecification> tileSizeSpecifications;

	/**
	 * The cached value of the '{@link #getTilingSpecification() <em>Tiling Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilingSpecification()
	 * @generated
	 * @ordered
	 */
	protected TilingSpecification tilingSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileLoopSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.TILE_LOOP_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallel(boolean newParallel) {
		boolean oldParallel = parallel;
		parallel = newParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TILE_LOOP_SPECIFICATION__PARALLEL, oldParallel, parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TILING_TYPE getTilingType() {
		return tilingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilingType(TILING_TYPE newTilingType) {
		TILING_TYPE oldTilingType = tilingType;
		tilingType = newTilingType == null ? TILING_TYPE_EDEFAULT : newTilingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_TYPE, oldTilingType, tilingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TileSizeSpecification> getTileSizeSpecifications() {
		if (tileSizeSpecifications == null) {
			tileSizeSpecifications = new EObjectContainmentEList<TileSizeSpecification>(TileSizeSpecification.class, this, TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILE_SIZE_SPECIFICATIONS);
		}
		return tileSizeSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilingSpecification getTilingSpecification() {
		return tilingSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTilingSpecification(TilingSpecification newTilingSpecification, NotificationChain msgs) {
		TilingSpecification oldTilingSpecification = tilingSpecification;
		tilingSpecification = newTilingSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_SPECIFICATION, oldTilingSpecification, newTilingSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTilingSpecification(TilingSpecification newTilingSpecification) {
		if (newTilingSpecification != tilingSpecification) {
			NotificationChain msgs = null;
			if (tilingSpecification != null)
				msgs = ((InternalEObject)tilingSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_SPECIFICATION, null, msgs);
			if (newTilingSpecification != null)
				msgs = ((InternalEObject)newTilingSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_SPECIFICATION, null, msgs);
			msgs = basicSetTilingSpecification(newTilingSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_SPECIFICATION, newTilingSpecification, newTilingSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILE_SIZE_SPECIFICATIONS:
				return ((InternalEList<?>)getTileSizeSpecifications()).basicRemove(otherEnd, msgs);
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_SPECIFICATION:
				return basicSetTilingSpecification(null, msgs);
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
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__PARALLEL:
				return isParallel();
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_TYPE:
				return getTilingType();
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILE_SIZE_SPECIFICATIONS:
				return getTileSizeSpecifications();
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_SPECIFICATION:
				return getTilingSpecification();
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
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__PARALLEL:
				setParallel((Boolean)newValue);
				return;
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_TYPE:
				setTilingType((TILING_TYPE)newValue);
				return;
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILE_SIZE_SPECIFICATIONS:
				getTileSizeSpecifications().clear();
				getTileSizeSpecifications().addAll((Collection<? extends TileSizeSpecification>)newValue);
				return;
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_SPECIFICATION:
				setTilingSpecification((TilingSpecification)newValue);
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
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__PARALLEL:
				setParallel(PARALLEL_EDEFAULT);
				return;
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_TYPE:
				setTilingType(TILING_TYPE_EDEFAULT);
				return;
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILE_SIZE_SPECIFICATIONS:
				getTileSizeSpecifications().clear();
				return;
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_SPECIFICATION:
				setTilingSpecification((TilingSpecification)null);
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
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__PARALLEL:
				return parallel != PARALLEL_EDEFAULT;
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_TYPE:
				return tilingType != TILING_TYPE_EDEFAULT;
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILE_SIZE_SPECIFICATIONS:
				return tileSizeSpecifications != null && !tileSizeSpecifications.isEmpty();
			case TargetmappingPackage.TILE_LOOP_SPECIFICATION__TILING_SPECIFICATION:
				return tilingSpecification != null;
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
		result.append(" (parallel: ");
		result.append(parallel);
		result.append(", tilingType: ");
		result.append(tilingType);
		result.append(')');
		return result.toString();
	}

} //TileLoopSpecificationImpl
