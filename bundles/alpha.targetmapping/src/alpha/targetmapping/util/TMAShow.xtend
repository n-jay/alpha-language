package alpha.targetmapping.util

import alpha.model.AlphaScheduleTarget
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.model.util.AlphaPrintingUtil
import alpha.targetmapping.AbstractBandExpression
import alpha.targetmapping.BandExpression
import alpha.targetmapping.BandPiece
import alpha.targetmapping.ContextExpression
import alpha.targetmapping.ExtensionExpression
import alpha.targetmapping.ExtensionTarget
import alpha.targetmapping.FilterExpression
import alpha.targetmapping.GuardExpression
import alpha.targetmapping.IsolateSpecification
import alpha.targetmapping.JNIDomainCalculatorForTM
import alpha.targetmapping.ScheduleTargetRestrictDomain
import alpha.targetmapping.TargetMappingForSystemBody
import alpha.targetmapping.TargetMappingNode
import alpha.targetmapping.TileBandExpression
import alpha.targetmapping.TilingSpecification
import fr.irisa.cairn.jnimap.isl.ISLMap
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Stack
import org.eclipse.xtext.EcoreUtil2
import java.util.Collections

/**
 * Prints TargetMapping in array notation.
 * 
 * The array notation names all dimensions (schedule + schedule target).
 * The switch is modified to keep track of the context information,
 * similar to how it is done in {@link JNIDomainCalculatorForTM},
 * and adds default dimension names when they were not given in the
 * original TargetMapping.
 */
class TMAShow extends TMShow {
	
	protected Map<AlphaScheduleTarget, Stack<List<String>>> indexNameContexts;
	protected Stack<List<String>> scheduleDimNameContextHistory = new Stack
	protected Stack<Integer> bandSizeHistory = new Stack
	
	//This variable is used to stop the visiting once it is encountered.
	//It's use is to support printing of sub-trees. First pass visits from the container system
	// to the target while collecting context information. Then the second pass uses the 
	// collected context to print the target sub-tree.
	final TargetMappingNode haltTarget;
	
	private new() { haltTarget = null }
	private new(TargetMappingNode target) { haltTarget = target }
	
	
	static def <T extends TargetMappingNode> print(T tmn) {
		val ashow = new TMAShow();
		
		ashow.parameterContext = TargetMappingUtil.getTargetSystem(tmn).parameterDomain;
		
		ashow.doSwitch(tmn).toString()
	}
	
	override printDomain(ContextExpression ce) {
		AlphaPrintingUtil.toAShowString(ce.contextDomain, parameterContext, scheduleDimNameContextHistory.peek)
	}
	
	override printDomain(ScheduleTargetRestrictDomain strd) {
		if (strd.restrictDomain.complement.isEmpty)
			''''''
		else
			" " + AlphaPrintingUtil.toAShowString(strd.restrictDomain, parameterContext, indexNameContexts.get(strd.scheduleTarget).peek)
	}
	
	override printDomain(GuardExpression ge) {
		AlphaPrintingUtil.toAShowString(ge.guardDomain, parameterContext, scheduleDimNameContextHistory.peek)
	}
	
	override printDomain(IsolateSpecification is) {
		AlphaPrintingUtil.toAShowString(is.isolateDomain, parameterContext, scheduleDimNameContextHistory.peek)
	}
	
	override printSchedule(BandPiece bp) {
		AlphaPrintingUtil.toAShowString(bp.partialSchedule, indexNameContexts.get(bp.pieceDomain.scheduleTarget).peek)
	}
	
	override printSchedule(TilingSpecification ts) {
		if (ts.loopSchedule.identity)
			''''''
		else
			AlphaPrintingUtil.toAShowString(ts.loopSchedule, scheduleDimNameContextHistory.peek)
	}
	
	override printExtensionMap(ISLMap map) {
		AlphaPrintingUtil.toShowString(map)
	}
	
	override printDimNames(ScheduleTargetRestrictDomain strd) {
		val history = indexNameContexts.get(strd.scheduleTarget)
		
		//skips name declaration if it does not change
		if (history.size > 1) {
			val top = history.pop
			val topm1 = history.peek
			history.push(top)
			
			if (top.equals(topm1)) {
				return ''''''
			}
		}
		'''[«indexNameContexts.get(strd.scheduleTarget).peek.join(",")»]'''
	}
	override printDimNames(BandExpression be) {
		'''[«getLocalContext(be.bandSize).join(",")»]'''
	}
	override printDimNames(TileBandExpression tbe) {
		'''[«getLocalContext(tbe.bandSize).join(",")»]'''
	}
	override printDimNames(ExtensionTarget et) {
		'''[«indexNameContexts.get(et).peek.join(",")»]'''
	}
	
