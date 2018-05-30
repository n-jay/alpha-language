package alpha.model.module;

import java.io.IOException;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaRoot;
import fr.irisa.r2d2.gecos.framework.GSModule;
import fr.irisa.r2d2.gecos.framework.GSModuleConstructor;

@GSModule("Reads a file as Alpha program.\n"
		+ "\nSee: 'ReadAlphaBundle' module for programs spanning multiple files.")
public class ReadAlpha extends AbstractAlphaModule<AlphaRoot> {

	private final String file;
	
	@GSModuleConstructor("Reads the specified file.")
	public ReadAlpha(String file) {
		this.file = file;
	}
	
	public AlphaRoot compute() {
		try {
			AlphaRoot root = AlphaModelLoader.loadModel(file);
			return root;
		} catch (IOException e) {
			throw new RuntimeException("IOException: " + e.getMessage());
		}
	}
}
