/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Calculator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.UnaryCalculatorExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.UnaryCalculatorExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link alpha.model.UnaryCalculatorExpression#get__internal_cache_islObject <em>internal cache isl Object</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getUnaryCalculatorExpression()
 * @model
 * @generated
 */
public interface UnaryCalculatorExpression extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.model.CALCULATOR_UNARY_OP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.CALCULATOR_UNARY_OP
	 * @see #setOperator(CALCULATOR_UNARY_OP)
	 * @see alpha.model.ModelPackage#getUnaryCalculatorExpression_Operator()
	 * @model unique="false"
	 * @generated
	 */
	CALCULATOR_UNARY_OP getOperator();

	/**
	 * Sets the value of the '{@link alpha.model.UnaryCalculatorExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.CALCULATOR_UNARY_OP
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CALCULATOR_UNARY_OP value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getUnaryCalculatorExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.UnaryCalculatorExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(CalculatorExpression value);

	/**
	 * Returns the value of the '<em><b>internal cache isl Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>internal cache isl Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>internal cache isl Object</em>' attribute.
	 * @see #set__internal_cache_islObject(JNIObject)
	 * @see alpha.model.ModelPackage#getUnaryCalculatorExpression___internal_cache_islObject()
	 * @model unique="false" dataType="alpha.model.JNIObject"
	 * @generated
	 */
	JNIObject get__internal_cache_islObject();

	/**
	 * Sets the value of the '{@link alpha.model.UnaryCalculatorExpression#get__internal_cache_islObject <em>internal cache isl Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>internal cache isl Object</em>' attribute.
	 * @see #get__internal_cache_islObject()
	 * @generated
	 */
	void set__internal_cache_islObject(JNIObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; ___internal_cache_islObject = this.get__internal_cache_islObject();\nif ((___internal_cache_islObject instanceof &lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt;))\n{\n\treturn &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET;\n}\n&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; ___internal_cache_islObject_1 = this.get__internal_cache_islObject();\nif ((___internal_cache_islObject_1 instanceof &lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt;))\n{\n\treturn &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.MAP;\n}\nreturn null;'"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.get__internal_cache_islObject();'"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitUnaryCalculatorExpression(this);'"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // UnaryCalculatorExpression
