/**
 */
package alpha.commands.model.impl;

import alpha.commands.model.AlphaCommand;
import alpha.commands.model.AlphaCommandCategory;
import alpha.commands.model.AlphaCommandSignature;
import alpha.commands.model.AlphaCommandSpecialization;
import alpha.commands.model.CommandBinding;
import alpha.commands.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.commands.model.impl.AlphaCommandImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link alpha.commands.model.impl.AlphaCommandImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link alpha.commands.model.impl.AlphaCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link alpha.commands.model.impl.AlphaCommandImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link alpha.commands.model.impl.AlphaCommandImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link alpha.commands.model.impl.AlphaCommandImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlphaCommandImpl extends MinimalEObjectImpl.Container implements AlphaCommand {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

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
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected AlphaCommandSignature signature;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<AlphaCommandSpecialization> specializations;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected CommandBinding binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALPHA_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaCommandCategory getCategory() {
		if (eContainerFeatureID() != ModelPackage.ALPHA_COMMAND__CATEGORY) return null;
		return (AlphaCommandCategory)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaCommandCategory basicGetCategory() {
		if (eContainerFeatureID() != ModelPackage.ALPHA_COMMAND__CATEGORY) return null;
		return (AlphaCommandCategory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(AlphaCommandCategory newCategory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCategory, ModelPackage.ALPHA_COMMAND__CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(AlphaCommandCategory newCategory) {
		if (newCategory != eInternalContainer() || (eContainerFeatureID() != ModelPackage.ALPHA_COMMAND__CATEGORY && newCategory != null)) {
			if (EcoreUtil.isAncestor(this, newCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, ModelPackage.ALPHA_COMMAND_CATEGORY__COMMANDS, AlphaCommandCategory.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_COMMAND__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_COMMAND__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaCommandSignature getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(AlphaCommandSignature newSignature, NotificationChain msgs) {
		AlphaCommandSignature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_COMMAND__SIGNATURE, oldSignature, newSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(AlphaCommandSignature newSignature) {
		if (newSignature != signature) {
			NotificationChain msgs = null;
			if (signature != null)
				msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_COMMAND__SIGNATURE, null, msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_COMMAND__SIGNATURE, null, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_COMMAND__SIGNATURE, newSignature, newSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphaCommandSpecialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<AlphaCommandSpecialization>(AlphaCommandSpecialization.class, this, ModelPackage.ALPHA_COMMAND__SPECIALIZATIONS, ModelPackage.ALPHA_COMMAND_SPECIALIZATION__COMMAND);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandBinding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(CommandBinding newBinding, NotificationChain msgs) {
		CommandBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_COMMAND__BINDING, oldBinding, newBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(CommandBinding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_COMMAND__BINDING, null, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ALPHA_COMMAND__BINDING, null, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALPHA_COMMAND__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_COMMAND__CATEGORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCategory((AlphaCommandCategory)otherEnd, msgs);
			case ModelPackage.ALPHA_COMMAND__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ALPHA_COMMAND__CATEGORY:
				return basicSetCategory(null, msgs);
			case ModelPackage.ALPHA_COMMAND__SIGNATURE:
				return basicSetSignature(null, msgs);
			case ModelPackage.ALPHA_COMMAND__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ALPHA_COMMAND__BINDING:
				return basicSetBinding(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.ALPHA_COMMAND__CATEGORY:
				return eInternalContainer().eInverseRemove(this, ModelPackage.ALPHA_COMMAND_CATEGORY__COMMANDS, AlphaCommandCategory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ALPHA_COMMAND__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case ModelPackage.ALPHA_COMMAND__LABEL:
				return getLabel();
			case ModelPackage.ALPHA_COMMAND__NAME:
				return getName();
			case ModelPackage.ALPHA_COMMAND__SIGNATURE:
				return getSignature();
			case ModelPackage.ALPHA_COMMAND__SPECIALIZATIONS:
				return getSpecializations();
			case ModelPackage.ALPHA_COMMAND__BINDING:
				return getBinding();
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
			case ModelPackage.ALPHA_COMMAND__CATEGORY:
				setCategory((AlphaCommandCategory)newValue);
				return;
			case ModelPackage.ALPHA_COMMAND__LABEL:
				setLabel((String)newValue);
				return;
			case ModelPackage.ALPHA_COMMAND__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ALPHA_COMMAND__SIGNATURE:
				setSignature((AlphaCommandSignature)newValue);
				return;
			case ModelPackage.ALPHA_COMMAND__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends AlphaCommandSpecialization>)newValue);
				return;
			case ModelPackage.ALPHA_COMMAND__BINDING:
				setBinding((CommandBinding)newValue);
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
			case ModelPackage.ALPHA_COMMAND__CATEGORY:
				setCategory((AlphaCommandCategory)null);
				return;
			case ModelPackage.ALPHA_COMMAND__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ModelPackage.ALPHA_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ALPHA_COMMAND__SIGNATURE:
				setSignature((AlphaCommandSignature)null);
				return;
			case ModelPackage.ALPHA_COMMAND__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case ModelPackage.ALPHA_COMMAND__BINDING:
				setBinding((CommandBinding)null);
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
			case ModelPackage.ALPHA_COMMAND__CATEGORY:
				return basicGetCategory() != null;
			case ModelPackage.ALPHA_COMMAND__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ModelPackage.ALPHA_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ALPHA_COMMAND__SIGNATURE:
				return signature != null;
			case ModelPackage.ALPHA_COMMAND__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case ModelPackage.ALPHA_COMMAND__BINDING:
				return binding != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AlphaCommandImpl
