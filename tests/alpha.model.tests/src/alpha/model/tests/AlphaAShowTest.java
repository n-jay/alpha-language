package alpha.model.tests;

import org.junit.Test;

import com.tngtech.java.junit.dataprovider.UseDataProvider;

import alpha.model.testframework.AlphaDefaultTestFlows;
import alpha.model.testframework.AlphaTestTemplate;
import alpha.model.testframework.AlphaTestVersion;
import alpha.model.testframework.data.AlphaBundleData;
import alpha.model.testframework.data.AlphaSingleFileData;
import alpha.model.testframework.data.IAlphaData;
import alpha.model.tests.util.AlphaTestUtil;
import alpha.model.util.AShow;
import fr.irisa.cairn.gecos.testframework.dataprovider.DataFromPathProvider;
import fr.irisa.cairn.gecos.testframework.dataprovider.ResourcesLocation;

public class AlphaAShowTest extends AlphaTestTemplate<AlphaTestVersion> {

	private void compute(AlphaTestVersion v) {
		AlphaTestUtil.saveAndParse(v, (r->AShow.print(r)));
	}

	
	@Override
	protected void configure() {
		super.configure();
		
		registerTestFlow(AlphaSingleFileData.class, AlphaDefaultTestFlows.alphaFileDataCheckProgramTestFlow());
		registerTestFlow(AlphaBundleData.class, AlphaDefaultTestFlows.alphaFileDataCheckProgramTestFlow());
	}

	@Test
	@UseDataProvider(location = DataFromPathProvider.class, value = DataFromPathProvider.PROVIDER_NAME)
	@ResourcesLocation(value = "resources/src-valid", dataClasses = {AlphaBundleData.class, AlphaSingleFileData.class})
	public void showTest(IAlphaData d) {
		runTest(d, v->compute(v));
	}
}
