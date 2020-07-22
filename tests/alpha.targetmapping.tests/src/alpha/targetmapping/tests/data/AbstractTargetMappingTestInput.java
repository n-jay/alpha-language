package alpha.targetmapping.tests.data;

import java.nio.file.Path;

public abstract class AbstractTargetMappingTestInput implements ITargetMappingTestInput {
	
	protected Path alphaFilepath;
	protected Path targetmappingFilepath;
	
	public AbstractTargetMappingTestInput(Path alphaFilepath, Path targetmappingFilepath) {
		this.alphaFilepath = alphaFilepath;
		this.targetmappingFilepath = targetmappingFilepath;
	}

	@Override
	public Path getAlphaFilepath() {
		return alphaFilepath;
	}

	@Override
	public Path getTargetMappingFilepath() {
		return targetmappingFilepath;
	}
	
	@Override
	public String toString() {
		return targetmappingFilepath.toString();
	}

}
