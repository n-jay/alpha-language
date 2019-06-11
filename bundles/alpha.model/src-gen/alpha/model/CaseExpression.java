/**
 */
package alpha.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.CaseExpression#getName <em>Name</em>}</li>
 *   <li>{@link alpha.model.CaseExpression#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.model.ModelPackage#getCaseExpression_Name()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.model.CaseExpression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.AlphaExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getCaseExpression_Exprs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlphaExpression> getExprs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.boolean" unique="false"
	 * @generated
	 */
	Boolean isNamed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // CaseExpression
