/**
 */
package alpha.targetmapping;

import alpha.model.JNIDomainInArrayNotation;

import fr.irisa.cairn.jnimap.isl.ISLSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.ContextExpression#getContextDomainExpr <em>Context Domain Expr</em>}</li>
 *   <li>{@link alpha.targetmapping.ContextExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getContextExpression()
 * @model
 * @generated
 */
public interface ContextExpression extends ScheduleTreeExpression {
	/**
	 * Returns the value of the '<em><b>Context Domain Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Domain Expr</em>' containment reference.
	 * @see #setContextDomainExpr(JNIDomainInArrayNotation)
	 * @see alpha.targetmapping.TargetmappingPackage#getContextExpression_ContextDomainExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIDomainInArrayNotation getContextDomainExpr();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ContextExpression#getContextDomainExpr <em>Context Domain Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Domain Expr</em>' containment reference.
	 * @see #getContextDomainExpr()
	 * @generated
	 */
	void setContextDomainExpr(JNIDomainInArrayNotation value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ScheduleTreeExpression)
	 * @see alpha.targetmapping.TargetmappingPackage#getContextExpression_Child()
	 * @model containment="true"
	 * @generated
	 */
	ScheduleTreeExpression getChild();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ContextExpression#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ScheduleTreeExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.targetmapping.JNIISLSet" unique="false"
	 * @generated
	 */
	ISLSet getContextDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(TargetMappingVisitor visitor);

} // ContextExpression
