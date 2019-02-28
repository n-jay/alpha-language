package alpha.commands.ui;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.groovy.eclipse.core.model.GroovyRuntime;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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

import com.google.common.base.Charsets;

public class AlphaProjectWizard extends Wizard implements INewWizard {
		
		public static final String RESOURCES_ROOT = "resources/";

		public String getPageName() { return "Alpha Project Wizard"; }
		public String getPageDescription() { return "Creates a Java plug-in project for running Alpha scripts."; }
		protected Bundle getPluginBundle() {
			return Platform.getBundle(Activator.PLUGIN_ID);
		}
		
		protected AlphaProjectWizardPage _page;
		
		public AlphaProjectWizard() {
			super();
			setNeedsProgressMonitor(true);
		}
		
		@Override
		public void addPages() {
			_page = new AlphaProjectWizardPage(getPageName(), getPageDescription());
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
			monitor.beginTask("Alpha project creation", IProgressMonitor.UNKNOWN);

			createAlphaProject(projectName, monitor);
			
			monitor.worked(1);
		}
		
		/**
		 * Create the project with Xtext, Groovy, PDE nature with dependences
		 * @param projectName
		 * @param monitor
		 * @return
		 * @throws CoreException
		 */
		protected IJavaProject createAlphaProject(String projectName, IProgressMonitor monitor) throws CoreException {
			IWorkspaceRoot wkRoot = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = wkRoot.getProject(projectName);
			
			if(Arrays.asList(wkRoot.getProjects()).contains(project)){
				IStatus status = new Status(Status.ERROR, getPluginBundle().getSymbolicName(), "Project with the same name already exist in the workspace");
				throw new CoreException(status);
			}
			
			project.create(null);
			project.open(null);
			
			IProjectDescription projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(project.getName());
			projectDescription.setNatureIds(new String[] { JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", "org.eclipse.xtext.ui.shared.xtextNature" });
			project.setDescription(projectDescription, null);
	        GroovyRuntime.addGroovyNature(project);
	        
	        createManifest(project);
			
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
			    if ("JavaSE-10".equals(iExecutionEnvironment.getId())) {
			        entries.add(JavaCore.newContainerEntry(JavaRuntime.newJREContainerPath(iExecutionEnvironment)));
			        break;
			    }
			}

			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
			entries.add(JavaCore.newSourceEntry(root.getPath()));
	        entries.add(JavaCore.newContainerEntry(GroovyRuntime.DSLD_CONTAINER_ID));
	        entries.add(JavaCore.newContainerEntry(new Path("GROOVY_SUPPORT")));
//	        entries.add(JavaCore.newContainerEntry(PDECore.REQUIRED_PLUGINS_CONTAINER_PATH));
	        entries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));

			javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);		

			return javaProject;
		}
		

		private void createManifest(IProject project) throws CoreException {
			IFolder metaInf = project.getFolder("META-INF");
			if (!metaInf.exists()) metaInf.create(false, true, null);
			
			{
				IFile manifest = project.getFile("META-INF/MANIFEST.MF");
			
				String content = 
						"Manifest-Version: 1.0\n" + 
						"Bundle-ManifestVersion: 2\n" + 
						"Bundle-RequiredExecutionEnvironment: JavaSE-10\n" + 
						"Automatic-Module-Name: AlphaExamples\n" + 
						"Bundle-Name: alpha.examples\n" + 
						"Bundle-SymbolicName: AlphaExamples\n" + 
						"Bundle-Version: 1.0.0.qualifier\n" + 
						"Require-Bundle: alpha.commands;bundle-version=\"0.1.0\",\n" + 
						" alpha.commands.groovy;bundle-version=\"0.1.0\",\n" + 
						" alpha.model;bundle-version=\"0.1.0\"\n" + 
						""; //empty line is important
				manifest.create(new ByteArrayInputStream(content.getBytes(Charsets.UTF_8)), true, null);
			}
			
			{
				IFile buildProp = project.getFile("build.properties");
				String content = 
						"source.. = src/\n" + 
						"bin.includes = META-INF/,\\\n" + 
						"               .\n" + 
						"";
				buildProp.create(new ByteArrayInputStream(content.getBytes(Charsets.UTF_8)), true, null);
			}
			
		}
	}
