/**
 */
package alpha.targetmapping;

import alpha.model.JNIFunction;

import fr.irisa.cairn.jnimap.isl.ISLMultiAff;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Band Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.BandPiece#getPieceDomain <em>Piece Domain</em>}</li>
 *   <li>{@link alpha.targetmapping.BandPiece#getPartialScheduleExpr <em>Partial Schedule Expr</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getBandPiece()
 * @model
 * @generated
 */
public interface BandPiece extends TargetMappingNode {
	/**
	 * Returns the value of the '<em><b>Piece Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece Domain</em>' containment reference.
	 * @see #setPieceDomain(ScheduleTargetRestrictDomain)
	 * @see alpha.targetmapping.TargetmappingPackage#getBandPiece_PieceDomain()
	 * @model containment="true"
	 * @generated
	 */
	ScheduleTargetRestrictDomain getPieceDomain();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.BandPiece#getPieceDomain <em>Piece Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piece Domain</em>' containment reference.
	 * @see #getPieceDomain()
	 * @generated
	 */
	void setPieceDomain(ScheduleTargetRestrictDomain value);

	/**
	 * Returns the value of the '<em><b>Partial Schedule Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Schedule Expr</em>' containment reference.
	 * @see #setPartialScheduleExpr(JNIFunction)
	 * @see alpha.targetmapping.TargetmappingPackage#getBandPiece_PartialScheduleExpr()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunction getPartialScheduleExpr();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.BandPiece#getPartialScheduleExpr <em>Partial Schedule Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Schedule Expr</em>' containment reference.
	 * @see #getPartialScheduleExpr()
	 * @generated
	 */
	void setPartialScheduleExpr(JNIFunction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="alpha.targetmapping.JNIISLMultiAff" unique="false"
	 * @generated
	 */
	ISLMultiAff getPartialSchedule();

} // BandPiece
