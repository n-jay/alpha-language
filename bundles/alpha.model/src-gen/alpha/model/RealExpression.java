/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.RealExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getRealExpression()
 * @model
 * @generated
 */
public interface RealExpression extends ConstantExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Float)
	 * @see alpha.model.ModelPackage#getRealExpression_Value()
	 * @model unique="false" dataType="alpha.model.float"
	 * @generated
	 */
	Float getValue();

	/**
	 * Sets the value of the '{@link alpha.model.RealExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Float value);

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

} // RealExpression
