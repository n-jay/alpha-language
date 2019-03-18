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
import alpha.model.SystemBody;
import alpha.model.tests.AbstractAlphaTest;
import alpha.model.tests.data.AlphaBundleTestInput;
import alpha.model.tests.data.AlphaSingleFileTestInput;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.tests.util.AlphaTestUtil;
import alpha.model.transformation.PropagateSimpleEquations;

@RunWith(Parameterized.class)
public class PropagateSimpleEquationsTest extends AbstractAlphaTest {

	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/propagate-simple-equations/";
	
	public PropagateSimpleEquationsTest(final IAlphaTestInput test) {
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
			PropagateSimpleEquations.apply(system);
			
			System.out.println(alpha.model.util.Show.print(system));
			EcoreUtil2.getAllContentsOfType(system, SystemBody.class).
				forEach(x->Assert.assertTrue(x.getEquations().size() == 1));
		}
		AlphaTestUtil.saveAndParse(root, (r->alpha.model.util.Show.print(r)));
	}
	
	@Override
	protected void doTest(AlphaBundleTestInput input) {
		throw new UnsupportedOperationException();
	}



}
