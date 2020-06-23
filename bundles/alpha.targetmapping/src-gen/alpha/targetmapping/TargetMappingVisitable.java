/**
 */
package alpha.targetmapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Mapping Visitable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Interface for TargetMappingVisitor
 * <!-- end-model-doc -->
 *
 *
 * @see alpha.targetmapping.TargetmappingPackage#getTargetMappingVisitable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TargetMappingVisitable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model visitorUnique="false"
	 * @generated
	 */
	void accept(TargetMappingVisitor visitor);

} // TargetMappingVisitable
