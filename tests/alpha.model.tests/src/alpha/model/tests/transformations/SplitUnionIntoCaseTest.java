package alpha.model.tests.transformations;

import java.io.File;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.xtext.EcoreUtil2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.RestrictExpression;
import alpha.model.tests.AbstractAlphaTest;
import alpha.model.tests.data.AlphaBundleTestInput;
import alpha.model.tests.data.AlphaSingleFileTestInput;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.tests.util.AlphaTestUtil;
import alpha.model.transformation.SplitUnionIntoCase;

@RunWith(Parameterized.class)
public class SplitUnionIntoCaseTest extends AbstractAlphaTest {

	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/split-union-into-case/";
	
	public SplitUnionIntoCaseTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return AlphaTestUtil.gatherTestInputs(new File(ROOT_DIR).toPath()).stream().map(f -> new Object[] { f }).collect(Collectors.toList());
	}
	
	@Test
	public void compute() {
		doTest();
	}
	
	@Override
	protected void doTest(AlphaSingleFileTestInput input) {
		AlphaRoot root = AlphaTestUtil.parseAndCheck(input);
		for (AlphaSystem system : root.getSystems()) {
			SplitUnionIntoCase.apply(system);
			
			EcoreUtil2.getAllContentsOfType(system, RestrictExpression.class).
				forEach(x->Assert.assertTrue(x.getRestrictDomain().getNbBasicSets() == 1));
		}
		AlphaTestUtil.saveAndParse(root, (r->alpha.model.util.Show.print(r)));
	}
	
	@Override
	protected void doTest(AlphaBundleTestInput input) {
		throw new UnsupportedOperationException();
	}


}
