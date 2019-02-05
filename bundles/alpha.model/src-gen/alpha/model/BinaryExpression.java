/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.BinaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.BinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link alpha.model.BinaryExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.model.BINARY_OP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.BINARY_OP
	 * @see #setOperator(BINARY_OP)
	 * @see alpha.model.ModelPackage#getBinaryExpression_Operator()
	 * @model unique="false"
	 * @generated
	 */
	BINARY_OP getOperator();

	/**
	 * Sets the value of the '{@link alpha.model.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.BINARY_OP
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BINARY_OP value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(AlphaExpression)
	 * @see alpha.model.ModelPackage#getBinaryExpression_Left()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getLeft();

	/**
	 * Sets the value of the '{@link alpha.model.BinaryExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(AlphaExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(AlphaExpression)
	 * @see alpha.model.ModelPackage#getBinaryExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getRight();

	/**
	 * Sets the value of the '{@link alpha.model.BinaryExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(AlphaExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // BinaryExpression
