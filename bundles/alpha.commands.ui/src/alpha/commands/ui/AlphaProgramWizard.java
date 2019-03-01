package alpha.commands.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Bundle;

public class AlphaProgramWizard  extends Wizard implements INewWizard {

    private IStructuredSelection selection;
    private AlphaProgramWizardPage wizardPage;

	public String getPageName() { return "Alpha Program Wizard"; }
	public String getPageDescription() { return "Creates a new Alpha program."; }
	protected Bundle getPluginBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

    public AlphaProgramWizard() {
		super();
		setNeedsProgressMonitor(true);
    }

    @Override
    public void addPages() {
    	wizardPage = new AlphaProgramWizardPage(getPageName(), getPageDescription(), selection);    	
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
