/**
 */
package alpha.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Function Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AlphaFunctionBinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link alpha.model.AlphaFunctionBinaryExpression#getRight <em>Right</em>}</li>
 *   <li>{@link alpha.model.AlphaFunctionBinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaFunctionBinaryExpression()
 * @model
 * @generated
 */
public interface AlphaFunctionBinaryExpression extends AlphaFunctionExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(AlphaFunctionExpression)
	 * @see alpha.model.ModelPackage#getAlphaFunctionBinaryExpression_Left()
	 * @model containment="true"
	 * @generated
	 */
	AlphaFunctionExpression getLeft();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaFunctionBinaryExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(AlphaFunctionExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(AlphaFunctionExpression)
	 * @see alpha.model.ModelPackage#getAlphaFunctionBinaryExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	AlphaFunctionExpression getRight();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaFunctionBinaryExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(AlphaFunctionExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see alpha.model.ModelPackage#getAlphaFunctionBinaryExpression_Operator()
	 * @model unique="false"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaFunctionBinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getISLString();

} // AlphaFunctionBinaryExpression
