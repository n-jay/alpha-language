/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.BooleanExpression#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends ConstantExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see alpha.model.ModelPackage#getBooleanExpression_Value()
	 * @model unique="false"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link alpha.model.BooleanExpression#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitBooleanExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // BooleanExpression
