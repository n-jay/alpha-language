/**
 */
package alpha.model.impl;

import alpha.model.AlphaFunction;
import alpha.model.AlphaFunctionExpression;
import alpha.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AlphaFunctionImpl#getIndexList <em>Index List</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaFunctionImpl#getExprs <em>Exprs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaFunctionImpl extends MinimalEObjectImpl.Container implements AlphaFunction {
	/**
	 * The default value of the '{@link #getIndexList() <em>Index List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexList()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexList() <em>Index List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexList()
	 * @generated
	 * @ordered
	 */
	protected String indexList = INDEX_LIST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprs()
	 * @generated
	 * @ordered
	 */
	protected EList<AlphaFunctionExpression> exprs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALPHA_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexList() {
		return indexList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexList(String newIndexList) {
		String oldIndexList = indexList;
		indexList = newIndexList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_FUNCTION__INDEX_LIST, oldIndexList, indexList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphaFunctionExpression> getExprs() {
		if (exprs == null) {
			exprs = new EObjectContainmentEList<AlphaFunctionExpression>(AlphaFunctionExpression.class, this, ModelPackage.ALPHA_FUNCTION__EXPRS);
		}
		return exprs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String plainToString() {
		final Function1<AlphaFunctionExpression, CharSequence> _function = new Function1<AlphaFunctionExpression, CharSequence>() {
			public CharSequence apply(final AlphaFunctionExpression e) {
				return e.getISLString();
			}
		};
		return String.format("[%s]->[%s]", this.getIndexList(), IterableExtensions.<AlphaFunctionExpression>join(this.getExprs(), ",", _function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_FUNCTION__EXPRS:
				return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ALPHA_FUNCTION__INDEX_LIST:
				return getIndexList();
			case ModelPackage.ALPHA_FUNCTION__EXPRS:
				return getExprs();
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
			case ModelPackage.ALPHA_FUNCTION__INDEX_LIST:
				setIndexList((String)newValue);
				return;
			case ModelPackage.ALPHA_FUNCTION__EXPRS:
				getExprs().clear();
				getExprs().addAll((Collection<? extends AlphaFunctionExpression>)newValue);
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
			case ModelPackage.ALPHA_FUNCTION__INDEX_LIST:
				setIndexList(INDEX_LIST_EDEFAULT);
				return;
			case ModelPackage.ALPHA_FUNCTION__EXPRS:
				getExprs().clear();
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
			case ModelPackage.ALPHA_FUNCTION__INDEX_LIST:
				return INDEX_LIST_EDEFAULT == null ? indexList != null : !INDEX_LIST_EDEFAULT.equals(indexList);
			case ModelPackage.ALPHA_FUNCTION__EXPRS:
				return exprs != null && !exprs.isEmpty();
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
		result.append(" (indexList: ");
		result.append(indexList);
		result.append(')');
		return result.toString();
	}

} //AlphaFunctionImpl
