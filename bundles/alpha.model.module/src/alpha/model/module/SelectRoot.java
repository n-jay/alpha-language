package alpha.model.module;

import java.util.List;

import alpha.model.AlphaRoot;
import alpha.model.util.AlphaUtil;
import fr.irisa.r2d2.gecos.framework.GSModule;
import fr.irisa.r2d2.gecos.framework.GSModuleConstructor;

@GSModule("Selects an AlphaRoot from list of AlphaRoots based on the system name.")
public class SelectRoot extends AbstractAlphaModule<AlphaRoot>  {
	
	private final List<AlphaRoot> roots;
	private final String systemName;

	@GSModuleConstructor("Find an AlphaRoot with the given system.")
	public SelectRoot(List<AlphaRoot> roots, String systemName) {
		this.roots = roots;
		this.systemName = systemName;
	}

	@Override
	public AlphaRoot compute() {
		return AlphaUtil.selectAlphaRoot(roots, systemName);
	}

}
