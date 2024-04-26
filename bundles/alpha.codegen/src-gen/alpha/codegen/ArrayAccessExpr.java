/**
 */
package alpha.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Access Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * Accesses an array variable at some index.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.ArrayAccessExpr#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link alpha.codegen.ArrayAccessExpr#getIndexExpressions <em>Index Expressions</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getArrayAccessExpr()
 * @model
 * @generated
 */
public interface ArrayAccessExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The name of the variable being accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see alpha.codegen.CodegenPackage#getArrayAccessExpr_VariableName()
	 * @model unique="false"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link alpha.codegen.ArrayAccessExpr#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Index Expressions</b></em>' reference list.
	 * The list contents are of type {@link alpha.codegen.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The expressions used to index the variable.
	 * This should never be empty.
	 * If there are multiple values, they will all be wrapped in square brackets
	 * and appear left to right (i.e., index 0 is the leftmost indexing expression).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index Expressions</em>' reference list.
	 * @see alpha.codegen.CodegenPackage#getArrayAccessExpr_IndexExpressions()
	 * @model
	 * @generated
	 */
	EList<Expression> getIndexExpressions();

} // ArrayAccessExpr
