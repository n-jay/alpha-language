package alpha.testframework.data;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

import fr.irisa.cairn.gecos.testframework.data.AbstractDataFromFile;

public class AlphaSingleFileData extends AbstractDataFromFile {
	
	private File file;
	
	public AlphaSingleFileData(File file) {
		this.file = file;
	}

	@Override
	public String getName() {
		return file.getName();
	}

	@Override
	public Collection<File> getSourceFiles() {
		return Arrays.asList(file);
	}

	@Override
	public Collection<File> getIncludeDirs() {
		return null;
	}

}
