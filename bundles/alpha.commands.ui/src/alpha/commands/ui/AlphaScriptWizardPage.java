package alpha.commands.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.google.common.base.Charsets;

public class AlphaScriptWizardPage extends WizardNewFileCreationPage {

	public AlphaScriptWizardPage(String pageName, String description, IStructuredSelection selection) {
		super(pageName, selection);
        setTitle(pageName);
        setDescription(description);
        setFileExtension("groovy");
	}
	
    @Override
    protected InputStream getInitialContents() {
		String content = 
				"import groovy.transform.BaseScript\n" + 
				"@BaseScript alpha.commands.groovy.AlphaScript alphaScript\n" + 
				"";
		return new ByteArrayInputStream(content.getBytes(Charsets.UTF_8));
    }
	
	

}
