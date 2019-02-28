package alpha.commands.model.ui.handler;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import alpha.commands.model.generator.AlphaGroovyCommandsGenerator;
import alpha.commands.model.generator.AlphaJavaCommandsGenerator;


/**
 * Pretty much copied over from the JNIMap generator ui.
 * 
 * @author tyuki
 *
 */
public class GenerationHandler extends AbstractHandler implements IHandler {
	
	public static boolean DEBUG = false;
	private static void debug(Object o) {
		if (DEBUG) System.out.println(o);
	}
	
    @Inject
    private AlphaJavaCommandsGenerator javaGenerator;
    
    @Inject
    private AlphaGroovyCommandsGenerator groovyGenerator;

    @Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;

    @Inject
    IResourceDescriptions resourceDescriptions;
    
    @Inject
    IResourceSetProvider resourceSetProvider;
    
    /**
     * Workaround for displaying full stack trace.
     * Copied from: 
     *    http://stackoverflow.com/questions/2826959/jface-errordialog-how-do-i-show-something-in-the-details-portion/9404081#9404081
     * 
     * @param msg
     * @param t
     */
    private static void errorDialogWithStackTrace(String msg, Throwable t) {
    	final String PLUGIN_ID = "alpha.commands.model.xtext.ui";

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);

        final String trace = sw.toString(); // stack trace as a string

        // Temp holder of child statuses
        List<Status> childStatuses = new ArrayList<Status>();

        // Split output by OS-independent new-line
        for (String line : trace.split(System.getProperty("line.separator"))) {
            // build & add status
            childStatuses.add(new Status(IStatus.ERROR, PLUGIN_ID, line));
        }

        MultiStatus ms = new MultiStatus(PLUGIN_ID, IStatus.ERROR,
                childStatuses.toArray(new Status[] {}), // convert to array of statuses
                t.getLocalizedMessage(), t);
        ErrorDialog.openError(null, "Error Generating Alpha Commands", msg, ms);
    }
    
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
    	debug("[AlphaCommands]START");
        try {
	        ISelection selection = HandlerUtil.getCurrentSelection(event);
            if (selection instanceof StructuredSelection) {
            	StructuredSelection structuredSelection = (StructuredSelection) selection;
    			for (Object o : structuredSelection.toArray()) {
    				final IFile file = (IFile) (o);
    				generate(file);
    			}
    	        MessageDialog.openInformation(null, "Alpha Commands Generated", "Alpha Commands have been successfully generated.");
            } else if (selection instanceof TextSelection) {      
            	IEditorInput input = HandlerUtil.getActiveEditorInput(event);
            	final IFile file = (IFile)input.getAdapter(IFile.class);
            	generate(file);
    	        MessageDialog.openInformation(null, "Alpha Commands Generated", "Alpha Commands have been successfully generated.");
            } else {
            	String msg = "[AlphaCommands]ERROR. Unsupported selection : "+selection.getClass().getSimpleName();
            	errorDialogWithStackTrace(msg,new IllegalArgumentException(msg));
            }
        } catch (Exception e) {
        	String msg = "[AlphaCommands]ERROR while processing selection.";
        	errorDialogWithStackTrace(msg, e);
        	throw new RuntimeException(msg,e);
        }
        debug("[AlphaCommands]END");
        return null;
    }

    private void generate(IFile file) {
    	debug("[AlphaCommands]using IFile : "+file.toString());
        IProject project = file.getProject();
        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        generate(uri,project);
	}

	private void generate(URI uri, final IProject project) {
        debug("[AlphaCommands]AlphaCommands URI : "+uri.toString());
		debug("[AlphaCommands]IProject : "+project.toString());
		
		//load model
        ResourceSet rs = resourceSetProvider.get(project);
        Resource r = rs.getResource(uri, true);
        EcoreUtil.resolveAll(r);
		
		//Java Generator
		{
			final IProject javaProject = project.getWorkspace().getRoot().getProject(javaGenerator.targetProject());
			debug("[AlphaCommands]JavaProject : "+javaProject.toString());
	        final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
	        fsa.setProject(javaProject);
	        fsa.setMonitor(new NullProgressMonitor());
	        fsa.setOutputPath("./");
	        fsa.getOutputConfigurations().get(EclipseResourceFileSystemAccess2.DEFAULT_OUTPUT).setSetDerivedProperty(false);
	        fsa.getOutputConfigurations().get(EclipseResourceFileSystemAccess2.DEFAULT_OUTPUT).setCreateOutputDirectory(true);
	
	        javaGenerator.doGenerate(r, fsa); // Instead of the basic generator
		}
        
        //Groovy Generator
		{
			final IProject groovyProject = project.getWorkspace().getRoot().getProject(groovyGenerator.targetProject());
			debug("[AlphaCommands]GroovyProject : "+groovyProject.toString());
	        final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
	        fsa.setProject(groovyProject);
	        fsa.setMonitor(new NullProgressMonitor());
	        fsa.setOutputPath("./");
	        fsa.getOutputConfigurations().get(EclipseResourceFileSystemAccess2.DEFAULT_OUTPUT).setSetDerivedProperty(false);
	        fsa.getOutputConfigurations().get(EclipseResourceFileSystemAccess2.DEFAULT_OUTPUT).setCreateOutputDirectory(true);
	
	        groovyGenerator.doGenerate(r, fsa); // Instead of the basic generator
		}
        
		try {
			final IWorkspace ws = ResourcesPlugin.getWorkspace();
			ws.run(new IWorkspaceRunnable() {
				@Override
				public void run(IProgressMonitor monitor) throws CoreException {
					project.refreshLocal(IResource.DEPTH_INFINITE, null);
				}
			}, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
    public boolean isEnabled() {
        return true;
    }
    
}
