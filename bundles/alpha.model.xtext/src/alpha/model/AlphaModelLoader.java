package alpha.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import alpha.model.exception.AlphaIssueException;
import alpha.model.issue.AlphaIssue;

/**
 * Class with static methods for interfacing with the textual representation of
 * the Alpha model. The various load methods parse the Alpha file with Xtext
 * parser, and then construct the ISL objects for each Alpha program.
 * 
 * @author tyuki
 *
 */
public class AlphaModelLoader {

	private AlphaModelLoader() {
	}

	/**
	 * Load a file specified by the given String (filepath).
	 * 
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static AlphaRoot loadModel(String filename) throws IOException {

		final Injector injector = new AlphaStandaloneSetup().createInjectorAndDoEMFRegistration();

		final ResourceSet set = injector.getInstance(XtextResourceSet.class);
		set.getPackageRegistry().put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);

		final Resource res = set.getResource(URI.createFileURI(filename), true);

		EObject root = res.getContents().get(0);
		AlphaRoot toplevel = (AlphaRoot) root;
		List<AlphaIssue> issues = AlphaInternalStateConstructor.compute(toplevel);
		if (!issues.isEmpty()) {
			throw new AlphaIssueException(issues);
		}

		return toplevel;
	}

	/**
	 * Load all files under the given directory. Calls
	 * {@link #loadModel(Collection)} after collecting the files in the given
	 * directory.
	 * 
	 * @param dirname
	 * @return List<AlphaRoot>: list of top-level model elements for all the files
	 *         in the given directory
	 * @throws IOException
	 */
	public static List<AlphaRoot> loadModelDir(String dirname) throws IOException {

		File file = new File(dirname);
		if (!file.isDirectory())
			throw new RuntimeException("Expecting path to a directory @ loadModelDir");

		return loadModel(Arrays.asList(file.listFiles()));
	}

	/**
	 * A wrapper for calling {@link #loadModel(Collection)} with Paths instead of
	 * Files.
	 * 
	 * @param files
	 * @return
	 * @throws IOException
	 */
	public static List<AlphaRoot> loadModelFromPaths(Collection<Path> files) throws IOException {
		return loadModel(files.stream().map(f -> f.toFile()).collect(Collectors.toList()));
	}

	/**
	 * Load a list of files
	 * 
	 * @param files
	 * @return
	 * @throws IOException
	 */
	public static List<AlphaRoot> loadModel(Collection<File> files) throws IOException {

		final Injector injector = new AlphaStandaloneSetup().createInjectorAndDoEMFRegistration();

		final XtextResourceSet set = injector.getInstance(XtextResourceSet.class);
		set.getPackageRegistry().put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		List<AlphaRoot> roots = new ArrayList<>(files.size());

		for (File file : files) {
			set.getResources().add(set.createResource(URI.createFileURI(file.getPath())));
		}
		EcoreUtil.resolveAll(set);

		for (File file : files) {
			final Resource res = set.getResource(URI.createFileURI(file.getPath()), true);
			if (res.getContents().size() == 0) continue;
			
			EObject root = res.getContents().get(0);
			AlphaRoot toplevel = (AlphaRoot) root;
			roots.add(toplevel);
		}

		List<AlphaIssue> issues = AlphaInternalStateConstructor.compute(roots);
		if (!issues.isEmpty()) {
			throw new AlphaIssueException(issues);
		}

		return roots;
	}

	
	public static void formatFile(String filename) throws IOException {
		AlphaRoot prog = loadModel(filename);

		final Injector injector = new AlphaStandaloneSetup().createInjectorAndDoEMFRegistration();
		final XtextResourceSet set = injector.getInstance(XtextResourceSet.class);

		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				injector.getInstance(XtextResourceFactory.class));

		SaveOptions opt = SaveOptions.newBuilder().format().getOptions();

		XtextResource resource = (XtextResource) set.createResource(URI.createFileURI(filename));
		resource.getContents().add(prog);
		resource.save(opt.toOptionsMap());
	}

	public static void saveAsXML(AlphaRoot seq, String modelfilename) throws IOException {
		final Injector injector = new AlphaStandaloneSetup().createInjectorAndDoEMFRegistration();
		final ResourceSet set = injector.getInstance(XtextResourceSet.class);

		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		Resource resource = set.createResource(URI.createFileURI(modelfilename));
		resource.getContents().add(seq);
		resource.save(null);
	}
}
