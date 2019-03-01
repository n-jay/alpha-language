package alpha.model.tests;

import org.junit.rules.ExpectedException;

import alpha.model.tests.data.AlphaBundleTestInput;
import alpha.model.tests.data.AlphaScriptTestInput;
import alpha.model.tests.data.AlphaSingleFileTestInput;
import alpha.model.tests.data.IAlphaTestInput;

public abstract class AbstractAlphaTest {
	
	private final IAlphaTestInput input;

	public AbstractAlphaTest(IAlphaTestInput input) {
		this.input = input;
	}
	
	/** Dispatch **/
	protected void doTest() {
		if (input instanceof AlphaSingleFileTestInput) {
			doTest((AlphaSingleFileTestInput)input);
		}
		if (input instanceof AlphaBundleTestInput) {
			doTest((AlphaBundleTestInput)input);
		}
		if (input instanceof AlphaScriptTestInput) {
			doTest((AlphaScriptTestInput)input);
		}
	}
	
	protected void doTest(AlphaSingleFileTestInput input) {
		
	}
	
	protected void doTest(AlphaBundleTestInput input) {
		
	}
	
	protected void doTest(AlphaScriptTestInput input) {
		
	}
}
