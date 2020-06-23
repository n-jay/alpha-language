package alpha.targetmapping.util

import alpha.model.AlphaExpression
import alpha.model.AlphaExpressionVisitable
import alpha.model.AlphaVisitable
import alpha.model.util.PrintAST
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject
import alpha.targetmapping.TargetMappingVisitable

class PrintTMAST extends AbstractTargetMappingVisitor {

	String indent = "";
	protected static final String INDENT_WITH_SIBILING = "   |";
	protected static final String INDENT_LAST_CHILD = "    ";
	protected StringBuffer _output = new StringBuffer;
	
	protected int depth = 0; 
	
	static def String print(TargetMappingVisitable node) {
		val printer = new PrintTMAST
		node.accept(printer);
		return printer._output.toString();
	}
	
	protected def printInt(String prefix, long v) {
		printStr(prefix, v+"");
	}
	
	protected def printReal(String prefix, double v) {
		printStr(prefix, v+"");
	}
	
	protected def printStr(Object... objs) {
		_output.append(indent)
		objs.forEach[o|_output.append(o)]
		_output.append("\n") 
	}
	
	override defaultIn(TargetMappingVisitable tmv) {
		printStr("_", tmv.eClass.name)
		indent += INDENT_WITH_SIBILING;
	}
	
	override defaultOut(TargetMappingVisitable tmv) {
		indent = indent.substring(0, indent.length() - INDENT_WITH_SIBILING.length());
	}
}