/**
 */
package alpha.model.impl;

import alpha.model.FuzzyFunction;
import alpha.model.FuzzyVariableUse;
import alpha.model.ModelPackage;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.FuzzyFunctionImpl#getAlphaString <em>Alpha String</em>}</li>
 *   <li>{@link alpha.model.impl.FuzzyFunctionImpl#getIndirections <em>Indirections</em>}</li>
 *   <li>{@link alpha.model.impl.FuzzyFunctionImpl#getZ__internal_cache_fuzzyMap <em>Zinternal cache fuzzy Map</em>}</li>
 *   <li>{@link alpha.model.impl.FuzzyFunctionImpl#getZ__internal_cache_depRelation <em>Zinternal cache dep Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuzzyFunctionImpl extends AlphaNodeImpl implements FuzzyFunction {
	/**
	 * The default value of the '{@link #getAlphaString() <em>Alpha String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaString()
	 * @generated
	 * @ordered
	 */
	protected static final String ALPHA_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlphaString() <em>Alpha String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaString()
	 * @generated
	 * @ordered
	 */
	protected String alphaString = ALPHA_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndirections() <em>Indirections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirections()
	 * @generated
	 * @ordered
	 */
	protected EList<FuzzyVariableUse> indirections;

	/**
	 * The default value of the '{@link #getZ__internal_cache_fuzzyMap() <em>Zinternal cache fuzzy Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_fuzzyMap()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLMap ZINTERNAL_CACHE_FUZZY_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_fuzzyMap() <em>Zinternal cache fuzzy Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_fuzzyMap()
	 * @generated
	 * @ordered
	 */
	protected JNIISLMap z__internal_cache_fuzzyMap = ZINTERNAL_CACHE_FUZZY_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ__internal_cache_depRelation() <em>Zinternal cache dep Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_depRelation()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLMap ZINTERNAL_CACHE_DEP_RELATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_depRelation() <em>Zinternal cache dep Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_depRelation()
	 * @generated
	 * @ordered
	 */
	protected JNIISLMap z__internal_cache_depRelation = ZINTERNAL_CACHE_DEP_RELATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUZZY_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlphaString() {
		return alphaString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphaString(String newAlphaString) {
		String oldAlphaString = alphaString;
		alphaString = newAlphaString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_FUNCTION__ALPHA_STRING, oldAlphaString, alphaString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuzzyVariableUse> getIndirections() {
		if (indirections == null) {
			indirections = new EObjectContainmentEList<FuzzyVariableUse>(FuzzyVariableUse.class, this, ModelPackage.FUZZY_FUNCTION__INDIRECTIONS);
		}
		return indirections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMap getZ__internal_cache_fuzzyMap() {
		return z__internal_cache_fuzzyMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_fuzzyMap(JNIISLMap newZ__internal_cache_fuzzyMap) {
		JNIISLMap oldZ__internal_cache_fuzzyMap = z__internal_cache_fuzzyMap;
		z__internal_cache_fuzzyMap = newZ__internal_cache_fuzzyMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_FUZZY_MAP, oldZ__internal_cache_fuzzyMap, z__internal_cache_fuzzyMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMap getZ__internal_cache_depRelation() {
		return z__internal_cache_depRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_depRelation(JNIISLMap newZ__internal_cache_depRelation) {
		JNIISLMap oldZ__internal_cache_depRelation = z__internal_cache_depRelation;
		z__internal_cache_depRelation = newZ__internal_cache_depRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_DEP_RELATION, oldZ__internal_cache_depRelation, z__internal_cache_depRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMap getFuzzyMap() {
		JNIISLMap _xifexpression = null;
		JNIISLMap _z__internal_cache_fuzzyMap = this.getZ__internal_cache_fuzzyMap();
		boolean _tripleNotEquals = (_z__internal_cache_fuzzyMap != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_fuzzyMap().copy();
		}
		else {
			_xifexpression = null;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuzzyMap(final JNIISLMap fuzzyMap) {
		this.setZ__internal_cache_fuzzyMap(fuzzyMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLMap getDependenceRelation() {
		JNIISLMap _xifexpression = null;
		JNIISLMap _z__internal_cache_depRelation = this.getZ__internal_cache_depRelation();
		boolean _tripleNotEquals = (_z__internal_cache_depRelation != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_depRelation().copy();
		}
		else {
			_xifexpression = null;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependenceRelation(final JNIISLMap depRel) {
		this.setZ__internal_cache_depRelation(depRel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyVariableUse getIndirectionByName(final String name) {
		final Function1<FuzzyVariableUse, Boolean> _function = new Function1<FuzzyVariableUse, Boolean>() {
			public Boolean apply(final FuzzyVariableUse i) {
				return Boolean.valueOf(i.getFuzzyIndex().contentEquals(name));
			}
		};
		return IterableExtensions.<FuzzyVariableUse>findFirst(this.getIndirections(), _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FUZZY_FUNCTION__INDIRECTIONS:
				return ((InternalEList<?>)getIndirections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FUZZY_FUNCTION__ALPHA_STRING:
				return getAlphaString();
			case ModelPackage.FUZZY_FUNCTION__INDIRECTIONS:
				return getIndirections();
			case ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_FUZZY_MAP:
				return getZ__internal_cache_fuzzyMap();
			case ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_DEP_RELATION:
				return getZ__internal_cache_depRelation();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.FUZZY_FUNCTION__ALPHA_STRING:
				setAlphaString((String)newValue);
				return;
			case ModelPackage.FUZZY_FUNCTION__INDIRECTIONS:
				getIndirections().clear();
				getIndirections().addAll((Collection<? extends FuzzyVariableUse>)newValue);
				return;
			case ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_FUZZY_MAP:
				setZ__internal_cache_fuzzyMap((JNIISLMap)newValue);
				return;
			case ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_DEP_RELATION:
				setZ__internal_cache_depRelation((JNIISLMap)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.FUZZY_FUNCTION__ALPHA_STRING:
				setAlphaString(ALPHA_STRING_EDEFAULT);
				return;
			case ModelPackage.FUZZY_FUNCTION__INDIRECTIONS:
				getIndirections().clear();
				return;
			case ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_FUZZY_MAP:
				setZ__internal_cache_fuzzyMap(ZINTERNAL_CACHE_FUZZY_MAP_EDEFAULT);
				return;
			case ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_DEP_RELATION:
				setZ__internal_cache_depRelation(ZINTERNAL_CACHE_DEP_RELATION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.FUZZY_FUNCTION__ALPHA_STRING:
				return ALPHA_STRING_EDEFAULT == null ? alphaString != null : !ALPHA_STRING_EDEFAULT.equals(alphaString);
			case ModelPackage.FUZZY_FUNCTION__INDIRECTIONS:
				return indirections != null && !indirections.isEmpty();
			case ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_FUZZY_MAP:
				return ZINTERNAL_CACHE_FUZZY_MAP_EDEFAULT == null ? z__internal_cache_fuzzyMap != null : !ZINTERNAL_CACHE_FUZZY_MAP_EDEFAULT.equals(z__internal_cache_fuzzyMap);
			case ModelPackage.FUZZY_FUNCTION__ZINTERNAL_CACHE_DEP_RELATION:
				return ZINTERNAL_CACHE_DEP_RELATION_EDEFAULT == null ? z__internal_cache_depRelation != null : !ZINTERNAL_CACHE_DEP_RELATION_EDEFAULT.equals(z__internal_cache_depRelation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (alphaString: ");
		result.append(alphaString);
		result.append(", z__internal_cache_fuzzyMap: ");
		result.append(z__internal_cache_fuzzyMap);
		result.append(", z__internal_cache_depRelation: ");
		result.append(z__internal_cache_depRelation);
		result.append(')');
		return result.toString();
	}

} //FuzzyFunctionImpl
