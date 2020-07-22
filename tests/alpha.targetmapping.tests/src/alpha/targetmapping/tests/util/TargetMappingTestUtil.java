package alpha.targetmapping.tests.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.io.Files;

import alpha.loader.AlphaLoader;
import alpha.model.AlphaModelSaver;
import alpha.targetmapping.TargetMapping;
import alpha.targetmapping.tests.data.ITargetMappingTestInput;
import alpha.targetmapping.tests.data.TargetMappingSingleFileTestInput;

/**
 * Methods to perform common routines for testing.
 * 
 *  A large part of it is about collecting new test inputs by 
 *  walking specific directories. The one for TargetMapping
 *  is less general than that used for Alpha, because it requires
 *  both an Alpha program and a TargetMapping to be a test input.
 *  
 *  Currently, conventions regarding the directory structure and 
 *  file names are used to automatically pair Alpha and TargetMapping.
 *  All Alpha sources are expected to be in src-alpha, in a directory
 *  prefixed with .unit in case of multi-source bundles. Then the 
 *  directory scanned for TargetMappings are expected to have .tm
 *  files under folders that correspond to the Alphs source/bundle
 *  in src-alpha.  
 * 
 * @author tyuki
 *
 */
public class TargetMappingTestUtil {
	
	public static final Path SRC_VALID = new File("resources/src-valid/").toPath();
	public static final Path SRC_INVALID = new File("resources/src-invalid/").toPath();
	public static final Path SRC_ALPHA = new File("resources/src-alpha/").toPath();
	public static final int DEFAULT_DEPTH = 4;
	
	private static String tempFileName(int count) {
		return String.format("temp%d.tm", count);
	}
	
	public static TargetMapping parseAndCheck(ITargetMappingTestInput testInput) {
		try {
			AlphaLoader.loadAlpha(testInput.getAlphaFilepath().toString());
			TargetMapping tm = AlphaLoader.loadTargetMapping(testInput.getTargetMappingFilepath().toString());
			
			return tm;
		} catch (IOException e) {
			throw new RuntimeException("IOException: " + e.getMessage());
		}
	}

	public static List<TargetMappingSingleFileTestInput> gatherSingleFileTestInputs(Path path) {
		return gatherSingleFileTestInputs(path, DEFAULT_DEPTH);
	}
	public static List<TargetMappingSingleFileTestInput> gatherSingleFileTestInputs(Path path, int depth) {
		return gatherTestInputs(path, depth).stream()
				.filter(t -> t instanceof TargetMappingSingleFileTestInput)
				.map(t -> (TargetMappingSingleFileTestInput)t)
				.collect(Collectors.toList());
	}
	
	/**
	 * Looks for directories by traversing file hierarchy. Each directory
	 * is assumed to be a collection of TargetMapping. If an Alpha 
	 * file/bundle corresponding to the directory name is found in SRC_ALPHA
	 * then ITargetMappingTestInputs are created for all .tm files. The
	 * directory is silently ignored otherwise.
	 * 
	 * @param path
	 * @param depth
	 * @return
	 */
	public static Collection<ITargetMappingTestInput> gatherTestInputs(Path path, int depth) {
		try {
			return java.nio.file.Files.walk(path, depth)
				.filter(java.nio.file.Files::isDirectory)
				.flatMap(p -> constructTestsForAnAlpha(p))
				.collect(Collectors.toList());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	public static Collection<ITargetMappingTestInput> gatherTestInputs(Path path) {
		return gatherTestInputs(path, DEFAULT_DEPTH);
	}
	
	public static Stream<ITargetMappingTestInput> constructTestsForAnAlpha(Path path) {
		try {
			Path alpha = lookupCorrespondingAlpha(path);
			if (alpha == null)
				return Stream.empty();
			
			return java.nio.file.Files.walk(path, 1)
				.filter(java.nio.file.Files::isRegularFile)
				.filter(f -> f.getFileName().toString().matches(".+\\.tm"))
				.map(f -> createTestInput(alpha, f));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	/*
	 * Alpha file/bundles are assumed to be on the top-level of SRC_ALPHA.
	 * 
	 */
	public static Path lookupCorrespondingAlpha(Path path) {
		try {
			Set<Path> singleFileSet = java.nio.file.Files.walk(SRC_ALPHA, 1)
										.filter(java.nio.file.Files::isRegularFile)
										.filter(f -> f.getFileName().toString().contentEquals(path.getFileName()+".alpha".toString()))
										.collect(Collectors.toSet());
			
			if (!singleFileSet.isEmpty())
					return singleFileSet.iterator().next();
			
			Set<Path> bundleSet     = java.nio.file.Files.walk(SRC_ALPHA, 1)
										.filter(java.nio.file.Files::isDirectory)
										.filter(f -> f.getFileName().toString().contentEquals(path.getFileName()+".unit"))
										.collect(Collectors.toSet());
			
			if (!bundleSet.isEmpty())
					return singleFileSet.iterator().next();
			
			return null;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static ITargetMappingTestInput createTestInput(Path alphaPath, Path tmPath) {
		if (java.nio.file.Files.isRegularFile(alphaPath)) {
			return new TargetMappingSingleFileTestInput(alphaPath, tmPath);
		}
		if (java.nio.file.Files.isDirectory(alphaPath)) {
			//return new TargetMappingSingleFileTestInput(alphaPath, tmPath);
		}
		throw new UnsupportedOperationException();
	}

	public static TargetMapping saveAndParse(ITargetMappingTestInput input, TargetMapping tm, Function<TargetMapping, String> f) {
		File dir = Files.createTempDir();
		File file = new File(dir, tempFileName(0));
		AlphaModelSaver.writeToFile(file, f.apply(tm));
		
		AlphaLoader.initialize();
		
		ITargetMappingTestInput newInput = copyWithTempFile(input, file);
		return TargetMappingTestUtil.parseAndCheck(newInput);
	}
	
	private static ITargetMappingTestInput copyWithTempFile(ITargetMappingTestInput input, File newFile) {
		if (input instanceof TargetMappingSingleFileTestInput) {
			return new TargetMappingSingleFileTestInput(input.getAlphaFilepath(), newFile.toPath());
		}
		
		throw new RuntimeException();
	}
}
