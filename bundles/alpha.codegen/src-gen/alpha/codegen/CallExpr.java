/**
 */
package alpha.codegen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A function call expression.
 * Note: min and max are valid options for a binary operator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.CallExpr#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link alpha.codegen.CallExpr#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getCallExpr()
 * @model
 * @generated
 */
public interface CallExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The name of the function being called.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see alpha.codegen.CodegenPackage#getCallExpr_FunctionName()
	 * @model unique="false"
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link alpha.codegen.CallExpr#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The arguments to the function. May be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getCallExpr_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // CallExpr
