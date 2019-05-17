/**
 */
package alpha.model.impl;

import alpha.model.AlphaConstant;
import alpha.model.AlphaElement;
import alpha.model.AlphaNode;
import alpha.model.AlphaPackage;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitor;
import alpha.model.ExternalFunction;
import alpha.model.Imports;
import alpha.model.ModelPackage;

import alpha.model.util.AlphaUtil;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.EcoreUtil2;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.model.impl.AlphaRootImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link alpha.model.impl.AlphaRootImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaRootImpl extends AlphaNodeImpl implements AlphaRoot {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Imports> imports;

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
	@Override
	public EList<Imports> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Imports>(Imports.class, this, ModelPackage.ALPHA_ROOT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EList<AlphaConstant> getConstants() {
		return ECollections.<AlphaConstant>asEList(EcoreUtil2.<AlphaConstant>getAllContentsOfType(this, AlphaConstant.class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalFunction> getExternalFunctions() {
		return ECollections.<ExternalFunction>asEList(EcoreUtil2.<ExternalFunction>getAllContentsOfType(this, ExternalFunction.class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlphaPackage> getPackages() {
		return ECollections.<AlphaPackage>asEList(EcoreUtil2.<AlphaPackage>getAllContentsOfType(this, AlphaPackage.class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlphaSystem> getSystems() {
		return ECollections.<AlphaSystem>asEList(EcoreUtil2.<AlphaSystem>getAllContentsOfType(this, AlphaSystem.class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaSystem getSystem(final String name) {
		boolean _contains = name.contains(".");
		if (_contains) {
			final Function1<AlphaSystem, Boolean> _function = new Function1<AlphaSystem, Boolean>() {
				public Boolean apply(final AlphaSystem s) {
					return Boolean.valueOf(s.getFullyQualifiedName().contentEquals(name));
				}
			};
			final AlphaSystem system = IterableExtensions.<AlphaSystem>findFirst(EcoreUtil2.<AlphaSystem>getAllContentsOfType(this, AlphaSystem.class), _function);
			if ((system != null)) {
				return system;
			}
		}
		else {
			final Function1<AlphaSystem, Boolean> _function_1 = new Function1<AlphaSystem, Boolean>() {
				public Boolean apply(final AlphaSystem s) {
					return Boolean.valueOf(s.getName().contentEquals(name));
				}
			};
			final AlphaSystem system_1 = IterableExtensions.<AlphaSystem>findFirst(EcoreUtil2.<AlphaSystem>getAllContentsOfType(this, AlphaSystem.class), _function_1);
			if ((system_1 != null)) {
				return system_1;
			}
		}
		throw new RuntimeException((("System " + name) + " was not found."));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void accept(final AlphaVisitor visitor) {
		visitor.visitAlphaRoot(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaNode getNode(final EList<Integer> nodeID) {
		LinkedList<Integer> _linkedList = new LinkedList<Integer>(nodeID);
		return this.getNode(_linkedList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlphaNode getNode(final String nodeID) {
		int[] _parseIntArray = AlphaUtil.parseIntArray(nodeID);
		LinkedList<Integer> _linkedList = new LinkedList<Integer>((Collection<? extends Integer>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_parseIntArray));
		return this.getNode(_linkedList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_ROOT__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ALPHA_ROOT__IMPORTS:
				return getImports();
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
			case ModelPackage.ALPHA_ROOT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Imports>)newValue);
				return;
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
			case ModelPackage.ALPHA_ROOT__IMPORTS:
				getImports().clear();
				return;
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
			case ModelPackage.ALPHA_ROOT__IMPORTS:
				return imports != null && !imports.isEmpty();
			case ModelPackage.ALPHA_ROOT__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlphaRootImpl
