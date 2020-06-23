/**
 */
package alpha.targetmapping;

import alpha.model.SystemBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Mapping For System Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.TargetMappingForSystemBody#getTargetBody <em>Target Body</em>}</li>
 *   <li>{@link alpha.targetmapping.TargetMappingForSystemBody#getScheduleTreeRoot <em>Schedule Tree Root</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getTargetMappingForSystemBody()
 * @model
 * @generated
 */
public interface TargetMappingForSystemBody extends TargetMappingNode, TargetMappingVisitable, ScopingEntity {
	/**
	 * Returns the value of the '<em><b>Target Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Body</em>' reference.
	 * @see #setTargetBody(SystemBody)
	 * @see alpha.targetmapping.TargetmappingPackage#getTargetMappingForSystemBody_TargetBody()
	 * @model
	 * @generated
	 */
	SystemBody getTargetBody();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TargetMappingForSystemBody#getTargetBody <em>Target Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Body</em>' reference.
	 * @see #getTargetBody()
	 * @generated
	 */
	void setTargetBody(SystemBody value);

	/**
	 * Returns the value of the '<em><b>Schedule Tree Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Tree Root</em>' containment reference.
	 * @see #setScheduleTreeRoot(ScheduleTreeExpression)
	 * @see alpha.targetmapping.TargetmappingPackage#getTargetMappingForSystemBody_ScheduleTreeRoot()
	 * @model containment="true"
	 * @generated
	 */
	ScheduleTreeExpression getScheduleTreeRoot();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TargetMappingForSystemBody#getScheduleTreeRoot <em>Schedule Tree Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Tree Root</em>' containment reference.
	 * @see #getScheduleTreeRoot()
	 * @generated
	 */
	void setScheduleTreeRoot(ScheduleTreeExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(TargetMappingVisitor visitor);

} // TargetMappingForSystemBody
