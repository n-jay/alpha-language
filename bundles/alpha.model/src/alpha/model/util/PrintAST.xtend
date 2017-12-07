package alpha.model.util

import alpha.model.AlphaConstant
import alpha.model.AlphaPackage
import alpha.model.AlphaRoot
import alpha.model.AlphaSystem
import alpha.model.ExternalFunction
import alpha.model.StandardEquation
import alpha.model.Variable
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject
import alpha.model.FuzzyVariable
import alpha.model.PolyhedralObject
import alpha.model.RestrictExpression
import alpha.model.AlphaVisitable
import alpha.model.AlphaExpressionVisitable

class PrintAST extends AbstractAlphaCompleteVisitor {
	
	private String indent = "";
	protected static final String INDENT_WITH_SIBILING = "   |";
	protected static final String INDENT_LAST_CHILD = "    ";
	protected StringBuffer _output = new StringBuffer;
	
	protected List<Integer> nodeIdTracker = new LinkedList; 
	protected int depth = 0; 
	
	public static def String print(AlphaRoot program) {
		val printer = new PrintAST
		program.accept(printer);
		return printer._output.toString();
	}
	public static def String print(AlphaSystem system) {
		val printer = new PrintAST;
		system.accept(printer);
		return printer._output.toString();
	}
	
	
	protected def printInt(String prefix, long v) {
		printStr(prefix, v+"");
	}
	
	protected def printReal(String prefix, double v) {
		printStr(prefix, v+"");
	}
	
	protected def printStr(String... strs) {
		_output.append(indent)
		strs.forEach[str|_output.append(str)]
		_output.append("\n") 
	}
	
//	protected def nodeTrackIn() {
//		//depth starts from 1 when starting from system
//		depth++;
//		if (nodeIdTracker.size() < depth) {
//			nodeIdTracker.add(0);
//		} else {
//			nodeIdTracker.set(depth-1, nodeIdTracker.get(depth-1)+1);	
//		}
//		printId();
//	}
//	
//	protected def nodeTrackOut() {
//		depth--;
//		if (nodeIdTracker.size() > depth+1) {
//			nodeIdTracker.set(depth+1, -1);
//		}
//	}
	
	protected def printId() {
		val id = new StringBuffer();
		for (i : 0 ..< depth) {
			if (id.length() > 0) {
				id.append(",");
			}
			id.append(nodeIdTracker.get(i));
		}
		_output.append(indent + "nodeId = ("+id+")\n"); 
	}

	override defaultIn(AlphaVisitable av) {
		_defaultIn(av);
	}
	
	override defaultIn(AlphaExpressionVisitable aev) {
		_defaultIn(aev);
	}

	private def _defaultIn(EObject obj) {
		printStr("_", obj.eClass.name)
		indent += INDENT_WITH_SIBILING;
	}
	
	override defaultOut(AlphaVisitable av) {
		_defaultOut(av);
	}
	
	override defaultOut(AlphaExpressionVisitable aev) {
		_defaultOut(aev);
	}

	private def _defaultOut(EObject obj) {
		indent = indent.substring(0, indent.length() - INDENT_WITH_SIBILING.length());
	}
	
	override inAlphaSystem(AlphaSystem system) {
		defaultIn(system);
		printStr("_", system.getName());
	}
	
	override outAlphaSystem(AlphaSystem system) {
		defaultOut(system);
	}

	override inExternalFunction(ExternalFunction ef) {
		defaultIn(ef);
		printStr("+--", ef.name, "(", ef.cardinality+")")
	}
	
	override visitAlphaConstant(AlphaConstant ac) {
		defaultIn(ac)
		printStr("+--", ac.name, "=", ac.value+"")
	}
	
	override visitVariable(Variable v) {
		defaultIn(v);
		printStr("+-- ", v.getName());
		printStr("+-- ", v.domain.toString);
		defaultOut(v);
	}
	
	override visitFuzzyVariable(FuzzyVariable v) {
		defaultIn(v);
		printStr("+-- ", v.getName());
		printStr("+-- ", v.relation.toString);
		defaultOut(v);
	}
	
	override visitPolyhedralObject(PolyhedralObject pobj) {
		defaultIn(pobj);
		printStr("+-- ", pobj.getName());
		printStr("+-- ", pobj.type.name());
		printStr("+-- ", pobj.ISLObject.toString);
		defaultOut(pobj)
	}
	
	override visitStandardEquation(StandardEquation s) {
		defaultIn(s);
		printStr("+-- ", s.getVariable().getName());
		super.visitStandardEquation(s)
		defaultOut(s);
	}
	
//	override visitRestrictExpression(RestrictExpression re) {
//		defaultIn(re);
//		nodeTrackIn()
//		super.visitRestrictExpression(re)
//		nodeTrackOut()
//		defaultOut(re);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}