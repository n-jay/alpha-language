package alpha.model.tests;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AlphaRoot;
import alpha.model.exception.AlphaIssueException;
import alpha.model.tests.data.AlphaBundleTestInput;
import alpha.model.tests.data.AlphaSingleFileTestInput;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.tests.util.AlphaTestUtil;

@RunWith(Parameterized.class)
public class AlphaCheckProgramTest extends GenericAlphaSystemTest {
	
    @Rule
    public ExpectedException thrown = ExpectedException.none();
	
	public AlphaCheckProgramTest(final IAlphaTestInput test, boolean expectedValid) {
		super(test);
		
		if (!expectedValid) {
	         thrown.expect(AlphaIssueException.class);
		}
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return Stream.concat(AlphaTestUtil.gatherTestInputs(AlphaTestUtil.SRC_VALID).stream().map(f -> new Object[] { f, true }),
						AlphaTestUtil.gatherTestInputs(AlphaTestUtil.SRC_INVALID).stream().map(f -> new Object[] { f, false })).collect(Collectors.toList());
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