package alpha.model.wizard;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Arrays;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Bundle;

public class AlphaExampleWizard extends Wizard implements INewWizard {

	public String getPageName() { return "Alpha Example Project Wizard"; }
	public String getPageDescription() { return "Creates a Java project with examples of Alpha programs and compiler scripts."; }
	public String getResourcesFolderToCopyIntoProject() { return "TODO"; }
	protected Bundle getPluginBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

	
	private AlphaExampleWizardPage _page;
	
	public AlphaExampleWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	@Override
	public void addPages() {
		_page = new AlphaExampleWizardPage(getPageName(), getPageDescription());
		addPage(_page);
	};
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public boolean performFinish() {
		final String projectName = _page.getProjectName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method.
	 */
	protected void doFinish(String projectName, IProgressMonitor monitor) throws CoreException {
		monitor.beginTask("Example project creation", IProgressMonitor.UNKNOWN);
		IJavaProject project = createExampleProject(projectName, monitor);
//		
//		if(getResourcesFolderToCopyIntoProject() != null)
//			copyRessourcesToProjectFolder(getResourcesFolderToCopyIntoProject(), project.getLocationURI());
		
		
		monitor.worked(1);
	}
	
	/**
	 * Create the project with Xtext nature
	 * @param projectName
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	private IJavaProject createExampleProject(String projectName, IProgressMonitor monitor) throws CoreException {
		IWorkspaceRoot wkRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = wkRoot.getProject(projectName);
		IProjectDescription projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(project.getName());
		projectDescription.setNatureIds(new String[] { JavaCore.NATURE_ID,  "org.eclipse.xtext.ui.shared.xtextNature" });
		project.setDescription(projectDescription, null);
		
		IJavaProject javaProject = JavaCore.create(project);
		
		IFolder binFolder = project.getFolder("bin");
		binFolder.create(false, true, null);
		javaProject.setOutputLocation(binFolder.getFullPath(), null);
		
		IFolder sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, null);
		
		IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());
		javaProject.setRawClasspath(newEntries, null);
		
		if(Arrays.asList(wkRoot.getProjects()).contains(project)){
			IStatus status = new Status(Status.ERROR, getPluginBundle().getSymbolicName(), "Project with the same name already exist in the workspace");
			throw new CoreException(status);
		}
		
		return javaProject;
	}
	
	private void copyRessourcesToProjectFolder(String resources, URI root) throws CoreException {
		Bundle bundle = getPluginBundle();
		try {	
			Path path = new Path(resources);
			URL fileURL = FileLocator.find(bundle, path, null);
			URI uri = FileLocator.resolve(fileURL).toURI();
			File file = new File(uri); // File of folder to copy
			File projectFolder = new File(root); // Project folder where copy resources
			
			if(file.isFile()){
				copyFile(file, projectFolder);
			}
			else if (file.isDirectory()) {
				copyDirectory(file, projectFolder);
			}
			else{
				IStatus status = new Status(Status.ERROR, bundle.getSymbolicName(),
						"Error during wizard creation. Impossible to find wizard resources " + resources);
				throw new CoreException(status);
			}			

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