	/*
	 * Schedule dim names are successively declared in case of nested band expressions. 
	 */
	private def getLocalContext(int currentBandSize) {
		val globalContext = scheduleDimNameContextHistory.peek
		globalContext.subList(globalContext.size - currentBandSize, globalContext.size)
	}
	
	override caseTargetMappingForSystemBody(TargetMappingForSystemBody object) {
		
		//Initialize index name contexts
		indexNameContexts = new HashMap
		
		scheduleDimNameContextHistory.push(new ArrayList);
		bandSizeHistory.push(0);
		
		for (target : EcoreUtil2.getAllContentsOfType(object.targetBody, AlphaScheduleTarget)) {
			val Stack<List<String>> stack = new Stack;
			val context = target.findIndexNames
			stack.push(context)
			indexNameContexts.put(target, stack);
		}
		
		super.caseTargetMappingForSystemBody(object)
	}
	
	override caseFilterExpression(FilterExpression object) {
		//use the name given to restrict domain for context
		for (fd : object.filterDomains) {
			indexNameContexts.get(fd.scheduleTarget).push(fd.restrictDomain.indexNames)
		}
		
		val res = super.caseFilterExpression(object)
		
		for (fd : object.filterDomains) {
			indexNameContexts.get(fd.scheduleTarget).pop();
		}
		
		return res;
	}
	
	override caseBandExpression(BandExpression object) {
		object.registerScheduleDimNames
		
		val res = super.caseBandExpression(object)
		
		bandSizeHistory.pop
		scheduleDimNameContextHistory.pop
		
		return res;
	}
	
	override caseTileBandExpression(TileBandExpression object) {
		object.registerScheduleDimNames
		
		val res = super.caseTileBandExpression(object)
		
		bandSizeHistory.pop
		scheduleDimNameContextHistory.pop
		
		return res;
	}
	
	private def registerScheduleDimNames(AbstractBandExpression abe) {
		val priorBands = bandSizeHistory.reduce[p1, p2|p1+p2]
		val additionalDims = abe.findScheduleDimNames(priorBands)
		val prevContext = scheduleDimNameContextHistory.peek
		val newContext = new ArrayList(prevContext)
		newContext.addAll(additionalDims)
		
		scheduleDimNameContextHistory.push(newContext)
		bandSizeHistory.push(abe.bandSize)
	}
	
	override caseExtensionExpression(ExtensionExpression object) {
		for (ExtensionTarget et : object.getExtensionTargets()) {
			val Stack<List<String>> contexts = new Stack
			
			if (et.getIndexNames().size() == et.getExtensionMap().getNbOutputs()) {
				contexts.add(et.getIndexNames());
			} else {
				contexts.add(null);
			}
			
			indexNameContexts.put(et, contexts);
		}
		
		val res = super.caseExtensionExpression(object)
		
		for (ExtensionTarget et : object.getExtensionTargets()) {
			indexNameContexts.remove(et)	
		}
		
		return res;
	}
	
	
	/*
	 * Helper to find index names
	 */
	private def dispatch findIndexNames(AlphaScheduleTarget target) {
		
	}
	private def dispatch findIndexNames(StandardEquation eq) {
		if (eq.getIndexNames().isEmpty() && eq.getVariable().getDomain().getNbIndices() > 0) {
			eq.getVariable().getDomain().getIndexNames();
		} else {
			eq.getIndexNames();
		}
	}
	private def dispatch findIndexNames(UseEquation eq) {
		eq.getInstantiationDomain().getIndexNames();
	}
	private def findScheduleDimNames(AbstractBandExpression abe, int priorBands) {
		val bandSize = abe.bandSize
		if (abe.bandSize == abe.scheduleDimensionNames.size) {
			abe.scheduleDimensionNames
		} else {
			(priorBands..<priorBands+bandSize).map[i|TargetMappingUtil.DEFAULT_SCHEDULE_DIMENSION_NAME_PROVIDER.apply(i)].toList
		}
	}
	
}