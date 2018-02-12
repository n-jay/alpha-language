/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JNI Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.JNIDomain#getIslString <em>Isl String</em>}</li>
 *   <li>{@link alpha.model.JNIDomain#getZ__internal_cache_islSet <em>Zinternal cache isl Set</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getJNIDomain()
 * @model
 * @generated
 */
public interface JNIDomain extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Isl String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isl String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isl String</em>' attribute.
	 * @see #setIslString(String)
	 * @see alpha.model.ModelPackage#getJNIDomain_IslString()
	 * @model unique="false"
	 * @generated
	 */
	String getIslString();

	/**
	 * Sets the value of the '{@link alpha.model.JNIDomain#getIslString <em>Isl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isl String</em>' attribute.
	 * @see #getIslString()
	 * @generated
	 */
	void setIslString(String value);

	/**
	 * Returns the value of the '<em><b>Zinternal cache isl Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zinternal cache isl Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal cache isl Set</em>' attribute.
	 * @see #setZ__internal_cache_islSet(JNIISLSet)
	 * @see alpha.model.ModelPackage#getJNIDomain_Z__internal_cache_islSet()
	 * @model unique="false" dataType="alpha.model.JNIISLSet"
	 * @generated
	 */
	JNIISLSet getZ__internal_cache_islSet();

	/**
	 * Sets the value of the '{@link alpha.model.JNIDomain#getZ__internal_cache_islSet <em>Zinternal cache isl Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal cache isl Set</em>' attribute.
	 * @see #getZ__internal_cache_islSet()
	 * @generated
	 */
	void setZ__internal_cache_islSet(JNIISLSet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; _xifexpression = null;\n&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; _z__internal_cache_islSet = this.getZ__internal_cache_islSet();\nboolean _tripleNotEquals = (_z__internal_cache_islSet != null);\nif (_tripleNotEquals)\n{\n\t_xifexpression = this.getZ__internal_cache_islSet().copy();\n}\nelse\n{\n\t_xifexpression = null;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLSet getISLSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model islsetDataType="alpha.model.JNIISLSet" islsetUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setZ__internal_cache_islSet(islset);'"
	 * @generated
	 */
	void setISLSet(JNIISLSet islset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET;'"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getISLSet();'"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; _z__internal_cache_islSet = this.getZ__internal_cache_islSet();\nboolean _tripleNotEquals = (_z__internal_cache_islSet != null);\nif (_tripleNotEquals)\n{\n\treturn this.getZ__internal_cache_islSet().toString(&lt;%fr.irisa.cairn.jnimap.isl.jni.ISL_FORMAT%&gt;.ISL);\n}\nelse\n{\n\treturn \"null ISL object\";\n}'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getIslString();'"
	 * @generated
	 */
	String plainToString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitJNIDomain(this);'"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // JNIDomain
