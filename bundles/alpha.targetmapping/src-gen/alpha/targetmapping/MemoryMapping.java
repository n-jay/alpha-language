/**
 */
package alpha.targetmapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.MemoryMapping#getMemorySpaceName <em>Memory Space Name</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getMemoryMapping()
 * @model
 * @generated
 */
public interface MemoryMapping extends AbstractMapping {
	/**
	 * Returns the value of the '<em><b>Memory Space Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Space Name</em>' attribute.
	 * @see #setMemorySpaceName(String)
	 * @see alpha.targetmapping.TargetmappingPackage#getMemoryMapping_MemorySpaceName()
	 * @model unique="false"
	 * @generated
	 */
	String getMemorySpaceName();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.MemoryMapping#getMemorySpaceName <em>Memory Space Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Space Name</em>' attribute.
	 * @see #getMemorySpaceName()
	 * @generated
	 */
	void setMemorySpaceName(String value);

} // MemoryMapping
