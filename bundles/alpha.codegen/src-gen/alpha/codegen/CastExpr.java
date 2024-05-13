/**
 */
package alpha.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * Casts an expression to a specific data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.CastExpr#getDataType <em>Data Type</em>}</li>
 *   <li>{@link alpha.codegen.CastExpr#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getCastExpr()
 * @model
 * @generated
 */
public interface CastExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The type to cast to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(DataType)
	 * @see alpha.codegen.CodegenPackage#getCastExpr_DataType()
	 * @model containment="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link alpha.codegen.CastExpr#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The expression being cast.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see alpha.codegen.CodegenPackage#getCastExpr_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link alpha.codegen.CastExpr#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // CastExpr
