/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Restrict Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AutoRestrictExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link alpha.model.AutoRestrictExpression#getZ__internal_cache_inferredDomain <em>Zinternal cache inferred Domain</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAutoRestrictExpression()
 * @model
 * @generated
 */
public interface AutoRestrictExpression extends AlphaExpression {
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
	 * @see alpha.model.ModelPackage#getAutoRestrictExpression_Expr()
	 * @model containment="true"
	 * @generated
	 */
	AlphaExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.AutoRestrictExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(AlphaExpression value);

	/**
	 * Returns the value of the '<em><b>Zinternal cache inferred Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zinternal cache inferred Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal cache inferred Domain</em>' attribute.
	 * @see #setZ__internal_cache_inferredDomain(JNIISLSet)
	 * @see alpha.model.ModelPackage#getAutoRestrictExpression_Z__internal_cache_inferredDomain()
	 * @model unique="false" dataType="alpha.model.JNIISLSet"
	 * @generated
	 */
	JNIISLSet getZ__internal_cache_inferredDomain();

	/**
	 * Sets the value of the '{@link alpha.model.AutoRestrictExpression#getZ__internal_cache_inferredDomain <em>Zinternal cache inferred Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal cache inferred Domain</em>' attribute.
	 * @see #getZ__internal_cache_inferredDomain()
	 * @generated
	 */
	void setZ__internal_cache_inferredDomain(JNIISLSet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 * @generated
	 */
	JNIISLSet getInferredDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model islsetDataType="alpha.model.JNIISLSet" islsetUnique="false"
	 * @generated
	 */
	void setInferredDomain(JNIISLSet islset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaExpressionVisitor visitor);

} // AutoRestrictExpression
