package alpha.model.tests;

import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AlphaRoot;
import alpha.model.tests.checker.CheckNormalized;
import alpha.model.tests.data.AlphaBundleTestInput;
import alpha.model.tests.data.AlphaSingleFileTestInput;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.tests.util.AlphaTestUtil;
import alpha.model.transformation.Normalize;

@RunWith(Parameterized.class)
public class AlphaNormalizeTest extends GenericAlphaSystemTest {

	public AlphaNormalizeTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(AlphaTestUtil.SRC_VALID);
	}
	
	@Override
	protected void doTest(AlphaSingleFileTestInput input) {
		AlphaRoot root = AlphaTestUtil.parseAndCheck(input);
		Normalize.apply(root);
		Assert.assertTrue(CheckNormalized.apply(root));
	}
	
	@Override
	protected void doTest(AlphaBundleTestInput input) {
		List<AlphaRoot> roots = AlphaTestUtil.parseAndCheck(input);
		for (AlphaRoot root : roots) {
			Normalize.apply(root);
			Assert.assertTrue(CheckNormalized.apply(root));
		}
	}
}
