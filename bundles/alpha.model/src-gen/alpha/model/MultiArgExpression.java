/**
 */
package alpha.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Arg Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.MultiArgExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.MultiArgExpression#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getMultiArgExpression()
 * @model
 * @generated
 */
public interface MultiArgExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.model.REDUCTION_OP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.REDUCTION_OP
	 * @see #setOperator(REDUCTION_OP)
	 * @see alpha.model.ModelPackage#getMultiArgExpression_Operator()
	 * @model unique="false"
	 * @generated
	 */
	REDUCTION_OP getOperator();

	/**
	 * Sets the value of the '{@link alpha.model.MultiArgExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.REDUCTION_OP
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(REDUCTION_OP value);

	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.AlphaExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getMultiArgExpression_Exprs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlphaExpression> getExprs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // MultiArgExpression
