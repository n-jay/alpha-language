/**
 */
package alpha.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An entire if..else if..else block.
 * The "ifBranch" is required, but the other fields are optional.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.IfStmt#getIfBranch <em>If Branch</em>}</li>
 *   <li>{@link alpha.codegen.IfStmt#getElseIfBranches <em>Else If Branches</em>}</li>
 *   <li>{@link alpha.codegen.IfStmt#getElseBranch <em>Else Branch</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getIfStmt()
 * @model
 * @generated
 */
public interface IfStmt extends Statement {
	/**
	 * Returns the value of the '<em><b>If Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The main "if" branch for this statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If Branch</em>' containment reference.
	 * @see #setIfBranch(ConditionalBranch)
	 * @see alpha.codegen.CodegenPackage#getIfStmt_IfBranch()
	 * @model containment="true"
	 * @generated
	 */
	ConditionalBranch getIfBranch();

	/**
	 * Sets the value of the '{@link alpha.codegen.IfStmt#getIfBranch <em>If Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Branch</em>' containment reference.
	 * @see #getIfBranch()
	 * @generated
	 */
	void setIfBranch(ConditionalBranch value);

	/**
	 * Returns the value of the '<em><b>Else If Branches</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.ConditionalBranch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The optional "else if" branches.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else If Branches</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getIfStmt_ElseIfBranches()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalBranch> getElseIfBranches();

	/**
	 * Returns the value of the '<em><b>Else Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * An optional "else" branch at the end of the statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else Branch</em>' containment reference.
	 * @see #setElseBranch(Branch)
	 * @see alpha.codegen.CodegenPackage#getIfStmt_ElseBranch()
	 * @model containment="true"
	 * @generated
	 */
	Branch getElseBranch();

	/**
	 * Sets the value of the '{@link alpha.codegen.IfStmt#getElseBranch <em>Else Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Branch</em>' containment reference.
	 * @see #getElseBranch()
	 * @generated
	 */
	void setElseBranch(Branch value);

} // IfStmt
