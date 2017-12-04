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
public interface Variable extends AlphaVisitable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.model.ModelPackage#getVariable_Name()
	 * @model unique="false"
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
	 * <p>
	 * If the meaning of the '<em>Domain Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%alpha.model.POLY_OBJECT_TYPE%&gt; _type = this.getDomainExpr().getType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_type, &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET));\nif (_notEquals)\n{\n\treturn null;\n}\n&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getDomainExpr().getISLObject();\nreturn ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt;) _iSLObject);'"
	 * @generated
	 */
	JNIISLSet getDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitVariable(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // Variable
