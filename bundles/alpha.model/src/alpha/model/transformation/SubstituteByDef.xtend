package alpha.model.transformation

import alpha.model.AlphaSystem
import alpha.model.StandardEquation
import alpha.model.util.AbstractAlphaCompleteVisitor

class SubstituteByDef extends AbstractAlphaCompleteVisitor  {
	protected StandardEquation transformedEquation
	protected StandardEquation substitutedEquation
	
	private new(AlphaSystem system, StandardEquation transformedEquation, StandardEquation substitutedEquation) {
		this.transformedEquation = transformedEquation
		this.substitutedEquation = substitutedEquation
	}
	
	
	static def void apply(AlphaSystem system, String varName, String varToSubstitute) {
		
		//TODO Get StandardEquation objects from system
		
		//TODO create instance of this class
		
		//TODO call accept
	}
	
	//TODO override visitor methods to implement substitution
}