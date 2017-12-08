/**
 * generated by Xtext 2.12.0
 */
package alpha.alpha;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AISL Basic Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.AISLBasicRelation#getInDims <em>In Dims</em>}</li>
 *   <li>{@link alpha.alpha.AISLBasicRelation#getOutDims <em>Out Dims</em>}</li>
 *   <li>{@link alpha.alpha.AISLBasicRelation#getConstraintStr <em>Constraint Str</em>}</li>
 * </ul>
 *
 * @see alpha.alpha.AlphaPackage#getAISLBasicRelation()
 * @model
 * @generated
 */
public interface AISLBasicRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>In Dims</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Dims</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Dims</em>' attribute.
   * @see #setInDims(String)
   * @see alpha.alpha.AlphaPackage#getAISLBasicRelation_InDims()
   * @model
   * @generated
   */
  String getInDims();

  /**
   * Sets the value of the '{@link alpha.alpha.AISLBasicRelation#getInDims <em>In Dims</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Dims</em>' attribute.
   * @see #getInDims()
   * @generated
   */
  void setInDims(String value);

  /**
   * Returns the value of the '<em><b>Out Dims</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Dims</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Dims</em>' attribute.
   * @see #setOutDims(String)
   * @see alpha.alpha.AlphaPackage#getAISLBasicRelation_OutDims()
   * @model
   * @generated
   */
  String getOutDims();

  /**
   * Sets the value of the '{@link alpha.alpha.AISLBasicRelation#getOutDims <em>Out Dims</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Dims</em>' attribute.
   * @see #getOutDims()
   * @generated
   */
  void setOutDims(String value);

  /**
   * Returns the value of the '<em><b>Constraint Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint Str</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint Str</em>' attribute.
   * @see #setConstraintStr(String)
   * @see alpha.alpha.AlphaPackage#getAISLBasicRelation_ConstraintStr()
   * @model
   * @generated
   */
  String getConstraintStr();

  /**
   * Sets the value of the '{@link alpha.alpha.AISLBasicRelation#getConstraintStr <em>Constraint Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint Str</em>' attribute.
   * @see #getConstraintStr()
   * @generated
   */
  void setConstraintStr(String value);

} // AISLBasicRelation
