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
public interface CalculatorExpression extends CalculatorNode, CalculatorExpressionVisitable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitCalculatorExpression(this);'"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // CalculatorExpression
