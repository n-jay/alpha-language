/**
 * generated by Xtext 2.12.0
 */
package alpha.alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AMulti Arg Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.AMultiArgLogicalExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see alpha.alpha.AlphaPackage#getAMultiArgLogicalExpression()
 * @model
 * @generated
 */
public interface AMultiArgLogicalExpression extends AMultiArgExpression
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see alpha.alpha.AlphaPackage#getAMultiArgLogicalExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link alpha.alpha.AMultiArgLogicalExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // AMultiArgLogicalExpression
