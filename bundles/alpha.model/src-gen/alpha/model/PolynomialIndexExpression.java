/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLPWQPolynomial;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polynomial Index Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.PolynomialIndexExpression#getPolynomialExpr <em>Polynomial Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getPolynomialIndexExpression()
 * @model
 * @generated
 */
public interface PolynomialIndexExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Polynomial Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polynomial Expr</em>' containment reference.
	 * @see #setPolynomialExpr(JNIPolynomial)
	 * @see alpha.model.ModelPackage#getPolynomialIndexExpression_PolynomialExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIPolynomial getPolynomialExpr();

	/**
	 * Sets the value of the '{@link alpha.model.PolynomialIndexExpression#getPolynomialExpr <em>Polynomial Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polynomial Expr</em>' containment reference.
	 * @see #getPolynomialExpr()
	 * @generated
	 */
	void setPolynomialExpr(JNIPolynomial value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLPWQPolynomial" unique="false"
	 * @generated
	 */
	JNIISLPWQPolynomial getPolynomial();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // PolynomialIndexExpression
