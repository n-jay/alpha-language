/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Restrict Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AutoRestrictExpression#getInferredDomain <em>Inferred Domain</em>}</li>
 *   <li>{@link alpha.model.AutoRestrictExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAutoRestrictExpression()
 * @model
 * @generated
 */
public interface AutoRestrictExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Inferred Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inferred Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inferred Domain</em>' containment reference.
	 * @see #setInferredDomain(JNIDomain)
	 * @see alpha.model.ModelPackage#getAutoRestrictExpression_InferredDomain()
	 * @model containment="true"
	 * @generated
	 */
	JNIDomain getInferredDomain();

	/**
	 * Sets the value of the '{@link alpha.model.AutoRestrictExpression#getInferredDomain <em>Inferred Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inferred Domain</em>' containment reference.
	 * @see #getInferredDomain()
	 * @generated
	 */
	void setInferredDomain(JNIDomain value);

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
	 * @see alpha.model.ModelPackage#getAutoRestrictExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.AutoRestrictExpression#getExpr <em>Expr</em>}' containment reference.
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitAutoRestrictExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // AutoRestrictExpression
