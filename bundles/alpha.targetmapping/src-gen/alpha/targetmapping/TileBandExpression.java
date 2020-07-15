/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Band Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * TileBandExpression is a more complicated variant of the BandExpression to handle tiling.
 * Since the treatment is drastically different, it is not a sub-class of BandExpression,
 * although it would be possible to model it as a sub-class.
 * 
 * TileBandExpression is always the leaf of the ScheduleTreeExpression, but has a chain of
 * TilingSpecifications that are used to expressed d-dimensional loop nests that correspond
 * to either tile or point loops, given a d-dimensional TileBand.
 * 
 * Each TileSpecification specifies the additional transformation on the loop (e.g., for skewing
 * the tiles), tile sizes for tile loops, and loop types for the point loops.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.TileBandExpression#getBandPieces <em>Band Pieces</em>}</li>
 *   <li>{@link alpha.targetmapping.TileBandExpression#getScheduleDimensionNames <em>Schedule Dimension Names</em>}</li>
 *   <li>{@link alpha.targetmapping.TileBandExpression#getTilingSpecification <em>Tiling Specification</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getTileBandExpression()
 * @model
 * @generated
 */
public interface TileBandExpression extends ScheduleTreeExpression {
	/**
	 * Returns the value of the '<em><b>Band Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.BandPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band Pieces</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getTileBandExpression_BandPieces()
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
	 * @see alpha.targetmapping.TargetmappingPackage#getTileBandExpression_ScheduleDimensionNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getScheduleDimensionNames();

	/**
	 * Returns the value of the '<em><b>Tiling Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiling Specification</em>' containment reference.
	 * @see #setTilingSpecification(TilingSpecification)
	 * @see alpha.targetmapping.TargetmappingPackage#getTileBandExpression_TilingSpecification()
	 * @model containment="true"
	 * @generated
	 */
	TilingSpecification getTilingSpecification();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TileBandExpression#getTilingSpecification <em>Tiling Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiling Specification</em>' containment reference.
	 * @see #getTilingSpecification()
	 * @generated
	 */
	void setTilingSpecification(TilingSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(TargetMappingVisitor visitor);

} // TileBandExpression
