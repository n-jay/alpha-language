package alpha.model.tests;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AlphaRoot;
import alpha.model.tests.data.AlphaBundleTestInput;
import alpha.model.tests.data.AlphaSingleFileTestInput;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.tests.util.AlphaTestUtil;


@RunWith(Parameterized.class)
public class AlphaShowTest extends AbstractAlphaTest {

	public AlphaShowTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return AlphaTestUtil.gatherTestInputs(AlphaTestUtil.SRC_VALID).stream().map(f -> new Object[] { f }).collect(Collectors.toList());
	}
	
	@Test
	public void compute() {
		doTest();
	}
	
	@Override
	protected void doTest(AlphaSingleFileTestInput input) {
		AlphaRoot root = AlphaTestUtil.parseAndCheck(input);
		AlphaTestUtil.saveAndParse(root, (r->alpha.model.util.Show.print(r)));
	}
	
	@Override
	protected void doTest(AlphaBundleTestInput input) {
		List<AlphaRoot> root = AlphaTestUtil.parseAndCheck(input);
		AlphaTestUtil.saveAndParse(root, (r->alpha.model.util.Show.print(r)));
	}
}
