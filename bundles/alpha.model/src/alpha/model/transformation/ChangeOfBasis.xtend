package alpha.model.transformation

import alpha.model.util.AbstractAlphaCompleteVisitor
import alpha.model.AlphaSystem
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.model.VariableExpression
import alpha.model.Variable
import alpha.model.factory.AlphaUserFactory
import alpha.model.matrix.factory.MatrixUserFactory
import alpha.model.util.AffineFuntionOperations
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType
import org.eclipse.emf.ecore.util.EcoreUtil

class ChangeOfBasis extends AbstractAlphaCompleteVisitor {
	
	private new(AlphaSystem system, Variable variable, JNIISLMultiAff f) {
		CoBfunction = f;
		target = variable;
		
		CoBfunctionInverse = AffineFuntionOperations.inverseInContext(CoBfunction, null, f.space.getNameList(JNIISLDimType.isl_dim_in))
	}
	
	JNIISLMultiAff CoBfunction;
	JNIISLMultiAff CoBfunctionInverse;
	Variable target;
	
	static def void apply(AlphaSystem system, String varName, JNIISLMultiAff f) {
		//f.
		
		val variable = system.variables.findFirst[v|v.name.contentEquals(varName)];
		if (variable === null) throw new RuntimeException(String.format("Variable %s not found.", varName));
		
		val CoB = new ChangeOfBasis(system, variable, f);
		system.accept(CoB);
	}
	
	override inVariable(Variable variable) {
		if (variable == target) {
			val newDom = variable.domain.apply(CoBfunction.copy.toMap)
			variable.domainExpr = AlphaUserFactory.createJNIDomain(newDom)
		}
	}
	
	override inStandardEquation(StandardEquation se) {
		if (se.variable == target) {
			val newExpr = AlphaUserFactory.createDependenceExpression(CoBfunctionInverse.copy, se.expr);
			se.expr = newExpr
		}
	}
	
	override outVariableExpression(VariableExpression ve) {
		if (ve.variable == target) {
			val newExpr = AlphaUserFactory.createDependenceExpression(CoBfunction.copy);
			EcoreUtil.replace(ve, newExpr);
			newExpr.expr = ve
		}
	}
		
	override inUseEquation(UseEquation ue) {
		super.inUseEquation(ue)	
	}
	
}