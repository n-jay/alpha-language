/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.SelectExpression#getSelectRelation <em>Select Relation</em>}</li>
 *   <li>{@link alpha.model.SelectExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getSelectExpression()
 * @model
 * @generated
 */
public interface SelectExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Select Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Relation</em>' containment reference.
	 * @see #setSelectRelation(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getSelectExpression_SelectRelation()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getSelectRelation();

	/**
	 * Sets the value of the '{@link alpha.model.SelectExpression#getSelectRelation <em>Select Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Relation</em>' containment reference.
	 * @see #getSelectRelation()
	 * @generated
	 */
	void setSelectRelation(CalculatorExpression value);

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
	 * @see alpha.model.ModelPackage#getSelectExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.SelectExpression#getExpr <em>Expr</em>}' containment reference.
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitSelectExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // SelectExpression
