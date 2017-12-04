/**
 */
package alpha.model.impl;

import alpha.model.AlphaVisitor;
import alpha.model.ModelPackage;
import alpha.model.OutputVariable;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OutputVariableImpl extends VariableImpl implements OutputVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OUTPUT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaVisitor visitor) {
		visitor.visitOutputVariable(this);
	}

} //OutputVariableImpl
