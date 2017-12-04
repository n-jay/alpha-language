/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.CalculatorExpression#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getCalculatorExpression()
 * @model abstract="true"
 * @generated
 */
public interface CalculatorExpression extends CalculatorNode, CalculatorExpressionVisitable {
	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see alpha.model.ModelPackage#getCalculatorExpression_ErrorMessage()
	 * @model unique="false"
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link alpha.model.CalculatorExpression#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitCalculatorExpression(this);'"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // CalculatorExpression
