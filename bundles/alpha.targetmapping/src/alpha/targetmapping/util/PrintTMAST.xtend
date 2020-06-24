package alpha.targetmapping.util

import alpha.model.AlphaExpression
import alpha.model.AlphaExpressionVisitable
import alpha.model.AlphaVisitable
import alpha.model.util.PrintAST
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject
import alpha.targetmapping.TargetMappingVisitable
import alpha.targetmapping.TargetMapping
import alpha.targetmapping.TargetMappingForSystemBody
import alpha.targetmapping.FilterExpression
import alpha.targetmapping.GuardExpression
import alpha.targetmapping.MarkExpression
import alpha.targetmapping.ContextExpression
import alpha.targetmapping.BandExpression
import alpha.targetmapping.ExtensionExpression

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
	
	override inTargetMapping(TargetMapping tm) {
		defaultIn(tm);
		printStr("+--", "targetSystem:", tm.getTargetSystem().getName());
	}
	
	override inTargetMappingForSystemBody(TargetMappingForSystemBody tm) {
		defaultIn(tm);
		printStr("+--", "targetBody:", tm.targetBody.system.systemBodies.indexOf(tm.targetBody));
	}
	
	override inContextExpression(ContextExpression ce) {
		defaultIn(ce);
		printStr("+--", ce.contextDomain);
	}
	
	override inFilterExpression(FilterExpression fe) {
		defaultIn(fe);
		for (fd : fe.filterDomains) {
			if (fd.restrictDomain.plainIsUniverse) {
				printStr("+--", fd.scheduleTarget.name);
			} else {
				printStr("+--", fd.scheduleTarget.name , ":", fd.restrictDomain);
			}
		}
			
	}
	
	override inGuardExpression(GuardExpression ge) {
		defaultIn(ge);
		printStr("+--", ge.guardDomain);
	}
	
	override inMarkExpression(MarkExpression me) {
		defaultIn(me);
		printStr("+--", me.identifier);
	}
	
	override inBandExpression(BandExpression be) {
		defaultIn(be);
		if (be.tile)
			printStr("+--", "tile");
		if (be.parallel)
			printStr("+--", "parallel");
		for (lts : be.loopTypeSpecifications) {
			printStr("+--", lts.loopType.name, ":", lts.dimension);	
		}
		for (bp : be.bandPieces) {
			if (bp.pieceDomain.restrictDomain.plainIsUniverse) {
				printStr("+--", bp.pieceDomain.scheduleTarget.name , "@" , bp.partialSchedule);
			} else {
				printStr("+--", bp.pieceDomain.scheduleTarget.name, ":", bp.pieceDomain.restrictDomain, "@" , bp.partialSchedule);
			}
		}
		if (be.isolateSpecification !== null) {
			printStr("+--", "isolate", be.isolateSpecification.isolateDomain);
			for (lts : be.isolateSpecification.loopTypeSpecifications) {
				printStr("   +--", lts.loopType.name, ":", lts.dimension);	
			}
			
		}
	}

	override inExtensionExpression(ExtensionExpression ee) {
		defaultIn(ee);
		for (et : ee.extensionTargets) {
			val srcname = if (et.source !== null) et.source.name else "[]"
			printStr("+--", srcname, "->", et.name, ":", et.extensionMap);
		}
	}
	
}