package alpha.testframework.checker;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.xtext.validation.Issue;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaRoot;
import alpha.testframework.AlphaTestVersion;
import fr.irisa.cairn.gecos.testframework.IChecker;
import fr.irisa.cairn.gecos.testframework.exceptions.CheckerFailureException;

public class XtextValidatorCheck implements IChecker<AlphaTestVersion> {
	
	public static final XtextValidatorCheck INSTANCE = new XtextValidatorCheck();

	@Override
	public void check(AlphaTestVersion version) {
		
		List<Issue> issues = new LinkedList<>();
		for (AlphaRoot root : version.getAlphaRoots()) {
			issues.addAll(AlphaModelLoader.validate(root));
			
		}
		if (!issues.isEmpty()) {
			String msg = issues.stream()
				.map(r -> "- " + r)
				.collect(Collectors.joining("\n"));
			throw new CheckerFailureException("[" + this.getClass().getSimpleName() + "]: the version '" + version + "' fails Xtext Validation:\n" + msg);
		}

	}

}
