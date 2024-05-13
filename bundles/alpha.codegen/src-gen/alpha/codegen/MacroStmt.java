/**
 */
package alpha.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * Defines a macro.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.MacroStmt#getName <em>Name</em>}</li>
 *   <li>{@link alpha.codegen.MacroStmt#getArguments <em>Arguments</em>}</li>
 *   <li>{@link alpha.codegen.MacroStmt#getReplacement <em>Replacement</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getMacroStmt()
 * @model
 * @generated
 */
public interface MacroStmt extends Statement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The name of the macro, which is what will get replaced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.codegen.CodegenPackage#getMacroStmt_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.codegen.MacroStmt#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The names of the arguments to the macro. May be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute list.
	 * @see alpha.codegen.CodegenPackage#getMacroStmt_Arguments()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getArguments();

	/**
	 * Returns the value of the '<em><b>Replacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The expression to replace the macro with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacement</em>' containment reference.
	 * @see #setReplacement(Expression)
	 * @see alpha.codegen.CodegenPackage#getMacroStmt_Replacement()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReplacement();

	/**
	 * Sets the value of the '{@link alpha.codegen.MacroStmt#getReplacement <em>Replacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement</em>' containment reference.
	 * @see #getReplacement()
	 * @generated
	 */
	void setReplacement(Expression value);

} // MacroStmt
