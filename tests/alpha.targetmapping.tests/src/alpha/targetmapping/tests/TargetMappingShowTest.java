package alpha.targetmapping.tests;

import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

import alpha.targetmapping.tests.data.ITargetMappingTestInput;
import alpha.targetmapping.tests.util.TargetMappingTestUtil;

public class TargetMappingShowTest extends GenericTargetMappingTest {

	public TargetMappingShowTest(final ITargetMappingTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(TargetMappingTestUtil.SRC_VALID);
	}
	
}
