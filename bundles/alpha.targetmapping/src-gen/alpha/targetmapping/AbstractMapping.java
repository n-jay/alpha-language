/**
 */
package alpha.targetmapping;

import alpha.model.AlphaScheduleTarget;
import alpha.model.JNIFunction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.AbstractMapping#getScheduleTarget <em>Schedule Target</em>}</li>
 *   <li>{@link alpha.targetmapping.AbstractMapping#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getAbstractMapping()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Schedule Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Target</em>' reference.
	 * @see #setScheduleTarget(AlphaScheduleTarget)
	 * @see alpha.targetmapping.TargetmappingPackage#getAbstractMapping_ScheduleTarget()
	 * @model
	 * @generated
	 */
	AlphaScheduleTarget getScheduleTarget();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.AbstractMapping#getScheduleTarget <em>Schedule Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Target</em>' reference.
	 * @see #getScheduleTarget()
	 * @generated
	 */
	void setScheduleTarget(AlphaScheduleTarget value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(JNIFunction)
	 * @see alpha.targetmapping.TargetmappingPackage#getAbstractMapping_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunction getMapping();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.AbstractMapping#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(JNIFunction value);

} // AbstractMapping
