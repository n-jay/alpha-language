/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculator Expression Visitable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getCalculatorExpressionVisitable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CalculatorExpressionVisitable extends AlphaNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // CalculatorExpressionVisitable
