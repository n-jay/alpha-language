/**
 */
package alpha.targetmapping.impl;

import alpha.targetmapping.ScheduleTreeExpression;
import alpha.targetmapping.TargetMappingVisitor;
import alpha.targetmapping.TargetmappingPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Tree Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ScheduleTreeExpressionImpl extends MinimalEObjectImpl.Container implements ScheduleTreeExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleTreeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetmappingPackage.Literals.SCHEDULE_TREE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(TargetMappingVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //ScheduleTreeExpressionImpl
