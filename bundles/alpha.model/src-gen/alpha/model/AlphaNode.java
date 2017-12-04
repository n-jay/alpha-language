/**
 */
package alpha.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Some conventions:
 *  polyhedral objects are either domains or relations in Alpha terms
 * the above is distinguished from ISL objects that are named sets or maps
 * 
 * TODO make sure calculator expression does not have cycles in its evaluation chain
 *   VariableDomain and DefinedObject should only refer to textually preceding definitions
 * <!-- end-model-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getAlphaNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AlphaNode extends EObject {
} // AlphaNode
