package alpha.commands.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.google.common.base.Charsets;

public class AlphaProgramWizardPage extends WizardNewFileCreationPage {

	public AlphaProgramWizardPage(String pageName, String description, IStructuredSelection selection) {
		super(pageName, selection);
        setTitle(pageName);
        setDescription(description);
        setFileExtension("alpha");
	}
    @Override
    protected InputStream getInitialContents() {
		String content = 
				"\n" + 
				"";
		return new ByteArrayInputStream(content.getBytes(Charsets.UTF_8));
    }

}
