/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Index Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.FuzzyIndexExpression#getFuzzyFunction <em>Fuzzy Function</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getFuzzyIndexExpression()
 * @model
 * @generated
 */
public interface FuzzyIndexExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Fuzzy Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuzzy Function</em>' containment reference.
	 * @see #setFuzzyFunction(FuzzyFunction)
	 * @see alpha.model.ModelPackage#getFuzzyIndexExpression_FuzzyFunction()
	 * @model containment="true"
	 * @generated
	 */
	FuzzyFunction getFuzzyFunction();

	/**
	 * Sets the value of the '{@link alpha.model.FuzzyIndexExpression#getFuzzyFunction <em>Fuzzy Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuzzy Function</em>' containment reference.
	 * @see #getFuzzyFunction()
	 * @generated
	 */
	void setFuzzyFunction(FuzzyFunction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 * @generated
	 */
	JNIISLMap getDependenceRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // FuzzyIndexExpression
