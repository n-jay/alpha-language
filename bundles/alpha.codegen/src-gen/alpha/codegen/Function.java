/**
 */
package alpha.codegen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * The definition of a function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.Function#getIsInline <em>Is Inline</em>}</li>
 *   <li>{@link alpha.codegen.Function#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link alpha.codegen.Function#getName <em>Name</em>}</li>
 *   <li>{@link alpha.codegen.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link alpha.codegen.Function#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link alpha.codegen.Function#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * If <code>true</code>, the function will be marked with the <code>inline</code> keyword.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Inline</em>' attribute.
	 * @see #setIsInline(Boolean)
	 * @see alpha.codegen.CodegenPackage#getFunction_IsInline()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsInline();

	/**
	 * Sets the value of the '{@link alpha.codegen.Function#getIsInline <em>Is Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inline</em>' attribute.
	 * @see #getIsInline()
	 * @generated
	 */
	void setIsInline(Boolean value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The return type of the function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(DataType)
	 * @see alpha.codegen.CodegenPackage#getFunction_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link alpha.codegen.Function#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The name of the function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.codegen.CodegenPackage#getFunction_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.codegen.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The list of parameters for the function. May be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.VariableDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The list of variables to declare at the start of the function. May be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getFunction_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDecl> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.codegen.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The list of statements inside the function. May be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see alpha.codegen.CodegenPackage#getFunction_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // Function
