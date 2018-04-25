/**
 */
package alpha.model.impl;

import alpha.model.AlphaExpressionVisitor;
import alpha.model.FuzzyArgReduceExpression;
import alpha.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Arg Reduce Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FuzzyArgReduceExpressionImpl extends AbstractFuzzyReduceExpressionImpl implements FuzzyArgReduceExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyArgReduceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUZZY_ARG_REDUCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final AlphaExpressionVisitor visitor) {
		visitor.visitFuzzyArgReduceExpression(this);
	}

} //FuzzyArgReduceExpressionImpl
