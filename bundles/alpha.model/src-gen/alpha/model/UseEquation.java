/**
 */
package alpha.model;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.UseEquation#getInstantiationDomainExpr <em>Instantiation Domain Expr</em>}</li>
 *   <li>{@link alpha.model.UseEquation#getSubsystemDims <em>Subsystem Dims</em>}</li>
 *   <li>{@link alpha.model.UseEquation#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getUseEquation()
 * @model
 * @generated
 */
public interface UseEquation extends AlphaVisitable {
	/**
	 * Returns the value of the '<em><b>Instantiation Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation Domain Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation Domain Expr</em>' containment reference.
	 * @see #setInstantiationDomainExpr(CalculatorExpression)
	 * @see alpha.model.ModelPackage#getUseEquation_InstantiationDomainExpr()
	 * @model containment="true"
	 * @generated
	 */
	CalculatorExpression getInstantiationDomainExpr();

	/**
	 * Sets the value of the '{@link alpha.model.UseEquation#getInstantiationDomainExpr <em>Instantiation Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiation Domain Expr</em>' containment reference.
	 * @see #getInstantiationDomainExpr()
	 * @generated
	 */
	void setInstantiationDomainExpr(CalculatorExpression value);

	/**
	 * Returns the value of the '<em><b>Subsystem Dims</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsystem Dims</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem Dims</em>' attribute list.
	 * @see alpha.model.ModelPackage#getUseEquation_SubsystemDims()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSubsystemDims();

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(UseExpression)
	 * @see alpha.model.ModelPackage#getUseEquation_Expr()
	 * @model containment="true"
	 * @generated
	 */
	UseExpression getExpr();

	/**
	 * Sets the value of the '{@link alpha.model.UseEquation#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(UseExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.JNIISLSet" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt; _xifexpression = null;\n&lt;%alpha.model.POLY_OBJECT_TYPE%&gt; _type = this.getInstantiationDomainExpr().getType();\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(_type, &lt;%alpha.model.POLY_OBJECT_TYPE%&gt;.SET));\nif (_notEquals)\n{\n\t_xifexpression = null;\n}\nelse\n{\n\t&lt;%fr.irisa.cairn.jnimap.runtime.JNIObject%&gt; _iSLObject = this.getInstantiationDomainExpr().getISLObject();\n\t_xifexpression = ((&lt;%fr.irisa.cairn.jnimap.isl.jni.JNIISLSet%&gt;) _iSLObject);\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	JNIISLSet getInstantiationDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='visitor.visitUseEquation(this);'"
	 * @generated
	 */
	void accept(AlphaVisitor visitor);

} // UseEquation
