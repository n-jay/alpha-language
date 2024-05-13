/**
 */
package alpha.codegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * Represents a conditional branch of an "if" statement (i.e., "if" or "else if").
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.ConditionalBranch#getConditional <em>Conditional</em>}</li>
 * </ul>
 *
 * @see alpha.codegen.CodegenPackage#getConditionalBranch()
 * @model
 * @generated
 */
public interface ConditionalBranch extends Branch {
	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional</em>' containment reference.
	 * @see #setConditional(Expression)
	 * @see alpha.codegen.CodegenPackage#getConditionalBranch_Conditional()
	 * @model containment="true"
	 * @generated
	 */
	Expression getConditional();

	/**
	 * Sets the value of the '{@link alpha.codegen.ConditionalBranch#getConditional <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' containment reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(Expression value);

} // ConditionalBranch
