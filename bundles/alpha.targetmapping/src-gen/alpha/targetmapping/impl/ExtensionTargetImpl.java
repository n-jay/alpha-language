/**
 */
package alpha.targetmapping.impl;

import alpha.model.AlphaScheduleTarget;
import alpha.model.JNIRelation;
import alpha.model.POLY_OBJECT_TYPE;

import alpha.targetmapping.ExtensionTarget;
import alpha.targetmapping.TargetmappingPackage;

import com.google.common.base.Objects;

import fr.irisa.cairn.jnimap.isl.ISLMap;

import fr.irisa.cairn.jnimap.runtime.JNIObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.targetmapping.impl.ExtensionTargetImpl#getSource <em>Source</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.ExtensionTargetImpl#getName <em>Name</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.ExtensionTargetImpl#getIndexNames <em>Index Names</em>}</li>
 *   <li>{@link alpha.targetmapping.impl.ExtensionTargetImpl#getExtensionMapExpr <em>Extension Map Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionTargetImpl extends MinimalEObjectImpl.Container implements ExtensionTarget {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AlphaScheduleTarget source;

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
	 * The cached value of the '{@link #getIndexNames() <em>Index Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> indexNames;

	/**
	 * The cached value of the '{@link #getExtensionMapExpr() <em>Extension Map Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionMapExpr()
	 * @generated
	 * @ordered
	 */
	protected JNIRelation extensionMapExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.EXTENSION_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaScheduleTarget getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (AlphaScheduleTarget)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetmappingPackage.EXTENSION_TARGET__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaScheduleTarget basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AlphaScheduleTarget newSource) {
		AlphaScheduleTarget oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.EXTENSION_TARGET__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.EXTENSION_TARGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIndexNames() {
		if (indexNames == null) {
			indexNames = new EDataTypeEList<String>(String.class, this, TargetmappingPackage.EXTENSION_TARGET__INDEX_NAMES);
		}
		return indexNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNIRelation getExtensionMapExpr() {
		return extensionMapExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionMapExpr(JNIRelation newExtensionMapExpr, NotificationChain msgs) {
		JNIRelation oldExtensionMapExpr = extensionMapExpr;
		extensionMapExpr = newExtensionMapExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetmappingPackage.EXTENSION_TARGET__EXTENSION_MAP_EXPR, oldExtensionMapExpr, newExtensionMapExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionMapExpr(JNIRelation newExtensionMapExpr) {
		if (newExtensionMapExpr != extensionMapExpr) {
			NotificationChain msgs = null;
			if (extensionMapExpr != null)
				msgs = ((InternalEObject)extensionMapExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.EXTENSION_TARGET__EXTENSION_MAP_EXPR, null, msgs);
			if (newExtensionMapExpr != null)
				msgs = ((InternalEObject)newExtensionMapExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetmappingPackage.EXTENSION_TARGET__EXTENSION_MAP_EXPR, null, msgs);
			msgs = basicSetExtensionMapExpr(newExtensionMapExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetmappingPackage.EXTENSION_TARGET__EXTENSION_MAP_EXPR, newExtensionMapExpr, newExtensionMapExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISLMap getExtensionMap() {
		ISLMap _xifexpression = null;
		POLY_OBJECT_TYPE _type = this.getExtensionMapExpr().getType();
		boolean _notEquals = (!Objects.equal(_type, POLY_OBJECT_TYPE.MAP));
		if (_notEquals) {
			_xifexpression = null;
		}
		else {
			JNIObject _iSLObject = this.getExtensionMapExpr().getISLObject();
			_xifexpression = ((ISLMap) _iSLObject);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetmappingPackage.EXTENSION_TARGET__EXTENSION_MAP_EXPR:
				return basicSetExtensionMapExpr(null, msgs);
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
			case TargetmappingPackage.EXTENSION_TARGET__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TargetmappingPackage.EXTENSION_TARGET__NAME:
				return getName();
			case TargetmappingPackage.EXTENSION_TARGET__INDEX_NAMES:
				return getIndexNames();
			case TargetmappingPackage.EXTENSION_TARGET__EXTENSION_MAP_EXPR:
				return getExtensionMapExpr();
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
			case TargetmappingPackage.EXTENSION_TARGET__SOURCE:
				setSource((AlphaScheduleTarget)newValue);
				return;
			case TargetmappingPackage.EXTENSION_TARGET__NAME:
				setName((String)newValue);
				return;
			case TargetmappingPackage.EXTENSION_TARGET__INDEX_NAMES:
				getIndexNames().clear();
				getIndexNames().addAll((Collection<? extends String>)newValue);
				return;
			case TargetmappingPackage.EXTENSION_TARGET__EXTENSION_MAP_EXPR:
				setExtensionMapExpr((JNIRelation)newValue);
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
			case TargetmappingPackage.EXTENSION_TARGET__SOURCE:
				setSource((AlphaScheduleTarget)null);
				return;
			case TargetmappingPackage.EXTENSION_TARGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetmappingPackage.EXTENSION_TARGET__INDEX_NAMES:
				getIndexNames().clear();
				return;
			case TargetmappingPackage.EXTENSION_TARGET__EXTENSION_MAP_EXPR:
				setExtensionMapExpr((JNIRelation)null);
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
			case TargetmappingPackage.EXTENSION_TARGET__SOURCE:
				return source != null;
			case TargetmappingPackage.EXTENSION_TARGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetmappingPackage.EXTENSION_TARGET__INDEX_NAMES:
				return indexNames != null && !indexNames.isEmpty();
			case TargetmappingPackage.EXTENSION_TARGET__EXTENSION_MAP_EXPR:
				return extensionMapExpr != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", indexNames: ");
		result.append(indexNames);
		result.append(')');
		return result.toString();
	}

} //ExtensionTargetImpl
