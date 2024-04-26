/**
 */
package alpha.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * An expression which applies some operator over two operands.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.BinaryExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.codegen.BinaryExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link alpha.codegen.BinaryExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getBinaryExpr()
 * @model
 * @generated
 */
public interface BinaryExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.codegen.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The operator to apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see alpha.codegen.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see alpha.codegen.CodegenPackage#getBinaryExpr_Operator()
	 * @model unique="false"
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link alpha.codegen.BinaryExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see alpha.codegen.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The operand on the left-hand side.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Expression)
	 * @see alpha.codegen.CodegenPackage#getBinaryExpr_Left()
	 * @model
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link alpha.codegen.BinaryExpr#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The operand on the right-hand side.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Expression)
	 * @see alpha.codegen.CodegenPackage#getBinaryExpr_Right()
	 * @model
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link alpha.codegen.BinaryExpr#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // BinaryExpr
