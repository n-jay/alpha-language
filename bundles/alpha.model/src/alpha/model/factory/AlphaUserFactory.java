package alpha.model.factory;

import alpha.model.AlphaExpression;
import alpha.model.BINARY_OP;
import alpha.model.BinaryExpression;
import alpha.model.CaseExpression;
import alpha.model.DependenceExpression;
import alpha.model.ExternalFunction;
import alpha.model.ExternalMultiArgExpression;
import alpha.model.IfExpression;
import alpha.model.IntegerExpression;
import alpha.model.JNIDomain;
import alpha.model.JNIFunction;
import alpha.model.ModelFactory;
import alpha.model.MultiArgExpression;
import alpha.model.REDUCTION_OP;
import alpha.model.ReduceExpression;
import alpha.model.RestrictExpression;
import alpha.model.StandardEquation;
import alpha.model.UNARY_OP;
import alpha.model.UnaryExpression;
import alpha.model.Variable;
import alpha.model.VariableExpression;
import alpha.model.util.AlphaPrintingUtil;
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
	
	private static void nullCheck(Object ... objects) {
		int count = 0;
		for (Object o : objects) {
			if (o == null) throw new RuntimeException(String.format("[AlphaUserFactory] %dth argument is null.", count));
			count++;
		}
	}
	
	
	public static JNIDomain createJNIDomain(JNIISLSet set) {
		nullCheck(set);
		
		JNIDomain dom = fact.createJNIDomain();
		
		dom.setISLSet(set);
		dom.setIslString(AlphaPrintingUtil.toShowString(set));//TODO
		
		return dom;
	}
	public static JNIDomain createJNIParameterDomain(JNIISLSet set) {
		nullCheck(set);
		
		JNIDomain dom = fact.createJNIDomain();
		
		dom.setISLSet(set);
		dom.setIslString(AlphaPrintingUtil.toShowStringParameterDomain(set));//TODO
		
		return dom;
	}
	public static JNIDomain createJNISystemBodyDomain(JNIISLSet set) {
		nullCheck(set);
		
		JNIDomain dom = fact.createJNIDomain();
		
		dom.setISLSet(set);
		dom.setIslString(AlphaPrintingUtil.toShowStringSystemBodyDomain(set));//TODO
		
		return dom;
	}
	public static  JNIFunction createJNIFunction(JNIISLMultiAff maff) {
		nullCheck(maff);
		
		JNIFunction fun = fact.createJNIFunction();
		
		fun.setISLMultiAff(maff);
		
		return fun;
	}
	
	public static Variable createVariable(String name, JNIISLSet domain) {
		nullCheck(name, domain);
		
		Variable v = fact.createVariable();
		
		v.setName(name);
		v.setDomainExpr(createJNIDomain(domain));

		return v;
	}
	
	public static StandardEquation createStandardEquation(Variable v, AlphaExpression expr) {
		nullCheck(v, expr);
		
		StandardEquation eq = fact.createStandardEquation();
		
		eq.setVariable(v);
		eq.setExpr(expr);
		
		return eq;
	}

	public static DependenceExpression createDependenceExpression(JNIISLMultiAff maff) {
		nullCheck(maff);
		
		DependenceExpression de = fact.createDependenceExpression();
		de.setFunctionExpr(createJNIFunction(maff));
		return de;
	}
	public static DependenceExpression createDependenceExpression(JNIISLMultiAff maff, AlphaExpression expr) {
		nullCheck(maff, expr);
		
		DependenceExpression de = createDependenceExpression(maff);
		de.setExpr(expr);
		return de;
	}
	
	public static VariableExpression createVariableExpression(Variable v) {
		nullCheck(v);
		
		VariableExpression ve = fact.createVariableExpression();
		
		ve.setVariable(v);
		
		return ve;
	}
	
	public static IntegerExpression createIntegerExpression(int v) {
		IntegerExpression ie = fact.createIntegerExpression();
		
		ie.setValue(v);
		
		return ie;
	}

	public static RestrictExpression createRestrictExpression(JNIISLSet dom) {
		nullCheck(dom);
		
		RestrictExpression re = fact.createRestrictExpression();		
		re.setDomainExpr(createJNIDomain(dom));
		return re;
	}
	public static RestrictExpression createRestrictExpression(JNIISLSet dom, AlphaExpression expr) {
		nullCheck(dom, expr);
	
		RestrictExpression re = createRestrictExpression(dom);
		re.setExpr(expr);		
		return re;
	}

	public static BinaryExpression createBinaryExpression(BINARY_OP op) {
		nullCheck(op);
		
		BinaryExpression be = fact.createBinaryExpression();
		be.setOperator(op);		
		return be;
	}
	public static BinaryExpression createBinaryExpression(BINARY_OP op, AlphaExpression left, AlphaExpression right) {
		nullCheck(op, left, right);

		BinaryExpression be = createBinaryExpression(op);
		be.setLeft(left);
		be.setRight(right);
		return be;
	}
	public static UnaryExpression createUnaryExpression(UNARY_OP op) {
		nullCheck(op);

		UnaryExpression ue = fact.createUnaryExpression();
		ue.setOperator(op);		
		return ue;
	}
	public static UnaryExpression createUnaryExpression(UNARY_OP op, AlphaExpression expr) {
		nullCheck(op, expr);

		UnaryExpression ue = createUnaryExpression(op);
		ue.setExpr(expr);
		return ue;
	}
	
	public static MultiArgExpression createMultiArgExpression(REDUCTION_OP op) {
		nullCheck(op);

		MultiArgExpression mae = fact.createMultiArgExpression();
		mae.setOperator(op);
		return mae;
	}
	public static ExternalMultiArgExpression createExternalMultiArgExpression(ExternalFunction ef) {
		nullCheck(ef);

		ExternalMultiArgExpression mae = fact.createExternalMultiArgExpression();
		mae.setOperator(REDUCTION_OP.EX);
		mae.setExternalFunction(ef);
		return mae;
	}
	public static IfExpression createIfExpression() {
		return fact.createIfExpression();		
	}
	public static IfExpression createIfExpression(AlphaExpression condExpr, AlphaExpression thenExpr, AlphaExpression elseExpr) {
		nullCheck(condExpr, thenExpr, elseExpr);

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
		nullCheck(name);

		CaseExpression ce = fact.createCaseExpression();
		ce.setName(name);
		return ce;
	}
	
	public static ReduceExpression createReduceExpression(REDUCTION_OP op, JNIISLMultiAff projection, AlphaExpression expr) {
		nullCheck(op, projection, expr);
		
		ReduceExpression re = fact.createReduceExpression();
		
		re.setOperator(op);
		re.setProjectionExpr(createJNIFunction(projection));
		re.setBody(expr);
		
		return re;
	}
}
