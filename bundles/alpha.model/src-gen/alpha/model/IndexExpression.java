/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.IndexExpression#getFunctionExpr <em>Function Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getIndexExpression()
 * @model
 * @generated
 */
public interface IndexExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Function Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Expr</em>' containment reference.
	 * @see #setFunctionExpr(JNIFunction)
	 * @see alpha.model.ModelPackage#getIndexExpression_FunctionExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunction getFunctionExpr();

	/**
	 * Sets the value of the '{@link alpha.model.IndexExpression#getFunctionExpr <em>Function Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Expr</em>' containment reference.
	 * @see #getFunctionExpr()
	 * @generated
	 */
	void setFunctionExpr(JNIFunction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMultiAff" unique="false"
	 * @generated
	 */
	JNIISLMultiAff getFunction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // IndexExpression
