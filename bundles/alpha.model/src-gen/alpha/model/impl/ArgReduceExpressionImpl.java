/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpressionVisitor;
import alpha.model.ArgReduceExpression;
import alpha.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arg Reduce Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ArgReduceExpressionImpl extends AbstractReduceExpressionImpl implements ArgReduceExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgReduceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ARG_REDUCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitArgReduceExpression(this);
	}

} //ArgReduceExpressionImpl
