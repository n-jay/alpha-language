package alpha.model.testframework.data;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import fr.irisa.cairn.gecos.testframework.exceptions.InvalidDataException;

public class AlphaSingleFileData extends AbstractAlphaData {
	
	public static boolean isValidPath(Path file) {
		return file != null && Files.isRegularFile(file) 
				&& file.getFileName().toString().matches(FileNamePatterns.ALPHA_SRC);
	}
	
	public static AlphaSingleFileData createFromPath(Path file) throws InvalidDataException {
		if(!isValidPath(file))
			throw new InvalidDataException("Not a valid '" + AlphaSingleFileData.class.getSimpleName() + "' data: " + file);
		
		AlphaSingleFileData data = new AlphaSingleFileData();
		data.path = file;
		data.alphaFiles = Arrays.asList(file);
		return data;
	}
	


}
