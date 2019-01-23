/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.SelectExpression#getRelationExpr <em>Relation Expr</em>}</li>
 *   <li>{@link alpha.model.SelectExpression#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getSelectExpression()
 * @model
 * @generated
 */
public interface SelectExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Relation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Expr</em>' containment reference.
	 * @see #setRelationExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getSelectExpression_RelationExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getRelationExpr();

	/**
	 * Sets the value of the '{@link alpha.model.SelectExpression#getRelationExpr <em>Relation Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Expr</em>' containment reference.
	 * @see #getRelationExpr()
	 * @generated
	 */
	void setRelationExpr(CalculatorExpression value);

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
	 * @see alpha.model.ModelPackage#getSelectExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.SelectExpression#getExpr <em>Expr</em>}' containment reference.
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
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt; _xifexpression = null;\n&lt;%alpha.model.POLY_OBJECT_TYPE%&gt; _type = this.getRelationExpr().getType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_type, &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.MAP));\nif (_notEquals)\n{\n\t_xifexpression = null;\n}\nelse\n{\n\t&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getRelationExpr().getISLObject();\n\t_xifexpression = ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt;) _iSLObject);\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLMap getSelectRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitSelectExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // SelectExpression
