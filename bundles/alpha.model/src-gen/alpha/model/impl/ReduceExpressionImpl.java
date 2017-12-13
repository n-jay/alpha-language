/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpressionVisitor;
import alpha.model.ModelPackage;
import alpha.model.ReduceExpression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduce Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReduceExpressionImpl extends AbstractReduceExpressionImpl implements ReduceExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReduceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REDUCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitReduceExpression(this);
	}

} //ReduceExpressionImpl
