/**
 */
package alpha.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * A comment in C. Each item of the string array will have '// ' prepended automatically.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.CommentStmt#getCommentLines <em>Comment Lines</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getCommentStmt()
 * @model
 * @generated
 */
public interface CommentStmt extends Statement {
	/**
	 * Returns the value of the '<em><b>Comment Lines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The individual lines of the comment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Lines</em>' attribute list.
	 * @see alpha.codegen.CodegenPackage#getCommentStmt_CommentLines()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCommentLines();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Adds lines to the comment.
	 * If there are any newlines in any of the provided strings,
	 * they will be broken into separate lines within this comment.
	 * <!-- end-model-doc -->
	 * @model linesDataType="alpha.codegen.StringIterable" linesUnique="false"
	 * @generated
	 */
	void addAll(Iterable<String> lines);

} // CommentStmt
