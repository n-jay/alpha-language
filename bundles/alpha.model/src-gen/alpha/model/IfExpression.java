/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.IfExpression#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link alpha.model.IfExpression#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link alpha.model.IfExpression#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Expr</em>' containment reference.
	 * @see #setCondExpr(AlphaExpression)
	 * @see alpha.model.ModelPackage#getIfExpression_CondExpr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getCondExpr();

	/**
	 * Sets the value of the '{@link alpha.model.IfExpression#getCondExpr <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Expr</em>' containment reference.
	 * @see #getCondExpr()
	 * @generated
	 */
	void setCondExpr(AlphaExpression value);

	/**
	 * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expr</em>' containment reference.
	 * @see #setThenExpr(AlphaExpression)
	 * @see alpha.model.ModelPackage#getIfExpression_ThenExpr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getThenExpr();

	/**
	 * Sets the value of the '{@link alpha.model.IfExpression#getThenExpr <em>Then Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expr</em>' containment reference.
	 * @see #getThenExpr()
	 * @generated
	 */
	void setThenExpr(AlphaExpression value);

	/**
	 * Returns the value of the '<em><b>Else Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expr</em>' containment reference.
	 * @see #setElseExpr(AlphaExpression)
	 * @see alpha.model.ModelPackage#getIfExpression_ElseExpr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getElseExpr();

	/**
	 * Sets the value of the '{@link alpha.model.IfExpression#getElseExpr <em>Else Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expr</em>' containment reference.
	 * @see #getElseExpr()
	 * @generated
	 */
	void setElseExpr(AlphaExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // IfExpression
