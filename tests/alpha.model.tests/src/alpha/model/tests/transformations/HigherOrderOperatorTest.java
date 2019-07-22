package alpha.model.tests.transformations;

import java.util.Collection;

import org.eclipse.xtext.EcoreUtil2;
import org.junit.Assert;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaSystem;
import alpha.model.StandardEquation;
import alpha.model.tests.GenericAlphaSystemTest;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.transformation.reduction.HigherOrderOperator;
import fr.irisa.cairn.jnimap.isl.ISLDimType;

public class HigherOrderOperatorTest extends GenericAlphaSystemTest {

	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/higher-order-operator/";
	
	public HigherOrderOperatorTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(ROOT_DIR);
	}
	
	@Override
	protected void doTest(AlphaSystem system) {
		EcoreUtil2.getAllContentsOfType(system, StandardEquation.class).
		forEach(x->{
			Assert.assertTrue(
					"Assumes first expression of any StandardEquation is a reduction.",
					x.getExpr() instanceof AbstractReduceExpression);
			
			int dimBefore = ((AbstractReduceExpression)x.getExpr()).getProjection().getNbInputs();
			HigherOrderOperator.apply((AbstractReduceExpression)x.getExpr());
			
			int dimAfter = 0;
			if (x.getExpr() instanceof AbstractReduceExpression) {
				dimAfter = ((AbstractReduceExpression)x.getExpr()).getProjection().getNbInputs();
			}
			Assert.assertTrue(
					"The dimensions of target reduction did not decrease.",
					!(x.getExpr() instanceof AbstractReduceExpression) || 
					dimAfter < dimBefore);
		});
	}
}
