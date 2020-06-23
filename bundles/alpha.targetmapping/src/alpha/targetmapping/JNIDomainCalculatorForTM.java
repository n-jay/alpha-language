package alpha.targetmapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.xtext.EcoreUtil2;

import alpha.model.AlphaScheduleTarget;
import alpha.model.AlphaSystem;
import alpha.model.CalculatorExpressionEvaluator;
import alpha.model.JNIDomainInArrayNotation;
import alpha.model.JNIFunction;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.issue.AlphaIssue;
import alpha.model.issue.CalculatorExpressionIssue;
import alpha.model.issue.AlphaIssue.TYPE;
import alpha.model.util.AffineFunctionOperations;
import alpha.targetmapping.issue.TargetMappingIssueFactory;
import alpha.targetmapping.util.AbstractTargetMappingVisitor;
import alpha.targetmapping.util.TargetMappingUtil;
import fr.irisa.cairn.jnimap.isl.ISLErrorException;
import fr.irisa.cairn.jnimap.isl.ISLMap;
import fr.irisa.cairn.jnimap.isl.ISLMultiAff;
import fr.irisa.cairn.jnimap.isl.ISLSet;

/**
 * This class is responsible for computing ISL representation of the
 * domain/function, just like {@link alpha.model.JNIDomainCalculator}.
 *
 * The main difference is that {@link TargetMapping} requires multiple index name
 * contexts to be kept, one for each {@link AlphaScheduleTarget}. Unlike equations
 * in Alpha, the schedule tree used in TargetMapping starts with the union of 
 * all schedule target domains at the root. The index names are initially the same
 * as what is defined in StandardEquation (or UseEquation) in the target Alpha
 * program, but may be changed at FilterExpressions.
 *
 * @author tyuki
 *
 */
public class JNIDomainCalculatorForTM extends AbstractTargetMappingVisitor {
	
	private Map<AlphaScheduleTarget, Stack<List<String>>> indexNameContexts;
	
	private List<AlphaIssue> issues = new LinkedList<>();
	
	private JNIDomainCalculatorForTM() {}
	
	public String parseParameterDomain(JNIDomainInArrayNotation jniDomain) {
		return String.format("{ : %s }", jniDomain.getIslString());
	}
	
	
	
	public static List<AlphaIssue> calculate(TargetMapping tm) {
		JNIDomainCalculatorForTM calc = new JNIDomainCalculatorForTM();
		calc.accept(tm);
		
		return calc.issues;
	}
	
	@Override
	public void inTargetMappingForSystemBody(TargetMappingForSystemBody tm) {
		if (tm.getTargetBody() == null) {
			issues.add(TargetMappingIssueFactory.unresolvedTargetBody(tm));
			return;
		}
		
		//Initialize index name contexts
		indexNameContexts = new HashMap<>();
		
		for (AlphaScheduleTarget target : EcoreUtil2.getAllContentsOfType(tm.getTargetBody(), AlphaScheduleTarget.class)) {
			Stack<List<String>> stack = new Stack<>();
			
			if (target instanceof StandardEquation) {
				//In case of StandardEquation, use the index names given in array notation, 
				//  if it is not using array notation, then use the default index names.
				StandardEquation se = ((StandardEquation) target);
				if (se.getIndexNames().isEmpty() && se.getVariable().getDomain().getNbIndices() > 0) {
					stack.add(se.getVariable().getDomain().getIndexNames());
				} else {
					stack.add(se.getIndexNames());
				}
			} else if (target instanceof UseEquation) {
				//For UseEquation, use the index names for instantiation domain.
				stack.add(((UseEquation) target).getInstantiationDomain().getIndexNames());
			}
			indexNameContexts.put(target, stack);
		}
	}
	
	@Override
	public void inContextExpression(ContextExpression ce) {
		AlphaSystem system = TargetMappingUtil.getTargetSystem(ce);
		
		try {
			String domStr = parseParameterDomain(ce.getContextDomain());
			ISLSet set = CalculatorExpressionEvaluator.parseDomain(system, domStr);
			ce.getContextDomain().setISLSet(set);
		} catch (RuntimeException re) {
			issues.add(new CalculatorExpressionIssue(TYPE.ERROR, re.getMessage(), ce.getContextDomain(), null));
		}
	}
	
	@Override
	public void inFilterExpression(FilterExpression fe) {
		//compute filter domain and record new contexts
		for (ScheduleTargetRestrictDomain fd : fe.getFilterDomains()) {
			List<String> context =  parseScheduleTargetRestrictDomain(fd);
			indexNameContexts.get(fd.getScheduleTarget()).push(context);
		}
	}
	
