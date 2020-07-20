/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Band Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * BandExpression defines a band in ISL ScheduleTree,
 * which is a multi-dimensional ordering of domains that
 * reach the band node. Each BandPiece specifies an affine
 * function for a schedule target, where the RHS is the
 * schedule time stamp. All BandPieces must have the same number
 * of dimensions in its RHS. The space on the RHS of these
 * schedule functions is called the schedule space, and its
 * dimensions may be named with scheduleDimensionNames. These
 * names are used for interpreting array notation in the
 * sub-tree within its scope.
 * 
 * There are two different BandExpressions in TargetMapping:
 *   - BandExpression: the standard one, which directly corresponds to band_node in ISL
 *   - TileBandExpression: a variant to specify (nested) tiling
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.AbstractBandExpression#getBandPieces <em>Band Pieces</em>}</li>
 *   <li>{@link alpha.targetmapping.AbstractBandExpression#getScheduleDimensionNames <em>Schedule Dimension Names</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getAbstractBandExpression()
 * @model abstract="true"
 * @generated
 */
public interface AbstractBandExpression extends ScheduleTreeExpression {
	/**
	 * Returns the value of the '<em><b>Band Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.BandPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band Pieces</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getAbstractBandExpression_BandPieces()
	 * @model containment="true"
	 * @generated
	 */
	EList<BandPiece> getBandPieces();

	/**
	 * Returns the value of the '<em><b>Schedule Dimension Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Dimension Names</em>' attribute list.
	 * @see alpha.targetmapping.TargetmappingPackage#getAbstractBandExpression_ScheduleDimensionNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getScheduleDimensionNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	int bandSize();

} // AbstractBandExpression
