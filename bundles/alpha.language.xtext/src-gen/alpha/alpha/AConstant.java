/**
 * generated by Xtext 2.13.0
 */
package alpha.alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AConstant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.AConstant#getName <em>Name</em>}</li>
 *   <li>{@link alpha.alpha.AConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see alpha.alpha.AlphaPackage#getAConstant()
 * @model
 * @generated
 */
public interface AConstant extends AConstantDeclaration
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
   * @see alpha.alpha.AlphaPackage#getAConstant_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link alpha.alpha.AConstant#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see alpha.alpha.AlphaPackage#getAConstant_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link alpha.alpha.AConstant#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // AConstant
