/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Function Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AlphaFunctionLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaFunctionLiteral()
 * @model
 * @generated
 */
public interface AlphaFunctionLiteral extends AlphaFunctionExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see alpha.model.ModelPackage#getAlphaFunctionLiteral_Value()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaFunctionLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.String" unique="false"
	 * @generated
	 */
	String getISLString();

} // AlphaFunctionLiteral
