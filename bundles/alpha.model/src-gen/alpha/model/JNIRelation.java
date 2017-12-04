/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JNI Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.JNIRelation#getIslString <em>Isl String</em>}</li>
 *   <li>{@link alpha.model.JNIRelation#getIslMap <em>Isl Map</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getJNIRelation()
 * @model
 * @generated
 */
public interface JNIRelation extends CalculatorExpression {
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
	 * @see alpha.model.ModelPackage#getJNIRelation_IslString()
	 * @model unique="false"
	 * @generated
	 */
	String getIslString();

	/**
	 * Sets the value of the '{@link alpha.model.JNIRelation#getIslString <em>Isl String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isl String</em>' attribute.
	 * @see #getIslString()
	 * @generated
	 */
	void setIslString(String value);

	/**
	 * Returns the value of the '<em><b>Isl Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isl Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isl Map</em>' attribute.
	 * @see #setIslMap(JNIISLMap)
	 * @see alpha.model.ModelPackage#getJNIRelation_IslMap()
	 * @model unique="false" dataType="alpha.model.JNIISLMap"
	 * @generated
	 */
	JNIISLMap getIslMap();

	/**
	 * Sets the value of the '{@link alpha.model.JNIRelation#getIslMap <em>Isl Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isl Map</em>' attribute.
	 * @see #getIslMap()
	 * @generated
	 */
	void setIslMap(JNIISLMap value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.MAP;'"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getIslMap();'"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLMap%&gt; _islMap = this.getIslMap();\nboolean _tripleNotEquals = (_islMap != null);\nif (_tripleNotEquals)\n{\n\treturn this.getIslMap().toString(&lt;%fr.irisa.cairn.jnimap.isl.jni.ISL_FORMAT%&gt;.ISL);\n}\nelse\n{\n\treturn \"null ISL object\";\n}'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitJNIRelation(this);'"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // JNIRelation