	@Override
	public void outFilterExpression(FilterExpression fe) {
		//restore previous context
		for (ScheduleTargetRestrictDomain fd : fe.getFilterDomains()) {
			indexNameContexts.get(fd.getScheduleTarget()).pop();
		}
	}
	
	@Override
	public void inGuardExpression(GuardExpression ge) {
		try {
			ISLSet set = CalculatorExpressionEvaluator.parseDomain(TargetMappingUtil.getTargetSystem(ge), ge.getGuardDomain().getIslString());
			ge.getGuardDomain().setISLSet(set);
		}
		catch (RuntimeException re) {
			issues.add(new CalculatorExpressionIssue(TYPE.ERROR, re.getMessage(), ge.getGuardDomain(), null));
		}
	}
	
	@Override
	public void inBandExpression(BandExpression be) {
		AlphaSystem system = TargetMappingUtil.getTargetSystem(be);
		
		for (BandPiece bp : be.getBandPieces()) {
			
			//compute the piece domain
			// its context does not need to be propagated, but is used in computing
			// the scheduling function also in the BandPiece
			List<String> context =  parseScheduleTargetRestrictDomain(bp.getPieceDomain());
			
			try {
				ISLMultiAff islMAff = CalculatorExpressionEvaluator.parseAffineFunction(system, context, bp.getPartialSchedule().getArrayNotation());
				bp.getPartialSchedule().setISLMultiAff(islMAff);
			} catch (RuntimeException re) {
				issues.add(new CalculatorExpressionIssue(TYPE.ERROR, re.getMessage(), bp.getPartialSchedule(), null));
			}
		}
		
		if (be.getIsolateSpecification() != null) {
			IsolateSpecification is = be.getIsolateSpecification();
			
			try {
				ISLSet dom = CalculatorExpressionEvaluator.parseDomain(system, is.getIsolateDomain().getIslString());
				is.getIsolateDomain().setISLSet(dom);
			} catch (RuntimeException re) {
				issues.add(new CalculatorExpressionIssue(TYPE.ERROR, re.getMessage(), is.getIsolateDomain(), null));
			}
		}
	}
	
	@Override
	public void inExtensionExpression(ExtensionExpression ee) {
		for (ExtensionTarget et : ee.getExtensionTargets()) {
			parseExtensionTargetExtensionMap(et);
			
			Stack<List<String>> contexts = new Stack<>();
			
			if (et.getIndexNames().size() == et.getExtensionMap().getISLMap().getNbOutputs()) {
				contexts.add(et.getIndexNames());
			}
			
			indexNameContexts.put(et, contexts);
		}
	}
	
	/**
	 * Computes JNIDomain of a ScheduleTargetRestrictDomain, and 
	 * returns the index name context used in the calculation. 
	 * 
	 * @param strd
	 * @return
	 */
	private List<String> parseScheduleTargetRestrictDomain(ScheduleTargetRestrictDomain strd) {
		AlphaSystem system = TargetMappingUtil.getTargetSystem(strd);
		
		List<String> context;
		if (strd.getIndexNames().size() > 0) {
			context = strd.getIndexNames();
		} else {
			context = new ArrayList<>(indexNameContexts.get(strd.getScheduleTarget()).peek());
		}

		//restrict domain may be null, in which case the domain is filtered to the universe (of the target space)
		if (strd.getRestrictDomain() != null) {
			try {
				String domStr = CalculatorExpressionEvaluator.parseJNIDomain(strd.getRestrictDomain(), context);
				ISLSet set = CalculatorExpressionEvaluator.parseDomain(system, domStr);
				strd.getRestrictDomain().setISLSet(set);
			} catch (RuntimeException re) {
				issues.add(new CalculatorExpressionIssue(TYPE.ERROR, re.getMessage(), strd, null));
			}
		}
		
		return context;
	}
	

	private void parseExtensionTargetExtensionMap(ExtensionTarget et) {
		AlphaSystem system = TargetMappingUtil.getTargetSystem(et);
		
		try {
			ISLMap map = CalculatorExpressionEvaluator.parseRelation(system, et.getExtensionMap().getIslString());
			et.getExtensionMap().setISLMap(map);
		}  catch (RuntimeException re) {
			issues.add(new CalculatorExpressionIssue(TYPE.ERROR, re.getMessage(), et.getExtensionMap(), null));
		}
	}
}
