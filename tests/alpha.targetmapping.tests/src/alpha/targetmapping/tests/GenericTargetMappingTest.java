package alpha.targetmapping.tests;

import java.io.File;
import java.nio.file.Path;
import java.util.Collection;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import alpha.loader.AlphaLoader;
import alpha.targetmapping.TargetMapping;
import alpha.targetmapping.tests.data.ITargetMappingTestInput;
import alpha.targetmapping.tests.data.TargetMappingSingleFileTestInput;
import alpha.targetmapping.tests.util.TargetMappingTestUtil;
import alpha.targetmapping.util.TMShow;

@RunWith(Parameterized.class)
public abstract class GenericTargetMappingTest {

	private final ITargetMappingTestInput input;

	public GenericTargetMappingTest(ITargetMappingTestInput input) {
		this.input = input;
	}

	protected static Collection<Object[]> getData(String filepath) {
		return getData(new File(filepath).toPath());
	}
	protected static Collection<Object[]> getData(Path path) {
		return TargetMappingTestUtil.gatherTestInputs(path).stream().map(f -> new Object[] { f }).collect(Collectors.toList());
	}
	
	@Test
	public void compute() {
		AlphaLoader.initialize();
		doTest();
	}
	
	/** Dispatch **/
	protected void doTest() {
		if (input instanceof TargetMappingSingleFileTestInput) {
			doTest((TargetMappingSingleFileTestInput)input);
		}
	}
	
	protected void doTest(TargetMappingSingleFileTestInput input) {
		TargetMapping tm = TargetMappingTestUtil.parseAndCheck(input);
		doTest(tm);
		TargetMappingTestUtil.saveAndParse(input, tm, TMShow::print);
	}
	
	protected void doTest(TargetMapping tm) {
		
	}
}
