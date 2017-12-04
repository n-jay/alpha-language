/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.IndexExpression#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getIndexExpression()
 * @model
 * @generated
 */
public interface IndexExpression extends AlphaExpression {
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
	 * @see alpha.model.ModelPackage#getIndexExpression_Function()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunction getFunction();

	/**
	 * Sets the value of the '{@link alpha.model.IndexExpression#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(JNIFunction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitIndexExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // IndexExpression
