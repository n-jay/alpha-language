package alpha.commands;

/*PROTECTED REGION ID(TransformationsBase_Imports) ENABLED START*/
//Add custom imports here
/*PROTECTED REGION END*/

import alpha.model.AlphaSystem;
import alpha.model.Variable;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import alpha.model.SystemBody;
import alpha.model.StandardEquation;


public class TransformationsBase {
	public static void ChangeOfBasis(AlphaSystem system, Variable var, JNIISLMultiAff f) {
		/*PROTECTED REGION ID(Transformations.ChangeOfBasis_) ENABLED START*/
		throw new UnsupportedOperationException("Not implemented.");
		/*PROTECTED REGION END*/
	}
	public static void Split(AlphaSystem system, Variable var, JNIISLSet splitDom) {
		/*PROTECTED REGION ID(Transformations.Split_) ENABLED START*/
		throw new UnsupportedOperationException("Not implemented.");
		/*PROTECTED REGION END*/
	}
	public static void SubstituteByDef(SystemBody body, StandardEquation targetEq, StandardEquation inlineEq) {
		/*PROTECTED REGION ID(Transformations.SubstituteByDef_) ENABLED START*/
		throw new UnsupportedOperationException("Not implemented.");
		/*PROTECTED REGION END*/
	}
}
