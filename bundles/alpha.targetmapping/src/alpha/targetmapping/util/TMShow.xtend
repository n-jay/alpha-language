package alpha.targetmapping.util

import alpha.model.util.AlphaPrintingUtil
import alpha.targetmapping.BandExpression
import alpha.targetmapping.BandPiece
import alpha.targetmapping.ContextExpression
import alpha.targetmapping.ExtensionExpression
import alpha.targetmapping.ExtensionTarget
import alpha.targetmapping.FilterExpression
import alpha.targetmapping.GuardExpression
import alpha.targetmapping.IsolateSpecification
import alpha.targetmapping.LoopTypeSpecification
import alpha.targetmapping.MarkExpression
import alpha.targetmapping.PointLoopSpecification
import alpha.targetmapping.ScheduleTargetRestrictDomain
import alpha.targetmapping.SequenceExpression
import alpha.targetmapping.SetExpression
import alpha.targetmapping.TargetMapping
import alpha.targetmapping.TargetMappingForSystemBody
import alpha.targetmapping.TargetMappingNode
import alpha.targetmapping.TileBandExpression
import alpha.targetmapping.TileLoopSpecification
import alpha.targetmapping.TileSizeSpecification
import alpha.targetmapping.TilingSpecification
import fr.irisa.cairn.jnimap.isl.ISLMap
import fr.irisa.cairn.jnimap.isl.ISLSet
import alpha.targetmapping.TILING_TYPE
import alpha.targetmapping.FullTileSpecification

/**
 * Prints the TargetMapping in Show notation. The show notation
 * is mostly context-free and each node can be printed on its own.
 * The only exception is when printing the domains, the parameter
 * domain of the enclosing system is used to simplify the constraints.
 */
class TMShow extends TargetmappingSwitch<CharSequence> {
	protected ISLSet parameterContext = null;

	static def <T extends TargetMappingNode> print(T tmn) {
		val show = new TMShow();
		
		show.parameterContext = TargetMappingUtil.getTargetSystem(tmn).parameterDomain;
		
		show.doSwitch(tmn).toString()
	}
	
	protected def printDomain(ContextExpression ce) {
		AlphaPrintingUtil.toAShowString(ce.contextDomain, parameterContext)
	}
	
	protected def printDomain(ScheduleTargetRestrictDomain strd) {
		AlphaPrintingUtil.toShowString(strd.restrictDomain, parameterContext)
	}
	
	protected def printDomain(GuardExpression ge) {
		AlphaPrintingUtil.toShowString(ge.guardDomain, parameterContext)
	}
	
	protected def printDomain(IsolateSpecification is) {
		AlphaPrintingUtil.toShowString(is.isolateDomain, parameterContext)
	}
	
	protected def printSchedule(BandPiece bp) {
		AlphaPrintingUtil.toShowString(bp.partialSchedule)
	}
	
	protected def printSchedule(TilingSpecification ts) {
		if (ts.loopSchedule.identity)
			''''''
		else
			AlphaPrintingUtil.toShowString(ts.loopSchedule)
	}
	
	protected def printExtensionMap(ISLMap map) {
		AlphaPrintingUtil.toShowString(map)
	}
	
	/*
	 * All the printDimNames methods are to be overridden by AShow.
	 * Context is not used for Show.
	 */
	protected def printDimNames(ScheduleTargetRestrictDomain strd) {
		''''''
	}
	protected def printDimNames(BandExpression be) {
		''''''
	}
	protected def printDimNames(TileBandExpression tbe) {
		''''''
	}
	protected def printDimNames(ExtensionTarget et) {
		''''''
	}
	
	
	override caseTargetMappingNode(TargetMappingNode object) {
		super.caseTargetMappingNode(object)
	}
	
	
	/*override*/ def caseTargetMapping(TargetMapping object) '''
		target «object.targetSystem.fullyQualifiedName»
		
		«object.systemBodyTMs.join('\n\n', [doSwitch])»
	'''
	
