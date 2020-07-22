package alpha.targetmapping.tests;

import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

import alpha.targetmapping.TargetMapping;
import alpha.targetmapping.tests.data.ITargetMappingTestInput;
import alpha.targetmapping.tests.data.TargetMappingSingleFileTestInput;
import alpha.targetmapping.tests.util.TargetMappingTestUtil;
import alpha.targetmapping.util.TMAShow;

public class TargetMappingAShowTest extends GenericTargetMappingTest {

	public TargetMappingAShowTest(final ITargetMappingTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(TargetMappingTestUtil.SRC_VALID);
	}
	
	@Override
	protected void doTest(TargetMappingSingleFileTestInput input) {
		TargetMapping tm = TargetMappingTestUtil.parseAndCheck(input);
		doTest(tm);
		TargetMappingTestUtil.saveAndParse(input, tm, TMAShow::print);
	}
}
