/**
 */
package alpha.model.matrix.impl;

import alpha.model.matrix.MatrixPackage;
import alpha.model.matrix.Space;

import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.xbase.lib.ExclusiveRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.matrix.impl.SpaceImpl#getParamNames <em>Param Names</em>}</li>
 *   <li>{@link alpha.model.matrix.impl.SpaceImpl#getIndexNames <em>Index Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpaceImpl extends MinimalEObjectImpl.Container implements Space {
	/**
	 * The cached value of the '{@link #getParamNames() <em>Param Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paramNames;

	/**
	 * The cached value of the '{@link #getIndexNames() <em>Index Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> indexNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixPackage.Literals.SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParamNames() {
		if (paramNames == null) {
			paramNames = new EDataTypeEList<String>(String.class, this, MatrixPackage.SPACE__PARAM_NAMES);
		}
		return paramNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIndexNames() {
		if (indexNames == null) {
			indexNames = new EDataTypeEList<String>(String.class, this, MatrixPackage.SPACE__INDEX_NAMES);
		}
		return indexNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbParams() {
		return ((Object[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(this.getParamNames(), Object.class)).length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbIndices() {
		return ((Object[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(this.getIndexNames(), Object.class)).length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSpace toJNIISLSetSpace() {
		JNIISLSpace space = JNIISLSpace.allocSet(this.getNbParams(), this.getNbIndices());
		int _nbParams = this.getNbParams();
		ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _nbParams, true);
		for (final Integer i : _doubleDotLessThan) {
			space = space.setName(JNIISLDimType.isl_dim_param, (i).intValue(), this.getParamNames().get((i).intValue()));
		}
		int _nbIndices = this.getNbIndices();
		ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _nbIndices, true);
		for (final Integer i_1 : _doubleDotLessThan_1) {
			space = space.setName(JNIISLDimType.isl_dim_set, (i_1).intValue(), this.getIndexNames().get((i_1).intValue()));
		}
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIISLSpace toJNIISLMultiAffSpace(final int nbExprs) {
		JNIISLSpace space = JNIISLSpace.alloc(this.getNbParams(), this.getNbIndices(), nbExprs);
		int _nbParams = this.getNbParams();
		ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _nbParams, true);
		for (final Integer i : _doubleDotLessThan) {
			space = space.setName(JNIISLDimType.isl_dim_param, (i).intValue(), this.getParamNames().get((i).intValue()));
		}
		int _nbIndices = this.getNbIndices();
		ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _nbIndices, true);
		for (final Integer i_1 : _doubleDotLessThan_1) {
			space = space.setName(JNIISLDimType.isl_dim_in, (i_1).intValue(), this.getIndexNames().get((i_1).intValue()));
		}
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MatrixPackage.SPACE__PARAM_NAMES:
				return getParamNames();
			case MatrixPackage.SPACE__INDEX_NAMES:
				return getIndexNames();
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
			case MatrixPackage.SPACE__PARAM_NAMES:
				getParamNames().clear();
				getParamNames().addAll((Collection<? extends String>)newValue);
				return;
			case MatrixPackage.SPACE__INDEX_NAMES:
				getIndexNames().clear();
				getIndexNames().addAll((Collection<? extends String>)newValue);
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
			case MatrixPackage.SPACE__PARAM_NAMES:
				getParamNames().clear();
				return;
			case MatrixPackage.SPACE__INDEX_NAMES:
				getIndexNames().clear();
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
			case MatrixPackage.SPACE__PARAM_NAMES:
				return paramNames != null && !paramNames.isEmpty();
			case MatrixPackage.SPACE__INDEX_NAMES:
				return indexNames != null && !indexNames.isEmpty();
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
		result.append(" (paramNames: ");
		result.append(paramNames);
		result.append(", indexNames: ");
		result.append(indexNames);
		result.append(')');
		return result.toString();
	}

} //SpaceImpl
