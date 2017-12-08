/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * Alpha Expressions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AlphaExpression#getExpressionDomain <em>Expression Domain</em>}</li>
 *   <li>{@link alpha.model.AlphaExpression#getContextDomain <em>Context Domain</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaExpression()
 * @model abstract="true"
 * @generated
 */
public interface AlphaExpression extends AlphaExpressionVisitable {
	/**
	 * Returns the value of the '<em><b>Expression Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Domain</em>' attribute.
	 * @see #setExpressionDomain(JNIISLSet)
	 * @see alpha.model.ModelPackage#getAlphaExpression_ExpressionDomain()
	 * @model unique="false" dataType="alpha.model.JNIISLSet"
	 * @generated
	 */
	JNIISLSet getExpressionDomain();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaExpression#getExpressionDomain <em>Expression Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Domain</em>' attribute.
	 * @see #getExpressionDomain()
	 * @generated
	 */
	void setExpressionDomain(JNIISLSet value);

	/**
	 * Returns the value of the '<em><b>Context Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Domain</em>' attribute.
	 * @see #setContextDomain(JNIISLSet)
	 * @see alpha.model.ModelPackage#getAlphaExpression_ContextDomain()
	 * @model unique="false" dataType="alpha.model.JNIISLSet"
	 * @generated
	 */
	JNIISLSet getContextDomain();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaExpression#getContextDomain <em>Context Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Domain</em>' attribute.
	 * @see #getContextDomain()
	 * @generated
	 */
	void setContextDomain(JNIISLSet value);

} // AlphaExpression
