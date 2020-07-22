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
import fr.irisa.cairn.jnimap.isl.ISLMap
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import fr.irisa.cairn.jnimap.isl.ISLSet
import org.eclipse.emf.common.util.EList

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
	
	protected def printContextDomain(ISLSet set) {
		AlphaPrintingUtil.toAShowString(set, parameterContext)
	}
	
	protected def printRestrictDomain(ISLSet set) {
		AlphaPrintingUtil.toShowString(set, parameterContext)
	}
	
	protected def printGuardDomain(ISLSet set) {
		AlphaPrintingUtil.toShowString(set, parameterContext)
	}
	
	protected def printIsolateDomain(ISLSet set) {
		AlphaPrintingUtil.toShowString(set, parameterContext)
	}
	
	protected def printBandSchedule(ISLMultiAff maff) {
		AlphaPrintingUtil.toShowString(maff)
	}
	
	protected def printLoopSchedule(ISLMultiAff maff) {
		if (maff.identity)
			''''''
		else
			AlphaPrintingUtil.toShowString(maff)
	}
	
	protected def printExtensionMap(ISLMap map) {
		AlphaPrintingUtil.toShowString(map)
	}
	
	override caseTargetMappingNode(TargetMappingNode object) {
		super.caseTargetMappingNode(object)
	}
	
	/* this should be changed by AShow */
	protected def printDimNames(EList<String> names) ''''''
	
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
		context «object.contextDomain.printContextDomain»
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
		'''«object.scheduleTarget.name»«object.indexNames.printDimNames»«object.restrictDomain.printRestrictDomain»'''
	
	/*override*/ def caseGuardExpression(GuardExpression object)
		'''if «object.guardDomain.printGuardDomain» «object.child.doSwitch»'''
	
	/*override*/ def caseMarkExpression(MarkExpression object)
		'''mark(«object.identifier») «object.child.doSwitch»'''
	
	/*override*/ def caseBandExpression(BandExpression object)
	'''
		band«object.scheduleDimensionNames.printDimNames» {
			«object.bandPieces.join('\n', [doSwitch])»
			«object.loopTypeSpecifications.join('\n', [doSwitch])»
			«IF object.isolateSpecification !== null»«object.isolateSpecification.doSwitch»«ENDIF»
		}«IF object.child !== null» + «object.child.doSwitch»«ENDIF»'''
	
	/*override*/ def caseBandPiece(BandPiece object) 
		'''«object.pieceDomain.doSwitch» : «object.partialSchedule.printBandSchedule»'''
	
	override caseLoopTypeSpecification(LoopTypeSpecification object)
		'''«object.unparseString»(«object.dimension»)'''
	
	/*override*/ def caseIsolateSpecification(IsolateSpecification object) '''
		isolate («object.isolateDomain.printIsolateDomain»«object.loopTypeSpecifications.join(" ", ", ", "", [doSwitch])»)
	'''
	
	/*override*/ def caseTileBandExpression(TileBandExpression object)
	'''
		tile-band«object.scheduleDimensionNames.printDimNames» {
			«object.bandPieces.join('\n', [doSwitch])»
			«object.tilingSpecification.doSwitch»
		}'''
	
	/*override*/ def caseTileLoopSpecification(TileLoopSpecification object) '''
		«object.tilingType.literal»«IF object.parallel» parallel«ENDIF» «object.loopSchedule.printLoopSchedule» («object.tileSizeSpecifications.join(",", [doSwitch])»)
		«object.tilingSpecification.doSwitch»
	'''
	
	override caseTileSizeSpecification(TileSizeSpecification object) {
		return object.unparseString
	}
	
	/*override*/ def casePointLoopSpecification(PointLoopSpecification object) '''
		point «object.loopSchedule.printLoopSchedule» «object.loopTypeSpecifications.join(' ', [doSwitch])»
		«IF object.isolateSpecification !== null»«object.isolateSpecification.doSwitch»«ENDIF»
	'''
	
	/*override*/ def caseExtensionExpression(ExtensionExpression object)
		'''extend («object.extensionTargets.join(', ', [doSwitch])») «object.child.doSwitch»'''
	
	/*override*/ def caseExtensionTarget(ExtensionTarget object) 
		'''«object.extensionMap.printExtensionMap» as «object.name»«object.indexNames.printDimNames»'''
}