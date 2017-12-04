/**
 */
package alpha.model.impl;

import alpha.model.AlphaVisitor;
import alpha.model.InputVariable;
import alpha.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InputVariableImpl extends VariableImpl implements InputVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INPUT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaVisitor visitor) {
		visitor.visitInputVariable(this);
	}

} //InputVariableImpl
