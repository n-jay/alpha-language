/**
 */
package alpha.targetmapping;

import alpha.model.AlphaScheduleTarget;
import alpha.model.JNIDomainInArrayNotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Target Restrict Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.ScheduleTargetRestrictDomain#getScheduleTarget <em>Schedule Target</em>}</li>
 *   <li>{@link alpha.targetmapping.ScheduleTargetRestrictDomain#getIndexNames <em>Index Names</em>}</li>
 *   <li>{@link alpha.targetmapping.ScheduleTargetRestrictDomain#getRestrictDomain <em>Restrict Domain</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getScheduleTargetRestrictDomain()
 * @model
 * @generated
 */
public interface ScheduleTargetRestrictDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Schedule Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Target</em>' reference.
	 * @see #setScheduleTarget(AlphaScheduleTarget)
	 * @see alpha.targetmapping.TargetmappingPackage#getScheduleTargetRestrictDomain_ScheduleTarget()
	 * @model
	 * @generated
	 */
	AlphaScheduleTarget getScheduleTarget();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ScheduleTargetRestrictDomain#getScheduleTarget <em>Schedule Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Target</em>' reference.
	 * @see #getScheduleTarget()
	 * @generated
	 */
	void setScheduleTarget(AlphaScheduleTarget value);

	/**
	 * Returns the value of the '<em><b>Index Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Names</em>' attribute list.
	 * @see alpha.targetmapping.TargetmappingPackage#getScheduleTargetRestrictDomain_IndexNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIndexNames();

	/**
	 * Returns the value of the '<em><b>Restrict Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrict Domain</em>' containment reference.
	 * @see #setRestrictDomain(JNIDomainInArrayNotation)
	 * @see alpha.targetmapping.TargetmappingPackage#getScheduleTargetRestrictDomain_RestrictDomain()
	 * @model containment="true"
	 * @generated
	 */
	JNIDomainInArrayNotation getRestrictDomain();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ScheduleTargetRestrictDomain#getRestrictDomain <em>Restrict Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restrict Domain</em>' containment reference.
	 * @see #getRestrictDomain()
	 * @generated
	 */
	void setRestrictDomain(JNIDomainInArrayNotation value);

} // ScheduleTargetRestrictDomain
