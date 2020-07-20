/**
 */
package alpha.targetmapping;

import alpha.model.AlphaScheduleTarget;
import alpha.model.JNIRelation;

import fr.irisa.cairn.jnimap.isl.ISLMap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.ExtensionTarget#getName <em>Name</em>}</li>
 *   <li>{@link alpha.targetmapping.ExtensionTarget#getIndexNames <em>Index Names</em>}</li>
 *   <li>{@link alpha.targetmapping.ExtensionTarget#getExtensionMapExpr <em>Extension Map Expr</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getExtensionTarget()
 * @model
 * @generated
 */
public interface ExtensionTarget extends AlphaScheduleTarget, TargetMappingNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alpha.targetmapping.TargetmappingPackage#getExtensionTarget_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ExtensionTarget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Index Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Names</em>' attribute list.
	 * @see alpha.targetmapping.TargetmappingPackage#getExtensionTarget_IndexNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIndexNames();

	/**
	 * Returns the value of the '<em><b>Extension Map Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Map Expr</em>' containment reference.
	 * @see #setExtensionMapExpr(JNIRelation)
	 * @see alpha.targetmapping.TargetmappingPackage#getExtensionTarget_ExtensionMapExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIRelation getExtensionMapExpr();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.ExtensionTarget#getExtensionMapExpr <em>Extension Map Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Map Expr</em>' containment reference.
	 * @see #getExtensionMapExpr()
	 * @generated
	 */
	void setExtensionMapExpr(JNIRelation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.targetmapping.JNIISLMap" unique="false"
	 * @generated
	 */
	ISLMap getExtensionMap();

} // ExtensionTarget
