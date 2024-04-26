/**
 */
package alpha.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesized Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents an expression surrounded in parentheses.
 * Note: when generating C code, some expressions are already wrapped in parentheses,
 * so using this may result in double parentheses.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.ParenthesizedExpr#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getParenthesizedExpr()
 * @model
 * @generated
 */
public interface ParenthesizedExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The expression to wrap in parentheses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see alpha.codegen.CodegenPackage#getParenthesizedExpr_Expression()
	 * @model
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link alpha.codegen.ParenthesizedExpr#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ParenthesizedExpr
