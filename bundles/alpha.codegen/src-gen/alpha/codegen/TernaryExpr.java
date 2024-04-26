/**
 */
package alpha.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ternary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * A conditional expression of the form "a ? b : c".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.TernaryExpr#getConditional <em>Conditional</em>}</li>
 *   <li>{@link alpha.codegen.TernaryExpr#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link alpha.codegen.TernaryExpr#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getTernaryExpr()
 * @model
 * @generated
 */
public interface TernaryExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The condition to check that selects one of the two expressions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional</em>' reference.
	 * @see #setConditional(Expression)
	 * @see alpha.codegen.CodegenPackage#getTernaryExpr_Conditional()
	 * @model
	 * @generated
	 */
	Expression getConditional();

	/**
	 * Sets the value of the '{@link alpha.codegen.TernaryExpr#getConditional <em>Conditional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The expression to return if the condition evaluates to <code>true</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Then Expr</em>' reference.
	 * @see #setThenExpr(Expression)
	 * @see alpha.codegen.CodegenPackage#getTernaryExpr_ThenExpr()
	 * @model
	 * @generated
	 */
	Expression getThenExpr();

	/**
	 * Sets the value of the '{@link alpha.codegen.TernaryExpr#getThenExpr <em>Then Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expr</em>' reference.
	 * @see #getThenExpr()
	 * @generated
	 */
	void setThenExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The expression to return if the condition evaluates to <code>false</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else Expr</em>' reference.
	 * @see #setElseExpr(Expression)
	 * @see alpha.codegen.CodegenPackage#getTernaryExpr_ElseExpr()
	 * @model
	 * @generated
	 */
	Expression getElseExpr();

	/**
	 * Sets the value of the '{@link alpha.codegen.TernaryExpr#getElseExpr <em>Else Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expr</em>' reference.
	 * @see #getElseExpr()
	 * @generated
	 */
	void setElseExpr(Expression value);

} // TernaryExpr
