/**
 */
package alpha.model;

import java.util.Queue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.Equation#getSystemBody <em>System Body</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getEquation()
 * @model abstract="true"
 * @generated
 */
public interface Equation extends AlphaNode, AlphaVisitable, AlphaSystemElement, AlphaScheduleTarget {
	/**
	 * Returns the value of the '<em><b>System Body</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link alpha.model.SystemBody#getEquations <em>Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Body</em>' container reference.
	 * @see #setSystemBody(SystemBody)
	 * @see alpha.model.ModelPackage#getEquation_SystemBody()
	 * @see alpha.model.SystemBody#getEquations
	 * @model opposite="equations" transient="false"
	 * @generated
	 */
	SystemBody getSystemBody();

	/**
	 * Sets the value of the '{@link alpha.model.Equation#getSystemBody <em>System Body</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Body</em>' container reference.
	 * @see #getSystemBody()
	 * @generated
	 */
	void setSystemBody(SystemBody value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exprIDDataType="alpha.model.IntegerQueue" exprIDUnique="false"
	 * @generated
	 */
	AlphaExpression getExpression(Queue<Integer> exprID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exprIDDataType="alpha.model.int" exprIDUnique="false" exprIDMany="true"
	 * @generated
	 */
	AlphaExpression getExpression(EList<Integer> exprID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exprIDstrDataType="alpha.model.String" exprIDstrUnique="false"
	 * @generated
	 */
	AlphaExpression getExpression(String exprIDstr);

} // Equation
