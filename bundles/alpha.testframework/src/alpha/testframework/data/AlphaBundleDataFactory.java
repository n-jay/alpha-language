package alpha.testframework.data;

import java.io.File;

import fr.irisa.cairn.gecos.testframework.IDataFactory;

public class AlphaBundleDataFactory implements IDataFactory<AlphaBundleData> {
	
	public static final AlphaBundleDataFactory INSTANCE = new AlphaBundleDataFactory(); 

	@Override
	public boolean isValid(File file) {
		return file.isDirectory() && file.getName().endsWith(".unit");
	}

	@Override
	public AlphaBundleData create(File file) {
		return new AlphaBundleData(file);
	}

}
