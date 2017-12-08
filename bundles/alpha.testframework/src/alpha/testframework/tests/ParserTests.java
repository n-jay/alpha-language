package alpha.testframework.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tngtech.java.junit.dataprovider.UseDataProvider;

import alpha.testframework.AlphaTestTemplate;
import alpha.testframework.AlphaTestVersion;
import alpha.testframework.checker.XtextValidatorCheck;
import alpha.testframework.data.AlphaDataFromFileProvider;
import fr.irisa.cairn.gecos.testframework.IChecker;
import fr.irisa.cairn.gecos.testframework.IData;
import fr.irisa.cairn.gecos.testframework.annotations.ResourcesLocation;

public class ParserTests extends AlphaTestTemplate {
	
	public ParserTests() {
		doGenerate = false;
	}

	@Test
	@UseDataProvider(location = AlphaDataFromFileProvider.class, value = AlphaDataFromFileProvider.PROVIDER_NAME)
	@ResourcesLocation(bundleName = "alpha.testframework", value = "resources/src-alpha/basic")
	public void basic(IData d) {
		runTest(d); 
	}
	
	@Override
	protected List<IChecker<AlphaTestVersion>> getCheckers() {
		return Arrays.asList(XtextValidatorCheck.INSTANCE);
	}
}
