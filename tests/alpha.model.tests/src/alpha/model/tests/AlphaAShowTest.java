package alpha.model.tests;

import java.util.Collection;
import java.util.List;

import org.junit.runners.Parameterized.Parameters;

import alpha.model.AlphaRoot;
import alpha.model.tests.data.AlphaBundleTestInput;
import alpha.model.tests.data.AlphaSingleFileTestInput;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.tests.util.AlphaTestUtil;

public class AlphaAShowTest extends GenericAlphaSystemTest {

	public AlphaAShowTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(AlphaTestUtil.SRC_VALID);
	}
	
	@Override
	protected void doTest(AlphaSingleFileTestInput input) {
		AlphaRoot root = AlphaTestUtil.parseAndCheck(input);
		AlphaTestUtil.saveAndParse(root, (r->alpha.model.util.AShow.print(r)));
	}
	
	@Override
	protected void doTest(AlphaBundleTestInput input) {
		List<AlphaRoot> root = AlphaTestUtil.parseAndCheck(input);
		AlphaTestUtil.saveAndParse(root, (r->alpha.model.util.AShow.print(r)));
	}
}
