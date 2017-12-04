/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JNI Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.JNIFunction#getAlphaString <em>Alpha String</em>}</li>
 *   <li>{@link alpha.model.JNIFunction#getIslMAff <em>Isl MAff</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getJNIFunction()
 * @model
 * @generated
 */
public interface JNIFunction extends CalculatorExpression {
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
	 * @see alpha.model.ModelPackage#getJNIFunction_AlphaString()
	 * @model unique="false"
	 * @generated
	 */
	String getAlphaString();

	/**
	 * Sets the value of the '{@link alpha.model.JNIFunction#getAlphaString <em>Alpha String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha String</em>' attribute.
	 * @see #getAlphaString()
	 * @generated
	 */
	void setAlphaString(String value);

	/**
	 * Returns the value of the '<em><b>Isl MAff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isl MAff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isl MAff</em>' attribute.
	 * @see #setIslMAff(JNIISLMultiAff)
	 * @see alpha.model.ModelPackage#getJNIFunction_IslMAff()
	 * @model unique="false" dataType="alpha.model.JNIISLMultiAff"
	 * @generated
	 */
	JNIISLMultiAff getIslMAff();

	/**
	 * Sets the value of the '{@link alpha.model.JNIFunction#getIslMAff <em>Isl MAff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isl MAff</em>' attribute.
	 * @see #getIslMAff()
	 * @generated
	 */
	void setIslMAff(JNIISLMultiAff value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.FUNCTION;'"
	 * @generated
	 */
	POLY_OBJECT_TYPE getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIObject" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getIslMAff();'"
	 * @generated
	 */
	JNIObject getISLObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitJNIFunction(this);'"
	 * @generated
	 */
	void accept(CalculatorExpressionVisitor visitor);

} // JNIFunction
