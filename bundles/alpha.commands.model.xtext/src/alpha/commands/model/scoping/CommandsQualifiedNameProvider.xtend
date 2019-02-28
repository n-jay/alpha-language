package alpha.commands.model.scoping

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import alpha.commands.model.AlphaCommand

class CommandsQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	override protected qualifiedName(Object ele) {
		if (ele instanceof AlphaCommand) {
			return QualifiedName.create((ele as AlphaCommand).label);		
		}
	
		super.qualifiedName(ele)
	}

}