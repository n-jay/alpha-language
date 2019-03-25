package alpha.model.tests.transformations;

import java.util.Collection;

import org.eclipse.xtext.EcoreUtil2;
import org.junit.Assert;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.AlphaSystem;
import alpha.model.SystemBody;
import alpha.model.tests.GenericAlphaSystemTest;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.transformation.PropagateSimpleEquations;

public class PropagateSimpleEquationsTest extends GenericAlphaSystemTest {

	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/propagate-simple-equations/";
	
	public PropagateSimpleEquationsTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(ROOT_DIR);
	}
	
	@Override
	protected void doTest(AlphaSystem system) {
		PropagateSimpleEquations.apply(system);
		EcoreUtil2.getAllContentsOfType(system, SystemBody.class).
			forEach(x->Assert.assertTrue(x.getEquations().size() == 1));
	}


}
