package alpha.model

import alpha.model.util.AlphaUtil
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory
import fr.irisa.cairn.jnimap.isl.jni.JNIISLContext
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import fr.irisa.cairn.jnimap.runtime.JNIObject
import java.util.ArrayList
import org.eclipse.emf.ecore.impl.EObjectImpl
import alpha.model.util.DefaultCalculatorExpressionVisitor
import alpha.model.issue.CalculatorExpressionIssue
import java.util.LinkedList
import java.util.List
import alpha.model.issue.AlphaIssue.TYPE
import java.lang.RuntimeException

class CalculatorExpressionEvaluator extends EObjectImpl implements DefaultCalculatorExpressionVisitor {
	
	private List<CalculatorExpressionIssue> issues = new LinkedList;
	
	public static def List<CalculatorExpressionIssue> calculate(CalculatorExpression expr) {
		val calc = new CalculatorExpressionEvaluator;
		
		expr.accept(calc);
		
		return calc.issues
	}
	
	
	override visitUnaryCalculatorExpression(UnaryCalculatorExpression expr) {
		//depth first; visit the children first
		DefaultCalculatorExpressionVisitor.super.visitUnaryCalculatorExpression(expr);
		
		if (expr.getExpr().getISLObject() === null) {
			//silent error since the root cause should already by registered in its child
			return;
		}
		
		val obj  = expr.expr.ISLObject
		
		try {
			JNIISLContext.recordStderrStart();
			val res = evaluateUnaryOperation(expr.operator, obj);
			expr.setZ__internal_cache_islObject(res)
		} catch (UnsupportedOperationException uoe) {
			issues.add(new CalculatorExpressionIssue(
				TYPE.ERROR,
				"Unary operation '"+expr.getOperator()+"' is undefined for " + expr.expr.type,
				expr, 
				ModelPackage.Literals.UNARY_CALCULATOR_EXPRESSION__OPERATOR
			));
			obj.free();
		} catch (RuntimeException re) {
			val err = JNIISLContext.recordStderrEnd();
			issues.add(new CalculatorExpressionIssue(
				TYPE.ERROR,
				"Operation " + expr.getOperator() + "failed: " + err,
				expr, 
				ModelPackage.Literals.UNARY_CALCULATOR_EXPRESSION__OPERATOR
			));
		} finally {
			JNIISLContext.recordStderrEnd();
		}
	}
	
	
	private dispatch def evaluateUnaryOperation(CALCULATOR_UNARY_OP op, JNIISLSet set) {
		switch (op) {
			case COMPLEMENT: {
				return set.complement()
			}
			case POLYHEDRAL_HULL: {
				return set.polyhedralHull().toSet()
			}
			case AFFINE_HULL: {
				return set.affineHull().toSet()
			}
			default: {
				throw new UnsupportedOperationException();	
			}
		}
	}
	
	private dispatch def evaluateUnaryOperation(CALCULATOR_UNARY_OP op, JNIISLMap map) {
		switch (op) {
			case AFFINE_HULL: {
					return map.affineHull().toMap()
			}
			case POLYHEDRAL_HULL :{
				return map.polyhedralHull().toMap()
			}
			case GET_DOMAIN: {
				return map.getDomain()
			}
			case GET_RANGE: {
				return map.getRange()
			}
			case COMPLEMENT: {
				return map.complement()
			}
			case REVERSE: {
				return map.reverse()
			}
		}
	}
	
	//None of the unary operators currently in the language makes sense for functions
	private dispatch def evaluateUnaryOperation(CALCULATOR_UNARY_OP op, JNIISLMultiAff fun) {
		throw new UnsupportedOperationException();	
	}
	
	override visitBinaryCalculatorExpression(BinaryCalculatorExpression expr) {
		//depth first; visit the children first
		DefaultCalculatorExpressionVisitor.super.visitBinaryCalculatorExpression(expr);
		
		if (expr.getLeft() === null || expr.getRight() === null || expr.getLeft().getISLObject() === null || expr.getRight().getISLObject() === null) {
			//silent error since the root cause should already by registered in its child
			return;
		}
		
		val left  = expr.left.ISLObject
		val right = expr.right.ISLObject
		
		try {
			JNIISLContext.recordStderrStart();
			val res = evaluateBinaryOperation(expr.operator, left, right);
			expr.setZ__internal_cache_islObject(res)
		} catch (UnsupportedOperationException uoe) {
			issues.add(new CalculatorExpressionIssue(
				TYPE.ERROR,
				"Binary operation '"+expr.getOperator()+"' is undefined for " + expr.left.type + " -> " + expr.right.type,
				expr, 
				ModelPackage.Literals.BINARY_CALCULATOR_EXPRESSION__OPERATOR
			));
			left.free(); right.free();
		} catch (RuntimeException re) {
			val err = JNIISLContext.recordStderrEnd();
			issues.add(new CalculatorExpressionIssue(
				TYPE.ERROR,
				"Operation " + expr.getOperator() + "failed: " + err,
				expr, 
				ModelPackage.Literals.BINARY_CALCULATOR_EXPRESSION__OPERATOR
			));
		} finally {
			JNIISLContext.recordStderrEnd();
		}
	}
	
