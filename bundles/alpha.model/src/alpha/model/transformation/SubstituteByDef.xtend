package alpha.model.transformation

import alpha.model.AlphaSystem
import alpha.model.Variable
import alpha.model.util.AbstractAlphaCompleteVisitor

class SubstituteByDef extends AbstractAlphaCompleteVisitor  {
	
	protected Variable targetVariable
	protected Variable substituteVariable
	
	private new(AlphaSystem system, Variable targetVariable, Variable substituteVariable) {
		this.targetVariable = targetVariable
		this.substituteVariable = substituteVariable
	}
	
	
	static def void apply(AlphaSystem system, String varName, String varToSubstitute) {
		
		//TODO Get Variable objects from system
		
		//TODO create instance of this class
		
		//TODO call accept
	}
	
	//TODO override visitor methods to implement substitution
}