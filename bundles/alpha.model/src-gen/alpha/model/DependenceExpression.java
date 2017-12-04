/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependence Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.DependenceExpression#getFunction <em>Function</em>}</li>
 *   <li>{@link alpha.model.DependenceExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getDependenceExpression()
 * @model
 * @generated
 */
public interface DependenceExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(JNIFunction)
	 * @see alpha.model.ModelPackage#getDependenceExpression_Function()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunction getFunction();

	/**
	 * Sets the value of the '{@link alpha.model.DependenceExpression#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(JNIFunction value);

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
	 * @see alpha.model.ModelPackage#getDependenceExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.DependenceExpression#getExpr <em>Expr</em>}' containment reference.
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitDependenceExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // DependenceExpression
