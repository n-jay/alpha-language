package alpha.targetmapping.util

import alpha.targetmapping.TargetMappingNode

class TMAShow extends TMShow {
	
	static def <T extends TargetMappingNode> print(T tmn) {
		val ashow = new TMAShow();
		
		ashow.parameterContext = TargetMappingUtil.getTargetSystem(tmn).parameterDomain;
		
		ashow.doSwitch(tmn).toString()
	}
}