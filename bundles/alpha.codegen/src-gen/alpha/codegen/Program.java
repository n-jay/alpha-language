/**
 */
package alpha.codegen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * Represents a program consisting of a single C file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.Program#getHeaderComment <em>Header Comment</em>}</li>
 *   <li>{@link alpha.codegen.Program#getIncludes <em>Includes</em>}</li>
 *   <li>{@link alpha.codegen.Program#getFunctionMacros <em>Function Macros</em>}</li>
 *   <li>{@link alpha.codegen.Program#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link alpha.codegen.Program#getMemoryMacros <em>Memory Macros</em>}</li>
 *   <li>{@link alpha.codegen.Program#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Header Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A comment at the top of the file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Comment</em>' containment reference.
	 * @see #setHeaderComment(CommentStmt)
	 * @see alpha.codegen.CodegenPackage#getProgram_HeaderComment()
	 * @model containment="true"
	 * @generated
	 */
	CommentStmt getHeaderComment();

	/**
	 * Sets the value of the '{@link alpha.codegen.Program#getHeaderComment <em>Header Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Comment</em>' containment reference.
	 * @see #getHeaderComment()
	 * @generated
	 */
	void setHeaderComment(CommentStmt value);

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.Include}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The list of #include directives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Include> getIncludes();

	/**
	 * Returns the value of the '<em><b>Function Macros</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.MacroStmt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A set of macros. Intended to be used for defining common functions like min(a,b) or floor(a).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Macros</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_FunctionMacros()
	 * @model containment="true"
	 * @generated
	 */
	EList<MacroStmt> getFunctionMacros();

	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.VariableDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Global variable declarations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Variables</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_GlobalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDecl> getGlobalVariables();

	/**
	 * Returns the value of the '<em><b>Memory Macros</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.MacroStmt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Another set of macros. Intended to be used for defining how the global variables are accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Macros</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_MemoryMacros()
	 * @model containment="true"
	 * @generated
	 */
	EList<MacroStmt> getMemoryMacros();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The function definitions for this program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

} // Program
