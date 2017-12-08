/**
 * generated by Xtext 2.12.0
 */
package alpha.alpha;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polyhedral Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.PolyhedralObject#getName <em>Name</em>}</li>
 *   <li>{@link alpha.alpha.PolyhedralObject#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see alpha.alpha.AlphaPackage#getPolyhedralObject()
 * @model
 * @generated
 */
public interface PolyhedralObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see alpha.alpha.AlphaPackage#getPolyhedralObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link alpha.alpha.PolyhedralObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference.
   * @see #setObject(APolyhedralObjectExpression)
   * @see alpha.alpha.AlphaPackage#getPolyhedralObject_Object()
   * @model containment="true"
   * @generated
   */
  APolyhedralObjectExpression getObject();

  /**
   * Sets the value of the '{@link alpha.alpha.PolyhedralObject#getObject <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' containment reference.
   * @see #getObject()
   * @generated
   */
  void setObject(APolyhedralObjectExpression value);

} // PolyhedralObject
