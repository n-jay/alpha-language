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
	 * @model aeUnique="false"
	 * @generated
	 */
	void visitAlphaExpression(AlphaExpression ae);

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
	 * @model fdeUnique="false"
	 * @generated
	 */
	void visitFuzzyDependenceExpression(FuzzyDependenceExpression fde);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model areUnique="false"
	 * @generated
	 */
	void visitAbstractReduceExpression(AbstractReduceExpression are);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model afreUnique="false"
	 * @generated
	 */
	void visitAbstractFuzzyReduceExpression(AbstractFuzzyReduceExpression afre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void visitConvolutionExpression(ConvolutionExpression ce);

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
	 * @model seUnique="false"
	 * @generated
	 */
	void visitSelectExpression(SelectExpression se);

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
	 * @model fieUnique="false"
	 * @generated
	 */
	void visitFuzzyIndexExpression(FuzzyIndexExpression fie);

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
	 * @model aeUnique="false"
	 * @generated
	 */
	void inAlphaExpression(AlphaExpression ae);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reUnique="false"
	 * @generated
	 */
	void inRestrictExpression(RestrictExpression re);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model areUnique="false"
	 * @generated
	 */
	void inAutoRestrictExpression(AutoRestrictExpression are);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void inCaseExpression(CaseExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ieUnique="false"
	 * @generated
	 */
	void inIfExpression(IfExpression ie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model deUnique="false"
	 * @generated
	 */
	void inDependenceExpression(DependenceExpression de);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fdeUnique="false"
	 * @generated
	 */
	void inFuzzyDependenceExpression(FuzzyDependenceExpression fde);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model areUnique="false"
	 * @generated
	 */
	void inAbstractReduceExpression(AbstractReduceExpression are);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reUnique="false"
	 * @generated
	 */
	void inReduceExpression(ReduceExpression re);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model areUnique="false"
	 * @generated
	 */
	void inArgReduceExpression(ArgReduceExpression are);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model afreUnique="false"
	 * @generated
	 */
	void inAbstractFuzzyReduceExpression(AbstractFuzzyReduceExpression afre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model freUnique="false"
	 * @generated
	 */
	void inFuzzyReduceExpression(FuzzyReduceExpression fre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fareUnique="false"
	 * @generated
	 */
	void inFuzzyArgReduceExpression(FuzzyArgReduceExpression fare);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void inConvolutionExpression(ConvolutionExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ueUnique="false"
	 * @generated
	 */
	void inUnaryExpression(UnaryExpression ue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beUnique="false"
	 * @generated
	 */
	void inBinaryExpression(BinaryExpression be);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model maeUnique="false"
	 * @generated
	 */
	void inMultiArgExpression(MultiArgExpression mae);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void inSelectExpression(SelectExpression se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ieUnique="false"
	 * @generated
	 */
	void inIndexExpression(IndexExpression ie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fieUnique="false"
	 * @generated
	 */
	void inFuzzyIndexExpression(FuzzyIndexExpression fie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model veUnique="false"
	 * @generated
	 */
	void inVariableExpression(VariableExpression ve);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void inConstantExpression(ConstantExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ieUnique="false"
	 * @generated
	 */
	void inIntegerExpression(IntegerExpression ie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reUnique="false"
	 * @generated
	 */
	void inRealExpression(RealExpression re);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beUnique="false"
	 * @generated
	 */
	void inBooleanExpression(BooleanExpression be);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ereUnique="false"
	 * @generated
	 */
	void inExternalReduceExpression(ExternalReduceExpression ere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eareUnique="false"
	 * @generated
	 */
	void inExternalArgReduceExpression(ExternalArgReduceExpression eare);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emaeUnique="false"
	 * @generated
	 */
	void inExternalMultiArgExpression(ExternalMultiArgExpression emae);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model efreUnique="false"
	 * @generated
	 */
	void inExternalFuzzyReduceExpression(ExternalFuzzyReduceExpression efre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model efareUnique="false"
	 * @generated
	 */
	void inExternalFuzzyArgReduceExpression(ExternalFuzzyArgReduceExpression efare);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model aeUnique="false"
	 * @generated
	 */
	void outAlphaExpression(AlphaExpression ae);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reUnique="false"
	 * @generated
	 */
	void outRestrictExpression(RestrictExpression re);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model areUnique="false"
	 * @generated
	 */
	void outAutoRestrictExpression(AutoRestrictExpression are);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void outCaseExpression(CaseExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ieUnique="false"
	 * @generated
	 */
	void outIfExpression(IfExpression ie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model deUnique="false"
	 * @generated
	 */
	void outDependenceExpression(DependenceExpression de);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fdeUnique="false"
	 * @generated
	 */
	void outFuzzyDependenceExpression(FuzzyDependenceExpression fde);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model areUnique="false"
	 * @generated
	 */
	void outAbstractReduceExpression(AbstractReduceExpression are);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reUnique="false"
	 * @generated
	 */
	void outReduceExpression(ReduceExpression re);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model areUnique="false"
	 * @generated
	 */
	void outArgReduceExpression(ArgReduceExpression are);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model afreUnique="false"
	 * @generated
	 */
	void outAbstractFuzzyReduceExpression(AbstractFuzzyReduceExpression afre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model freUnique="false"
	 * @generated
	 */
	void outFuzzyReduceExpression(FuzzyReduceExpression fre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fareUnique="false"
	 * @generated
	 */
	void outFuzzyArgReduceExpression(FuzzyArgReduceExpression fare);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void outConvolutionExpression(ConvolutionExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ueUnique="false"
	 * @generated
	 */
	void outUnaryExpression(UnaryExpression ue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beUnique="false"
	 * @generated
	 */
	void outBinaryExpression(BinaryExpression be);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model maeUnique="false"
	 * @generated
	 */
	void outMultiArgExpression(MultiArgExpression mae);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model seUnique="false"
	 * @generated
	 */
	void outSelectExpression(SelectExpression se);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ieUnique="false"
	 * @generated
	 */
	void outIndexExpression(IndexExpression ie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fieUnique="false"
	 * @generated
	 */
	void outFuzzyIndexExpression(FuzzyIndexExpression fie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model veUnique="false"
	 * @generated
	 */
	void outVariableExpression(VariableExpression ve);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ceUnique="false"
	 * @generated
	 */
	void outConstantExpression(ConstantExpression ce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ieUnique="false"
	 * @generated
	 */
	void outIntegerExpression(IntegerExpression ie);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reUnique="false"
	 * @generated
	 */
	void outRealExpression(RealExpression re);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model beUnique="false"
	 * @generated
	 */
	void outBooleanExpression(BooleanExpression be);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ereUnique="false"
	 * @generated
	 */
	void outExternalReduceExpression(ExternalReduceExpression ere);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eareUnique="false"
	 * @generated
	 */
	void outExternalArgReduceExpression(ExternalArgReduceExpression eare);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emaeUnique="false"
	 * @generated
	 */
	void outExternalMultiArgExpression(ExternalMultiArgExpression emae);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model efreUnique="false"
	 * @generated
	 */
	void outExternalFuzzyReduceExpression(ExternalFuzzyReduceExpression efre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model efareUnique="false"
	 * @generated
	 */
	void outExternalFuzzyArgReduceExpression(ExternalFuzzyArgReduceExpression efare);

} // AlphaExpressionVisitor
