/**
 * generated by Xtext 2.12.0
 */
package alpha.alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AISL Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.AISLRelation#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see alpha.alpha.AlphaPackage#getAISLRelation()
 * @model
 * @generated
 */
public interface AISLRelation extends APolyhedralObjectExpression, APolyObjectInRestrict
{
  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link alpha.alpha.AISLBasicRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see alpha.alpha.AlphaPackage#getAISLRelation_Relations()
   * @model containment="true"
   * @generated
   */
  EList<AISLBasicRelation> getRelations();

} // AISLRelation
