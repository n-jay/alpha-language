/**
 * generated by Xtext 2.12.0
 */
package alpha.alpha;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AUse Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.AUseEquation#getInstantiationDomain <em>Instantiation Domain</em>}</li>
 *   <li>{@link alpha.alpha.AUseEquation#getSubsystemDims <em>Subsystem Dims</em>}</li>
 *   <li>{@link alpha.alpha.AUseEquation#getOutputExprs <em>Output Exprs</em>}</li>
 *   <li>{@link alpha.alpha.AUseEquation#getSystem <em>System</em>}</li>
 *   <li>{@link alpha.alpha.AUseEquation#getCallParams <em>Call Params</em>}</li>
 *   <li>{@link alpha.alpha.AUseEquation#getInputExprs <em>Input Exprs</em>}</li>
 * </ul>
 *
 * @see alpha.alpha.AlphaPackage#getAUseEquation()
 * @model
 * @generated
 */
public interface AUseEquation extends EObject
{
  /**
   * Returns the value of the '<em><b>Instantiation Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiation Domain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiation Domain</em>' containment reference.
   * @see #setInstantiationDomain(APolyhedralObjectExpression)
   * @see alpha.alpha.AlphaPackage#getAUseEquation_InstantiationDomain()
   * @model containment="true"
   * @generated
   */
  APolyhedralObjectExpression getInstantiationDomain();

  /**
   * Sets the value of the '{@link alpha.alpha.AUseEquation#getInstantiationDomain <em>Instantiation Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instantiation Domain</em>' containment reference.
   * @see #getInstantiationDomain()
   * @generated
   */
  void setInstantiationDomain(APolyhedralObjectExpression value);

  /**
   * Returns the value of the '<em><b>Subsystem Dims</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsystem Dims</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsystem Dims</em>' attribute.
   * @see #setSubsystemDims(String)
   * @see alpha.alpha.AlphaPackage#getAUseEquation_SubsystemDims()
   * @model
   * @generated
   */
  String getSubsystemDims();

  /**
   * Sets the value of the '{@link alpha.alpha.AUseEquation#getSubsystemDims <em>Subsystem Dims</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subsystem Dims</em>' attribute.
   * @see #getSubsystemDims()
   * @generated
   */
  void setSubsystemDims(String value);

  /**
   * Returns the value of the '<em><b>Output Exprs</b></em>' containment reference list.
   * The list contents are of type {@link alpha.alpha.AAlphaExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Exprs</em>' containment reference list.
   * @see alpha.alpha.AlphaPackage#getAUseEquation_OutputExprs()
   * @model containment="true"
   * @generated
   */
  EList<AAlphaExpression> getOutputExprs();

  /**
   * Returns the value of the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' reference.
   * @see #setSystem(AAffineSystem)
   * @see alpha.alpha.AlphaPackage#getAUseEquation_System()
   * @model
   * @generated
   */
  AAffineSystem getSystem();

  /**
   * Sets the value of the '{@link alpha.alpha.AUseEquation#getSystem <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(AAffineSystem value);

  /**
   * Returns the value of the '<em><b>Call Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Params</em>' containment reference.
   * @see #setCallParams(AIndexAffineExpressionList)
   * @see alpha.alpha.AlphaPackage#getAUseEquation_CallParams()
   * @model containment="true"
   * @generated
   */
  AIndexAffineExpressionList getCallParams();

  /**
   * Sets the value of the '{@link alpha.alpha.AUseEquation#getCallParams <em>Call Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Params</em>' containment reference.
   * @see #getCallParams()
   * @generated
   */
  void setCallParams(AIndexAffineExpressionList value);

  /**
   * Returns the value of the '<em><b>Input Exprs</b></em>' containment reference list.
   * The list contents are of type {@link alpha.alpha.AAlphaExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Exprs</em>' containment reference list.
   * @see alpha.alpha.AlphaPackage#getAUseEquation_InputExprs()
   * @model containment="true"
   * @generated
   */
  EList<AAlphaExpression> getInputExprs();

} // AUseEquation
