/**
 * generated by Xtext 2.12.0
 */
package alpha.alpha.impl;

import alpha.alpha.AAffineSystem;
import alpha.alpha.AAlphaExpression;
import alpha.alpha.AEquation;
import alpha.alpha.AFuzzyVariableDeclaration;
import alpha.alpha.APolyhedralObjectExpression;
import alpha.alpha.AUseEquation;
import alpha.alpha.AVariableDeclaration;
import alpha.alpha.AlphaPackage;
import alpha.alpha.PolyhedralObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AAffine System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getPolyObjects <em>Poly Objects</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getInputDeclarations <em>Input Declarations</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getOutputDeclarations <em>Output Declarations</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getLocalvarDeclarations <em>Localvar Declarations</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getFuzzyVariables <em>Fuzzy Variables</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getWhileDomain <em>While Domain</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#isWhile <em>While</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getTestExpression <em>Test Expression</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getUseEquations <em>Use Equations</em>}</li>
 *   <li>{@link alpha.alpha.impl.AAffineSystemImpl#getEquations <em>Equations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AAffineSystemImpl extends AbstractElementImpl implements AAffineSystem
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected static final String PARAMETERS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected String parameters = PARAMETERS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPolyObjects() <em>Poly Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolyObjects()
   * @generated
   * @ordered
   */
  protected EList<PolyhedralObject> polyObjects;

  /**
   * The cached value of the '{@link #getInputDeclarations() <em>Input Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputDeclarations()
   * @generated
   * @ordered
   */
  protected EList<AVariableDeclaration> inputDeclarations;

  /**
   * The cached value of the '{@link #getOutputDeclarations() <em>Output Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputDeclarations()
   * @generated
   * @ordered
   */
  protected EList<AVariableDeclaration> outputDeclarations;

  /**
   * The cached value of the '{@link #getLocalvarDeclarations() <em>Localvar Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalvarDeclarations()
   * @generated
   * @ordered
   */
  protected EList<AVariableDeclaration> localvarDeclarations;

  /**
   * The cached value of the '{@link #getFuzzyVariables() <em>Fuzzy Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuzzyVariables()
   * @generated
   * @ordered
   */
  protected EList<AFuzzyVariableDeclaration> fuzzyVariables;

  /**
   * The cached value of the '{@link #getWhileDomain() <em>While Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileDomain()
   * @generated
   * @ordered
   */
  protected APolyhedralObjectExpression whileDomain;

  /**
   * The default value of the '{@link #isWhile() <em>While</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWhile()
   * @generated
   * @ordered
   */
  protected static final boolean WHILE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWhile() <em>While</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWhile()
   * @generated
   * @ordered
   */
  protected boolean while_ = WHILE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTestExpression() <em>Test Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestExpression()
   * @generated
   * @ordered
   */
  protected AAlphaExpression testExpression;

  /**
   * The cached value of the '{@link #getUseEquations() <em>Use Equations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseEquations()
   * @generated
   * @ordered
   */
  protected EList<AUseEquation> useEquations;

  /**
   * The cached value of the '{@link #getEquations() <em>Equations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquations()
   * @generated
   * @ordered
   */
  protected EList<AEquation> equations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AAffineSystemImpl()
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
    return AlphaPackage.Literals.AAFFINE_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlphaPackage.AAFFINE_SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(String newParameters)
  {
    String oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlphaPackage.AAFFINE_SYSTEM__PARAMETERS, oldParameters, parameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PolyhedralObject> getPolyObjects()
  {
    if (polyObjects == null)
    {
      polyObjects = new EObjectContainmentEList<PolyhedralObject>(PolyhedralObject.class, this, AlphaPackage.AAFFINE_SYSTEM__POLY_OBJECTS);
    }
    return polyObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AVariableDeclaration> getInputDeclarations()
  {
    if (inputDeclarations == null)
    {
      inputDeclarations = new EObjectContainmentEList<AVariableDeclaration>(AVariableDeclaration.class, this, AlphaPackage.AAFFINE_SYSTEM__INPUT_DECLARATIONS);
    }
    return inputDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AVariableDeclaration> getOutputDeclarations()
  {
    if (outputDeclarations == null)
    {
      outputDeclarations = new EObjectContainmentEList<AVariableDeclaration>(AVariableDeclaration.class, this, AlphaPackage.AAFFINE_SYSTEM__OUTPUT_DECLARATIONS);
    }
    return outputDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AVariableDeclaration> getLocalvarDeclarations()
  {
    if (localvarDeclarations == null)
    {
      localvarDeclarations = new EObjectContainmentEList<AVariableDeclaration>(AVariableDeclaration.class, this, AlphaPackage.AAFFINE_SYSTEM__LOCALVAR_DECLARATIONS);
    }
    return localvarDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AFuzzyVariableDeclaration> getFuzzyVariables()
  {
    if (fuzzyVariables == null)
    {
      fuzzyVariables = new EObjectContainmentEList<AFuzzyVariableDeclaration>(AFuzzyVariableDeclaration.class, this, AlphaPackage.AAFFINE_SYSTEM__FUZZY_VARIABLES);
    }
    return fuzzyVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public APolyhedralObjectExpression getWhileDomain()
  {
    return whileDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileDomain(APolyhedralObjectExpression newWhileDomain, NotificationChain msgs)
  {
    APolyhedralObjectExpression oldWhileDomain = whileDomain;
    whileDomain = newWhileDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlphaPackage.AAFFINE_SYSTEM__WHILE_DOMAIN, oldWhileDomain, newWhileDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileDomain(APolyhedralObjectExpression newWhileDomain)
  {
    if (newWhileDomain != whileDomain)
    {
      NotificationChain msgs = null;
      if (whileDomain != null)
        msgs = ((InternalEObject)whileDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlphaPackage.AAFFINE_SYSTEM__WHILE_DOMAIN, null, msgs);
      if (newWhileDomain != null)
        msgs = ((InternalEObject)newWhileDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlphaPackage.AAFFINE_SYSTEM__WHILE_DOMAIN, null, msgs);
      msgs = basicSetWhileDomain(newWhileDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlphaPackage.AAFFINE_SYSTEM__WHILE_DOMAIN, newWhileDomain, newWhileDomain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWhile()
  {
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhile(boolean newWhile)
  {
    boolean oldWhile = while_;
    while_ = newWhile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlphaPackage.AAFFINE_SYSTEM__WHILE, oldWhile, while_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AAlphaExpression getTestExpression()
  {
    return testExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestExpression(AAlphaExpression newTestExpression, NotificationChain msgs)
  {
    AAlphaExpression oldTestExpression = testExpression;
    testExpression = newTestExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlphaPackage.AAFFINE_SYSTEM__TEST_EXPRESSION, oldTestExpression, newTestExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestExpression(AAlphaExpression newTestExpression)
  {
    if (newTestExpression != testExpression)
    {
      NotificationChain msgs = null;
      if (testExpression != null)
        msgs = ((InternalEObject)testExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlphaPackage.AAFFINE_SYSTEM__TEST_EXPRESSION, null, msgs);
      if (newTestExpression != null)
        msgs = ((InternalEObject)newTestExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlphaPackage.AAFFINE_SYSTEM__TEST_EXPRESSION, null, msgs);
      msgs = basicSetTestExpression(newTestExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlphaPackage.AAFFINE_SYSTEM__TEST_EXPRESSION, newTestExpression, newTestExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AUseEquation> getUseEquations()
  {
    if (useEquations == null)
    {
      useEquations = new EObjectContainmentEList<AUseEquation>(AUseEquation.class, this, AlphaPackage.AAFFINE_SYSTEM__USE_EQUATIONS);
    }
    return useEquations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AEquation> getEquations()
  {
    if (equations == null)
    {
      equations = new EObjectContainmentEList<AEquation>(AEquation.class, this, AlphaPackage.AAFFINE_SYSTEM__EQUATIONS);
    }
    return equations;
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
      case AlphaPackage.AAFFINE_SYSTEM__POLY_OBJECTS:
        return ((InternalEList<?>)getPolyObjects()).basicRemove(otherEnd, msgs);
      case AlphaPackage.AAFFINE_SYSTEM__INPUT_DECLARATIONS:
        return ((InternalEList<?>)getInputDeclarations()).basicRemove(otherEnd, msgs);
      case AlphaPackage.AAFFINE_SYSTEM__OUTPUT_DECLARATIONS:
        return ((InternalEList<?>)getOutputDeclarations()).basicRemove(otherEnd, msgs);
      case AlphaPackage.AAFFINE_SYSTEM__LOCALVAR_DECLARATIONS:
        return ((InternalEList<?>)getLocalvarDeclarations()).basicRemove(otherEnd, msgs);
      case AlphaPackage.AAFFINE_SYSTEM__FUZZY_VARIABLES:
        return ((InternalEList<?>)getFuzzyVariables()).basicRemove(otherEnd, msgs);
      case AlphaPackage.AAFFINE_SYSTEM__WHILE_DOMAIN:
        return basicSetWhileDomain(null, msgs);
      case AlphaPackage.AAFFINE_SYSTEM__TEST_EXPRESSION:
        return basicSetTestExpression(null, msgs);
      case AlphaPackage.AAFFINE_SYSTEM__USE_EQUATIONS:
        return ((InternalEList<?>)getUseEquations()).basicRemove(otherEnd, msgs);
      case AlphaPackage.AAFFINE_SYSTEM__EQUATIONS:
        return ((InternalEList<?>)getEquations()).basicRemove(otherEnd, msgs);
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
      case AlphaPackage.AAFFINE_SYSTEM__NAME:
        return getName();
      case AlphaPackage.AAFFINE_SYSTEM__PARAMETERS:
        return getParameters();
      case AlphaPackage.AAFFINE_SYSTEM__POLY_OBJECTS:
        return getPolyObjects();
      case AlphaPackage.AAFFINE_SYSTEM__INPUT_DECLARATIONS:
        return getInputDeclarations();
      case AlphaPackage.AAFFINE_SYSTEM__OUTPUT_DECLARATIONS:
        return getOutputDeclarations();
      case AlphaPackage.AAFFINE_SYSTEM__LOCALVAR_DECLARATIONS:
        return getLocalvarDeclarations();
      case AlphaPackage.AAFFINE_SYSTEM__FUZZY_VARIABLES:
        return getFuzzyVariables();
      case AlphaPackage.AAFFINE_SYSTEM__WHILE_DOMAIN:
        return getWhileDomain();
      case AlphaPackage.AAFFINE_SYSTEM__WHILE:
        return isWhile();
      case AlphaPackage.AAFFINE_SYSTEM__TEST_EXPRESSION:
        return getTestExpression();
      case AlphaPackage.AAFFINE_SYSTEM__USE_EQUATIONS:
        return getUseEquations();
      case AlphaPackage.AAFFINE_SYSTEM__EQUATIONS:
        return getEquations();
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
      case AlphaPackage.AAFFINE_SYSTEM__NAME:
        setName((String)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__PARAMETERS:
        setParameters((String)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__POLY_OBJECTS:
        getPolyObjects().clear();
        getPolyObjects().addAll((Collection<? extends PolyhedralObject>)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__INPUT_DECLARATIONS:
        getInputDeclarations().clear();
        getInputDeclarations().addAll((Collection<? extends AVariableDeclaration>)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__OUTPUT_DECLARATIONS:
        getOutputDeclarations().clear();
        getOutputDeclarations().addAll((Collection<? extends AVariableDeclaration>)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__LOCALVAR_DECLARATIONS:
        getLocalvarDeclarations().clear();
        getLocalvarDeclarations().addAll((Collection<? extends AVariableDeclaration>)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__FUZZY_VARIABLES:
        getFuzzyVariables().clear();
        getFuzzyVariables().addAll((Collection<? extends AFuzzyVariableDeclaration>)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__WHILE_DOMAIN:
        setWhileDomain((APolyhedralObjectExpression)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__WHILE:
        setWhile((Boolean)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__TEST_EXPRESSION:
        setTestExpression((AAlphaExpression)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__USE_EQUATIONS:
        getUseEquations().clear();
        getUseEquations().addAll((Collection<? extends AUseEquation>)newValue);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__EQUATIONS:
        getEquations().clear();
        getEquations().addAll((Collection<? extends AEquation>)newValue);
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
      case AlphaPackage.AAFFINE_SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__PARAMETERS:
        setParameters(PARAMETERS_EDEFAULT);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__POLY_OBJECTS:
        getPolyObjects().clear();
        return;
      case AlphaPackage.AAFFINE_SYSTEM__INPUT_DECLARATIONS:
        getInputDeclarations().clear();
        return;
      case AlphaPackage.AAFFINE_SYSTEM__OUTPUT_DECLARATIONS:
        getOutputDeclarations().clear();
        return;
      case AlphaPackage.AAFFINE_SYSTEM__LOCALVAR_DECLARATIONS:
        getLocalvarDeclarations().clear();
        return;
      case AlphaPackage.AAFFINE_SYSTEM__FUZZY_VARIABLES:
        getFuzzyVariables().clear();
        return;
      case AlphaPackage.AAFFINE_SYSTEM__WHILE_DOMAIN:
        setWhileDomain((APolyhedralObjectExpression)null);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__WHILE:
        setWhile(WHILE_EDEFAULT);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__TEST_EXPRESSION:
        setTestExpression((AAlphaExpression)null);
        return;
      case AlphaPackage.AAFFINE_SYSTEM__USE_EQUATIONS:
        getUseEquations().clear();
        return;
      case AlphaPackage.AAFFINE_SYSTEM__EQUATIONS:
        getEquations().clear();
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
      case AlphaPackage.AAFFINE_SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlphaPackage.AAFFINE_SYSTEM__PARAMETERS:
        return PARAMETERS_EDEFAULT == null ? parameters != null : !PARAMETERS_EDEFAULT.equals(parameters);
      case AlphaPackage.AAFFINE_SYSTEM__POLY_OBJECTS:
        return polyObjects != null && !polyObjects.isEmpty();
      case AlphaPackage.AAFFINE_SYSTEM__INPUT_DECLARATIONS:
        return inputDeclarations != null && !inputDeclarations.isEmpty();
      case AlphaPackage.AAFFINE_SYSTEM__OUTPUT_DECLARATIONS:
        return outputDeclarations != null && !outputDeclarations.isEmpty();
      case AlphaPackage.AAFFINE_SYSTEM__LOCALVAR_DECLARATIONS:
        return localvarDeclarations != null && !localvarDeclarations.isEmpty();
      case AlphaPackage.AAFFINE_SYSTEM__FUZZY_VARIABLES:
        return fuzzyVariables != null && !fuzzyVariables.isEmpty();
      case AlphaPackage.AAFFINE_SYSTEM__WHILE_DOMAIN:
        return whileDomain != null;
      case AlphaPackage.AAFFINE_SYSTEM__WHILE:
        return while_ != WHILE_EDEFAULT;
      case AlphaPackage.AAFFINE_SYSTEM__TEST_EXPRESSION:
        return testExpression != null;
      case AlphaPackage.AAFFINE_SYSTEM__USE_EQUATIONS:
        return useEquations != null && !useEquations.isEmpty();
      case AlphaPackage.AAFFINE_SYSTEM__EQUATIONS:
        return equations != null && !equations.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", parameters: ");
    result.append(parameters);
    result.append(", while: ");
    result.append(while_);
    result.append(')');
    return result.toString();
  }

} //AAffineSystemImpl
