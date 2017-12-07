package alpha.testframework.data;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.runners.model.FrameworkMethod;

import com.tngtech.java.junit.dataprovider.DataProvider;

import fr.irisa.cairn.gecos.testframework.IDataFactory;
import fr.irisa.cairn.gecos.testframework.annotations.ResourcesLocation;
import fr.irisa.cairn.gecos.testframework.data.AbstractDataFromFile;
import fr.irisa.cairn.gecos.testframework.dataprovider.DataFromFileProvider;
import fr.irisa.cairn.gecos.testframework.utils.DataProviderUtils;
import fr.irisa.cairn.gecos.testframework.utils.ResourceLocator;

public class AlphaDataFromFileProvider extends DataFromFileProvider {

	public static final AlphaDataFromFileProvider INSTANCE = new AlphaDataFromFileProvider();
	
	@DataProvider 
	public static Object[][] dataProvider(FrameworkMethod method) {
		return INSTANCE.provide(method);
	}
	
	@Override
	protected List<AbstractDataFromFile> processLocation(ResourcesLocation l) {
		String bundleName = l.bundleName();
		String loc = l.value();
		
		ResourceLocator locator = new ResourceLocator(bundleName, loc); //XXX
		File rootDir = locator.locate(loc);
		
		if(!rootDir.isDirectory()) {
			throw new RuntimeException("ERROR: resources resolved loaction not found! Specified by " + l + ". Resolved location: " + rootDir);
		}
		
		List<AbstractDataFromFile> data = new ArrayList<>();
		
		List<IDataFactory<? extends AbstractDataFromFile>> factories = Arrays.asList(AlphaSingleFileDataFactory.INSTANCE, AlphaBundleDataFactory.INSTANCE);
		
		List<Path> resources = DataProviderUtils.findAllMatchingFiles(rootDir, factories);
		
		for (IDataFactory<? extends AbstractDataFromFile> factory : factories) {
			resources.stream()
				.map(Path::toFile)
				.filter(factory::isValid)
				.map(factory::create)
				.forEach(data::add);
		}
		return data;
	}
	
}
