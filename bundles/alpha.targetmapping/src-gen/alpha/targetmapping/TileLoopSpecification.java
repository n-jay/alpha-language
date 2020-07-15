/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Loop Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.TileLoopSpecification#isParallel <em>Parallel</em>}</li>
 *   <li>{@link alpha.targetmapping.TileLoopSpecification#getTilingType <em>Tiling Type</em>}</li>
 *   <li>{@link alpha.targetmapping.TileLoopSpecification#getTileSizeSpecifications <em>Tile Size Specifications</em>}</li>
 *   <li>{@link alpha.targetmapping.TileLoopSpecification#getTilingSpecification <em>Tiling Specification</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getTileLoopSpecification()
 * @model
 * @generated
 */
public interface TileLoopSpecification extends TilingSpecification {
	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' attribute.
	 * @see #setParallel(boolean)
	 * @see alpha.targetmapping.TargetmappingPackage#getTileLoopSpecification_Parallel()
	 * @model unique="false"
	 * @generated
	 */
	boolean isParallel();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TileLoopSpecification#isParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see #isParallel()
	 * @generated
	 */
	void setParallel(boolean value);

	/**
	 * Returns the value of the '<em><b>Tiling Type</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.targetmapping.TILING_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiling Type</em>' attribute.
	 * @see alpha.targetmapping.TILING_TYPE
	 * @see #setTilingType(TILING_TYPE)
	 * @see alpha.targetmapping.TargetmappingPackage#getTileLoopSpecification_TilingType()
	 * @model unique="false"
	 * @generated
	 */
	TILING_TYPE getTilingType();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TileLoopSpecification#getTilingType <em>Tiling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiling Type</em>' attribute.
	 * @see alpha.targetmapping.TILING_TYPE
	 * @see #getTilingType()
	 * @generated
	 */
	void setTilingType(TILING_TYPE value);

	/**
	 * Returns the value of the '<em><b>Tile Size Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.TileSizeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size Specifications</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getTileLoopSpecification_TileSizeSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<TileSizeSpecification> getTileSizeSpecifications();

	/**
	 * Returns the value of the '<em><b>Tiling Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiling Specification</em>' containment reference.
	 * @see #setTilingSpecification(TilingSpecification)
	 * @see alpha.targetmapping.TargetmappingPackage#getTileLoopSpecification_TilingSpecification()
	 * @model containment="true"
	 * @generated
	 */
	TilingSpecification getTilingSpecification();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TileLoopSpecification#getTilingSpecification <em>Tiling Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiling Specification</em>' containment reference.
	 * @see #getTilingSpecification()
	 * @generated
	 */
	void setTilingSpecification(TilingSpecification value);

} // TileLoopSpecification
