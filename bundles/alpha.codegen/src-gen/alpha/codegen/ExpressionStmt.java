/**
 */
package alpha.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This is a statement which simply contains an expression.
 * Intended for use with function call expressions
 * (if its return type is "void" or if you're discarding the returned value),
 * or for "custom expressions", which would allow you to use any statement you'd like.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.ExpressionStmt#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getExpressionStmt()
 * @model
 * @generated
 */
public interface ExpressionStmt extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see alpha.codegen.CodegenPackage#getExpressionStmt_Expression()
	 * @model
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link alpha.codegen.ExpressionStmt#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ExpressionStmt
