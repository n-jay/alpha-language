package alpha.commands.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Bundle;

public class AlphaScriptWizard extends Wizard implements INewWizard {

    private IStructuredSelection selection;
    private AlphaScriptWizardPage wizardPage;

	public String getPageName() { return "Alpha Script Wizard"; }
	public String getPageDescription() { return "Creates a new Groovy script configured to be used as an Alpha script."; }
	protected Bundle getPluginBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

    public AlphaScriptWizard() {
		super();
		setNeedsProgressMonitor(true);
    }

    @Override
    public void addPages() {
    	wizardPage = new AlphaScriptWizardPage(getPageName(), getPageDescription(), selection);    	
        addPage(wizardPage);
    }
    
    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.selection = selection;
    }
    
    @Override
    public boolean performFinish() {
        IFile file = wizardPage.createNewFile();
        return file != null;
    }
}

