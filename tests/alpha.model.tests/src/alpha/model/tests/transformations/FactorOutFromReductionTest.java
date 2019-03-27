package alpha.model.tests.transformations;

import java.util.Collection;
import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.junit.Assert;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaSystem;
import alpha.model.BinaryExpression;
import alpha.model.DependenceExpression;
import alpha.model.MultiArgExpression;
import alpha.model.tests.GenericAlphaSystemTest;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.transformation.reduction.FactorOutFromReduction;

public class FactorOutFromReductionTest extends GenericAlphaSystemTest {

	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/factor-out-from-reduction/";
	
	public FactorOutFromReductionTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(ROOT_DIR);
	}
	
	@Override
	protected void doTest(AlphaSystem system) {
		List<BinaryExpression> bexprs = EcoreUtil2.getAllContentsOfType(system, BinaryExpression.class);
		List<MultiArgExpression> maexprs = EcoreUtil2.getAllContentsOfType(system, MultiArgExpression.class);
		
		Assert.assertTrue("Assumes each system as exactly one candidate target to apply the transformation.", 
				bexprs.size() + maexprs.size() == 1);
		
		if (bexprs.size() == 1) {
			FactorOutFromReduction.apply((DependenceExpression)bexprs.get(0).getLeft());
		} else {
			FactorOutFromReduction.apply((DependenceExpression)maexprs.get(0).getExprs().get(0));
		}
		EcoreUtil2.getAllContentsOfType(system, AbstractReduceExpression.class).
		forEach(x->{
			Assert.assertTrue("Assumes all reductions to not have any Binary/MultiArgExpression after the transformation.",
			EcoreUtil2.getAllContentsOfType(x, BinaryExpression.class).isEmpty() &&
			EcoreUtil2.getAllContentsOfType(x, MultiArgExpression.class).isEmpty());

			Assert.assertTrue("Assumes all reductions to have BinaryMultiArgExpression as its parent.",
			x.eContainer() instanceof BinaryExpression ||
			x.eContainer() instanceof MultiArgExpression);
		});
	}
}
