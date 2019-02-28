package alpha.model.wizard;

import alpha.commands.ui.AlphaProjectWizardPage;

public class AlphaExampleWizardPage extends AlphaProjectWizardPage {

	public AlphaExampleWizardPage(String pageName, String description) {
		super(pageName, description);
	}

	@Override
	protected String getDefaultProjectName() {
		return "alpha.examples";
	}
	
}

