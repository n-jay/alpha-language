/**
 * generated by Xtext 2.13.0
 */
package alpha.alpha.impl;

import alpha.alpha.AISLBasicRelation;
import alpha.alpha.AlphaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AISL Basic Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.impl.AISLBasicRelationImpl#getInDims <em>In Dims</em>}</li>
 *   <li>{@link alpha.alpha.impl.AISLBasicRelationImpl#getOutDims <em>Out Dims</em>}</li>
 *   <li>{@link alpha.alpha.impl.AISLBasicRelationImpl#getConstraintStr <em>Constraint Str</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AISLBasicRelationImpl extends MinimalEObjectImpl.Container implements AISLBasicRelation
{
  /**
   * The default value of the '{@link #getInDims() <em>In Dims</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInDims()
   * @generated
   * @ordered
   */
  protected static final String IN_DIMS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInDims() <em>In Dims</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInDims()
   * @generated
   * @ordered
   */
  protected String inDims = IN_DIMS_EDEFAULT;

  /**
   * The default value of the '{@link #getOutDims() <em>Out Dims</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutDims()
   * @generated
   * @ordered
   */
  protected static final String OUT_DIMS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutDims() <em>Out Dims</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutDims()
   * @generated
   * @ordered
   */
  protected String outDims = OUT_DIMS_EDEFAULT;

  /**
   * The default value of the '{@link #getConstraintStr() <em>Constraint Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintStr()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraintStr() <em>Constraint Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintStr()
   * @generated
   * @ordered
   */
  protected String constraintStr = CONSTRAINT_STR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AISLBasicRelationImpl()
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
    return AlphaPackage.Literals.AISL_BASIC_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInDims()
  {
    return inDims;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInDims(String newInDims)
  {
    String oldInDims = inDims;
    inDims = newInDims;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlphaPackage.AISL_BASIC_RELATION__IN_DIMS, oldInDims, inDims));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutDims()
  {
    return outDims;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutDims(String newOutDims)
  {
    String oldOutDims = outDims;
    outDims = newOutDims;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlphaPackage.AISL_BASIC_RELATION__OUT_DIMS, oldOutDims, outDims));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraintStr()
  {
    return constraintStr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraintStr(String newConstraintStr)
  {
    String oldConstraintStr = constraintStr;
    constraintStr = newConstraintStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlphaPackage.AISL_BASIC_RELATION__CONSTRAINT_STR, oldConstraintStr, constraintStr));
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
      case AlphaPackage.AISL_BASIC_RELATION__IN_DIMS:
        return getInDims();
      case AlphaPackage.AISL_BASIC_RELATION__OUT_DIMS:
        return getOutDims();
      case AlphaPackage.AISL_BASIC_RELATION__CONSTRAINT_STR:
        return getConstraintStr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlphaPackage.AISL_BASIC_RELATION__IN_DIMS:
        setInDims((String)newValue);
        return;
      case AlphaPackage.AISL_BASIC_RELATION__OUT_DIMS:
        setOutDims((String)newValue);
        return;
      case AlphaPackage.AISL_BASIC_RELATION__CONSTRAINT_STR:
        setConstraintStr((String)newValue);
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
      case AlphaPackage.AISL_BASIC_RELATION__IN_DIMS:
        setInDims(IN_DIMS_EDEFAULT);
        return;
      case AlphaPackage.AISL_BASIC_RELATION__OUT_DIMS:
        setOutDims(OUT_DIMS_EDEFAULT);
        return;
      case AlphaPackage.AISL_BASIC_RELATION__CONSTRAINT_STR:
        setConstraintStr(CONSTRAINT_STR_EDEFAULT);
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
      case AlphaPackage.AISL_BASIC_RELATION__IN_DIMS:
        return IN_DIMS_EDEFAULT == null ? inDims != null : !IN_DIMS_EDEFAULT.equals(inDims);
      case AlphaPackage.AISL_BASIC_RELATION__OUT_DIMS:
        return OUT_DIMS_EDEFAULT == null ? outDims != null : !OUT_DIMS_EDEFAULT.equals(outDims);
      case AlphaPackage.AISL_BASIC_RELATION__CONSTRAINT_STR:
        return CONSTRAINT_STR_EDEFAULT == null ? constraintStr != null : !CONSTRAINT_STR_EDEFAULT.equals(constraintStr);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (inDims: ");
    result.append(inDims);
    result.append(", outDims: ");
    result.append(outDims);
    result.append(", constraintStr: ");
    result.append(constraintStr);
    result.append(')');
    return result.toString();
  }

} //AISLBasicRelationImpl
