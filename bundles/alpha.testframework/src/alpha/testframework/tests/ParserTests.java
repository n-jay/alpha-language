package alpha.testframework.tests;

import org.junit.Test;

import com.tngtech.java.junit.dataprovider.UseDataProvider;

import alpha.testframework.AlphaTestTemplate;
import alpha.testframework.data.AlphaDataFromFileProvider;
import fr.irisa.cairn.gecos.testframework.IData;
import fr.irisa.cairn.gecos.testframework.annotations.ResourcesLocation;

public class ParserTests extends AlphaTestTemplate {

	@Test
	@UseDataProvider(location = AlphaDataFromFileProvider.class, value = AlphaDataFromFileProvider.PROVIDER_NAME)
	@ResourcesLocation(bundleName = "alpha.testframework", value = "resources/src-alpha/basic")
	public void basic(IData d) {
		runTest(d); 
	}
}
