package alpha.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssueFactory;

/**
 * Checks the uniqueness of system and equation names.
 * 
 * The uniqueness is not enforced by EMF since it is only the qualified name
 * that has to be unique. The name attribute on system/variables are not ID for
 * this reason.
 * 
 * @author tyuki
 *
 */
public class AlphaNameUniquenessChecker {

	private static final IQualifiedNameProvider provider = new DefaultDeclarativeQualifiedNameProvider();

	public static List<AlphaIssue> check(List<AlphaRoot> roots) {
		List<AlphaIssue> issues = new LinkedList<>();

		if (roots.isEmpty())
			return issues;

		ResourceSet rset = roots.get(0).eResource().getResourceSet();

		if (!roots.stream().allMatch(r -> r.eResource().getResourceSet() == rset)) {
			throw new RuntimeException("Expecting Alpha programs in the same resource set.");
		}

		//check consistency for system and external functions
		Map<String, List<AlphaSystem>> systemNameMap = new HashMap<>();
		Map<String, List<ExternalFunction>> exFunNameMap = new HashMap<>();
		
		// Collect all systems by its qualified name
		TreeIterator<Object> iterator = EcoreUtil.getAllProperContents(rset, false);

		while (iterator.hasNext()) {
			Object current = iterator.next();
			if (current instanceof AlphaSystem) {
				iterator.prune();
				String qname = provider.getFullyQualifiedName((AlphaSystem) current).toString();
				checkAndAdd(qname, (AlphaSystem) current, systemNameMap);
				issues.addAll(check((AlphaSystem) current));
			} else if (current instanceof ExternalFunction) {
				iterator.prune();
				String qname = provider.getFullyQualifiedName((ExternalFunction) current).toString();
				checkAndAdd(qname, (ExternalFunction) current, exFunNameMap);
			}
		}

		//duplicate system
		systemNameMap.values().stream().filter(l -> l.size() > 1).forEach(l -> {
			for (AlphaSystem system : l) {
				issues.add(AlphaIssueFactory.duplicateSystem(system));
			}
		});
		
		//duplicate external function
		exFunNameMap.values().stream().filter(l -> l.size() > 1).forEach(l -> {
			for (ExternalFunction exFun : l) {
				issues.add(AlphaIssueFactory.duplicateExternalFunction(exFun));
			}
		});

		return issues;
	}

	public static List<AlphaIssue> check(AlphaRoot root) {
		return check(Arrays.asList(root));
	}

	public static List<AlphaIssue> check(AlphaSystem system) {
		List<AlphaIssue> issues = new LinkedList<>();

		// First check for name conflicts between variables and polyhedral objects
		{
			Map<String, List<AlphaNode>> nameMap = new HashMap<>();

			system.getVariables().stream().forEach(v -> {
				checkAndAdd(v.getName(), v, nameMap);
			});

			system.getDefinedObjects().stream().forEach(v -> {
				checkAndAdd(v.getName(), v, nameMap);
			});

			nameMap.values().stream().filter(l -> l.size() > 1).forEach(l -> {
				for (AlphaNode node : l) {
					if (node instanceof Variable)
						issues.add(AlphaIssueFactory.duplicateVariable((Variable) node));
					if (node instanceof PolyhedralObject)
						issues.add(AlphaIssueFactory.duplicatePolyObject((PolyhedralObject) node));
				}
			});
		}

		// Then check name conflicts between equations
		{
			Map<String, List<AlphaNode>> nameMap = new HashMap<>();

			system.getEquations().stream().forEach(e -> {
				checkAndAdd(e.getVariable().getName(), e, nameMap);
			});

			system.getUseEquations().stream().forEach(e -> {
				EcoreUtil.getAllContents(e.getOutputExprs()).forEachRemaining(l -> {
					if (l instanceof VariableExpression) {
						String name = ((VariableExpression) l).getVariable().getName();
						checkAndAdd(name, e, nameMap);

					}
				});
			});

			nameMap.values().stream().filter(l -> l.size() > 1).forEach(l -> {
				for (AlphaNode node : l) {
					if (node instanceof StandardEquation)
						issues.add(AlphaIssueFactory.duplicateStandardEquation((StandardEquation) node));
					if (node instanceof UseEquation)
						issues.add(AlphaIssueFactory.duplicateUseEquation((UseEquation) node));
				}
			});
		}
		
		return issues;
	}

	private static <T> void checkAndAdd(String key, T obj, Map<String, List<T>> map) {
		if (!map.containsKey(key)) {
			map.put(key, new LinkedList<T>());
		}
		map.get(key).add(obj);
	}
}
