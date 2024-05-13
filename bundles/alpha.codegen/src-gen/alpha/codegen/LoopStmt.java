/**
 */
package alpha.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * Represents a "for" loop.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.LoopStmt#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link alpha.codegen.LoopStmt#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link alpha.codegen.LoopStmt#getConditional <em>Conditional</em>}</li>
 *   <li>{@link alpha.codegen.LoopStmt#getIncrementBy <em>Increment By</em>}</li>
 *   <li>{@link alpha.codegen.LoopStmt#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getLoopStmt()
 * @model
 * @generated
 */
public interface LoopStmt extends Statement {
	/**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The variable being looped over.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable</em>' attribute.
	 * @see #setLoopVariable(String)
	 * @see alpha.codegen.CodegenPackage#getLoopStmt_LoopVariable()
	 * @model unique="false"
	 * @generated
	 */
	String getLoopVariable();

	/**
	 * Sets the value of the '{@link alpha.codegen.LoopStmt#getLoopVariable <em>Loop Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Variable</em>' attribute.
	 * @see #getLoopVariable()
	 * @generated
	 */
	void setLoopVariable(String value);

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The initial value of the loop variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(Expression)
	 * @see alpha.codegen.CodegenPackage#getLoopStmt_Initializer()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitializer();

	/**
	 * Sets the value of the '{@link alpha.codegen.LoopStmt#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(Expression value);

	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The conditional expression to check each iteration of the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional</em>' containment reference.
	 * @see #setConditional(Expression)
	 * @see alpha.codegen.CodegenPackage#getLoopStmt_Conditional()
	 * @model containment="true"
	 * @generated
	 */
	Expression getConditional();

	/**
	 * Sets the value of the '{@link alpha.codegen.LoopStmt#getConditional <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' containment reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(Expression value);

	/**
	 * Returns the value of the '<em><b>Increment By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Increments the loop variable by the given amount.
	 * This is intended only for additive increments (i.e., "+=").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Increment By</em>' containment reference.
	 * @see #setIncrementBy(Expression)
	 * @see alpha.codegen.CodegenPackage#getLoopStmt_IncrementBy()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIncrementBy();

	/**
	 * Sets the value of the '{@link alpha.codegen.LoopStmt#getIncrementBy <em>Increment By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment By</em>' containment reference.
	 * @see #getIncrementBy()
	 * @generated
	 */
	void setIncrementBy(Expression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The statements to loop over.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getLoopStmt_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getBody();

} // LoopStmt
