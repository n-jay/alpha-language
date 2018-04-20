/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Index Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.FuzzyIndexExpression#getFunctionExpr <em>Function Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getFuzzyIndexExpression()
 * @model
 * @generated
 */
public interface FuzzyIndexExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Function Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Expr</em>' containment reference.
	 * @see #setFunctionExpr(JNIFuzzyFunction)
	 * @see alpha.model.ModelPackage#getFuzzyIndexExpression_FunctionExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIFuzzyFunction getFunctionExpr();

	/**
	 * Sets the value of the '{@link alpha.model.FuzzyIndexExpression#getFunctionExpr <em>Function Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Expr</em>' containment reference.
	 * @see #getFunctionExpr()
	 * @generated
	 */
	void setFunctionExpr(JNIFuzzyFunction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLUnionMap" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap%&gt; _xifexpression = null;\n&lt;%alpha.model.POLY_OBJECT_TYPE%&gt; _type = this.getFunctionExpr().getType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_type, &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.UNION_MAP));\nif (_notEquals)\n{\n\t_xifexpression = null;\n}\nelse\n{\n\t&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getFunctionExpr().getISLObject();\n\t_xifexpression = ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap%&gt;) _iSLObject);\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLUnionMap getFunction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitFuzzyIndexExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // FuzzyIndexExpression
