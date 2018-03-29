package alpha.model.testframework.data;

import java.nio.file.Path;
import java.util.List;

import fr.irisa.cairn.gecos.testframework.data.AbstractDataFromPath;

public abstract class AbstractAlphaData extends AbstractDataFromPath implements IAlphaData {
	
	protected List<Path> alphaFiles; 

	@Override
	public List<Path> getAlphaFiles() {
		return alphaFiles;
	}

}
