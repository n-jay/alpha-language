package alpha.model.tests.data;

import java.nio.file.Path;

public class AbstractAlphaTestInput implements IAlphaTestInput {
	
	protected Path filepath;
	
	public AbstractAlphaTestInput(Path filepath) {
		this.filepath = filepath;
	}

	@Override
	public Path getFilepath() {
		return filepath;
	}

	@Override
	public String toString() {
		return filepath.toString();
	}
}
