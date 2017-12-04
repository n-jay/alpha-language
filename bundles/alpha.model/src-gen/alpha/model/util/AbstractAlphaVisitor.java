package alpha.model.util;

import org.eclipse.emf.ecore.impl.EObjectImpl;

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

public abstract class AbstractAlphaVisitor extends EObjectImpl implements AlphaVisitor {

	
	@Override
	public void visitAlphaRoot(AlphaRoot root) {
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
	public void visitAlphaElement(AlphaElement ap) {}
	
	@Override
	public void visitAlphaPackage(AlphaPackage ap) {}

	@Override
	public void visitImports(Imports imports) {}

	@Override
	public void visitAlphaSystem(AlphaSystem system) {
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
	public void visitVariable(Variable variable) {}
	
	@Override
	public void visitInputVariable(InputVariable variable) {
		visitVariable(variable);
	}

	@Override
	public void visitOutputVariable(OutputVariable variable) {
		visitVariable(variable);
	}

	@Override
	public void visitLocalVariable(LocalVariable variable) {
		visitVariable(variable);
	}
	
	@Override
	public void visitFuzzyVariable(FuzzyVariable variable) {
		visitVariable(variable);
	}

	@Override
	public void visitPolyhedralObject(PolyhedralObject pobj) {}
	@Override
	public void visitAlphaConstant(AlphaConstant ac) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visitExternalFunction(ExternalFunction ef) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visitUseEquation(UseEquation ue) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visitStandardEquation(StandardEquation se) {
		// TODO Auto-generated method stub
		
	}

}
