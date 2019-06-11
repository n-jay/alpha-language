/**
 */
package alpha.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JNI Function In Array Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.JNIFunctionInArrayNotation#getArrayNotation <em>Array Notation</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getJNIFunctionInArrayNotation()
 * @model
 * @generated
 */
public interface JNIFunctionInArrayNotation extends JNIFunction {
	/**
	 * Returns the value of the '<em><b>Array Notation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Notation</em>' attribute list.
	 * @see alpha.model.ModelPackage#getJNIFunctionInArrayNotation_ArrayNotation()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	EList<String> getArrayNotation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="alpha.model.String" unique="false"
	 * @generated
	 */
	String plainToString();

} // JNIFunctionInArrayNotation
