package alpha.testframework.data;

import java.io.File;

import fr.irisa.cairn.gecos.testframework.IDataFactory;

public class AlphaSingleFileDataFactory implements IDataFactory<AlphaSingleFileData> {
	
	public static final AlphaSingleFileDataFactory INSTANCE = new AlphaSingleFileDataFactory();

	@Override
	public boolean isValid(File file) {
		return file.isFile() && file.getName().endsWith(".alpha");
	}

	@Override
	public AlphaSingleFileData create(File file) {
		return new AlphaSingleFileData(file);
	}

}
