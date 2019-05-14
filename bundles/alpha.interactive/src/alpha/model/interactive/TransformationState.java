package alpha.model.interactive;

import java.util.List;
import java.util.Map;

import alpha.model.AlphaRoot;

public class TransformationState {
	
	protected final AlphaRoot root;
	protected final Map<String, Object> properties;
	protected final List<String> commands;
	
	public TransformationState(AlphaRoot root, Map<String, Object> properties, List<String> commands) {
		this.root = root;
		this.properties = properties;
		this.commands = commands;
	}
}
