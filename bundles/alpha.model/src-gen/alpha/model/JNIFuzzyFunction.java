/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JNI Fuzzy Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.JNIFuzzyFunction#getAlphaString <em>Alpha String</em>}</li>
 *   <li>{@link alpha.model.JNIFuzzyFunction#getZ__internal_cache_islUMap <em>Zinternal cache isl UMap</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getJNIFuzzyFunction()
 * @model
 * @generated
 */
public interface JNIFuzzyFunction extends CalculatorExpression {
	/**
	 * Returns the value of the '<em><b>Alpha String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha String</em>' attribute.
	 * @see #setAlphaString(String)
	 * @see alpha.model.ModelPackage#getJNIFuzzyFunction_AlphaString()
	 * @model unique="false"
	 * @generated
	 */
	String getAlphaString();

	/**
	 * Sets the value of the '{@link alpha.model.JNIFuzzyFunction#getAlphaString <em>Alpha String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha String</em>' attribute.
	 * @see #getAlphaString()
	 * @generated
	 */
	void setAlphaString(String value);

	/**
	 * Returns the value of the '<em><b>Zinternal cache isl UMap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zinternal cache isl UMap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zinternal cache isl UMap</em>' attribute.
	 * @see #setZ__internal_cache_islUMap(JNIISLUnionMap)
	 * @see alpha.model.ModelPackage#getJNIFuzzyFunction_Z__internal_cache_islUMap()
	 * @model unique="false" dataType="alpha.model.JNIISLUnionMap"
	 * @generated
	 */
	JNIISLUnionMap getZ__internal_cache_islUMap();

	/**
	 * Sets the value of the '{@link alpha.model.JNIFuzzyFunction#getZ__internal_cache_islUMap <em>Zinternal cache isl UMap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zinternal cache isl UMap</em>' attribute.
	 * @see #getZ__internal_cache_islUMap()
	 * @generated
	 */
	void setZ__internal_cache_islUMap(JNIISLUnionMap value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLUnionMap" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap%&gt; _xifexpression = null;\n&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap%&gt; _z__internal_cache_islUMap = this.getZ__internal_cache_islUMap();\nboolean _tripleNotEquals = (_z__internal_cache_islUMap != null);\nif (_tripleNotEquals)\n{\n\t_xifexpression = this.getZ__internal_cache_islUMap().copy();\n}\nelse\n{\n\t_xifexpression = null;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLUnionMap getISLUnionMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model islUMapDataType="alpha.model.JNIISLUnionMap" islUMapUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setZ__internal_cache_islUMap(islUMap);'"
	 * @generated
	 */
	void setISLUnionMap(JNIISLUnionMap islUMap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.UNION_MAP;'"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getISLUnionMap();'"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getAlphaString();'"
	 * @generated
	 */
	String plainToString();

} // JNIFuzzyFunction
