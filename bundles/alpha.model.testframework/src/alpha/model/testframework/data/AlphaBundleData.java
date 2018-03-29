package alpha.model.testframework.data;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

import fr.irisa.cairn.gecos.testframework.exceptions.InvalidDataException;
import fr.irisa.cairn.gecos.testframework.utils.DataProviderUtils;

public class AlphaBundleData extends AbstractAlphaData {
	
	public static boolean isValidPath(Path dir) {
		return dir != null && Files.isDirectory(dir) 
				&& dir.getFileName().toString().matches(FileNamePatterns.ALPHA_UNIT_DIR);
	}
	
	public static AlphaBundleData createFromPath(Path dir) throws InvalidDataException {
		if(!isValidPath(dir))
			throw new InvalidDataException("Not a valid '" + AlphaBundleData.class.getSimpleName() + "' data: " + dir);
	
		AlphaBundleData data = new AlphaBundleData();
		data.path = dir;
		data.alphaFiles = DataProviderUtils.lookupFiles(dir, FileNamePatterns.ALPHA_SRC).collect(Collectors.toList());
		if(data.alphaFiles.isEmpty())
			throw new InvalidDataException("Unit directory of '" + AlphaBundleData.class.getSimpleName() 
					+ "' data must contain at least one source file: " + dir);
		return data;
	}


}
