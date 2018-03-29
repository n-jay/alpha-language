package alpha.model

import alpha.model.exception.OutOfContextArrayNotationException
import alpha.model.issue.AlphaIssue.TYPE
import alpha.model.issue.CalculatorExpressionIssue
import alpha.model.util.AlphaUtil
import alpha.model.util.DefaultCalculatorExpressionVisitor
import fr.irisa.cairn.jnimap.isl.jni.ISLFactory
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet
import fr.irisa.cairn.jnimap.runtime.JNIObject
import java.util.ArrayList
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.impl.EObjectImpl

import static alpha.model.util.AlphaUtil.callISLwithErrorHandling

class CalculatorExpressionEvaluator extends EObjectImpl implements DefaultCalculatorExpressionVisitor {

	private List<CalculatorExpressionIssue> issues = new LinkedList;

	private List<String> indexNameContext;

	protected new(List<String> indexNameContext) {
		this.indexNameContext = indexNameContext;
	}

	public static def List<CalculatorExpressionIssue> calculate(CalculatorExpression expr) {
		return calculate(expr, null)
	}

	public static def List<CalculatorExpressionIssue> calculate(CalculatorExpression expr,
		List<String> indexNameContext) {
		val calc = new CalculatorExpressionEvaluator(indexNameContext);

		expr.accept(calc);

		return calc.issues
	}


	private def registerIssue(String msg, AlphaNode node) {
		issues.add(new CalculatorExpressionIssue(TYPE.ERROR, msg, node.eContainer, node.eContainingFeature));
	}

