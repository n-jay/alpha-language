/**
 */
package alpha.targetmapping;

import fr.irisa.cairn.jnimap.isl.ISLASTLoopType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISL Loop Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.ISLLoopTypeSpecification#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getISLLoopTypeSpecification()
 * @model
 * @generated
 */
public interface ISLLoopTypeSpecification extends LoopTypeSpecification {
	/**
	 * Returns the value of the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Type</em>' attribute.
	 * @see #setLoopType(ISLASTLoopType)
	 * @see alpha.targetmapping.TargetmappingPackage#getISLLoopTypeSpecification_LoopType()
	 * @model unique="false" dataType="alpha.targetmapping.ISLASTLoopType"
	 * @generated
	 */
	ISLASTLoopType getLoopType();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ISLLoopTypeSpecification#getLoopType <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Type</em>' attribute.
	 * @see #getLoopType()
	 * @generated
	 */
	void setLoopType(ISLASTLoopType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String unparseString();

} // ISLLoopTypeSpecification
