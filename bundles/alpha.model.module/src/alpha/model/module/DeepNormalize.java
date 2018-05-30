package alpha.model.module;

import alpha.model.AlphaRoot;
import alpha.model.transformation.Normalize;
import fr.irisa.r2d2.gecos.framework.GSModule;
import fr.irisa.r2d2.gecos.framework.GSModuleConstructor;

@GSModule("Normalize. Transform the program into normal form.\n"
		+ "  This is a deep normalize that removes all of the new language constructs added for sloppiness.\n")
public class DeepNormalize extends AbstractAlphaModule<AlphaRoot> {

	private final AlphaRoot root;

	@GSModuleConstructor("Normalizes the given program with deep mode enabled.")
	public DeepNormalize(AlphaRoot root) {
		this.root = root;
	}
	
	@Override
	public AlphaRoot compute() {
		Normalize.apply(root, true);
		return root;
	}

}
