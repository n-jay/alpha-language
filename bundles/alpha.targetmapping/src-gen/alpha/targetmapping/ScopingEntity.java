/**
 */
package alpha.targetmapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scoping Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * ScopingEntity defines scopes for schedule targets.
 * Initially, the scope is defined by the target SystemBody,
 * which includes all the equations defined.
 * 
 * FilterExpression and ExtensionExpression are
 * ScopingEntities within TargetMapping that modifies the scope.
 * <!-- end-model-doc -->
 *
 *
 * @see alpha.targetmapping.TargetmappingPackage#getScopingEntity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ScopingEntity extends EObject {
} // ScopingEntity
