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
	 * Returns the value of the '<em><b>Header Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A comment at the top of the file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Comment</em>' reference.
	 * @see #setHeaderComment(CommentStmt)
	 * @see alpha.codegen.CodegenPackage#getProgram_HeaderComment()
	 * @model
	 * @generated
	 */
	CommentStmt getHeaderComment();

	/**
	 * Sets the value of the '{@link alpha.codegen.Program#getHeaderComment <em>Header Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Comment</em>' reference.
	 * @see #getHeaderComment()
	 * @generated
	 */
	void setHeaderComment(CommentStmt value);

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link alpha.codegen.Include}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The list of #include directives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_Includes()
	 * @model
	 * @generated
	 */
	EList<Include> getIncludes();

	/**
	 * Returns the value of the '<em><b>Function Macros</b></em>' reference list.
	 * The list contents are of type {@link alpha.codegen.MacroStmt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A set of macros. Intended to be used for defining common functions like min(a,b) or floor(a).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Macros</em>' reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_FunctionMacros()
	 * @model
	 * @generated
	 */
	EList<MacroStmt> getFunctionMacros();

	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' reference list.
	 * The list contents are of type {@link alpha.codegen.VariableDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Global variable declarations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Variables</em>' reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_GlobalVariables()
	 * @model
	 * @generated
	 */
	EList<VariableDecl> getGlobalVariables();

	/**
	 * Returns the value of the '<em><b>Memory Macros</b></em>' reference list.
	 * The list contents are of type {@link alpha.codegen.MacroStmt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Another set of macros. Intended to be used for defining how the global variables are accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Macros</em>' reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_MemoryMacros()
	 * @model
	 * @generated
	 */
	EList<MacroStmt> getMemoryMacros();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' reference list.
	 * The list contents are of type {@link alpha.codegen.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The function definitions for this program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functions</em>' reference list.
	 * @see alpha.codegen.CodegenPackage#getProgram_Functions()
	 * @model
	 * @generated
	 */
	EList<Function> getFunctions();

} // Program
