package alpha.targetmapping.util

import alpha.targetmapping.BandExpression
import alpha.targetmapping.ContextExpression
import alpha.targetmapping.ExtensionExpression
import alpha.targetmapping.FilterExpression
import alpha.targetmapping.GuardExpression
import alpha.targetmapping.MarkExpression
import alpha.targetmapping.TargetMapping
import alpha.targetmapping.TargetMappingForSystemBody
import alpha.targetmapping.TargetMappingVisitable
import alpha.targetmapping.TileBandExpression
import alpha.targetmapping.TileLoopSpecification
import alpha.targetmapping.PointLoopSpecification
import org.eclipse.emf.ecore.EObject

/**
 * PrintTMAST is a dump of the TargetMapping IR, mainly used for debugging.
 * 
 */
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
		defaultIn(tmv as EObject)
	}
	
	override defaultOut(TargetMappingVisitable tmv) {
		defaultOut(tmv as EObject)
	}
	
	def defaultIn(EObject eobj) {
		printStr("_", eobj.eClass.name)
		indent += INDENT_WITH_SIBILING;
	}
	
	def defaultOut(EObject eobj) {
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
		for (bp : be.bandPieces) {
			if (bp.pieceDomain.restrictDomain.plainIsUniverse) {
				printStr("+--", bp.pieceDomain.scheduleTarget.name , "@" , bp.partialSchedule);
			} else {
				printStr("+--", bp.pieceDomain.scheduleTarget.name, ":", bp.pieceDomain.restrictDomain, "@" , bp.partialSchedule);
			}
		}
		for (lts : be.loopTypeSpecifications) {
			printStr("+--", lts.name, ":", lts.dimension);	
		}
		if (be.isolateSpecification !== null) {
			printStr("+--", "isolate", be.isolateSpecification.isolateDomain);
			for (lts : be.isolateSpecification.loopTypeSpecifications) {
				printStr("   +--", lts.name, ":", lts.dimension);	
			}
		}
	}
	
	override inTileBandExpression(TileBandExpression tbe) {
		defaultIn(tbe);
		printStr("+--", tbe.tilingType);
		for (bp : tbe.bandPieces) {
			if (bp.pieceDomain.restrictDomain.plainIsUniverse) {
				printStr("+--", bp.pieceDomain.scheduleTarget.name , "@" , bp.partialSchedule);
			} else {
				printStr("+--", bp.pieceDomain.scheduleTarget.name, ":", bp.pieceDomain.restrictDomain, "@" , bp.partialSchedule);
			}
		}
		printStr("+--", tbe.scheduleDimensionNames)
		
		visitTilingSpecification(tbe.tilingSpecification)
	}
	def dispatch void visitTilingSpecification(PointLoopSpecification pls) {
		defaultIn(pls);
		printStr("+--", pls.loopSchedule)
		for (lts : pls.loopTypeSpecifications) {
			printStr("+--", lts.name, ":", lts.dimension);	
		}
		
		if (pls.fullTileSpecification !== null) {
			printStr("+--", "full-tile");
			for (lts : pls.fullTileSpecification.loopTypeSpecifications) {
				printStr("   +--", lts.name, ":", lts.dimension);	
			}
		}

		defaultOut(pls);		
	}
	
	def dispatch void visitTilingSpecification(TileLoopSpecification tls) {
		defaultIn(tls);
		if (tls.loopSchedule !== null)
			printStr("+--", tls.loopSchedule)
		if (tls.parallel)
			printStr("+--", "parallel");
		printStr("+--", tls.tileSizeSpecifications.join(", ", [tss|tss.unparseString]));
		
		visitTilingSpecification(tls.tilingSpecification)
		defaultOut(tls);
	}
	override inExtensionExpression(ExtensionExpression ee) {
		defaultIn(ee);
		for (et : ee.extensionTargets) {
			printStr("+--", et.name, ":", et.extensionMap);
		}
	}
	
}