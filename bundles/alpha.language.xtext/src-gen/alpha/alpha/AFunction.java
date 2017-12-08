/**
 * generated by Xtext 2.12.0
 */
package alpha.alpha;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.AFunction#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link alpha.alpha.AFunction#getFunc <em>Func</em>}</li>
 * </ul>
 *
 * @see alpha.alpha.AlphaPackage#getAFunction()
 * @model
 * @generated
 */
public interface AFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Indexes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indexes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indexes</em>' attribute.
   * @see #setIndexes(String)
   * @see alpha.alpha.AlphaPackage#getAFunction_Indexes()
   * @model
   * @generated
   */
  String getIndexes();

  /**
   * Sets the value of the '{@link alpha.alpha.AFunction#getIndexes <em>Indexes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indexes</em>' attribute.
   * @see #getIndexes()
   * @generated
   */
  void setIndexes(String value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(AIndexAffineExpressionList)
   * @see alpha.alpha.AlphaPackage#getAFunction_Func()
   * @model containment="true"
   * @generated
   */
  AIndexAffineExpressionList getFunc();

  /**
   * Sets the value of the '{@link alpha.alpha.AFunction#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(AIndexAffineExpressionList value);

} // AFunction
