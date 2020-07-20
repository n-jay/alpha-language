/**
 */
package alpha.targetmapping;

import alpha.model.JNIFunction;

import fr.irisa.cairn.jnimap.isl.ISLMultiAff;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tiling Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.TilingSpecification#getLoopScheduleExpr <em>Loop Schedule Expr</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getTilingSpecification()
 * @model abstract="true"
 * @generated
 */
public interface TilingSpecification extends TargetMappingNode {
	/**
	 * Returns the value of the '<em><b>Loop Schedule Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Schedule Expr</em>' containment reference.
	 * @see #setLoopScheduleExpr(JNIFunction)
	 * @see alpha.targetmapping.TargetmappingPackage#getTilingSpecification_LoopScheduleExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunction getLoopScheduleExpr();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.TilingSpecification#getLoopScheduleExpr <em>Loop Schedule Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Schedule Expr</em>' containment reference.
	 * @see #getLoopScheduleExpr()
	 * @generated
	 */
	void setLoopScheduleExpr(JNIFunction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.targetmapping.JNIISLMultiAff" unique="false"
	 * @generated
	 */
	ISLMultiAff getLoopSchedule();

} // TilingSpecification
