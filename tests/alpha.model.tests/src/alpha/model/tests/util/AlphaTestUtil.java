package alpha.model.tests.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

import com.google.common.io.Files;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaModelSaver;
import alpha.model.AlphaRoot;
import alpha.model.testframework.AlphaTestVersion;

public class AlphaTestUtil {

	private static String tempFileName(int count) {
		return String.format("temp%d.alpha", count);
	}
	
	/**
	 * Saves the AlphaRoots in the given version by applying the function and reads the output.
	 * The output is read as a bundle if the input contains multiple roots.
	 * 
	 * @param v
	 * @param f
	 */
	public static void saveAndParse(AlphaTestVersion v, Function<AlphaRoot, String> f) {
		File dir = Files.createTempDir();
		int count = 0;
		for (AlphaRoot root : v.getAlphaRoots()) {
			File file = new File(dir, tempFileName(count));
			AlphaModelSaver.writeToFile(file, f.apply(root));
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
				File file = new File(dir, tempFileName(0));
				AlphaRoot newRoot = AlphaModelLoader.loadModel(file);
				v.getAlphaRoots().clear();
				v.getAlphaRoots().add(newRoot);
			}
		} catch (IOException e) {
			throw new RuntimeException("Failed to read: " + dir);
		}
	}
}
