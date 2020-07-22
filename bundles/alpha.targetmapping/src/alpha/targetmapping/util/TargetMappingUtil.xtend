package alpha.targetmapping.util

import alpha.model.AlphaSystem
import alpha.model.SystemBody
import alpha.targetmapping.TargetMapping
import alpha.targetmapping.TargetMappingForSystemBody
import alpha.targetmapping.TargetMappingNode
import fr.irisa.cairn.jnimap.isl.ISLASTLoopType
import java.util.function.Function

class TargetMappingUtil {
	
	public static Function<Integer,String> DEFAULT_SCHEDULE_DIMENSION_NAME_PROVIDER = [x|'''i«x»''']
	
	static def TargetMapping getContainerTM(TargetMappingNode node) {
		if (node instanceof TargetMapping)
			return node as TargetMapping
		
		if (node.eContainer() === null)
			return null
		
		return TargetMappingUtil.getContainerTM(node.eContainer() as TargetMappingNode)
	}
	
	static def TargetMappingForSystemBody getContainerTMforSystemBody(TargetMappingNode node) {
		if (node instanceof TargetMappingForSystemBody)
			return node as TargetMappingForSystemBody
		
		if (node.eContainer() === null)
			return null
		
		return TargetMappingUtil.getContainerTMforSystemBody(node.eContainer() as TargetMappingNode)
	}

	static def AlphaSystem getTargetSystem(TargetMappingNode node) {
		val tm = TargetMappingUtil.getContainerTM(node)
		
		if (tm === null) return null;
		
		return tm.targetSystem
	}

	static def SystemBody getTargetSystemBody(TargetMappingNode node) {
		val tm = TargetMappingUtil.getContainerTMforSystemBody(node)
		
		if (tm === null) return null;
		
		return tm.targetBody
	}
	
	static def toString(ISLASTLoopType value) {
		switch (value.getValue()) {
			case ISLASTLoopType.ISL_AST_LOOP_DEFAULT:
				return "default"
			case ISLASTLoopType.ISL_AST_LOOP_ATOMIC:
				return "atomic"
			case ISLASTLoopType.ISL_AST_LOOP_UNROLL:
				return "unroll"
			case ISLASTLoopType.ISL_AST_LOOP_SEPARATE:
				return "separate"
			default:
				throw new IllegalArgumentException()
		}
	}
}