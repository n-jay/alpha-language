/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.AbstractBandExpression;
import alpha.targetmapping.BandPiece;
import alpha.targetmapping.TargetmappingPackage;

import fr.irisa.cairn.jnimap.isl.ISLMultiAff;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Band Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.AbstractBandExpressionImpl#getBandPieces <em>Band Pieces</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.AbstractBandExpressionImpl#getScheduleDimensionNames <em>Schedule Dimension Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractBandExpressionImpl extends ScheduleTreeExpressionImpl implements AbstractBandExpression {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractBandExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.ABSTRACT_BAND_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BandPiece> getBandPieces() {
		if (bandPieces == null) {
			bandPieces = new EObjectContainmentEList<BandPiece>(BandPiece.class, this, TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__BAND_PIECES);
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
			scheduleDimensionNames = new EDataTypeEList<String>(String.class, this, TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES);
		}
		return scheduleDimensionNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int bandSize() {
		final Function1<BandPiece, ISLMultiAff> _function = new Function1<BandPiece, ISLMultiAff>() {
			public ISLMultiAff apply(final BandPiece bp) {
				return bp.getPartialSchedule();
			}
		};
		final Function1<ISLMultiAff, Integer> _function_1 = new Function1<ISLMultiAff, Integer>() {
			public Integer apply(final ISLMultiAff ps) {
				return Integer.valueOf(ps.getNbOutputs());
			}
		};
		final Set<Integer> bandSizes = IterableExtensions.<Integer>toSet(XcoreEListExtensions.<ISLMultiAff, Integer>map(XcoreEListExtensions.<BandPiece, ISLMultiAff>map(this.getBandPieces(), _function), _function_1));
		if (((bandSizes.size() != 1) || ((IterableExtensions.<Integer>head(bandSizes)).intValue() == (-1)))) {
			throw new RuntimeException("This case should not be reached if consistency checks are working properly.");
		}
		return (int) IterableExtensions.<Integer>head(bandSizes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__BAND_PIECES:
				return ((InternalEList<?>)getBandPieces()).basicRemove(otherEnd, msgs);
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
			case TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__BAND_PIECES:
				return getBandPieces();
			case TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES:
				return getScheduleDimensionNames();
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
			case TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__BAND_PIECES:
				getBandPieces().clear();
				getBandPieces().addAll((Collection<? extends BandPiece>)newValue);
				return;
			case TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES:
				getScheduleDimensionNames().clear();
				getScheduleDimensionNames().addAll((Collection<? extends String>)newValue);
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
			case TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__BAND_PIECES:
				getBandPieces().clear();
				return;
			case TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES:
				getScheduleDimensionNames().clear();
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
			case TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__BAND_PIECES:
				return bandPieces != null && !bandPieces.isEmpty();
			case TargetmappingPackage.ABSTRACT_BAND_EXPRESSION__SCHEDULE_DIMENSION_NAMES:
				return scheduleDimensionNames != null && !scheduleDimensionNames.isEmpty();
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

} //AbstractBandExpressionImpl
