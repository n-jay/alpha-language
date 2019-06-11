/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.IntegerExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getIntegerExpression()
 * @model
 * @generated
 */
public interface IntegerExpression extends ConstantExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see alpha.model.ModelPackage#getIntegerExpression_Value()
	 * @model unique="false" dataType="alpha.model.int"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link alpha.model.IntegerExpression#getValue <em>Value</em>}' attribute.
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
	 * @model dataType="alpha.model.String" unique="false"
	 * @generated
	 */
	String valueString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // IntegerExpression
