/**
 */
package alpha.model.impl;

import alpha.model.AlphaElement;
import alpha.model.AlphaVisitor;
import alpha.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AlphaElementImpl extends MinimalEObjectImpl.Container implements AlphaElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphaElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALPHA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaVisitor visitor) {
		visitor.visitAlphaElement(this);
	}

} //AlphaElementImpl
