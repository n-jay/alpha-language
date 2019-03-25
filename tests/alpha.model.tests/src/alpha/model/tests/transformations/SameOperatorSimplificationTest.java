package alpha.model.tests.transformations;

import java.util.Collection;

import org.eclipse.xtext.EcoreUtil2;
import org.junit.Assert;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AbstractReduceExpression;
import alpha.model.AlphaSystem;
import alpha.model.BinaryExpression;
import alpha.model.MultiArgExpression;
import alpha.model.StandardEquation;
import alpha.model.tests.GenericAlphaSystemTest;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.transformation.reduction.SameOperatorSimplification;

public class SameOperatorSimplificationTest extends GenericAlphaSystemTest {

	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/same-operator-simplification/";
	
	public SameOperatorSimplificationTest(final IAlphaTestInput test) {
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
					"SameOperatorSimplificationTest assumes first expression of any StandardEquation is a reduction.",
					x.getExpr() instanceof AbstractReduceExpression);
			SameOperatorSimplification.apply((AbstractReduceExpression)x.getExpr());
		});
		
		EcoreUtil2.getAllContentsOfType(system, AbstractReduceExpression.class).
		forEach(x->Assert.assertTrue(
				EcoreUtil2.getAllContentsOfType(x, BinaryExpression.class).isEmpty() &&
				EcoreUtil2.getAllContentsOfType(x, MultiArgExpression.class).isEmpty()));
	}
}
