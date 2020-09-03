/**
 */
package alpha.targetmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Tile Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.FullTileSpecification#getLoopTypeSpecifications <em>Loop Type Specifications</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getFullTileSpecification()
 * @model
 * @generated
 */
public interface FullTileSpecification extends TargetMappingNode {
	/**
	 * Returns the value of the '<em><b>Loop Type Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.LoopTypeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Type Specifications</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getFullTileSpecification_LoopTypeSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoopTypeSpecification> getLoopTypeSpecifications();

} // FullTileSpecification
