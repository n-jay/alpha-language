package alpha.model.interactive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaNode;
import alpha.model.AlphaRoot;
import alpha.model.AlphaSystem;
import alpha.model.SystemBody;
import alpha.model.UniquenessAndCompletenessCheck;
import alpha.model.issue.AlphaIssue;
import alpha.model.transformation.Normalize;
import alpha.model.util.AShow;

public abstract class AbstractInteractiveExploration {
	
	public static boolean SKIP_SINGLE_CHOICE_QUESTIONS = false;

	private final String filepath;
	private AlphaRoot originalProgram;
	private String systemName;
	private int systemBodyID;

	protected BufferedReader inStream;
	protected PrintStream outStream = System.out;
	protected PrintStream errStream = System.err;
	
	private Stack<TransformationState> stateRecord;
	
	private AlphaRoot wcProgram;
	private AlphaSystem wcSystem;
	private SystemBody wcBody;
	
	private Map<String, Object> properties;

	protected AbstractInteractiveExploration(String filepath) {
		this.filepath = filepath;
	}
	
	protected void cleanup() {
		try {
			if (inStream != null)
				inStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected int acceptInteger() {
		return acceptInteger(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	protected int acceptInteger(int min, int max) {
		try {
			while (true) {
				String line = inStream.readLine();
				try {
					int val = Integer.parseInt(line);
					if (min <= val && val < max) return val;
					outStream.println(String.format("Valid range is [%d, %d]. Please try again.", min, max-1));
				} catch (NumberFormatException nfe) {
					outStream.println("Input is not an integer. Please try again.");
				}
			}
		} catch (IOException ioe) {
			throw new RuntimeException("Unexpected IOE: " + ioe.getMessage());
		}
	}

	protected AlphaSystem getCurrentSystem() {
		return wcSystem;
	}
	
	protected SystemBody getCurrentBody() {
		return wcBody;
	}
	
	protected void run() {
		setupInputReader();
		
		loadProgram();
		
		selectTargetSystem();
		
		selectTargetSystemBody();
		
		initStateRecord();
		
		mainLoop();
		
		cleanup();
	}

	protected void setupInputReader() {
		inStream = new BufferedReader(new InputStreamReader(System.in));
	}
	
	protected void loadProgram() {
		try {
			originalProgram = AlphaModelLoader.loadModel(filepath);
			Normalize.apply(originalProgram);
			List<AlphaIssue> issues = UniquenessAndCompletenessCheck.check(originalProgram);
			if (!issues.isEmpty())
				throw new RuntimeException("Input Alpha program failed CheckProgram.");
			
		} catch (IOException e) {
			errStream.println("Failed to load Alpha program.");
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	protected void selectTargetSystem() {
		final int nbSystems = originalProgram.getSystems().size();
		
		if (nbSystems == 1 && SKIP_SINGLE_CHOICE_QUESTIONS) {
			systemName = originalProgram.getSystems().get(0).getFullyQualifiedName();
			outStream.println(String.format("Selected system %s", systemName));
			return;
		}

		outStream.println(AShow.print(originalProgram));
		outStream.println("Select an AlphaSystem to work with:");
		for (int i = 0; i < nbSystems; i++) {
			AlphaSystem system = originalProgram.getSystems().get(i);
			outStream.print(i+ ": ");
			outStream.println(system.getFullyQualifiedName());
		}
		int selected = acceptInteger(0, nbSystems);
		systemName = originalProgram.getSystems().get(selected).getFullyQualifiedName();
	}
	
	protected void selectTargetSystemBody() {
		final AlphaSystem system = originalProgram.getSystem(systemName);
		final int nbBodies = system.getSystemBodies().size();
		
		if (nbBodies == 1 && SKIP_SINGLE_CHOICE_QUESTIONS) {
			systemBodyID = 0;
			outStream.println("Selected body 0");		
			return;
		}
		
		outStream.println(AShow.print(system));
		outStream.println("Select a SystemBody to work with:");
		for (int i = 0; i < nbBodies; i++) {
			SystemBody body = system.getSystemBodies().get(i);
			outStream.print(i+ ": when ");
			outStream.println(body.getParameterDomain());
		}
		systemBodyID = acceptInteger(0, nbBodies);
	}
	
	private final void initStateRecord() {
		stateRecord = new Stack<>();
		
		List<String> commands = new ArrayList<String>(3);
		commands.add(String.format("root = ReadAlpha(\"%s\")", filepath));
		commands.add(String.format("system = GetSystem(root, \"%s\")", systemName));
		commands.add(String.format("body = GetSystemBody(system, %d)", systemBodyID));

		properties = new TreeMap<>();
		setWC(originalProgram);
		initProperties();
		recordState(commands);
	}

	protected void recordState(String ... commands) {
		recordState(Arrays.asList(commands));
	}
	
	/**
	 * Creates a new state that is pushed onto the stack, and then create a fresh working copy.
	 * 
	 * @param commands
	 */
	protected void recordState(List<String> commands) {
		TransformationState state = new TransformationState(wcProgram, properties, commands);
		stateRecord.push(state);
		
		copyState();
		
		reflectProperties();
	}
	
	/**
	 * Copies the working copy of the program and updates objects in the properties.
	 * 
	 */
	private void copyState() {
		//AlphaNodes are tracked by its ID and corresponding copy is set 
		Map<String, EList<Integer>> nodeIds = new TreeMap<>();
		for (Map.Entry<String, Object> entry : properties.entrySet()) {
			if (entry.getValue() instanceof AlphaNode) {
				nodeIds.put(entry.getKey(), ((AlphaNode)entry.getValue()).getNodeID());
			}
		}
		
		setWC(EcoreUtil.copy(wcProgram));

		for (Map.Entry<String, EList<Integer>> entry : nodeIds.entrySet()) {
			properties.put(entry.getKey(), wcProgram.getNode(entry.getValue()));
		}
	}

	/**
	 * Restores the last state from the record, and removes it from the stack.
	 * (Basically an undo)
	 */
	protected void rollbackState() {
		if (stateRecord.isEmpty()) {
			throw new UnsupportedOperationException("There is no more state to roll back.");
		}
		
		if (stateRecord.size() > 1) {
			restoreState(stateRecord.pop());
		} else {
			restoreState(stateRecord.peek());
		}
	}

	/**
	 * Restores the last state from the record, but does not remove it from the stack.
	 * This method should be called to recover from exceptions.
	 */
	protected void restoreState() {
		if (stateRecord.isEmpty()) {
			throw new UnsupportedOperationException("There is no more state to roll back.");
		}
		
		restoreState(stateRecord.peek());
	}
	
	/**
	 * The working copies for AlphaSystem and SystemBody is recomputed from the root,
	 * using the system name and body ID being stored.
	 * 
	 * @param root
	 */
	private final void setWC(AlphaRoot root) {
		wcProgram = root;
		wcSystem = alpha.commands.Utility.GetSystem(wcProgram, systemName);
		wcBody = alpha.commands.Utility.GetSystemBody(wcSystem, systemBodyID);
	}

	/**
	 * Restores state from TransformationState
	 * 
	 * @param state
	 */
	private final void restoreState(TransformationState state) {
		setWC(state.root);
		properties = new TreeMap<>(state.properties);
		copyState();
		reflectProperties();
	}
	
	protected Object getProperty(String key) {
		return properties.get(key);
	}
	
	protected Object setProperty(String key, Object obj) {
		return properties.put(key, obj);
	}
	
	protected List<String> getCommandSequence() {
		final List<String> commands = new LinkedList<>();
		stateRecord.stream().forEach(s->commands.addAll(s.commands));
		return commands;
	}
	
	abstract protected void mainLoop();
	
	/**
	 * Set initial properties before starting the main loop.
	 * The properties set here are saved with the first record.
	 */
	abstract protected void initProperties();

	/**
	 * The properties map is renewed by either creating a new 
	 * copy or restored from stored state.
	 * This method should reflect the content of map to local
	 * variables when appropriate.
	 */
	abstract protected void reflectProperties();
}
