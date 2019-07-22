/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.ISLMap;
import fr.irisa.cairn.jnimap.isl.ISLSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.FuzzyVariable#getRangeExpr <em>Range Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getFuzzyVariable()
 * @model
 * @generated
 */
public interface FuzzyVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Range Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Expr</em>' containment reference.
	 * @see #setRangeExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getFuzzyVariable_RangeExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getRangeExpr();

	/**
	 * Sets the value of the '{@link alpha.model.FuzzyVariable#getRangeExpr <em>Range Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Expr</em>' containment reference.
	 * @see #getRangeExpr()
	 * @generated
	 */
	void setRangeExpr(CalculatorExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 * @generated
	 */
	ISLSet getRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 * @generated
	 */
	ISLMap getRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // FuzzyVariable
