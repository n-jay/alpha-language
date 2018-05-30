package alpha.model.module;

import alpha.model.AlphaRoot;
import fr.irisa.r2d2.gecos.framework.GSArg;
import fr.irisa.r2d2.gecos.framework.GSModule;
import fr.irisa.r2d2.gecos.framework.GSModuleConstructor;

@GSModule("Prints a progran in Show syntax.\n"
		+ "\nSee: 'AShow' module for outputs in Array Notation.")
public class Show extends AbstractAlphaModule<AlphaRoot> {

	private final AlphaRoot root;
	private final String systemName;

	@GSModuleConstructor("Prints the entire program.")
	public Show(AlphaRoot root) {
		this.root = root;
		systemName = null;
	}

	@GSModuleConstructor("Prints the specified system.")
	public Show(AlphaRoot root, String systemName) {
		this.root = root;
		this.systemName = systemName;
	}
	
	@Override
	public AlphaRoot compute() {
		String s = alpha.model.util.Show.print((systemName != null)?root.getSystem(systemName):root);
		System.out.println(s);
		
		return root;
	}

}
