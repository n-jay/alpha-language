/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Calculator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.BinaryCalculatorExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.BinaryCalculatorExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link alpha.model.BinaryCalculatorExpression#getRight <em>Right</em>}</li>
 *   <li>{@link alpha.model.BinaryCalculatorExpression#getZ__internal_cache_islObject <em>Zinternal cache isl Object</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getBinaryCalculatorExpression()
 * @model
 * @generated
 */
public interface BinaryCalculatorExpression extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.model.CALCULATOR_BINARY_OP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.CALCULATOR_BINARY_OP
	 * @see #setOperator(CALCULATOR_BINARY_OP)
	 * @see alpha.model.ModelPackage#getBinaryCalculatorExpression_Operator()
	 * @model unique="false"
	 * @generated
	 */
	CALCULATOR_BINARY_OP getOperator();

	/**
	 * Sets the value of the '{@link alpha.model.BinaryCalculatorExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.CALCULATOR_BINARY_OP
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CALCULATOR_BINARY_OP value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getBinaryCalculatorExpression_Left()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getLeft();

	/**
	 * Sets the value of the '{@link alpha.model.BinaryCalculatorExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(CalculatorExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getBinaryCalculatorExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getRight();

	/**
	 * Sets the value of the '{@link alpha.model.BinaryCalculatorExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(CalculatorExpression value);

	/**
	 * Returns the value of the '<em><b>Zinternal cache isl Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal cache isl Object</em>' attribute.
	 * @see #setZ__internal_cache_islObject(JNIObject)
	 * @see alpha.model.ModelPackage#getBinaryCalculatorExpression_Z__internal_cache_islObject()
	 * @model unique="false" dataType="alpha.model.JNIObject"
	 * @generated
	 */
	JNIObject getZ__internal_cache_islObject();

	/**
	 * Sets the value of the '{@link alpha.model.BinaryCalculatorExpression#getZ__internal_cache_islObject <em>Zinternal cache isl Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal cache isl Object</em>' attribute.
	 * @see #getZ__internal_cache_islObject()
	 * @generated
	 */
	void setZ__internal_cache_islObject(JNIObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String plainToString();

} // BinaryCalculatorExpression
