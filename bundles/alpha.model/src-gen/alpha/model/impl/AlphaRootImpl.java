/**
 */
package alpha.model.impl;

import alpha.model.AlphaConstant;
import alpha.model.AlphaElement;
import alpha.model.AlphaPackage;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitor;
import alpha.model.ExternalFunction;
import alpha.model.Imports;
import alpha.model.ModelPackage;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AlphaRootImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaRootImpl extends MinimalEObjectImpl.Container implements AlphaRoot {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AlphaElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALPHA_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphaElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AlphaElement>(AlphaElement.class, this, ModelPackage.ALPHA_ROOT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Imports> getImports() {
		return ECollections.<Imports>asEList(((Imports[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(Iterables.<Imports>filter(this.getElements(), Imports.class), Imports.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphaConstant> getConstants() {
		return ECollections.<AlphaConstant>asEList(((AlphaConstant[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(Iterables.<AlphaConstant>filter(this.getElements(), AlphaConstant.class), AlphaConstant.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalFunction> getExternalFunctions() {
		return ECollections.<ExternalFunction>asEList(((ExternalFunction[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(Iterables.<ExternalFunction>filter(this.getElements(), ExternalFunction.class), ExternalFunction.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphaPackage> getPackages() {
		return ECollections.<AlphaPackage>asEList(((AlphaPackage[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(Iterables.<AlphaPackage>filter(this.getElements(), AlphaPackage.class), AlphaPackage.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphaSystem> getSystems() {
		return ECollections.<AlphaSystem>asEList(((AlphaSystem[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(Iterables.<AlphaSystem>filter(this.getElements(), AlphaSystem.class), AlphaSystem.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaSystem getSystem(final String name) {
		final Function1<AlphaSystem, Boolean> _function = new Function1<AlphaSystem, Boolean>() {
			public Boolean apply(final AlphaSystem s) {
				return Boolean.valueOf(s.getName().contentEquals(name));
			}
		};
		final Iterator<AlphaSystem> matching = IteratorExtensions.<AlphaSystem>filter(Iterators.<AlphaSystem>filter(this.eAllContents(), AlphaSystem.class), _function);
		int _size = IteratorExtensions.size(matching);
		boolean _greaterThan = (_size > 0);
		if (_greaterThan) {
			return IteratorExtensions.<AlphaSystem>head(matching);
		}
		throw new RuntimeException((("System " + name) + " was not found."));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaVisitor visitor) {
		visitor.visitAlphaRoot(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_ROOT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ALPHA_ROOT__ELEMENTS:
				return getElements();
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
			case ModelPackage.ALPHA_ROOT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends AlphaElement>)newValue);
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
			case ModelPackage.ALPHA_ROOT__ELEMENTS:
				getElements().clear();
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
			case ModelPackage.ALPHA_ROOT__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlphaRootImpl
