/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AlphaConstant#getName <em>Name</em>}</li>
 *   <li>{@link alpha.model.AlphaConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaConstant()
 * @model
 * @generated
 */
public interface AlphaConstant extends AlphaElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.model.ModelPackage#getAlphaConstant_Name()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaConstant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see alpha.model.ModelPackage#getAlphaConstant_Value()
	 * @model unique="false" dataType="alpha.model.int"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // AlphaConstant
