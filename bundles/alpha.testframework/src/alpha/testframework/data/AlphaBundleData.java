package alpha.testframework.data;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import fr.irisa.cairn.gecos.testframework.data.AbstractDataFromFile;

public class AlphaBundleData extends AbstractDataFromFile {
	
	private File bundleDirectory;
	private List<File> files;
	
	public AlphaBundleData(File file) {
		bundleDirectory = file;

		files = Arrays.asList(file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".alpha");
			}
		}));
	}

	@Override
	public String getName() {
		return bundleDirectory.getName();
	}

	@Override
	public Collection<File> getSourceFiles() {
		return files;
	}

	@Override
	public Collection<File> getIncludeDirs() {
		return null;
	}

}
