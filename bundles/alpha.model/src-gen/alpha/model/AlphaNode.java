/**
 */
package alpha.model;

import java.util.Queue;

import org.eclipse.emf.common.util.EList;

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
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.AlphaNode#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see alpha.model.ModelPackage#getAlphaNode()
 * @model
 * @generated
 */
public interface AlphaNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute list.
	 * @see alpha.model.ModelPackage#getAlphaNode_NodeID()
	 * @model unique="false" dataType="alpha.model.int" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Integer> getNodeID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns a node in the AST as a result of following the path specified by
	 * the given vector. Each element of the vector is the index of the list
	 * returned by eContents.
	 * 
	 * Note that the nodeID is computed has AlphaRoot as its root. Thus,
	 * getNode must be called at AlphaNode to retrieve the right node.
	 * (It is best if the visibility can be restricted, but this is not supported by current Xcore.)
	 * <!-- end-model-doc -->
	 * @model unique="false" nodeIDDataType="alpha.model.IntegerQueue" nodeIDUnique="false"
	 * @generated
	 */
	AlphaNode getNode(Queue<Integer> nodeID);

} // AlphaNode
