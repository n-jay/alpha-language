/**
 */
package alpha.targetmapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Loop Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.AlphaLoopTypeSpecification#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getAlphaLoopTypeSpecification()
 * @model
 * @generated
 */
public interface AlphaLoopTypeSpecification extends LoopTypeSpecification {
	/**
	 * Returns the value of the '<em><b>Loop Type</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.targetmapping.ALPHA_LOOP_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Type</em>' attribute.
	 * @see alpha.targetmapping.ALPHA_LOOP_TYPE
	 * @see #setLoopType(ALPHA_LOOP_TYPE)
	 * @see alpha.targetmapping.TargetmappingPackage#getAlphaLoopTypeSpecification_LoopType()
	 * @model unique="false"
	 * @generated
	 */
	ALPHA_LOOP_TYPE getLoopType();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.AlphaLoopTypeSpecification#getLoopType <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Type</em>' attribute.
	 * @see alpha.targetmapping.ALPHA_LOOP_TYPE
	 * @see #getLoopType()
	 * @generated
	 */
	void setLoopType(ALPHA_LOOP_TYPE value);

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

} // AlphaLoopTypeSpecification
