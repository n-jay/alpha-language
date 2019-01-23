/**
 */
package alpha.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub System Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.SubSystemCaseExpression#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getSubSystemCaseExpression()
 * @model
 * @generated
 */
public interface SubSystemCaseExpression extends UseExpression {
	/**
	 * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.model.UseExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exprs</em>' containment reference list.
	 * @see alpha.model.ModelPackage#getSubSystemCaseExpression_Exprs()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseExpression> getExprs();

} // SubSystemCaseExpression
