package alpha.model;

import alpha.model.util.AbstractAlphaExpressionVisitor;
import alpha.model.util.AlphaUtil;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class ExpressionDomainCalculator extends AbstractAlphaExpressionVisitor {

	
	@Override
	public void outVariableExpression(VariableExpression ve) {
		ve.setExpressionDomain(ve.getVariable().getDomain());
	}
	
	@Override
	public void outConstantExpression(ConstantExpression ce) {
		ce.setExpressionDomain(AlphaUtil.getScalarDomain(ce));
	}
	
	@Override
	public void outUnaryExpression(UnaryExpression ue) {
		ue.setExpressionDomain(ue.getExpr().getExpressionDomain());
	}
	
	@Override
	public void outBinaryExpression(BinaryExpression be) {
		//Expression domain of a binary expression is the intersection of the two
		be.setExpressionDomain(be.getLeft().getExpressionDomain().intersect(be.getRight().getExpressionDomain()));
	}
	
	@Override
	public void outCaseExpression(CaseExpression ce) {
		JNIISLSet union = ce.getExprs().stream().map(a->a.getExpressionDomain())
			.reduce((a,b)->a.union(b)).get();
		ce.setExpressionDomain(union);
	}
	
	@Override
	public void outIfExpression(IfExpression ie) {
		JNIISLSet set = ie.getCondExpr().getExpressionDomain();
		set = set.intersect(ie.getThenExpr().getExpressionDomain());
		set = set.intersect(ie.getElseExpr().getExpressionDomain());
		ie.setExpressionDomain(set);
	}
	
	@Override
	public void outIndexExpression(IndexExpression ie) {
		ie.setExpressionDomain(JNIISLSet.buildUniverse(ie.getFunction().getIslMAff().getSpace()));
	}
	
	@Override
	public void outMultiArgExpression(MultiArgExpression mae) {
		JNIISLSet intersection = mae.getExprs().stream().map(e->e.getExpressionDomain())
		.reduce((a,b)->a.intersect(b)).get();
		mae.setExpressionDomain(intersection);
	}
	
	@Override
	public void outReduceExpression(ReduceExpression re) {
		JNIISLSet proj = re.getBody().getExpressionDomain().apply(re.getProjection().getIslMAff().toMap());
		re.setExpressionDomain(proj);
	}
	
	@Override
	public void outRestrictExpression(RestrictExpression re) {
		if (re.getDomainExpr().getType() != POLY_OBJECT_TYPE.SET)
			throw new RuntimeException("Domain of restrict expression must evaluate to ");
		
//		re.getDomainExpr().getISLObject();
//		re.setExpressionDomain(re.getExpr().getExpressionDomain().intersect());
	}
}
