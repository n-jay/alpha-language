/**
 */
package alpha.targetmapping;

import alpha.model.JNIFunctionInArrayNotation;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link alpha.targetmapping.BandPiece#getPartialSchedule <em>Partial Schedule</em>}</li>
 * </ul>
 *
 * @see alpha.targetmapping.TargetmappingPackage#getBandPiece()
 * @model
 * @generated
 */
public interface BandPiece extends EObject {
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
	 * Returns the value of the '<em><b>Partial Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Schedule</em>' containment reference.
	 * @see #setPartialSchedule(JNIFunctionInArrayNotation)
	 * @see alpha.targetmapping.TargetmappingPackage#getBandPiece_PartialSchedule()
	 * @model containment="true"
	 * @generated
	 */
	JNIFunctionInArrayNotation getPartialSchedule();

	/**
	 * Sets the value of the '{@link alpha.targetmapping.BandPiece#getPartialSchedule <em>Partial Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partial Schedule</em>' containment reference.
	 * @see #getPartialSchedule()
	 * @generated
	 */
	void setPartialSchedule(JNIFunctionInArrayNotation value);

} // BandPiece
