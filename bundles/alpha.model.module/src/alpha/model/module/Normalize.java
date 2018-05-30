package alpha.model.module;

import alpha.model.AlphaRoot;
import fr.irisa.r2d2.gecos.framework.GSModule;
import fr.irisa.r2d2.gecos.framework.GSModuleConstructor;

@GSModule("Normalize. Transform the program into normal form.\n"
		+ "  This is a shallow normalize that preserve some of the new language constructs.\n"
		+ "\nSee: 'DeepNormalize' for full normalization (to pure Alpha).")
public class Normalize extends AbstractAlphaModule<AlphaRoot> {

	private final AlphaRoot root;
	
	@GSModuleConstructor("Normalizes the given program.")
	public Normalize(AlphaRoot root) {
		this.root = root;
	}
	
	@Override
	public AlphaRoot compute() {
		alpha.model.transformation.Normalize.apply(root, false);
		return root;
	}
}
