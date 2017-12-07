/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arg Reduce Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.ArgReduceExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.ArgReduceExpression#getProjection <em>Projection</em>}</li>
 *   <li>{@link alpha.model.ArgReduceExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getArgReduceExpression()
 * @model
 * @generated
 */
public interface ArgReduceExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.model.REDUCTION_OP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.REDUCTION_OP
	 * @see #setOperator(REDUCTION_OP)
	 * @see alpha.model.ModelPackage#getArgReduceExpression_Operator()
	 * @model unique="false"
	 * @generated
	 */
	REDUCTION_OP getOperator();

	/**
	 * Sets the value of the '{@link alpha.model.ArgReduceExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.REDUCTION_OP
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(REDUCTION_OP value);

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' containment reference.
	 * @see #setProjection(JNIFunction)
	 * @see alpha.model.ModelPackage#getArgReduceExpression_Projection()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunction getProjection();

	/**
	 * Sets the value of the '{@link alpha.model.ArgReduceExpression#getProjection <em>Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' containment reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(JNIFunction value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(AlphaExpression)
	 * @see alpha.model.ModelPackage#getArgReduceExpression_Body()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getBody();

	/**
	 * Sets the value of the '{@link alpha.model.ArgReduceExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(AlphaExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitArgReduceExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // ArgReduceExpression
