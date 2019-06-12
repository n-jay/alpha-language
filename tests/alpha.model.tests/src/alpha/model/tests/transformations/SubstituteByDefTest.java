package alpha.model.tests.transformations;

import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;

import alpha.model.AlphaSystem;
import alpha.model.Variable;
import alpha.model.tests.GenericAlphaSystemTest;
import alpha.model.tests.data.IAlphaTestInput;
import alpha.model.transformation.Normalize;
import alpha.model.transformation.SubstituteByDef;

public class SubstituteByDefTest  extends GenericAlphaSystemTest {

	private static final String ROOT_DIR = "resources/src-valid/transformation-tests/substitute-by-def/";
	
	public SubstituteByDefTest(final IAlphaTestInput test) {
		super(test);
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return getData(ROOT_DIR);
	}
	
	@Override
	protected void doTest(AlphaSystem system) {
		Variable v = system.getOutputs().get(0);
		SubstituteByDef.apply(system, v);
		Normalize.apply(system);
		System.out.println(alpha.model.util.AShow.print(system));
	}

}
