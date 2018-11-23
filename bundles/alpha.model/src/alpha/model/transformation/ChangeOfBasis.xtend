package alpha.model.transformation

import alpha.model.util.AbstractAlphaCompleteVisitor
import alpha.model.AlphaSystem
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff

class ChangeOfBasis extends AbstractAlphaCompleteVisitor {
	
	private new() {}
	
	static def void apply(AlphaSystem system, String varName, JNIISLMultiAff f) {
		//f.
		
		val CoB = new ChangeOfBasis;
		
	}
	
}