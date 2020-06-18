package alpha.targetmapping;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

import alpha.model.AlphaInternalStateConstructor;
import alpha.model.AlphaModelLoader;
import alpha.model.AlphaRoot;
import alpha.model.AlphaStandaloneSetup;
import alpha.model.AlphaVisitable;
import alpha.model.ModelPackage;
import alpha.model.exception.AlphaIssueException;
import alpha.model.issue.AlphaIssue;
import alpha.model.util.Show;

/**
 * ModelLoader for TargetMapping
 * 
 * @see AlphaModelLoader
 * 
 * @author tyuki
 *
 */
public class TargetMappingLoader {

	/**
	 * Load the specified file as a TargetMapping.
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static TargetMapping loadModel(String filename) throws IOException {

		final Injector injector = new TargetMappingStandaloneSetup().createInjectorAndDoEMFRegistration();

		final ResourceSet set = injector.getInstance(XtextResourceSet.class);
		set.getPackageRegistry().put(TargetmappingPackage.eNS_URI, TargetmappingPackage.eINSTANCE);

		final Resource res = set.getResource(URI.createFileURI(filename), true);

		EObject root = res.getContents().get(0);
		TargetMapping toplevel = (TargetMapping) root;
		List<Issue> xtextIssues = validate(toplevel);
		if (!xtextIssues.isEmpty()) {
			throw new RuntimeException(xtextIssues.toString());
		}
		
//		List<AlphaIssue> issues = AlphaInternalStateConstructor.compute(toplevel);
//		if (!issues.isEmpty()) {
//			System.err.println(Show.print(toplevel));
//			throw new AlphaIssueException(issues);
//		}

		return toplevel;
	}
	public static TargetMapping loadModel(File file) throws IOException {
		return loadModel(file.getAbsolutePath());
	}
	

	public static List<Issue> validate(TargetMapping tm) {
		Resource resource = tm.eResource();
		IResourceValidator validator = ((XtextResource) resource).getResourceServiceProvider().getResourceValidator();
		
		//CheckMode.EXPENSIVE triggers CheckProgram
		List<Issue> issues = validator.validate(resource, CheckMode.FAST_ONLY, CancelIndicator.NullImpl);
		return issues;
	}
}
