package alpha.model.util;

import alpha.model.AlphaConstant;
import alpha.model.AlphaElement;
import alpha.model.AlphaPackage;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.AlphaVisitable;
import alpha.model.AlphaVisitor;
import alpha.model.ExternalFunction;
import alpha.model.FuzzyVariable;
import alpha.model.Imports;
import alpha.model.PolyhedralObject;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.Variable;

public interface DefaultAlphaVisitor extends AlphaVisitor {
	
	default void defaultIn(AlphaVisitable av) {}
	default void defaultOut(AlphaVisitable av) {}

	/*
	 * Helper to avoid repeating null check all over the place.
	 */
	default void accept(AlphaVisitable av) {
		if (av != null) av.accept(this);
	}
	
	@Override
	default void visitAlphaRoot(AlphaRoot root) {
		inAlphaRoot(root);
		root.getElements().forEach(a->a.accept(this));
		outAlphaRoot(root);
	}
	
	@Override
	default void visitAlphaElement(AlphaElement ap) {
		throw new UnsupportedOperationException("visitAlphaElement should never be called");
	}
	
	@Override
	default void visitAlphaPackage(AlphaPackage ap) {
		inAlphaPackage(ap);
		ap.getElements().forEach(a->a.accept(this));
		outAlphaPackage(ap);
	}

	@Override
	default void visitImports(Imports imports) {
		inImports(imports);
		outImports(imports);
	}

	@Override
	default void visitAlphaSystem(AlphaSystem system) {
		inAlphaSystem(system);
		system.getDefinedObjects().forEach(a->a.accept(this));
		system.getInputs().forEach(a->a.accept(this));
		system.getOutputs().forEach(a->a.accept(this));
		system.getLocals().forEach(a->a.accept(this));
		system.getUseEquations().forEach(a->a.accept(this));
		system.getEquations().forEach(a->a.accept(this));
		outAlphaSystem(system);
	}

	@Override
	default void visitVariable(Variable variable) {
		inVariable(variable);
		outVariable(variable);
	}
	
	@Override
	default void visitFuzzyVariable(FuzzyVariable variable) {
		inFuzzyVariable(variable);
		visitVariable(variable);
		outFuzzyVariable(variable);
	}

	@Override
	default void visitPolyhedralObject(PolyhedralObject pobj) {
		inPolyhedralObject(pobj);
		outPolyhedralObject(pobj);
	}
	
	@Override
	default void visitAlphaConstant(AlphaConstant ac) {
		inAlphaConstant(ac);
		outAlphaConstant(ac);
	}
	
	@Override
	default void visitExternalFunction(ExternalFunction ef) {
		inExternalFunction(ef);
		outExternalFunction(ef);
	}
	
	@Override
	default void visitUseEquation(UseEquation ue) {
		inUseEquation(ue);
		outUseEquation(ue);
	}
	
	@Override
	default void visitStandardEquation(StandardEquation se) {
		inStandardEquation(se);
		outStandardEquation(se);
	}
	

	@Override
	default void inAlphaRoot(AlphaRoot root) {
		defaultIn(root);
	}
	
	@Override
	default void inAlphaElement(AlphaElement ap) {
		defaultIn(ap);
	}

	@Override
	default void inAlphaPackage(AlphaPackage ap) {
		inAlphaElement(ap);
	}

	@Override
	default void inAlphaSystem(AlphaSystem system) {
		inAlphaElement(system);
	}

	@Override
	default void inImports(Imports imports) {
		defaultIn(imports);
	}

	@Override
	default void inAlphaConstant(AlphaConstant ac) {
		inAlphaElement(ac);
	}

	@Override
	default void inExternalFunction(ExternalFunction ef) {
		inAlphaElement(ef);
	}
	
	@Override
	default void inVariable(Variable variable) {
		defaultIn(variable);
	}
	
	@Override
	default void inFuzzyVariable(FuzzyVariable variable) {
		inVariable(variable);
	}

	@Override
	default void inPolyhedralObject(PolyhedralObject pobj) {
		defaultIn(pobj);
	}
	
	@Override
	default void inUseEquation(UseEquation ue) {
		defaultIn(ue);
	}
	
	@Override
	default void inStandardEquation(StandardEquation se) {
		defaultIn(se);
	}

	@Override
	default void outAlphaRoot(AlphaRoot root) {
		defaultOut(root);
	}
	
	@Override
	default void outAlphaElement(AlphaElement ap) {
		defaultOut(ap);
	}
	
	@Override
	default void outAlphaPackage(AlphaPackage ap) {
		outAlphaElement(ap);
	}

	@Override
	default void outAlphaSystem(AlphaSystem system) {
		outAlphaElement(system);
	}

	@Override
	default void outImports(Imports imports) {
		defaultOut(imports);
	}

	@Override
	default void outAlphaConstant(AlphaConstant ac) {
		outAlphaElement(ac);
	}

	@Override
	default void outExternalFunction(ExternalFunction ef) {
		outAlphaElement(ef);
	}
	
	@Override
	default void outVariable(Variable variable) {
		defaultOut(variable);
	}

	@Override
	default void outFuzzyVariable(FuzzyVariable variable) {
		outVariable(variable);
	}

	@Override
	default void outPolyhedralObject(PolyhedralObject pobj) {
		defaultOut(pobj);
	}
	
	@Override
	default void outUseEquation(UseEquation ue) {
		defaultOut(ue);
	}
	
	@Override
	default void outStandardEquation(StandardEquation se) {
		defaultOut(se);
	}
}
