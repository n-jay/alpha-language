/**
 */
package alpha.targetmapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Tile Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.FixedTileSize#getTileSize <em>Tile Size</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getFixedTileSize()
 * @model
 * @generated
 */
public interface FixedTileSize extends TileSizeSpecification {
	/**
	 * Returns the value of the '<em><b>Tile Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size</em>' attribute.
	 * @see #setTileSize(int)
	 * @see alpha.targetmapping.TargetmappingPackage#getFixedTileSize_TileSize()
	 * @model unique="false"
	 * @generated
	 */
	int getTileSize();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.FixedTileSize#getTileSize <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size</em>' attribute.
	 * @see #getTileSize()
	 * @generated
	 */
	void setTileSize(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String unparseString();

} // FixedTileSize
