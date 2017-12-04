/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restrict Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.RestrictExpression#getDomainExpr <em>Domain Expr</em>}</li>
 *   <li>{@link alpha.model.RestrictExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getRestrictExpression()
 * @model
 * @generated
 */
public interface RestrictExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Expr</em>' containment reference.
	 * @see #setDomainExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getRestrictExpression_DomainExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getDomainExpr();

	/**
	 * Sets the value of the '{@link alpha.model.RestrictExpression#getDomainExpr <em>Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Expr</em>' containment reference.
	 * @see #getDomainExpr()
	 * @generated
	 */
	void setDomainExpr(CalculatorExpression value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(AlphaExpression)
	 * @see alpha.model.ModelPackage#getRestrictExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.RestrictExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(AlphaExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitRestrictExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // RestrictExpression
