/**
 */
package alpha.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * Assigns the left-hand expression according to the right-hand expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.AssignmentStmt#getLeft <em>Left</em>}</li>
 *   <li>{@link alpha.codegen.AssignmentStmt#getAssignType <em>Assign Type</em>}</li>
 *   <li>{@link alpha.codegen.AssignmentStmt#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getAssignmentStmt()
 * @model
 * @generated
 */
public interface AssignmentStmt extends Statement, Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The expression which is getting assigned a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see alpha.codegen.CodegenPackage#getAssignmentStmt_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link alpha.codegen.AssignmentStmt#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Assign Type</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.codegen.AssignmentOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Which kind of assignment to perform (e.g., = or +=).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assign Type</em>' attribute.
	 * @see alpha.codegen.AssignmentOperator
	 * @see #setAssignType(AssignmentOperator)
	 * @see alpha.codegen.CodegenPackage#getAssignmentStmt_AssignType()
	 * @model unique="false"
	 * @generated
	 */
	AssignmentOperator getAssignType();

	/**
	 * Sets the value of the '{@link alpha.codegen.AssignmentStmt#getAssignType <em>Assign Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign Type</em>' attribute.
	 * @see alpha.codegen.AssignmentOperator
	 * @see #getAssignType()
	 * @generated
	 */
	void setAssignType(AssignmentOperator value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The expression to assign to the left side.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see alpha.codegen.CodegenPackage#getAssignmentStmt_Right()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link alpha.codegen.AssignmentStmt#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // AssignmentStmt
