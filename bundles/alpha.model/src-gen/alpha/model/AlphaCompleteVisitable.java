/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Complete Visitable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Interface for AlphaCompleteVisitor, which actually is not complete in the sense it does not visit CalculatorExpression.
 * This is because CalculatorExpressions are separate data structure to describe polyhedral objects, which is tightly
 * coupled with JNIISL.
 * <!-- end-model-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getAlphaCompleteVisitable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AlphaCompleteVisitable extends AlphaNode {
} // AlphaCompleteVisitable
