/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getCalculatorExpression()
 * @model abstract="true"
 * @generated
 */
public interface CalculatorExpression extends AlphaNode, CalculatorNode, CalculatorExpressionVisitable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * toString without using ISL objects
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String plainToString();

} // CalculatorExpression
