package alpha.model.tests;

import org.junit.Test;

import com.tngtech.java.junit.dataprovider.UseDataProvider;

import alpha.model.exception.AlphaIssueException;
import alpha.model.testframework.AlphaDefaultTestFlows;
import alpha.model.testframework.AlphaTestTemplate;
import alpha.model.testframework.AlphaTestVersion;
import alpha.model.testframework.data.AlphaBundleData;
import alpha.model.testframework.data.AlphaSingleFileData;
import alpha.model.testframework.data.IAlphaData;
import fr.irisa.cairn.gecos.testframework.dataprovider.DataFromPathProvider;
import fr.irisa.cairn.gecos.testframework.dataprovider.ResourcesLocation;
import fr.irisa.cairn.gecos.testframework.exceptions.CreationFailure;
import fr.irisa.cairn.gecos.testframework.utils.ThrowableMatchers;

public class AlphaCheckProgramTest extends AlphaTestTemplate<AlphaTestVersion> {
	
	@Override
	protected void configure() {
		super.configure();
		
		registerTestFlow(AlphaSingleFileData.class, AlphaDefaultTestFlows.alphaFileDataCheckProgramTestFlow());
		registerTestFlow(AlphaBundleData.class, AlphaDefaultTestFlows.alphaFileDataCheckProgramTestFlow());
	}

	@Test
	@UseDataProvider(location = DataFromPathProvider.class, value = DataFromPathProvider.PROVIDER_NAME)
	@ResourcesLocation(value = "resources/src-valid", dataClasses = {AlphaBundleData.class, AlphaSingleFileData.class})
	public void validSyntax(IAlphaData d) {
		runTest(d);
	}
	

	@Test
	@UseDataProvider(location = DataFromPathProvider.class, value = DataFromPathProvider.PROVIDER_NAME)
	@ResourcesLocation(value = "resources/src-invalid", dataClasses = {AlphaBundleData.class, AlphaSingleFileData.class})
	public void invalidSyntax(IAlphaData d) {
		expectedExceptions.register(ThrowableMatchers.isAndHasCause(CreationFailure.class, AlphaIssueException.class));
		
		runTest(d);
	}
	
}
