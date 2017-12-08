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
 *   <li>{@link alpha.model.AlphaExpression#get__internal_cache_exprDom <em>internal cache expr Dom</em>}</li>
 *   <li>{@link alpha.model.AlphaExpression#get__internal_cache_contextDom <em>internal cache context Dom</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaExpression()
 * @model abstract="true"
 * @generated
 */
public interface AlphaExpression extends AlphaExpressionVisitable {
	/**
	 * Returns the value of the '<em><b>internal cache expr Dom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal object for always copying expression domain at getter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>internal cache expr Dom</em>' attribute.
	 * @see #set__internal_cache_exprDom(JNIISLSet)
	 * @see alpha.model.ModelPackage#getAlphaExpression___internal_cache_exprDom()
	 * @model unique="false" dataType="alpha.model.JNIISLSet"
	 * @generated
	 */
	JNIISLSet get__internal_cache_exprDom();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaExpression#get__internal_cache_exprDom <em>internal cache expr Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>internal cache expr Dom</em>' attribute.
	 * @see #get__internal_cache_exprDom()
	 * @generated
	 */
	void set__internal_cache_exprDom(JNIISLSet value);

	/**
	 * Returns the value of the '<em><b>internal cache context Dom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal object for always copying context domain at getter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>internal cache context Dom</em>' attribute.
	 * @see #set__internal_cache_contextDom(JNIISLSet)
	 * @see alpha.model.ModelPackage#getAlphaExpression___internal_cache_contextDom()
	 * @model unique="false" dataType="alpha.model.JNIISLSet"
	 * @generated
	 */
	JNIISLSet get__internal_cache_contextDom();

	/**
	 * Sets the value of the '{@link alpha.model.AlphaExpression#get__internal_cache_contextDom <em>internal cache context Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>internal cache context Dom</em>' attribute.
	 * @see #get__internal_cache_contextDom()
	 * @generated
	 */
	void set__internal_cache_contextDom(JNIISLSet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model domDataType="alpha.model.JNIISLSet" domUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.set__internal_cache_exprDom(dom);'"
	 * @generated
	 */
	void setExpressionDomain(JNIISLSet dom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; ___internal_cache_exprDom = this.get__internal_cache_exprDom();\nboolean _tripleNotEquals = (___internal_cache_exprDom != null);\nif (_tripleNotEquals)\n{\n\treturn this.get__internal_cache_exprDom().copy();\n}\nreturn null;'"
	 * @generated
	 */
	JNIISLSet getExpressionDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model domDataType="alpha.model.JNIISLSet" domUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.set__internal_cache_contextDom(dom);'"
	 * @generated
	 */
	void setContextDomain(JNIISLSet dom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; ___internal_cache_contextDom = this.get__internal_cache_contextDom();\nboolean _tripleNotEquals = (___internal_cache_contextDom != null);\nif (_tripleNotEquals)\n{\n\treturn this.get__internal_cache_contextDom().copy();\n}\nreturn null;'"
	 * @generated
	 */
	JNIISLSet getContextDomain();

} // AlphaExpression
