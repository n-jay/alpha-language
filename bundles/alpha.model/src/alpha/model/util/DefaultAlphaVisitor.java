package alpha.model.util;

import alpha.model.AlphaConstant;
import alpha.model.AlphaElement;
import alpha.model.AlphaPackage;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitor;
import alpha.model.ExternalFunction;
import alpha.model.FuzzyVariable;
import alpha.model.Imports;
import alpha.model.InputVariable;
import alpha.model.LocalVariable;
import alpha.model.OutputVariable;
import alpha.model.PolyhedralObject;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.Variable;

public interface DefaultAlphaVisitor extends AlphaVisitor {

	
	@Override
	default void visitAlphaRoot(AlphaRoot root) {
		for (Imports i : root.getImports()) {
			i.accept(this);
		}
		for (AlphaPackage ap : root.getPackages()) {
			ap.accept(this);
		}
		for (AlphaSystem as : root.getSystems()) {
			as.accept(this);
		}
	}
	
	@Override
	default void visitAlphaElement(AlphaElement ap) {}
	
	@Override
	default void visitAlphaPackage(AlphaPackage ap) {}

	@Override
	default void visitImports(Imports imports) {}

	@Override
	default void visitAlphaSystem(AlphaSystem system) {
		for (PolyhedralObject pobj : system.getDefinedObjects()) {
			visitPolyhedralObject(pobj);
		}
		for (InputVariable v : system.getInputs()) {
			visitInputVariable(v);
		}
		for (OutputVariable v : system.getOutputs()) {
			visitOutputVariable(v);
		}
		for (LocalVariable v : system.getLocals()) {
			visitLocalVariable(v);
		}
		for (FuzzyVariable v : system.getFuzzyVariables()) {
			visitFuzzyVariable(v);
		}
	}

	@Override
	default void visitVariable(Variable variable) {}
	
	@Override
	default void visitInputVariable(InputVariable variable) {
		visitVariable(variable);
	}

	@Override
	default void visitOutputVariable(OutputVariable variable) {
		visitVariable(variable);
	}

	@Override
	default void visitLocalVariable(LocalVariable variable) {
		visitVariable(variable);
	}
	
	@Override
	default void visitFuzzyVariable(FuzzyVariable variable) {
		visitVariable(variable);
	}

	@Override
	default void visitPolyhedralObject(PolyhedralObject pobj) {}
	
	@Override
	default void visitAlphaConstant(AlphaConstant ac) {}
	
	@Override
	default void visitExternalFunction(ExternalFunction ef) {}
	
	@Override
	default void visitUseEquation(UseEquation ue) {}
	
	@Override
	default void visitStandardEquation(StandardEquation se) {}

}
