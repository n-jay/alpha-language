package alpha.model.module;

import java.io.IOException;
import java.util.List;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaRoot;
import fr.irisa.r2d2.gecos.framework.GSModule;
import fr.irisa.r2d2.gecos.framework.GSModuleConstructor;

@GSModule("Reads a directory that contain multiple Alpha programs.\n"
		+ "All of the files are parsed and then returned as a list.\n"
		+ "This is necessary when subsystem call span across files.")
public class ReadAlphaBundle extends AbstractAlphaModule<List<AlphaRoot>> {

	private final String dir;
	
	@GSModuleConstructor("Reads the specified directory.")
	public ReadAlphaBundle(String dir) {
		this.dir = dir;
	}
	
	public List<AlphaRoot> compute() {
		try {
			List<AlphaRoot> roots = AlphaModelLoader.loadModelDir(dir);
			return roots;
		} catch (IOException e) {
			throw new RuntimeException("IOException: " + e.getMessage());
		}
	}
}
