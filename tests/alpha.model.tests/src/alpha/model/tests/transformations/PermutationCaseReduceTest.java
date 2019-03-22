package alpha.model.tests.transformations;

import java.util.Collection;

import org.eclipse.xtext.EcoreUtil2;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaSystem;
import alpha.model.CaseExpression;
import alpha.model.tests.GenericAlphaSystemTest;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.transformation.reduction.PermutationCaseReduce;

@RunWith(Parameterized.class)
public class PermutationCaseReduceTest extends GenericAlphaSystemTest {

	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/permutation-case-reduce/";
	
	public PermutationCaseReduceTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(ROOT_DIR);
	}
	
	@Override
	protected void doTest(AlphaSystem system) {
		PermutationCaseReduce.apply(system);
		EcoreUtil2.getAllContentsOfType(system, AbstractReduceExpression.class).
			forEach(x->Assert.assertFalse(x.getBody() instanceof CaseExpression));
	}
}
