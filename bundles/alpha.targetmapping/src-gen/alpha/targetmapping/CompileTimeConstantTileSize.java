/**
 */
package alpha.targetmapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compile Time Constant Tile Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.CompileTimeConstantTileSize#getTileSizeName <em>Tile Size Name</em>}</li>
 *   <li>{@link alpha.targetmapping.CompileTimeConstantTileSize#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getCompileTimeConstantTileSize()
 * @model
 * @generated
 */
public interface CompileTimeConstantTileSize extends TileSizeSpecification {
	/**
	 * Returns the value of the '<em><b>Tile Size Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size Name</em>' attribute.
	 * @see #setTileSizeName(String)
	 * @see alpha.targetmapping.TargetmappingPackage#getCompileTimeConstantTileSize_TileSizeName()
	 * @model unique="false"
	 * @generated
	 */
	String getTileSizeName();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.CompileTimeConstantTileSize#getTileSizeName <em>Tile Size Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size Name</em>' attribute.
	 * @see #getTileSizeName()
	 * @generated
	 */
	void setTileSizeName(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(int)
	 * @see alpha.targetmapping.TargetmappingPackage#getCompileTimeConstantTileSize_DefaultValue()
	 * @model unique="false"
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.CompileTimeConstantTileSize#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(int value);

} // CompileTimeConstantTileSize
