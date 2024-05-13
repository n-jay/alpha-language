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
	 * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The condition to check that selects one of the two expressions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional</em>' containment reference.
	 * @see #setConditional(Expression)
	 * @see alpha.codegen.CodegenPackage#getTernaryExpr_Conditional()
	 * @model containment="true"
	 * @generated
	 */
	Expression getConditional();

	/**
	 * Sets the value of the '{@link alpha.codegen.TernaryExpr#getConditional <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' containment reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The expression to return if the condition evaluates to <code>true</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Then Expr</em>' containment reference.
	 * @see #setThenExpr(Expression)
	 * @see alpha.codegen.CodegenPackage#getTernaryExpr_ThenExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getThenExpr();

	/**
	 * Sets the value of the '{@link alpha.codegen.TernaryExpr#getThenExpr <em>Then Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expr</em>' containment reference.
	 * @see #getThenExpr()
	 * @generated
	 */
	void setThenExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The expression to return if the condition evaluates to <code>false</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else Expr</em>' containment reference.
	 * @see #setElseExpr(Expression)
	 * @see alpha.codegen.CodegenPackage#getTernaryExpr_ElseExpr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElseExpr();

	/**
	 * Sets the value of the '{@link alpha.codegen.TernaryExpr#getElseExpr <em>Else Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expr</em>' containment reference.
	 * @see #getElseExpr()
	 * @generated
	 */
	void setElseExpr(Expression value);

} // TernaryExpr
