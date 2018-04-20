/**
 */
package alpha.model.impl;

import alpha.model.JNIFuzzyFunction;
import alpha.model.ModelPackage;
import alpha.model.POLY_OBJECT_TYPE;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLUnionMap;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JNI Fuzzy Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.JNIFuzzyFunctionImpl#getAlphaString <em>Alpha String</em>}</li>
 *   <li>{@link alpha.model.impl.JNIFuzzyFunctionImpl#getZ__internal_cache_islUMap <em>Zinternal cache isl UMap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JNIFuzzyFunctionImpl extends CalculatorExpressionImpl implements JNIFuzzyFunction {
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
	 * The default value of the '{@link #getZ__internal_cache_islUMap() <em>Zinternal cache isl UMap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islUMap()
	 * @generated
	 * @ordered
	 */
	protected static final JNIISLUnionMap ZINTERNAL_CACHE_ISL_UMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ__internal_cache_islUMap() <em>Zinternal cache isl UMap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ__internal_cache_islUMap()
	 * @generated
	 * @ordered
	 */
	protected JNIISLUnionMap z__internal_cache_islUMap = ZINTERNAL_CACHE_ISL_UMAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JNIFuzzyFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.JNI_FUZZY_FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_FUZZY_FUNCTION__ALPHA_STRING, oldAlphaString, alphaString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLUnionMap getZ__internal_cache_islUMap() {
		return z__internal_cache_islUMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ__internal_cache_islUMap(JNIISLUnionMap newZ__internal_cache_islUMap) {
		JNIISLUnionMap oldZ__internal_cache_islUMap = z__internal_cache_islUMap;
		z__internal_cache_islUMap = newZ__internal_cache_islUMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JNI_FUZZY_FUNCTION__ZINTERNAL_CACHE_ISL_UMAP, oldZ__internal_cache_islUMap, z__internal_cache_islUMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLUnionMap getISLUnionMap() {
		JNIISLUnionMap _xifexpression = null;
		JNIISLUnionMap _z__internal_cache_islUMap = this.getZ__internal_cache_islUMap();
		boolean _tripleNotEquals = (_z__internal_cache_islUMap != null);
		if (_tripleNotEquals) {
			_xifexpression = this.getZ__internal_cache_islUMap().copy();
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
	public void setISLUnionMap(final JNIISLUnionMap islUMap) {
		this.setZ__internal_cache_islUMap(islUMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POLY_OBJECT_TYPE getType() {
		return POLY_OBJECT_TYPE.UNION_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIObject getISLObject() {
		return this.getISLUnionMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String plainToString() {
		return this.getAlphaString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.JNI_FUZZY_FUNCTION__ALPHA_STRING:
				return getAlphaString();
			case ModelPackage.JNI_FUZZY_FUNCTION__ZINTERNAL_CACHE_ISL_UMAP:
				return getZ__internal_cache_islUMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.JNI_FUZZY_FUNCTION__ALPHA_STRING:
				setAlphaString((String)newValue);
				return;
			case ModelPackage.JNI_FUZZY_FUNCTION__ZINTERNAL_CACHE_ISL_UMAP:
				setZ__internal_cache_islUMap((JNIISLUnionMap)newValue);
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
			case ModelPackage.JNI_FUZZY_FUNCTION__ALPHA_STRING:
				setAlphaString(ALPHA_STRING_EDEFAULT);
				return;
			case ModelPackage.JNI_FUZZY_FUNCTION__ZINTERNAL_CACHE_ISL_UMAP:
				setZ__internal_cache_islUMap(ZINTERNAL_CACHE_ISL_UMAP_EDEFAULT);
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
			case ModelPackage.JNI_FUZZY_FUNCTION__ALPHA_STRING:
				return ALPHA_STRING_EDEFAULT == null ? alphaString != null : !ALPHA_STRING_EDEFAULT.equals(alphaString);
			case ModelPackage.JNI_FUZZY_FUNCTION__ZINTERNAL_CACHE_ISL_UMAP:
				return ZINTERNAL_CACHE_ISL_UMAP_EDEFAULT == null ? z__internal_cache_islUMap != null : !ZINTERNAL_CACHE_ISL_UMAP_EDEFAULT.equals(z__internal_cache_islUMap);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (alphaString: ");
		result.append(alphaString);
		result.append(", z__internal_cache_islUMap: ");
		result.append(z__internal_cache_islUMap);
		result.append(')');
		return result.toString();
	}

} //JNIFuzzyFunctionImpl
