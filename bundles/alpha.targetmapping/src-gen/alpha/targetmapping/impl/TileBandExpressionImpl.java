/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.BandPiece;
import alpha.targetmapping.TargetMappingVisitor;
import alpha.targetmapping.TargetmappingPackage;
import alpha.targetmapping.TileBandExpression;
import alpha.targetmapping.TilingSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile Band Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.TileBandExpressionImpl#getBandPieces <em>Band Pieces</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.TileBandExpressionImpl#getScheduleDimensionNames <em>Schedule Dimension Names</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.TileBandExpressionImpl#getTilingSpecification <em>Tiling Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileBandExpressionImpl extends ScheduleTreeExpressionImpl implements TileBandExpression {
	/**
	 * The cached value of the '{@link #getBandPieces() <em>Band Pieces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandPieces()
	 * @generated
	 * @ordered
	 */
	protected EList<BandPiece> bandPieces;

	/**
	 * The cached value of the '{@link #getScheduleDimensionNames() <em>Schedule Dimension Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDimensionNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scheduleDimensionNames;

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
	protected TileBandExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.TILE_BAND_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BandPiece> getBandPieces() {
		if (bandPieces == null) {
			bandPieces = new EObjectContainmentEList<BandPiece>(BandPiece.class, this, TargetmappingPackage.TILE_BAND_EXPRESSION__BAND_PIECES);
		}
		return bandPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getScheduleDimensionNames() {
		if (scheduleDimensionNames == null) {
			scheduleDimensionNames = new EDataTypeEList<String>(String.class, this, TargetmappingPackage.TILE_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES);
		}
		return scheduleDimensionNames;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TILE_BAND_EXPRESSION__TILING_SPECIFICATION, oldTilingSpecification, newTilingSpecification);
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
				msgs = ((InternalEObject)tilingSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TILE_BAND_EXPRESSION__TILING_SPECIFICATION, null, msgs);
			if (newTilingSpecification != null)
				msgs = ((InternalEObject)newTilingSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.TILE_BAND_EXPRESSION__TILING_SPECIFICATION, null, msgs);
			msgs = basicSetTilingSpecification(newTilingSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.TILE_BAND_EXPRESSION__TILING_SPECIFICATION, newTilingSpecification, newTilingSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final TargetMappingVisitor visitor) {
		visitor.visitTileBandExpression(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.TILE_BAND_EXPRESSION__BAND_PIECES:
				return ((InternalEList<?>)getBandPieces()).basicRemove(otherEnd, msgs);
			case TargetmappingPackage.TILE_BAND_EXPRESSION__TILING_SPECIFICATION:
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
			case TargetmappingPackage.TILE_BAND_EXPRESSION__BAND_PIECES:
				return getBandPieces();
			case TargetmappingPackage.TILE_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES:
				return getScheduleDimensionNames();
			case TargetmappingPackage.TILE_BAND_EXPRESSION__TILING_SPECIFICATION:
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
			case TargetmappingPackage.TILE_BAND_EXPRESSION__BAND_PIECES:
				getBandPieces().clear();
				getBandPieces().addAll((Collection<? extends BandPiece>)newValue);
				return;
			case TargetmappingPackage.TILE_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES:
				getScheduleDimensionNames().clear();
				getScheduleDimensionNames().addAll((Collection<? extends String>)newValue);
				return;
			case TargetmappingPackage.TILE_BAND_EXPRESSION__TILING_SPECIFICATION:
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
			case TargetmappingPackage.TILE_BAND_EXPRESSION__BAND_PIECES:
				getBandPieces().clear();
				return;
			case TargetmappingPackage.TILE_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES:
				getScheduleDimensionNames().clear();
				return;
			case TargetmappingPackage.TILE_BAND_EXPRESSION__TILING_SPECIFICATION:
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
			case TargetmappingPackage.TILE_BAND_EXPRESSION__BAND_PIECES:
				return bandPieces != null && !bandPieces.isEmpty();
			case TargetmappingPackage.TILE_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES:
				return scheduleDimensionNames != null && !scheduleDimensionNames.isEmpty();
			case TargetmappingPackage.TILE_BAND_EXPRESSION__TILING_SPECIFICATION:
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
		result.append(" (scheduleDimensionNames: ");
		result.append(scheduleDimensionNames);
		result.append(')');
		return result.toString();
	}

} //TileBandExpressionImpl
