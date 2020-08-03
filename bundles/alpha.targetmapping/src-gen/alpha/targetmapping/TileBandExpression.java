/**
 */
package alpha.targetmapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Band Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * TileBandExpression is a more complicated variant of the BandExpression to handle tiling.
 * 
 * TileBandExpression is always the leaf of the ScheduleTree, but has a chain of
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
 *   <li>{@link alpha.targetmapping.TileBandExpression#getTilingType <em>Tiling Type</em>}</li>
 *   <li>{@link alpha.targetmapping.TileBandExpression#getTilingSpecification <em>Tiling Specification</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getTileBandExpression()
 * @model
 * @generated
 */
public interface TileBandExpression extends AbstractBandExpression {
	/**
	 * Returns the value of the '<em><b>Tiling Type</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.targetmapping.TILING_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiling Type</em>' attribute.
	 * @see alpha.targetmapping.TILING_TYPE
	 * @see #setTilingType(TILING_TYPE)
	 * @see alpha.targetmapping.TargetmappingPackage#getTileBandExpression_TilingType()
	 * @model unique="false"
	 * @generated
	 */
	TILING_TYPE getTilingType();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TileBandExpression#getTilingType <em>Tiling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiling Type</em>' attribute.
	 * @see alpha.targetmapping.TILING_TYPE
	 * @see #getTilingType()
	 * @generated
	 */
	void setTilingType(TILING_TYPE value);

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
