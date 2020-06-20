package alpha.model.tests.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.io.Files;

import alpha.loader.AlphaLoader;
import alpha.model.AlphaModelSaver;
import alpha.model.AlphaRoot;
import alpha.model.tests.data.AlphaBundleTestInput;
import alpha.model.tests.data.AlphaSingleFileTestInput;
import alpha.model.tests.data.IAlphaTestInput;

public class AlphaTestUtil {

	public static final Path SRC_VALID = new File("resources/src-valid/").toPath();
	public static final Path SRC_INVALID = new File("resources/src-invalid/").toPath();
	public static final Path SCRIPT_VALID = new File("resources/script-valid/").toPath();
	public static final Path SCRIPT_INVALID = new File("resources/script-invalid/").toPath();
	public static final int COMMON_DEPTH = 4;

	private static String tempFileName(int count) {
		return String.format("temp%d.alpha", count);
	}
	
	public static AlphaRoot parseAndCheck(AlphaSingleFileTestInput testInput) {
		return alpha.commands.Core.ReadAlpha(testInput.getFilepath().toString());
	}
	
	public static List<AlphaRoot> parseAndCheck(AlphaBundleTestInput testInput) {
		return alpha.commands.Core.ReadAlphaBundle(testInput.getFilepath().toString());
	}
	
	/**
	 * Saves the AlphaRoots in the given version by applying the function and reads the output.
	 * The output is read as a bundle if the input contains multiple roots.
	 * 
	 * @param v
	 * @param f
	 */
	public static List<AlphaRoot> saveAndParse(List<AlphaRoot> roots, Function<AlphaRoot, String> f) {
		File dir = Files.createTempDir();
		int count = 0;
		for (AlphaRoot root : roots) {
			File file = new File(dir, tempFileName(count));
			AlphaModelSaver.writeToFile(file, f.apply(root));
			count++;
		}
		
		AlphaLoader.initialize();
		try {
			//bundle
			if (count > 1) {
				return AlphaLoader.loadAlphaDir(dir);
			//single
			} else {
				File file = new File(dir, tempFileName(0));
				return Arrays.asList(AlphaLoader.loadAlpha(file));
			}
		} catch (IOException e) {
			throw new RuntimeException("Failed to read: " + dir);
		}
	}
	public static AlphaRoot saveAndParse(AlphaRoot root, Function<AlphaRoot, String> f) {
		return saveAndParse(Arrays.asList(root), f).get(0);
	}
	
	public static List<AlphaSingleFileTestInput> gatherSingleFileTestInputs(Path path) {
		return gatherSingleFileTestInputs(path, COMMON_DEPTH);
	}
	public static List<AlphaSingleFileTestInput> gatherSingleFileTestInputs(Path path, int depth) {
		return lookupFiles(path, depth, ".+\\.alpha").filter(p->!p.toString().
				contains(".unit")).map((p->new AlphaSingleFileTestInput(p))).collect(Collectors.toList());
	}
	public static List<AlphaBundleTestInput> gatherBundleTestInputs(Path path) {
		return gatherBundleTestInputs(path, COMMON_DEPTH);
	}
	public static List<AlphaBundleTestInput> gatherBundleTestInputs(Path path, int depth) {
		return lookupDirs(path, depth, ".+\\.unit").map((p->new AlphaBundleTestInput(p))).collect(Collectors.toList());
	}
	public static List<? extends IAlphaTestInput> gatherTestInputs(Path path) {
		return gatherTestInputs(path, COMMON_DEPTH);
	}
	public static List<? extends IAlphaTestInput> gatherTestInputs(Path path, int depth) {
		List<AlphaSingleFileTestInput> list1 = gatherSingleFileTestInputs(path, depth);
		List<AlphaBundleTestInput> list2 = gatherBundleTestInputs(path, depth);
		
		return Stream.of(list1, list2).flatMap(x->x.stream()).collect(Collectors.toList());
	}

	/**
	 * Lookup regular files, in {@code rootDir} recursively, 
	 * that matches the specified filename pattern.
	 *
	 * @return stream of files, never {@code null}
	 */ 
	public static Stream<Path> lookupFiles(Path rootDir, int maxDepth, String fileNamePattern) {
		try {
			return java.nio.file.Files.walk(rootDir, maxDepth)
				.filter(java.nio.file.Files::isRegularFile)
				.filter(f -> f.getFileName().toString().matches(fileNamePattern));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Lookup files (infinite depth) that match the filename pattern.
	 *
	 * @return stream of files, never {@code null}
	 */ 
	public static Stream<Path> lookupFiles(Path rootDir, String fileNamePattern) {
		return lookupFiles(rootDir, Integer.MAX_VALUE, fileNamePattern);
	}
	
	/**
	 * Lookup directories, in {@code rootDir} recursively, 
	 * that matches the specified filename pattern.
	 *
	 * @return stream of files, never {@code null}
	 */ 
	public static Stream<Path> lookupDirs(Path rootDir, int maxDepth, String fileNamePattern) {
		try {
			return java.nio.file.Files.walk(rootDir, maxDepth)
				.filter(java.nio.file.Files::isDirectory)
				.filter(f -> f.getFileName().toString().matches(fileNamePattern));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Lookup directories (infinite depth) that contain at least one 
	 * regular file matching the filename pattern.
	 *
	 * @return stream of files, never {@code null}
	 */ 
	public static Stream<Path> lookupDirsContainingFile(Path rootDir, String fileNamePattern) {
		return lookupFiles(rootDir, fileNamePattern)
				.map(Path::getParent)
				.filter(Objects::nonNull)
				.distinct();
	}
}
