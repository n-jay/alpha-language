package alpha.model.wizard;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.osgi.framework.Bundle;

import alpha.commands.ui.AlphaProjectWizard;

public class AlphaExampleWizard extends AlphaProjectWizard {
	
	public static final String RESOURCES_ROOT = "resources/";

	@Override
	public String getPageName() { return "Alpha Example Project Wizard"; }

	@Override
	public String getPageDescription() { return "Creates a Java project with examples of Alpha programs and scripts."; }

	@Override
	protected Bundle getPluginBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}
	
	public AlphaExampleWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	@Override
	public void addPages() {
		_page = new AlphaExampleWizardPage(getPageName(), getPageDescription());
		addPage(_page);
	};
	
	/**
	 * The worker method.
	 */
	protected void doFinish(String projectName, IProgressMonitor monitor) throws CoreException {
		monitor.beginTask("Example project creation", IProgressMonitor.UNKNOWN);
		IJavaProject project = createAlphaProject(projectName, monitor);
		
		copyResourcesToProjectFolder(project);
		
		monitor.worked(1);
	}
	
	
	private void copyResourcesToProjectFolder(IJavaProject project) throws CoreException {
		Bundle bundle = getPluginBundle();
		try {	
			Path path = new Path(RESOURCES_ROOT);
			URL fileURL = FileLocator.find(bundle, path, null);
			URI uri = FileLocator.resolve(fileURL).toURI();
			File src = new File(uri); // File of folder to copy
			File projectFolder = new File(project.getProject().getLocationURI()); // Project folder where copy resources
			
			if (src.isDirectory()) {
				for (File file : src.listFiles()) {
					if (file.isDirectory()) {
						copyDirectory(file, new File(projectFolder, file.getName()));
					} else {
						copyFile(file, projectFolder);
					}
				}
			} else {
				IStatus status = new Status(Status.ERROR, bundle.getSymbolicName(),
						"Error during wizard creation. Impossible to find wizard resources: " + RESOURCES_ROOT);
				throw new CoreException(status);
			}

			project.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (IOException | URISyntaxException e) {
			IStatus status = new Status(Status.ERROR, bundle.getSymbolicName(),
					"Error during wizard creation. Impossible to copy resources", e);
			throw new CoreException(status);
		}
	}
	
	private void copyFile(File src, File target) throws IOException{
		File targetFile = new File(target, src.getName());
		if(targetFile.isFile())
			throw new IOException("The target source file at " + targetFile.getPath() + " already exist");
		
		Files.copy(src.toPath(), new FileOutputStream(targetFile));
	}
	
	private void copyDirectory(File src, File target) throws IOException {
		if (!src.isDirectory())
			throw new IOException("the copy directory source at " + src.getPath() + " is not a directory.");
		
		if (!target.isDirectory())
			if(!target.mkdir())
				throw new IOException("Impossible to create target folder");

		for (File file : src.listFiles()) {
			if (file.isDirectory()) {
				copyDirectory(file, new File(target, file.getName()));
			} else {
				copyFile(file, target);
			}
		}
	}


}
