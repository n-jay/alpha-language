/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.ISLMultiAff;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependence Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.DependenceExpression#getFunctionExpr <em>Function Expr</em>}</li>
 *   <li>{@link alpha.model.DependenceExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getDependenceExpression()
 * @model
 * @generated
 */
public interface DependenceExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Function Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Expr</em>' containment reference.
	 * @see #setFunctionExpr(JNIFunction)
	 * @see alpha.model.ModelPackage#getDependenceExpression_FunctionExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunction getFunctionExpr();

	/**
	 * Sets the value of the '{@link alpha.model.DependenceExpression#getFunctionExpr <em>Function Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Expr</em>' containment reference.
	 * @see #getFunctionExpr()
	 * @generated
	 */
	void setFunctionExpr(JNIFunction value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(AlphaExpression)
	 * @see alpha.model.ModelPackage#getDependenceExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.DependenceExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(AlphaExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMultiAff" unique="false"
	 * @generated
	 */
	ISLMultiAff getFunction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // DependenceExpression
