/**
 */
package alpha.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Schedule Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * ScheduleTarget is what can be referred to from TargetMapping:
 *   - StandardEquation
 *   - UseEquation
 * <!-- end-model-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getAlphaScheduleTarget()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AlphaScheduleTarget extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.model.String" unique="false"
	 * @generated
	 */
	String getName();

} // AlphaScheduleTarget
