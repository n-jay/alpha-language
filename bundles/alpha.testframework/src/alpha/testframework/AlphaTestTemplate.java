package alpha.testframework;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaRoot;
import alpha.testframework.checker.XtextValidatorCheck;
import fr.irisa.cairn.gecos.testframework.IChecker;
import fr.irisa.cairn.gecos.testframework.ICodeGenerator;
import fr.irisa.cairn.gecos.testframework.ICompiler;
import fr.irisa.cairn.gecos.testframework.IData;
import fr.irisa.cairn.gecos.testframework.templates.AbstractTestTemplate;

public class AlphaTestTemplate extends AbstractTestTemplate<AlphaTestVersion, AlphaTransformation> {

	
	public AlphaTestTemplate() {
		super();
		
		doGenerate = false;
	}

	@Override
	protected AlphaTestVersion createOriginalVersion(IData data) {

		AlphaTestVersion version = new AlphaTestVersion("original");
		
		try {
			List<AlphaRoot> roots = AlphaModelLoader.loadModel(data.getSourceFiles());
			version.getAlphaRoots().addAll(roots);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		return version;
	}

	@Override
	protected AlphaTestVersion createTransformedVersion(AlphaTransformation transformation, int transIdx) {
		return null;
	}

	@Override
	protected List<IChecker<AlphaTestVersion>> getCheckers() {
		return Arrays.asList(XtextValidatorCheck.INSTANCE);
	}

	@Override
	protected ICodeGenerator<AlphaTestVersion> getGenerator() {
		return null;
	}

	@Override
	protected ICompiler getCompiler() {
		return null;
	}


}
