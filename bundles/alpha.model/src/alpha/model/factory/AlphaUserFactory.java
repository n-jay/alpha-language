package alpha.model.factory;

import alpha.model.AlphaExpression;
import alpha.model.BINARY_OP;
import alpha.model.BinaryExpression;
import alpha.model.CaseExpression;
import alpha.model.DependenceExpression;
import alpha.model.ExternalFunction;
import alpha.model.ExternalMultiArgExpression;
import alpha.model.IfExpression;
import alpha.model.JNIDomain;
import alpha.model.JNIFunction;
import alpha.model.ModelFactory;
import alpha.model.MultiArgExpression;
import alpha.model.REDUCTION_OP;
import alpha.model.RestrictExpression;
import alpha.model.UNARY_OP;
import alpha.model.UnaryExpression;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

/**
 * AlphaUserFactory provides a set of convenience methods for creating nodes in Alpha IR.
 * 
 * The bare factory generated from EMF does not give much control or content checks. All
 * nodes created in the Alpha transformations should use methods in this class.  
 * 
 * 
 * @author tyuki
 *
 */
public class AlphaUserFactory {
	private AlphaUserFactory() {}
	
	private static final ModelFactory fact = ModelFactory.eINSTANCE;
	
	
	public static JNIDomain createJNIDomain(JNIISLSet set) {
		JNIDomain dom = fact.createJNIDomain();
		
		dom.setISLSet(set);
		dom.setIslString(set.toString()); //TODO
		
		return dom;
	}
	public static  JNIFunction createJNIFunction(JNIISLMultiAff maff) {
		JNIFunction fun = fact.createJNIFunction();
		
		fun.setISLMultiAff(maff);
		fun.setAlphaString(maff.toString()); //TODO
		
		return fun;
	}

	public static DependenceExpression createDependenceExpression(JNIISLMultiAff maff) {
		DependenceExpression de = fact.createDependenceExpression();
		de.setFunctionExpr(createJNIFunction(maff));
		return de;
	}
	public static DependenceExpression createDependenceExpression(JNIISLMultiAff maff, AlphaExpression expr) {
		DependenceExpression de = createDependenceExpression(maff);
		de.setExpr(expr);
		return de;
	}

	public static RestrictExpression createRestrictExpression(JNIISLSet dom) {
		RestrictExpression re = fact.createRestrictExpression();		
		re.setDomainExpr(createJNIDomain(dom));
		return re;
	}
	public static RestrictExpression createRestrictExpression(JNIISLSet dom, AlphaExpression expr) {
		RestrictExpression re = createRestrictExpression(dom);
		re.setExpr(expr);		
		return re;
	}

	public static BinaryExpression createBinaryExpression(BINARY_OP op) {
		BinaryExpression be = fact.createBinaryExpression();
		be.setOperator(op);		
		return be;
	}
	public static BinaryExpression createBinaryExpression(BINARY_OP op, AlphaExpression left, AlphaExpression right) {
		BinaryExpression be = createBinaryExpression(op);
		be.setLeft(left);
		be.setRight(right);
		return be;
	}
	public static UnaryExpression createUnaryExpression(UNARY_OP op) {
		UnaryExpression ue = fact.createUnaryExpression();
		ue.setOperator(op);		
		return ue;
	}
	public static UnaryExpression createUnaryExpression(UNARY_OP op, AlphaExpression expr) {
		UnaryExpression ue = createUnaryExpression(op);
		ue.setExpr(expr);
		return ue;
	}
	
	public static MultiArgExpression createMultiArgExpression(REDUCTION_OP op) {
		MultiArgExpression mae = fact.createMultiArgExpression();
		mae.setOperator(op);
		return mae;
	}
	public static ExternalMultiArgExpression createExternalMultiArgExpression(ExternalFunction ef) {
		ExternalMultiArgExpression mae = fact.createExternalMultiArgExpression();
		mae.setOperator(REDUCTION_OP.EX);
		mae.setExternalFunction(ef);
		return mae;
	}
	public static IfExpression createIfExpression() {
		return fact.createIfExpression();		
	}
	public static IfExpression createIfExpression(AlphaExpression condExpr, AlphaExpression thenExpr, AlphaExpression elseExpr) {
		IfExpression ie = fact.createIfExpression();

		ie.setCondExpr(condExpr);
		ie.setThenExpr(thenExpr);
		ie.setElseExpr(elseExpr);
		
		return ie;
	}
	public static CaseExpression createCaseExpression() {
		return fact.createCaseExpression();		
	}
	public static CaseExpression createCaseExpression(String name) {
		CaseExpression ce = fact.createCaseExpression();
		ce.setName(name);
		return ce;
	}
}
