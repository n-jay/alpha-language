package alpha.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import alpha.model.issue.AlphaIssue;
import alpha.model.issue.AlphaIssueFactory;
import alpha.model.util.AlphaUtil;

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

	public static List<AlphaIssue> check(List<AlphaRoot> roots) {
		List<AlphaIssue> issues = new LinkedList<>();

		if (roots.isEmpty())
			return issues;

		//check consistency for system and external functions
		Map<String, List<AlphaSystem>> systemNameMap = new HashMap<>();
		Map<String, List<ExternalFunction>> exFunNameMap = new HashMap<>();
		
		// Collect all systems/external functions by its qualified name
		for (AlphaRoot root : roots) {
			for (AlphaSystem system : root.getSystems()) {
				checkAndAdd(system.getFullyQualifiedName(), system, systemNameMap);
				issues.addAll(check(system));
			}
			for (ExternalFunction ef : root.getExternalFunctions()) {
				String qname = ef.getFullyQualifiedName();
				checkAndAdd(qname, ef, exFunNameMap);
			}
		}

		//duplicate system
		systemNameMap.values().stream().filter(l -> l.size() > 1).forEach(l -> {
			for (AlphaSystem system : l) {
				issues.add(AlphaIssueFactory.duplicateSystem(system, l));
			}
		});
		
		//duplicate external function
		exFunNameMap.values().stream().filter(l -> l.size() > 1).forEach(l -> {
			for (ExternalFunction exFun : l) {
				issues.add(AlphaIssueFactory.duplicateExternalFunction(exFun, l));
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

		// Then check name conflicts between equations within each system body
		for (SystemBody sysBody : system.getSystemBodies()) {
			Map<String, List<AlphaNode>> nameMap = new HashMap<>();

			sysBody.getStandardEquations().stream().forEach(e -> {
				checkAndAdd(e.getVariable().getName(), e, nameMap);
			});

			//UseEquations can write to variables multiple times as long as the domains are disjoint
			// only check against name conflict with StandardEquations
			sysBody.getUseEquations().stream().forEach(e -> {
				EcoreUtil.getAllContents(e.getOutputExprs()).forEachRemaining(l -> {
					if (l instanceof VariableExpression) {
						String name = ((VariableExpression) l).getVariable().getName();
						checkAndAdd(name, e, nameMap);

					}
				});
			});

			nameMap.values().stream().filter(l -> l.size() > 1).forEach(l -> {
				//skip conflicts only within UseEquations
				if (l.stream().allMatch(n -> n instanceof UseEquation)) return;
				
				for (AlphaNode node : l) {
					if (node instanceof StandardEquation)
						issues.add(AlphaIssueFactory.duplicateStandardEquation((StandardEquation) node));
					if (node instanceof UseEquation)
						issues.add(AlphaIssueFactory.duplicateUseEquation((UseEquation) node));
				}
			});
		}
		
		// Then check for AlphaConstants
		{
			Map<String, List<AlphaConstant>> nameMap = new HashMap<>();

			AlphaUtil.getAlphaConstants(system).forEach(c -> {
				checkAndAdd(c.getName(), c, nameMap);
			});

			nameMap.values().stream().filter(l -> l.size() > 1).forEach(l -> {
				for (AlphaConstant c : l)
					issues.add(AlphaIssueFactory.duplicateAlphaConstant(c));
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
