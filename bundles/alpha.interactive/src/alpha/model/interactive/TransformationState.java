package alpha.model.interactive;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import alpha.model.AlphaRoot;

public class TransformationState {
	
	protected final AlphaRoot root;
	protected final Map<String, Object> properties;
	protected final List<String> commands;
	
	public TransformationState(AlphaRoot root, Map<String, Object> properties, List<String> commands) {
		this.root = root;
		this.properties = Collections.unmodifiableMap(new TreeMap<>(properties));
		this.commands = commands;
	}
	
	@Override
	public String toString() {
		return String.format("%s State=%s", root, properties.get("state"));
	}
}
