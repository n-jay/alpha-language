package alpha.model.wizard;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
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
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.jdt.launching.environments.IExecutionEnvironmentsManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Bundle;

public class AlphaExampleWizard extends Wizard implements INewWizard {
	
	public static final String RESOURCES_ROOT = "resources/";

	public String getPageName() { return "Alpha Example Project Wizard"; }
	public String getPageDescription() { return "Creates a Java project with examples of Alpha programs and compiler scripts."; }
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
		
		copyResourcesToProjectFolder(project);
		
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
		
		if(Arrays.asList(wkRoot.getProjects()).contains(project)){
			IStatus status = new Status(Status.ERROR, getPluginBundle().getSymbolicName(), "Project with the same name already exist in the workspace");
			throw new CoreException(status);
		}
		
		project.create(null);
		project.open(null);
		
		IProjectDescription projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(project.getName());
		projectDescription.setNatureIds(new String[] { JavaCore.NATURE_ID,  "org.eclipse.xtext.ui.shared.xtextNature" });
		project.setDescription(projectDescription, null);
		
		IJavaProject javaProject = JavaCore.create(project);
		

		IFolder binFolder = project.getFolder("bin");
		if (!binFolder.exists())
			binFolder.create(false, true, null);
		javaProject.setOutputLocation(binFolder.getFullPath(), null);
		
		IFolder sourceFolder = project.getFolder("src");
		if (!sourceFolder.exists())
			sourceFolder.create(false, true, null);
		
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		IExecutionEnvironmentsManager executionEnvironmentsManager = JavaRuntime.getExecutionEnvironmentsManager();
		IExecutionEnvironment[] executionEnvironments = executionEnvironmentsManager.getExecutionEnvironments();
		for (IExecutionEnvironment iExecutionEnvironment : executionEnvironments) {
		    if ("JavaSE-1.8".equals(iExecutionEnvironment.getId())) {
		        entries.add(JavaCore.newContainerEntry(JavaRuntime.newJREContainerPath(iExecutionEnvironment)));
		        break;
		    }
		}

		IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
		entries.add(JavaCore.newSourceEntry(root.getPath()));

		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);		

		return javaProject;
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
