package alpha.model.tests;

import java.io.File;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import alpha.loader.AlphaLoader;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.tests.data.AlphaBundleTestInput;
import alpha.model.tests.data.AlphaScriptTestInput;
import alpha.model.tests.data.AlphaSingleFileTestInput;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.tests.util.AlphaTestUtil;

@RunWith(Parameterized.class)
public abstract class GenericAlphaSystemTest {
	
	private final IAlphaTestInput input;

	public GenericAlphaSystemTest(IAlphaTestInput input) {
		this.input = input;
	}

	protected static Collection<Object[]> getData(String filepath) {
		return getData(new File(filepath).toPath());
	}
	protected static Collection<Object[]> getData(Path path) {
		return AlphaTestUtil.gatherTestInputs(path).stream().map(f -> new Object[] { f }).collect(Collectors.toList());
	}
	
	@Test
	public void compute() {
		AlphaLoader.initialize();
		doTest();
	}
	
	/** Dispatch **/
	protected void doTest() {
		if (input instanceof AlphaSingleFileTestInput) {
			doTest((AlphaSingleFileTestInput)input);
		}
		if (input instanceof AlphaBundleTestInput) {
			doTest((AlphaBundleTestInput)input);
		}
		if (input instanceof AlphaScriptTestInput) {
			doTest((AlphaScriptTestInput)input);
		}
	}
	
	protected void doTest(AlphaSingleFileTestInput input) {
		AlphaRoot root = AlphaTestUtil.parseAndCheck(input);
		for (AlphaSystem system : root.getSystems()) {
			doTest(system);
		}
		AlphaTestUtil.saveAndParse(root, (r->alpha.model.util.Show.print(r)));
	}
	
	protected void doTest(AlphaBundleTestInput input) {
		List<AlphaRoot> roots = AlphaTestUtil.parseAndCheck(input);
		for (AlphaRoot root : roots) {
			for (AlphaSystem system : root.getSystems()) {
				doTest(system);
			}
			AlphaTestUtil.saveAndParse(root, (r->alpha.model.util.Show.print(r)));
		}
	}
	
	protected void doTest(AlphaScriptTestInput input) {
		throw new UnsupportedOperationException();
	}
	
	protected void doTest(AlphaSystem system) {
		
	}
}
