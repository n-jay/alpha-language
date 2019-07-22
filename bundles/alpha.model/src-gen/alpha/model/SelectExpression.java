/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.ISLMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.SelectExpression#getRelationExpr <em>Relation Expr</em>}</li>
 *   <li>{@link alpha.model.SelectExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getSelectExpression()
 * @model
 * @generated
 */
public interface SelectExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Relation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Expr</em>' containment reference.
	 * @see #setRelationExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getSelectExpression_RelationExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getRelationExpr();

	/**
	 * Sets the value of the '{@link alpha.model.SelectExpression#getRelationExpr <em>Relation Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Expr</em>' containment reference.
	 * @see #getRelationExpr()
	 * @generated
	 */
	void setRelationExpr(CalculatorExpression value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(AlphaExpression)
	 * @see alpha.model.ModelPackage#getSelectExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.SelectExpression#getExpr <em>Expr</em>}' containment reference.
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
	ISLMap getSelectRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // SelectExpression
