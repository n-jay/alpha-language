/**
 * generated by Xtext 2.12.0
 */
package alpha.alpha.impl;

import alpha.alpha.AISLBasicSet;
import alpha.alpha.AISLSet;
import alpha.alpha.AlphaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AISL Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.impl.AISLSetImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link alpha.alpha.impl.AISLSetImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AISLSetImpl extends APolyhedralObjectExpressionImpl implements AISLSet
{
  /**
   * The cached value of the '{@link #getSets() <em>Sets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSets()
   * @generated
   * @ordered
   */
  protected EList<AISLBasicSet> sets;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<AISLBasicSet> relations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AISLSetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlphaPackage.Literals.AISL_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AISLBasicSet> getSets()
  {
    if (sets == null)
    {
      sets = new EObjectContainmentEList<AISLBasicSet>(AISLBasicSet.class, this, AlphaPackage.AISL_SET__SETS);
    }
    return sets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AISLBasicSet> getRelations()
  {
    if (relations == null)
    {
      relations = new EObjectContainmentEList<AISLBasicSet>(AISLBasicSet.class, this, AlphaPackage.AISL_SET__RELATIONS);
    }
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlphaPackage.AISL_SET__SETS:
        return ((InternalEList<?>)getSets()).basicRemove(otherEnd, msgs);
      case AlphaPackage.AISL_SET__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlphaPackage.AISL_SET__SETS:
        return getSets();
      case AlphaPackage.AISL_SET__RELATIONS:
        return getRelations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlphaPackage.AISL_SET__SETS:
        getSets().clear();
        getSets().addAll((Collection<? extends AISLBasicSet>)newValue);
        return;
      case AlphaPackage.AISL_SET__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends AISLBasicSet>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlphaPackage.AISL_SET__SETS:
        getSets().clear();
        return;
      case AlphaPackage.AISL_SET__RELATIONS:
        getRelations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlphaPackage.AISL_SET__SETS:
        return sets != null && !sets.isEmpty();
      case AlphaPackage.AISL_SET__RELATIONS:
        return relations != null && !relations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AISLSetImpl
