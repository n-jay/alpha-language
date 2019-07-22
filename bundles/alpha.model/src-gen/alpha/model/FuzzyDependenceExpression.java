/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.ISLMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Dependence Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.FuzzyDependenceExpression#getFuzzyFunction <em>Fuzzy Function</em>}</li>
 *   <li>{@link alpha.model.FuzzyDependenceExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getFuzzyDependenceExpression()
 * @model
 * @generated
 */
public interface FuzzyDependenceExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Fuzzy Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuzzy Function</em>' containment reference.
	 * @see #setFuzzyFunction(FuzzyFunction)
	 * @see alpha.model.ModelPackage#getFuzzyDependenceExpression_FuzzyFunction()
	 * @model containment="true"
	 * @generated
	 */
	FuzzyFunction getFuzzyFunction();

	/**
	 * Sets the value of the '{@link alpha.model.FuzzyDependenceExpression#getFuzzyFunction <em>Fuzzy Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuzzy Function</em>' containment reference.
	 * @see #getFuzzyFunction()
	 * @generated
	 */
	void setFuzzyFunction(FuzzyFunction value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(AlphaExpression)
	 * @see alpha.model.ModelPackage#getFuzzyDependenceExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.FuzzyDependenceExpression#getExpr <em>Expr</em>}' containment reference.
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
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 * @generated
	 */
	ISLMap getDependenceRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // FuzzyDependenceExpression
