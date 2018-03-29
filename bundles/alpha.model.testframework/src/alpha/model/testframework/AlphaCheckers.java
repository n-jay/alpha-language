package alpha.model.testframework;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import alpha.model.AlphaRoot;
import alpha.model.AlphaVisitable;
import alpha.model.UniquenessAndCompletenessCheck;
import alpha.model.issue.AlphaIssue;
import fr.irisa.cairn.gecos.testframework.exceptions.CheckerFailure;
import fr.irisa.cairn.gecos.testframework.model.IVersionOperator;

public class AlphaCheckers {

	private AlphaCheckers() {}
	


	public static List<Issue> validate(AlphaVisitable alpha) {
		Resource resource = alpha.eResource();
		IResourceValidator validator = ((XtextResource) resource).getResourceServiceProvider().getResourceValidator();
		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		return issues;
	}
	
	public static <V extends AlphaTestVersion> IVersionOperator<V> xtextValidator() {
		return version -> {
			List<AlphaRoot> roots = version.getAlphaRoots();
			if(roots == null || !roots.isEmpty())
				throw new IllegalArgumentException("AlphaTestVersion is null or empty: " + version);

			List<Issue> issues = new LinkedList<>();
			for (AlphaRoot root : version.getAlphaRoots()) {
				issues.addAll(validate(root));
			}
			if (!issues.isEmpty()) {
				String msg = issues.stream()
					.map(r -> "- " + r)
					.collect(Collectors.joining("\n"));
				throw new CheckerFailure("The version '" + version + "' fails Xtext Validation.\n" + msg);
			}
		};
	}
	

	public static <V extends AlphaTestVersion> IVersionOperator<V> checkProgram() {
		return version -> {
			List<AlphaRoot> roots = version.getAlphaRoots();
			if(roots == null || !roots.isEmpty())
				throw new IllegalArgumentException("AlphaTestVersion is null or empty: " + version);

			List<AlphaIssue> issues = UniquenessAndCompletenessCheck.check(roots);
			if (!issues.isEmpty()) {
				String msg = issues.stream()
					.map(r -> "- " + r)
					.collect(Collectors.joining("\n"));
				throw new CheckerFailure("The version '" + version + "' fails UniquenessAndCompletenessCheck.\n" + msg);
			}
		};
	}

	
}
