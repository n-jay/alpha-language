package alpha.model.tests.groovy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.stream.Collectors;

import org.codehaus.groovy.control.CompilationFailedException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import alpha.model.tests.util.AlphaTestUtil;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;


@RunWith(Parameterized.class)
public class AlphaGroovyScriptTest {
	
	private final Path path;
	
	public AlphaGroovyScriptTest(Path path) {
		this.path = path;
	}
	
	@Parameters(name="{0}")
	public static Collection<Object[]> data() {
		return AlphaTestUtil.lookupFiles(AlphaTestUtil.SCRIPT_VALID, ".+\\.groovy").map(f -> new Object[] { f }).collect(Collectors.toList());
	}
	
	@Test
	public void compute() throws CompilationFailedException, IOException {
		GroovyClassLoader gcl = new GroovyClassLoader();
		
		gcl.parseClass(new File("../../bundles/alpha.commands.groovy/src/alpha/commands/groovy/AbstractAlphaScript.groovy"));
		gcl.parseClass(new File("../../bundles/alpha.commands.groovy/src-gen/alpha/commands/groovy/AlphaScript.groovy"));
		GroovyShell shell = new GroovyShell(gcl);
		shell.evaluate(path.toFile());
	}
}
