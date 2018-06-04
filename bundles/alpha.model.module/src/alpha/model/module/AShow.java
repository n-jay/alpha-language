package alpha.model.module;

import alpha.model.AlphaRoot;
import fr.irisa.r2d2.gecos.framework.GSModule;
import fr.irisa.r2d2.gecos.framework.GSModuleConstructor;

@GSModule("Prints a progran in AShow syntax.\n"
		+ "\nSee: 'Show' module for outputs in 'pure' Alpha.")
public class AShow extends AbstractAlphaModule<AlphaRoot> {

	private final AlphaRoot root;
	private final String systemName;

	@GSModuleConstructor("Prints the entire program.")
	public AShow(AlphaRoot root) {
		this.root = root;
		systemName = null;
	}

	@GSModuleConstructor("Prints the specified system.")
	public AShow(AlphaRoot root, String systemName) {
		this.root = root;
		this.systemName = systemName;
	}
	
	@Override
	public AlphaRoot compute() {
		String s = alpha.model.util.AShow.print((systemName != null)?root.getSystem(systemName):root);
		System.out.println(s);
		
		return root;
	}

}
