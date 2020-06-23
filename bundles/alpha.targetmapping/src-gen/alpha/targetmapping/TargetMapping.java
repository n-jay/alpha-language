/**
 */
package alpha.targetmapping;

import alpha.model.AlphaSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.TargetMapping#getTargetSystem <em>Target System</em>}</li>
 *   <li>{@link alpha.targetmapping.TargetMapping#getScheduleTreeRoot <em>Schedule Tree Root</em>}</li>
 *   <li>{@link alpha.targetmapping.TargetMapping#getMemorySpaces <em>Memory Spaces</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getTargetMapping()
 * @model
 * @generated
 */
public interface TargetMapping extends TargetMappingNode, TargetMappingVisitable, ScopingEntity {
	/**
	 * Returns the value of the '<em><b>Target System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target System</em>' reference.
	 * @see #setTargetSystem(AlphaSystem)
	 * @see alpha.targetmapping.TargetmappingPackage#getTargetMapping_TargetSystem()
	 * @model
	 * @generated
	 */
	AlphaSystem getTargetSystem();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TargetMapping#getTargetSystem <em>Target System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target System</em>' reference.
	 * @see #getTargetSystem()
	 * @generated
	 */
	void setTargetSystem(AlphaSystem value);

	/**
	 * Returns the value of the '<em><b>Schedule Tree Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Tree Root</em>' containment reference.
	 * @see #setScheduleTreeRoot(ScheduleTreeExpression)
	 * @see alpha.targetmapping.TargetmappingPackage#getTargetMapping_ScheduleTreeRoot()
	 * @model containment="true"
	 * @generated
	 */
	ScheduleTreeExpression getScheduleTreeRoot();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TargetMapping#getScheduleTreeRoot <em>Schedule Tree Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Tree Root</em>' containment reference.
	 * @see #getScheduleTreeRoot()
	 * @generated
	 */
	void setScheduleTreeRoot(ScheduleTreeExpression value);

	/**
	 * Returns the value of the '<em><b>Memory Spaces</b></em>' containment reference list.
	 * The list contents are of type {@link alpha.targetmapping.MemorySpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Spaces</em>' containment reference list.
	 * @see alpha.targetmapping.TargetmappingPackage#getTargetMapping_MemorySpaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemorySpace> getMemorySpaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(TargetMappingVisitor visitor);

} // TargetMapping
