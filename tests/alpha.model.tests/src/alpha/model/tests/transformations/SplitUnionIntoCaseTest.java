package alpha.model.tests.transformations;

import java.util.Collection;

import org.eclipse.xtext.EcoreUtil2;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AlphaSystem;
import alpha.model.RestrictExpression;
import alpha.model.tests.GenericAlphaSystemTest;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.transformation.SplitUnionIntoCase;

@RunWith(Parameterized.class)
public class SplitUnionIntoCaseTest extends GenericAlphaSystemTest {

	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/split-union-into-case/";
	
	public SplitUnionIntoCaseTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(ROOT_DIR);
	}
	
	@Override
	protected void doTest(AlphaSystem system) {
		SplitUnionIntoCase.apply(system);
		EcoreUtil2.getAllContentsOfType(system, RestrictExpression.class).
			forEach(x->Assert.assertTrue(x.getRestrictDomain().getNbBasicSets() == 1));
	}

}
