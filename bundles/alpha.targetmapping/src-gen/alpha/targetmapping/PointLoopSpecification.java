/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Loop Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.PointLoopSpecification#getLoopTypeSpecifications <em>Loop Type Specifications</em>}</li>
 *   <li>{@link alpha.targetmapping.PointLoopSpecification#getFullTileSpecification <em>Full Tile Specification</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getPointLoopSpecification()
 * @model
 * @generated
 */
public interface PointLoopSpecification extends TilingSpecification {
	/**
	 * Returns the value of the '<em><b>Loop Type Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.LoopTypeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Type Specifications</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getPointLoopSpecification_LoopTypeSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoopTypeSpecification> getLoopTypeSpecifications();

	/**
	 * Returns the value of the '<em><b>Full Tile Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Tile Specification</em>' containment reference.
	 * @see #setFullTileSpecification(FullTileSpecification)
	 * @see alpha.targetmapping.TargetmappingPackage#getPointLoopSpecification_FullTileSpecification()
	 * @model containment="true"
	 * @generated
	 */
	FullTileSpecification getFullTileSpecification();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.PointLoopSpecification#getFullTileSpecification <em>Full Tile Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Tile Specification</em>' containment reference.
	 * @see #getFullTileSpecification()
	 * @generated
	 */
	void setFullTileSpecification(FullTileSpecification value);

} // PointLoopSpecification
