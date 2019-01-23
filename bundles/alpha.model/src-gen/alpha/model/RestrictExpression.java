/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restrict Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.RestrictExpression#getDomainExpr <em>Domain Expr</em>}</li>
 *   <li>{@link alpha.model.RestrictExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getRestrictExpression()
 * @model
 * @generated
 */
public interface RestrictExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Expr</em>' containment reference.
	 * @see #setDomainExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getRestrictExpression_DomainExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getDomainExpr();

	/**
	 * Sets the value of the '{@link alpha.model.RestrictExpression#getDomainExpr <em>Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Expr</em>' containment reference.
	 * @see #getDomainExpr()
	 * @generated
	 */
	void setDomainExpr(CalculatorExpression value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(AlphaExpression)
	 * @see alpha.model.ModelPackage#getRestrictExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.RestrictExpression#getExpr <em>Expr</em>}' containment reference.
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
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; _xifexpression = null;\n&lt;%alpha.model.POLY_OBJECT_TYPE%&gt; _type = this.getDomainExpr().getType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_type, &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET));\nif (_notEquals)\n{\n\t_xifexpression = null;\n}\nelse\n{\n\t&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getDomainExpr().getISLObject();\n\t_xifexpression = ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt;) _iSLObject);\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLSet getRestrictDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitRestrictExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // RestrictExpression