	override visitUnaryCalculatorExpression(UnaryCalculatorExpression expr) {
		// depth first; visit the children first
		DefaultCalculatorExpressionVisitor.super.visitUnaryCalculatorExpression(expr);

		if (expr.getExpr().getISLObject() === null) {
			// silent error since the root cause should already by registered in its child
			return;
		}

		val obj = expr.expr.ISLObject
		
		try {
			val res = callISLwithErrorHandling(
					[|evaluateUnaryOperation(expr.operator, obj)],
					[err|registerIssue("Unary operation '" + expr.getOperator() + "' is undefined for " + expr.expr.type, expr)]);
			expr.z__internal_cache_islObject = res;
		} catch (UnsupportedOperationException uoe) {
			registerIssue("Unary operation '" + expr.getOperator() + "' is undefined for " + expr.expr.type, expr.expr);
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
			case POLYHEDRAL_HULL: {
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

	// None of the unary operators currently in the language makes sense for functions
	private dispatch def evaluateUnaryOperation(CALCULATOR_UNARY_OP op, JNIISLMultiAff fun) {
		throw new UnsupportedOperationException();
	}

	override visitBinaryCalculatorExpression(BinaryCalculatorExpression expr) {
		// depth first; visit the children first
		DefaultCalculatorExpressionVisitor.super.visitBinaryCalculatorExpression(expr);

		if (expr.getLeft() === null || expr.getRight() === null || expr.getLeft().getISLObject() === null ||
			expr.getRight().getISLObject() === null) {
			// silent error since the root cause should already by registered in its child
			return;
		}

		val left = expr.left.ISLObject
		val right = expr.right.ISLObject
		
		
		try {
			val res = callISLwithErrorHandling(
					[|evaluateBinaryOperation(expr.operator, left, right)],
					[err|registerIssue("Operation " + expr.getOperator() + "failed: " + err, expr)]);
			expr.z__internal_cache_islObject = res;
		} catch (UnsupportedOperationException uoe) {
			registerIssue("Binary operation '" + expr.getOperator() + "' is undefined for " + expr.left.type + " -> " + expr.right.type, expr);
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

	// Although some of the operations (like intersect) may be defined for Set -> Map, they are all undefined to be consistent with iscc
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

	// Most operations involving functions are performed by first converting functions to maps 
	private dispatch def JNIObject evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLMap left,
		JNIISLMultiAff right) {
		return evaluateBinaryOperation(op, left, right.toMap);
	}

	private dispatch def JNIObject evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLMultiAff left,
		JNIISLSet right) {
		return evaluateBinaryOperation(op, left.toMap, right);
	}

	private dispatch def JNIObject evaluateBinaryOperation(CALCULATOR_BINARY_OP op, JNIISLMultiAff left,
		JNIISLMap right) {
		return evaluateBinaryOperation(op, left.toMap, right);
	}

	// Fun -> Fun do have its own definition; other operations involve domain/range and do not make sense for functions
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

			completed.append(parseJNIDomain(jniDomain));

			var jniset = ISLFactory.islSet(
				AlphaUtil.replaceAlphaConstants(AlphaUtil.getContainerSystem(jniDomain), completed.toString()));
			jniset = jniset.intersectParams(pdom.copy());
			jniDomain.setISLSet(jniset);
		} catch (RuntimeException re) {
			val msg = if (re.message === null) re.class.name else re.message
			registerIssue(msg, jniDomain);
		}
	}

	private def dispatch parseJNIDomain(JNIDomain jniDomain) {
		jniDomain.getIslString();
	}

	private def dispatch parseJNIDomain(JNIDomainInArrayNotation jniDomain) {
		String.format("{ [%s] : %s }", (indexNameContext).join(","), jniDomain.getIslString());
	}

	override visitJNIRelation(JNIRelation jniRelation) {
		try {
			val pdom = getParameterDomain(jniRelation);

			val completed = new StringBuffer("[");
			completed.append(String.join(",", pdom.getParametersNames()));
			completed.append("] -> ");
			completed.append(jniRelation.getIslString());

			var jnimap = ISLFactory.islMap(
				AlphaUtil.replaceAlphaConstants(AlphaUtil.getContainerSystem(jniRelation), completed.toString()));
			jnimap = jnimap.intersectParams(pdom.copy());
			jniRelation.setISLMap(jnimap);
		} catch (RuntimeException re) {
			val msg = if(re.message === null) re.class.name else re.message
			registerIssue(msg, jniRelation);
		}
	}

	override visitJNIFunction(JNIFunction jniFunction) {
		parseJNIFunction(jniFunction);
	}

	protected def dispatch parseJNIFunction(JNIFunction jniFunction) {
		try {
			val pdom = getParameterDomain(jniFunction);

			val completed = new StringBuffer("[");
			completed.append(String.join(",", pdom.getParametersNames()));
			completed.append("] -> ");

			val alphaStr = jniFunction.getAlphaString().split("->");

			val indexNames = alphaStr.get(0).substring(alphaStr.get(0).indexOf('(') + 1);
			val expr = alphaStr.get(1).substring(0, alphaStr.get(1).lastIndexOf(')'));

			completed.append("{ [");
			completed.append(indexNames);
			completed.append("] -> [");
			completed.append(expr);
			completed.append("] }");

			val jnimaff = ISLFactory.islMultiAff(
				AlphaUtil.replaceAlphaConstants(AlphaUtil.getContainerSystem(jniFunction), completed.toString()));
			jniFunction.setISLMultiAff(jnimaff);
		} catch (RuntimeException re) {
			val msg = if(re.message === null) re.class.name else re.message
			registerIssue(msg, jniFunction);
		}
	}

	protected def dispatch parseJNIFunction(JNIFunctionInArrayNotation jniFunction) {

		try {
			val pdom = getParameterDomain(jniFunction);

			val completed = new StringBuffer("[");
			completed.append(String.join(",", pdom.getParametersNames()));
			completed.append("] -> ");

			completed.append(jniFunction.parseJNIFunction(jniFunction.eContainer as AlphaNode));

			val jnimaff = ISLFactory.islMultiAff(
				AlphaUtil.replaceAlphaConstants(AlphaUtil.getContainerSystem(jniFunction), completed.toString()));
			jniFunction.setISLMultiAff(jnimaff);
		} catch (RuntimeException re) {
			val msg = if(re.message === null) re.class.name else re.message
			registerIssue(msg, jniFunction);
		}
	}

	private def parseJNIFunctionAsProjection(JNIFunctionInArrayNotation jniFunction) {
		if (indexNameContext === null)
			throw new OutOfContextArrayNotationException(String.format("ArrayNotation [%s] does not have the necessary context (index names) to be interpreted.", jniFunction.arrayNotation.join(",")));
		
		val funStr = new StringBuffer("{ [");
		funStr.append((indexNameContext + jniFunction.arrayNotation).join(","))
		funStr.append("] -> [");
		funStr.append((indexNameContext).join(","))
		funStr.append("] }");
		return funStr;
	}

	private def parseJNIFunctionAsFunction(JNIFunctionInArrayNotation jniFunction) {
		if (indexNameContext === null)
			throw new OutOfContextArrayNotationException(String.format("ArrayNotation [%s] does not have the necessary context (index names) to be interpreted.", jniFunction.arrayNotation.join(",")));

		val funStr = new StringBuffer("{ [");
		funStr.append((indexNameContext).join(","))
		funStr.append("] -> [");
		funStr.append((jniFunction.arrayNotation).join(","))
		funStr.append("] }");
		return funStr;
	}

	protected def dispatch parseJNIFunction(JNIFunctionInArrayNotation jniFunction, ReduceExpression parent) {
		return parseJNIFunctionAsProjection(jniFunction);
	}

	protected def dispatch parseJNIFunction(JNIFunctionInArrayNotation jniFunction, ArgReduceExpression parent) {
		return parseJNIFunctionAsProjection(jniFunction);
	}

	protected def dispatch parseJNIFunction(JNIFunctionInArrayNotation jniFunction, UseEquation parent) {
		return parseJNIFunctionAsFunction(jniFunction);
	}

	protected def dispatch parseJNIFunction(JNIFunctionInArrayNotation jniFunction, DependenceExpression parent) {
		return parseJNIFunctionAsFunction(jniFunction);
	}

	protected def dispatch parseJNIFunction(JNIFunctionInArrayNotation jniFunction, IndexExpression parent) {
		return parseJNIFunctionAsFunction(jniFunction);
	}

	override visitVariableDomain(VariableDomain vdom) {
		// try to evaluate the variable to detect cycles
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
				dimNames.add("i" + d);
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
				if(d > 0) completed.append(" && ");
				completed.append("0<=" + dimNames.get(d) + "<" + rdom.getUpperBounds().get(d));
			}
			completed.append("}");

			var jniset = ISLFactory.islSet(completed.toString());
			jniset = jniset.intersectParams(pdom.copy());

			rdom.setISLSet(jniset);
		} catch (RuntimeException re) {
			registerIssue(re.message, rdom);
		}
	}

	override visitDefinedObject(DefinedObject dobj) {
		// try to evalute the object to detect cycles
		if (dobj !== null)
			dobj.getISLObject();
	}

	private def JNIISLSet getParameterDomain(CalculatorExpression expr) {

		val system = AlphaUtil.getContainerSystem(expr);
		if (system === null) {
			throw new RuntimeException("Expression is not contained by an AlphaSystem.");
		}

		if (system.getParameterDomain() === null || system.getParameterDomain().getISLSet() === null) {
			throw new RuntimeException("The parameter domain of the container system is null.");
		}

		return system.getParameterDomain().getISLSet();
	}
}
