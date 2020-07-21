package alpha.targetmapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import org.eclipse.xtext.EcoreUtil2;

import alpha.model.AlphaScheduleTarget;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.issue.AlphaIssue;
import alpha.targetmapping.issue.TargetMappingIssueFactory;
import alpha.targetmapping.util.AbstractTargetMappingVisitor;

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
	private Stack<List<String>> scheduleDimNameContextHistory = new Stack<>();
	private Stack<Integer> bandSizeHistory = new Stack<>();
	
	private List<AlphaIssue> issues = new LinkedList<>();
	
	private JNIDomainCalculatorForTM() {}
	
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
		
		scheduleDimNameContextHistory.push(new ArrayList<>());
		bandSizeHistory.push(0);
		
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
		issues.addAll(CalculatorExpressionEvaluatorForTM.calculate(ce.getContextDomainExpr(), scheduleDimNameContextHistory.peek()));
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
		issues.addAll(CalculatorExpressionEvaluatorForTM.calculate(ge.getGuardDomainExpr(), scheduleDimNameContextHistory.peek()));
	}
	
	@Override
	public void inBandExpression(BandExpression be) {
		processBandPieces(be);
		
		if (be.getIsolateSpecification() != null) {
			IsolateSpecification is = be.getIsolateSpecification();
			issues.addAll(CalculatorExpressionEvaluatorForTM.calculate(is.getIsolateDomainExpr(), scheduleDimNameContextHistory.peek()));
		}
	}
	
	/*
	 * Helper function that computes domains for BandPieces
	 * 
	 * It is made a separate function because it is shared by BandExpression and TileBandExpression.
	 */
	private void processBandPieces(AbstractBandExpression abe) {
		for (BandPiece bp : abe.getBandPieces()) {
			//compute the piece domain
			// its context does not need to be propagated, but is used in computing
			// the scheduling function also in the BandPiece
			List<String> context =  parseScheduleTargetRestrictDomain(bp.getPieceDomain());
			issues.addAll(CalculatorExpressionEvaluatorForTM.calculate(bp.getPartialScheduleExpr(), context));
		}
		
		//check for consistency of bands
		Set<Integer> bandSizes = abe.getBandPieces().stream().map(bp->bp.getPartialSchedule()).map(s->(s!=null?s.getNbOutputs():-1)).collect(Collectors.toSet());
		//if more than one sizes are collected, then dimensions are inconsistent
		if (bandSizes.size() != 1) {
			issues.add(TargetMappingIssueFactory.mismatchedPartialSchedules(abe));
		} 

		int bandSize = bandSizes.iterator().next();
		List<String> currentContext = scheduleDimNameContextHistory.peek();

		if (bandSize == -1 || currentContext == null) {
			//Silently ignore dimSize == -1
			// it means there were issues parsing polyhedral objects, 
			// and were already reported as issues earlier in the flow.
			scheduleDimNameContextHistory.push(null);
			bandSizeHistory.push(null);
		} else if (bandSize != abe.getScheduleDimensionNames().size() && abe.getScheduleDimensionNames().size() > 0) {
			//When the given names to schedule dimensions do not match the number of schedule dimensions
			// the name context is ignored, and array notation is disabled 
			issues.add(TargetMappingIssueFactory.mismatchedScheduleDimNames(abe));
			scheduleDimNameContextHistory.push(null);
			bandSizeHistory.push(null);
		} else if (abe.getScheduleDimensionNames().size() == 0) {
			//If dimSize is consistent, but names are not given, then only record the band size
			scheduleDimNameContextHistory.push(null);
			bandSizeHistory.push(bandSize);
		} else {
			List<String> newContext = new LinkedList<>(currentContext);
			newContext.addAll(abe.getScheduleDimensionNames());
			scheduleDimNameContextHistory.push(newContext);
			bandSizeHistory.push(bandSize);
		}
	}
	
	/*
	 * Helper to give schedule dimension names restricted to the current BandExpression.
	 * 
	 * The local context is used for specifying schedule of the tile loops, and so on.
	 */
	private List<String> getLocalScheduleDimNameContext() {
		Integer bandSize = bandSizeHistory.peek();
		List<String> globalContext = scheduleDimNameContextHistory.peek();
		if (globalContext == null || bandSize == null)
			return null;
		
		return globalContext.subList(globalContext.size()-bandSize, globalContext.size());
	}

//	/*
//	 * Helper to give schedule dimension names restricted to the outer band expressions.
//	 * 
//	 * The outer context is used for specifying isolate domains, and so on.
//	 * In ISL, it lives in a separate space by using relations:
//	 *   [param]->{ [outer] -> [local] : constraints}
//	 */
//	private List<String> getOuterScheduleDimNameContext() {
//		Integer dimSize = scheduleDimsPerBandHistory.peek();
//		List<String> globalContext = scheduleDimNameContextHistory.peek();
//		if (globalContext == null || dimSize == null)
//			return null;
//		
//		return globalContext.subList(0, globalContext.size()-dimSize);
//	}
	
	@Override
	public void outAbstractBandExpression(AbstractBandExpression abe) {
		scheduleDimNameContextHistory.pop();
		bandSizeHistory.pop();
	}
	
	@Override
	public void inExtensionExpression(ExtensionExpression ee) {
		for (ExtensionTarget et : ee.getExtensionTargets()) {
			parseExtensionTargetExtensionMap(et);
			
			Stack<List<String>> contexts = new Stack<>();
			
			if (et.getIndexNames().size() == et.getExtensionMap().getNbOutputs()) {
				contexts.add(et.getIndexNames());
			}
			
			indexNameContexts.put(et, contexts);
		}
	}
	
	@Override
	public void inTileBandExpression(TileBandExpression tbe) {
		processBandPieces(tbe);
		processTilingSpecification(tbe.getTilingSpecification());
	}
	
	private void processTilingSpecification(TilingSpecification ts) {
		int bandSize = bandSizeHistory.peek();
		int totalDims = bandSizeHistory.parallelStream().reduce((a,b)->(a+b)).get();
		
		issues.addAll(CalculatorExpressionEvaluatorForTM.calculate(ts.getLoopScheduleExpr(), getLocalScheduleDimNameContext(), bandSize, totalDims-bandSize));
		
		if (ts instanceof TileLoopSpecification) {
			TilingSpecification child = ((TileLoopSpecification) ts).getTilingSpecification();
			if (child != null)
				processTilingSpecification(child);
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
		List<String> context;
		if (strd.getIndexNames().size() > 0) {
			context = strd.getIndexNames();
		} else {
			context = new ArrayList<>(indexNameContexts.get(strd.getScheduleTarget()).peek());
		}

		issues.addAll(CalculatorExpressionEvaluatorForTM.calculate(strd.getRestrictDomainExpr(), context));
		
		return context;
	}
	
	private void parseExtensionTargetExtensionMap(ExtensionTarget et) {
		issues.addAll(CalculatorExpressionEvaluatorForTM.calculate(et.getExtensionMapExpr(), null));
	}
}
