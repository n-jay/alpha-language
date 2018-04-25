/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Fuzzy Reduce Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AbstractFuzzyReduceExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link alpha.model.AbstractFuzzyReduceExpression#getProjectionFunction <em>Projection Function</em>}</li>
 *   <li>{@link alpha.model.AbstractFuzzyReduceExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAbstractFuzzyReduceExpression()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFuzzyReduceExpression extends AlphaExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link alpha.model.REDUCTION_OP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.REDUCTION_OP
	 * @see #setOperator(REDUCTION_OP)
	 * @see alpha.model.ModelPackage#getAbstractFuzzyReduceExpression_Operator()
	 * @model unique="false"
	 * @generated
	 */
	REDUCTION_OP getOperator();

	/**
	 * Sets the value of the '{@link alpha.model.AbstractFuzzyReduceExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see alpha.model.REDUCTION_OP
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(REDUCTION_OP value);

	/**
	 * Returns the value of the '<em><b>Projection Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection Function</em>' containment reference.
	 * @see #setProjectionFunction(FuzzyFunction)
	 * @see alpha.model.ModelPackage#getAbstractFuzzyReduceExpression_ProjectionFunction()
	 * @model containment="true"
	 * @generated
	 */
	FuzzyFunction getProjectionFunction();

	/**
	 * Sets the value of the '{@link alpha.model.AbstractFuzzyReduceExpression#getProjectionFunction <em>Projection Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection Function</em>' containment reference.
	 * @see #getProjectionFunction()
	 * @generated
	 */
	void setProjectionFunction(FuzzyFunction value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(AlphaExpression)
	 * @see alpha.model.ModelPackage#getAbstractFuzzyReduceExpression_Body()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getBody();

	/**
	 * Sets the value of the '{@link alpha.model.AbstractFuzzyReduceExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(AlphaExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLMap" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt; _xifexpression = null;\n&lt;%alpha.model.FuzzyFunction%&gt; _projectionFunction = this.getProjectionFunction();\nboolean _tripleNotEquals = (_projectionFunction != null);\nif (_tripleNotEquals)\n{\n\t_xifexpression = this.getProjectionFunction().getDependenceRelation();\n}\nelse\n{\n\t_xifexpression = null;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLMap getProjection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitAbstractFuzzyReduceExpression(this);'"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // AbstractFuzzyReduceExpression
