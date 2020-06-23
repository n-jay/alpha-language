package alpha.targetmapping.util

import alpha.targetmapping.TargetMappingForSystemBody
import alpha.targetmapping.TargetMapping
import org.eclipse.emf.ecore.EObject
import alpha.model.AlphaSystem
import alpha.model.SystemBody

class TargetMappingUtil {
	
	static def TargetMapping getContainerTM(EObject node) {
		if (node instanceof TargetMapping)
			return node as TargetMapping
		
		if (node.eContainer() === null)
			return null
		
		return TargetMappingUtil.getContainerTM(node.eContainer())
	}
	
	static def TargetMappingForSystemBody getContainerTMforSystemBody(EObject node) {
		if (node instanceof TargetMappingForSystemBody)
			return node as TargetMappingForSystemBody
		
		if (node.eContainer() === null)
			return null
		
		return TargetMappingUtil.getContainerTMforSystemBody(node.eContainer())
	}

	static def AlphaSystem getTargetSystem(EObject node) {
		val tm = TargetMappingUtil.getContainerTM(node)
		
		if (tm === null) return null;
		
		return tm.targetSystem
	}

	static def SystemBody getTargetSystemBody(EObject node) {
		val tm = TargetMappingUtil.getContainerTMforSystemBody(node)
		
		if (tm === null) return null;
		
		return tm.targetBody
	}
	
}