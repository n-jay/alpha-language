/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpressionVisitor;
import alpha.model.ConstantExpression;
import alpha.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConstantExpressionImpl extends MinimalEObjectImpl.Container implements ConstantExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONSTANT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitConstantExpression(this);
	}

} //ConstantExpressionImpl
