/**
 */
package alpha.targetmapping;

import alpha.model.JNIDomainInArrayNotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.ContextExpression#getContextDomain <em>Context Domain</em>}</li>
 *   <li>{@link alpha.targetmapping.ContextExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getContextExpression()
 * @model
 * @generated
 */
public interface ContextExpression extends ScheduleTreeExpression {
	/**
	 * Returns the value of the '<em><b>Context Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Domain</em>' containment reference.
	 * @see #setContextDomain(JNIDomainInArrayNotation)
	 * @see alpha.targetmapping.TargetmappingPackage#getContextExpression_ContextDomain()
	 * @model containment="true"
	 * @generated
	 */
	JNIDomainInArrayNotation getContextDomain();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ContextExpression#getContextDomain <em>Context Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Domain</em>' containment reference.
	 * @see #getContextDomain()
	 * @generated
	 */
	void setContextDomain(JNIDomainInArrayNotation value);

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
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(TargetMappingVisitor visitor);

} // ContextExpression