	private dispatch def evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLSet left, JNIISLSet right) {
		switch (op) {
			case INTERSECT: {
				return left.intersect(right)
			}
			case UNION: {
				return left.union(right)
			}
			case CROSS_PRODUCT: {
				return left.flatProduct(right)
			}
			case SET_DIFFERENCE: {
				return left.subtract(right)
			}
			default: {
				throw new UnsupportedOperationException();
			}
		}	
	}
	//Although some of the operations (like intersect) may be defined for Set -> Map, they are all undefined to be consistent with iscc
	private dispatch def evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLSet left, JNIISLMap right) {
		throw new UnsupportedOperationException();
	}
	private dispatch def evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLSet left, JNIISLMultiAff right) {
		throw new UnsupportedOperationException();
	}
	
	private dispatch def evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLMap left, JNIISLSet right) {
		switch (op) {
			case INTERSECT: {
				return left.intersectDomain(right)
			}
			case SET_DIFFERENCE: {
				return left.subtractDomain(right)
			}
			case JOIN: {
				return right.apply(left)
			}
			case INTERSECT_RANGE: {
				return left.intersectRange(right)
			}
			case SUBTRACT_RANGE: {
				return left.subtractRange(right)
			}
			default: {
				throw new UnsupportedOperationException();
			}
		}
		
	}
	private dispatch def evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLMap left, JNIISLMap right) {
		switch (op) {
			case INTERSECT: {
				return left.intersect(right)
			}
			case UNION: {
				return left.union(right)
			}
			case CROSS_PRODUCT: {
				return left.flatProduct(right)
			}
			case SET_DIFFERENCE: {
				return left.subtract(right)
			}
			case JOIN: {
				return right.applyDomain(left)
			}
			default: {
				throw new UnsupportedOperationException();
			}
		}
	}
	
	//Most operations involving functions are performed by first converting functions to maps 
	private dispatch def JNIObject evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLMap left, JNIISLMultiAff right) {
		return evaluateBinaryOperation(op, left, right.toMap);
	}
	private dispatch def JNIObject evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLMultiAff left, JNIISLSet right) {
		return evaluateBinaryOperation(op, left.toMap, right);
	}
	private dispatch def JNIObject evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLMultiAff left, JNIISLMap right) {
		return evaluateBinaryOperation(op, left.toMap, right);
	}
	//Fun -> Fun do have its own definition; other operations involve domain/range and do not make sense for functions
	private dispatch def evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLMultiAff left, JNIISLMultiAff right) {
		switch (op) {
			case CROSS_PRODUCT: {
				return left.flatRangeProduct(right)
			}
			case JOIN: {
				return right.pullback(left)
			}
			default: {
				throw new UnsupportedOperationException();
			}
		}
	}
	
	override visitJNIDomain(JNIDomain jniDomain) {

		try {
			val pdom = getParameterDomain(jniDomain);
			
			val completed = new StringBuffer("[");
			completed.append(String.join(",", pdom.getParametersNames()));
			completed.append("] -> ");
			completed.append(jniDomain.getIslString());
			
			
			var jniset = ISLFactory.islSet(AlphaUtil.replaceAlphaConstants(AlphaUtil.getContainerSystem(jniDomain), completed.toString()));
			jniset = jniset.intersectParams(pdom.copy());
			jniDomain.setIslSet(jniset);
		} catch (RuntimeException re) {
			issues.add(new CalculatorExpressionIssue(
				TYPE.ERROR,
				re.message,
				jniDomain, 
				ModelPackage.Literals.JNI_DOMAIN__ISL_STRING
			));
		}
	}
	
	override visitJNIRelation(JNIRelation jniRelation) {
		try {
			val pdom = getParameterDomain(jniRelation);
			
			val completed = new StringBuffer("[");
			completed.append(String.join(",", pdom.getParametersNames()));
			completed.append("] -> ");
			completed.append(jniRelation.getIslString());
			
			var jnimap = ISLFactory.islMap(AlphaUtil.replaceAlphaConstants(AlphaUtil.getContainerSystem(jniRelation), completed.toString()));
			jnimap = jnimap.intersectParams(pdom.copy());
			jniRelation.setIslMap(jnimap);
		} catch (RuntimeException re) {
			issues.add(new CalculatorExpressionIssue(
				TYPE.ERROR,
				re.message,
				jniRelation, 
				ModelPackage.Literals.JNI_RELATION__ISL_STRING
			));
		}
	}
	
	override visitJNIFunction(JNIFunction jniFunction) {
		try {
			val pdom = getParameterDomain(jniFunction);
			
			val completed = new StringBuffer("[");
			completed.append(String.join(",", pdom.getParametersNames()));
			completed.append("] -> ");
			
			val alphaStr = jniFunction.getAlphaString().split("->");
			
			val indexNames = alphaStr.get(0).substring(alphaStr.get(0).indexOf('(')+1);
			val expr = alphaStr.get(1).substring(0, alphaStr.get(1).lastIndexOf(')'));
			
			completed.append("{ [");
			completed.append(indexNames);
			completed.append("] -> [");
			completed.append(expr);
			completed.append("] }");
			
			val jnimaff = ISLFactory.islMultiAff(AlphaUtil.replaceAlphaConstants(AlphaUtil.getContainerSystem(jniFunction), completed.toString()));
			jniFunction.setIslMAff(jnimaff);
			
		} catch (RuntimeException re) {
			issues.add(new CalculatorExpressionIssue(
				TYPE.ERROR,
				re.message,
				jniFunction, 
				ModelPackage.Literals.JNI_FUNCTION__ALPHA_STRING
			));
		}
	}
	
	override visitVariableDomain(VariableDomain vdom) {
		//try to evaluate the variable to detect cycles
		if (vdom.getVariable() !== null)
			vdom.getVariable().getDomain();
	}

	override void visitRectangularDomain(RectangularDomain rdom) {
		val dim = rdom.getUpperBounds().size();
		
		val dimNames = new ArrayList(dim);
		if (rdom.getIndexNames() !== null && rdom.getIndexNames().size() == dim) {
			dimNames.addAll(rdom.getIndexNames());
		} else {
			for (d : 0 ..< dim) {
				dimNames.add("i"+d);
			}
			if (rdom.upperBounds !== null && rdom.getIndexNames().size() > 0) {
				issues.add(
					new CalculatorExpressionIssue(
						TYPE.WARNING,
						"Length of the index names do not match the domain. Specified names are unused.",
						rdom,
						ModelPackage.Literals.RECTANGULAR_DOMAIN__INDEX_NAMES
					)
				);
			}
		}

		try {
			val pdom = getParameterDomain(rdom);
	
			val completed = new StringBuffer("[");
			completed.append(String.join(",", pdom.getParametersNames()));
			completed.append("] -> { [");
			completed.append(String.join(",", dimNames));
			completed.append("] :");
			for (d : 0 ..< dim) {
				if (d>0) completed.append(" && ");
				completed.append("0<="+dimNames.get(d)+"<"+rdom.getUpperBounds().get(d));
			}
			completed.append("}");

			var jniset = ISLFactory.islSet(completed.toString());
			jniset = jniset.intersectParams(pdom.copy());
			
			rdom.setIslSet(jniset);
		} catch (RuntimeException re) {
			issues.add(new CalculatorExpressionIssue(
				TYPE.ERROR,
				re.message,
				rdom, 
				ModelPackage.Literals.RECTANGULAR_DOMAIN__UPPER_BOUNDS
			));
		}
	}
	
	override visitDefinedObject(DefinedObject dobj) {
		//try to evalute the object to detect cycles
		if (dobj !== null)
			dobj.getISLObject();
	}
	
	private def JNIISLSet getParameterDomain(CalculatorExpression expr) {

		val system = AlphaUtil.getContainerSystem(expr);
		if (system === null) {
			throw new RuntimeException("Expression is not contained by an AlphaSystem.");
		}
		
		if (system.getParameterDomain() === null || system.getParameterDomain().getIslSet() === null) {
			throw new RuntimeException("The parameter domain of the container system is null.");
		}
		
		return system.getParameterDomain().getIslSet();
	}
}