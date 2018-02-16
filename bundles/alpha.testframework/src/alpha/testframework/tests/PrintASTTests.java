package alpha.testframework.tests;

import org.junit.Test;

import com.tngtech.java.junit.dataprovider.UseDataProvider;

import alpha.model.AlphaRoot;
import alpha.model.util.PrintAST;
import alpha.testframework.AlphaTestTemplate;
import alpha.testframework.AlphaTestVersion;
import alpha.testframework.data.AlphaDataFromFileProvider;
import fr.irisa.cairn.gecos.testframework.ICodeGenerator;
import fr.irisa.cairn.gecos.testframework.IData;
import fr.irisa.cairn.gecos.testframework.annotations.ResourcesLocation;

public class PrintASTTests extends AlphaTestTemplate {
	
	public PrintASTTests() {
		doCompile = false;
	}
	
	@Test
	@UseDataProvider(location = AlphaDataFromFileProvider.class, value = AlphaDataFromFileProvider.PROVIDER_NAME)
//	@ResourcesLocation(bundleName = "alpha.testframework", value = "resources/src-alpha/basic")
//	@ResourcesLocation(bundleName = "alpha.testframework", value = "resources/src-alpha/syntax-tests")
	@ResourcesLocation(bundleName = "alpha.testframework", value = "resources/src-alpha/kernels")
	public void basic(IData d) {
		runTest(d); 
	}
	
	@Override
	protected ICodeGenerator<AlphaTestVersion> getGenerator() {
		return new ICodeGenerator<AlphaTestVersion>() {
			
			@Override
			public void generate(AlphaTestVersion version) {
				for (AlphaRoot root : version.getAlphaRoots()) {
					System.out.println(PrintAST.print(root));
				}
			}
		};
	}
	
	
}