	/*override*/ def caseTargetMappingForSystemBody(TargetMappingForSystemBody object) {
		
		if (object.targetMapping.systemBodyTMs.size == 1) {
			return object.scheduleTreeRoot.doSwitch
		} else {
			return '''
				body «object.targetMapping.systemBodyTMs.indexOf(object)»:
					«object.scheduleTreeRoot.doSwitch»
			'''
		}
	}
	
	/*override*/ def caseContextExpression(ContextExpression object) '''
		context «object.printDomain»
		«object.child.doSwitch»
	'''
	
	/*override*/ def caseSetExpression(SetExpression object) '''
		set {
			«object.children.join('', ';\n', ';', [doSwitch])»
		}
	'''
	
	/*override*/ def caseSequenceExpression(SequenceExpression object) '''
		seq {
			«object.children.join('', ';\n', ';', [doSwitch])»
		}
	'''
	
	/*override*/ def caseFilterExpression(FilterExpression object) 
		'''«object.filterDomains.join(', ', [doSwitch])»«IF object.child !== null» : «object.child.doSwitch»«ENDIF»'''
	
	/*override*/ def caseScheduleTargetRestrictDomain(ScheduleTargetRestrictDomain object) 
		'''«object.scheduleTarget.name»«object.printDimNames»«object.printDomain»'''
	
	/*override*/ def caseGuardExpression(GuardExpression object)
		'''if «object.printDomain» «object.child.doSwitch»'''
	
	/*override*/ def caseMarkExpression(MarkExpression object)
		'''mark(«object.identifier») «object.child.doSwitch»'''
	
	/*override*/ def caseBandExpression(BandExpression object)
	'''
		band«object.printDimNames» {
			«object.bandPieces.join('\n', [doSwitch])»
			«object.loopTypeSpecifications.join('\n', [doSwitch])»
			«IF object.isolateSpecification !== null»«object.isolateSpecification.doSwitch»«ENDIF»
		}«IF object.child !== null» + «object.child.doSwitch»«ENDIF»'''
	
	/*override*/ def caseBandPiece(BandPiece object) 
		'''«object.pieceDomain.doSwitch» : «object.printSchedule»'''
	
	override caseLoopTypeSpecification(LoopTypeSpecification object)
		'''«object.unparseString»(«object.dimension»)'''
	
	/*override*/ def caseIsolateSpecification(IsolateSpecification object) '''
		isolate («object.printDomain»«object.loopTypeSpecifications.join(" ", ", ", "", [doSwitch])»)
	'''
	
	/*override*/ def caseTileBandExpression(TileBandExpression object)
	'''
		tile-band«object.printTilingType»«object.printDimNames» {
			«object.bandPieces.join('\n', [doSwitch])»
			«object.tilingSpecification.doSwitch»
		}'''
	
	private def printTilingType(TileBandExpression tbe) {
		if (tbe.tilingType == TILING_TYPE.FIXED_SIZE)
			''
		else
			''' («tbe.tilingType.literal»)'''
	}
	
	/*override*/ def caseTileLoopSpecification(TileLoopSpecification object) '''
		tile«IF object.parallel» parallel«ENDIF» («object.tileSizeSpecifications.join(",", [doSwitch])») «object.printSchedule»
		«object.tilingSpecification.doSwitch»
	'''
	
	override caseTileSizeSpecification(TileSizeSpecification object) {
		return object.unparseString
	}
	
	/*override*/ def casePointLoopSpecification(PointLoopSpecification object) '''
		point «object.printSchedule» «object.loopTypeSpecifications.join(' ', [doSwitch])»«
			IF object.fullTileSpecification !== null»«object.fullTileSpecification.doSwitch»«ENDIF»
	'''
	
	/*override*/ def caseFullTileSpecification(FullTileSpecification object)
		'''full-tile «IF object.loopTypeSpecifications.length > 0»(«object.loopTypeSpecifications.join(' ', [doSwitch])»)«ENDIF»'''
	
	/*override*/ def caseExtensionExpression(ExtensionExpression object)
		'''extend («object.extensionTargets.join(', ', [doSwitch])») «object.child.doSwitch»'''
	
	/*override*/ def caseExtensionTarget(ExtensionTarget object) 
		'''«object.extensionMap.printExtensionMap» as «object.name»«object.printDimNames»'''
		
		
}