/**
 */
package alpha.targetmapping;

import alpha.model.JNIDomainInArrayNotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.GuardExpression#getGuardDomain <em>Guard Domain</em>}</li>
 *   <li>{@link alpha.targetmapping.GuardExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getGuardExpression()
 * @model
 * @generated
 */
public interface GuardExpression extends ScheduleTreeExpression {
	/**
	 * Returns the value of the '<em><b>Guard Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Domain</em>' containment reference.
	 * @see #setGuardDomain(JNIDomainInArrayNotation)
	 * @see alpha.targetmapping.TargetmappingPackage#getGuardExpression_GuardDomain()
	 * @model containment="true"
	 * @generated
	 */
	JNIDomainInArrayNotation getGuardDomain();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.GuardExpression#getGuardDomain <em>Guard Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Domain</em>' containment reference.
	 * @see #getGuardDomain()
	 * @generated
	 */
	void setGuardDomain(JNIDomainInArrayNotation value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ScheduleTreeExpression)
	 * @see alpha.targetmapping.TargetmappingPackage#getGuardExpression_Child()
	 * @model containment="true"
	 * @generated
	 */
	ScheduleTreeExpression getChild();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.GuardExpression#getChild <em>Child</em>}' containment reference.
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

} // GuardExpression
