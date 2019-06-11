/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.Variable#getName <em>Name</em>}</li>
 *   <li>{@link alpha.model.Variable#getDomainExpr <em>Domain Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends AlphaNode, AlphaVisitable, AlphaSystemElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.model.ModelPackage#getVariable_Name()
	 * @model unique="false" dataType="alpha.model.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.model.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Expr</em>' containment reference.
	 * @see #setDomainExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getVariable_DomainExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getDomainExpr();

	/**
	 * Sets the value of the '{@link alpha.model.Variable#getDomainExpr <em>Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Expr</em>' containment reference.
	 * @see #getDomainExpr()
	 * @generated
	 */
	void setDomainExpr(CalculatorExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 * @generated
	 */
	JNIISLSet getDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.boolean" unique="false"
	 * @generated
	 */
	Boolean isInput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.boolean" unique="false"
	 * @generated
	 */
	Boolean isOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.boolean" unique="false"
	 * @generated
	 */
	Boolean isLocal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // Variable
