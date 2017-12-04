/**
 */
package alpha.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Expression Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alpha.model.ModelPackage#getAlphaExpressionVisitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AlphaExpressionVisitor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reUnique="false"
	 * @generated
	 */
	void visitRestrictExpression(RestrictExpression re);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model areUnique="false"
	 * @generated
	 */
	void visitAutoRestrictExpression(AutoRestrictExpression are);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void visitCaseExpression(CaseExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ieUnique="false"
	 * @generated
	 */
	void visitIfExpression(IfExpression ie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model deUnique="false"
	 * @generated
	 */
	void visitDependenceExpression(DependenceExpression de);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reUnique="false"
	 * @generated
	 */
	void visitReduceExpression(ReduceExpression re);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ueUnique="false"
	 * @generated
	 */
	void visitUnaryExpression(UnaryExpression ue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beUnique="false"
	 * @generated
	 */
	void visitBinaryExpression(BinaryExpression be);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model maeUnique="false"
	 * @generated
	 */
	void visitMultiArgExpression(MultiArgExpression mae);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ieUnique="false"
	 * @generated
	 */
	void visitIndexExpression(IndexExpression ie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model veUnique="false"
	 * @generated
	 */
	void visitVariableExpression(VariableExpression ve);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void visitConstantExpression(ConstantExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ieUnique="false"
	 * @generated
	 */
	void visitIntegerExpression(IntegerExpression ie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reUnique="false"
	 * @generated
	 */
	void visitRealExpression(RealExpression re);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beUnique="false"
	 * @generated
	 */
	void visitBooleanExpression(BooleanExpression be);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emaeUnique="false"
	 * @generated
	 */
	void visitExternalMultiArgExpression(ExternalMultiArgExpression emae);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ereUnique="false"
	 * @generated
	 */
	void visitExternalReduceExpression(ExternalReduceExpression ere);

} // AlphaExpressionVisitor
