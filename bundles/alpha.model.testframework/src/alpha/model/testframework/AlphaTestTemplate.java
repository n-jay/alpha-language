package alpha.model.testframework;

import alpha.model.testframework.data.AlphaBundleData;
import alpha.model.testframework.data.AlphaSingleFileData;
import fr.irisa.cairn.gecos.testframework.s2s.TestFlowTemplate;

public class AlphaTestTemplate<V extends AlphaTestVersion> extends TestFlowTemplate<V> {
	

	@Override
	protected void configure() {
		super.configure();

		registerTestFlow(AlphaSingleFileData.class, AlphaDefaultTestFlows.alphaFileDataTestFlow());
		registerTestFlow(AlphaBundleData.class, AlphaDefaultTestFlows.alphaFileDataTestFlow());
	}
	
}
