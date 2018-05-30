package alpha.model.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class AlphaExampleWizardPage extends WizardPage {
		private static final String DEFAULT_PROJECT_NAME = "alpha.examples";
	
		private Text _projectName;

		public AlphaExampleWizardPage(String pageName, String description) {
			super(pageName);
			setTitle(pageName);
			setDescription(description);
		}

		@Override
		public void createControl(Composite parent) {
			Composite container = new Composite(parent, SWT.NULL);
			GridLayout layout = new GridLayout();
			container.setLayout(layout);
			layout.numColumns = 3;
			layout.verticalSpacing = 9;
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);

			Label label = new Label(container, SWT.NULL);
			label.setText("&Project name:");

			_projectName = new Text(container, SWT.BORDER | SWT.SINGLE);
			_projectName.setText(DEFAULT_PROJECT_NAME);
			gd = new GridData(GridData.FILL_HORIZONTAL);
			_projectName.setLayoutData(gd);
			_projectName.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					dialogChanged();
				}
			});
		
			dialogChanged();
			setControl(container);
		}
		
		private void dialogChanged() {

			String projectName = _projectName.getText();
			if (projectName.length() == 0) {
				updateStatus("Project name must be specified");
				return;
			}
			if (projectName.replace('\\', '/').indexOf('/', 1) > 0) {
				updateStatus("File name must be valid");
				return;
			}
		
			updateStatus(null);
		}
		
		private void updateStatus(String message) {
			setErrorMessage(message);
			setPageComplete(message == null);
		}
		
		public String getProjectName(){
			return _projectName.getText();
		}
	}

