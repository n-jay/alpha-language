/**
 */
package alpha.codegen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * An include statement. Only needs to specify the file path to include.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.Include#getFile <em>File</em>}</li>
 *   <li>{@link alpha.codegen.Include#isUseQuotes <em>Use Quotes</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The name of the file to include. The file extension must be provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see alpha.codegen.CodegenPackage#getInclude_File()
	 * @model unique="false"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link alpha.codegen.Include#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Use Quotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * If <code>true</code>, the file will be surrounded in quotes (").
	 * If <code>false</code>, the file will be surrounded in angle brackets (< and >).
	 * See the following link for details: https://en.cppreference.com/w/c/preprocessor/include
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Quotes</em>' attribute.
	 * @see #setUseQuotes(boolean)
	 * @see alpha.codegen.CodegenPackage#getInclude_UseQuotes()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUseQuotes();

	/**
	 * Sets the value of the '{@link alpha.codegen.Include#isUseQuotes <em>Use Quotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Quotes</em>' attribute.
	 * @see #isUseQuotes()
	 * @generated
	 */
	void setUseQuotes(boolean value);

} // Include
