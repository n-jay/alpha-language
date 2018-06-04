package alpha.model.tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.google.common.io.Files;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaModelSaver;
import alpha.model.AlphaRoot;
import alpha.model.testframework.AlphaDefaultTestFlows;
import alpha.model.testframework.AlphaTestTemplate;
import alpha.model.testframework.AlphaTestVersion;
import alpha.model.testframework.data.AlphaBundleData;
import alpha.model.testframework.data.AlphaSingleFileData;
import alpha.model.testframework.data.IAlphaData;
import fr.irisa.cairn.gecos.testframework.dataprovider.DataFromPathProvider;
import fr.irisa.cairn.gecos.testframework.dataprovider.ResourcesLocation;

public class AlphaShowTest  extends AlphaTestTemplate<AlphaTestVersion> {
	
	
	private void compute(AlphaTestVersion v) {
		File dir = Files.createTempDir();
		int count = 0;
		for (AlphaRoot root : v.getAlphaRoots()) {
			File file = new File(dir, "temp" + count + ".alpha");
			AlphaModelSaver.Save(root, file);
			count++;
		}
		
		try {
			//bundle
			if (count > 1) {
				List<AlphaRoot> newRoots = AlphaModelLoader.loadModelDir(dir);
				v.getAlphaRoots().clear();
				v.getAlphaRoots().addAll(newRoots);
			//single
			} else {
				File file = new File(dir, "temp" + 0 + ".alpha");
				AlphaRoot newRoot = AlphaModelLoader.loadModel(file);
				v.getAlphaRoots().clear();
				v.getAlphaRoots().add(newRoot);
			}
		} catch (IOException e) {
			throw new RuntimeException("Failed to read: " + dir);
		}
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
