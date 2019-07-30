package alpha.model.transformation.automation;

import org.eclipse.emf.ecore.util.EcoreUtil;

import alpha.model.AlphaRoot;

public class ProgramState {

	public final AlphaRoot root;
	public int nbSR;
	
	public ProgramState(AlphaRoot root) {
		this.root = root;
		this.nbSR = 0;
	}
	public ProgramState(AlphaRoot root, int nbSR) {
		this.root = root;
		this.nbSR = nbSR;
	}
	
	public ProgramState copy() {
		return new ProgramState(EcoreUtil.copy(root), nbSR);
	}
}
