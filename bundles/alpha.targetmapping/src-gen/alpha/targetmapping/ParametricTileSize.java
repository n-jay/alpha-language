/**
 */
package alpha.targetmapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Tile Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.ParametricTileSize#getTileSizeName <em>Tile Size Name</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getParametricTileSize()
 * @model
 * @generated
 */
public interface ParametricTileSize extends TileSizeSpecification {
	/**
	 * Returns the value of the '<em><b>Tile Size Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size Name</em>' attribute.
	 * @see #setTileSizeName(String)
	 * @see alpha.targetmapping.TargetmappingPackage#getParametricTileSize_TileSizeName()
	 * @model unique="false"
	 * @generated
	 */
	String getTileSizeName();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ParametricTileSize#getTileSizeName <em>Tile Size Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size Name</em>' attribute.
	 * @see #getTileSizeName()
	 * @generated
	 */
	void setTileSizeName(String value);

} // ParametricTileSize
