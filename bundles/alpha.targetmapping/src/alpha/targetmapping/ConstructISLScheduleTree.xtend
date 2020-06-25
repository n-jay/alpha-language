package alpha.targetmapping

import alpha.model.AlphaScheduleTarget
import alpha.model.StandardEquation
import alpha.model.UseEquation
import alpha.targetmapping.util.AbstractTargetMappingVisitor
import alpha.targetmapping.util.TargetMappingUtil
import fr.irisa.cairn.jnimap.isl.ISLContext
import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLIdentifier
import fr.irisa.cairn.jnimap.isl.ISLMap
import fr.irisa.cairn.jnimap.isl.ISLSchedule
import fr.irisa.cairn.jnimap.isl.ISLScheduleExtensionNode
import fr.irisa.cairn.jnimap.isl.ISLScheduleSequenceNode
import fr.irisa.cairn.jnimap.isl.ISLUnionSetList
import java.util.LinkedList
import java.util.List
import org.eclipse.xtext.EcoreUtil2

/**
 * ConstructISLScheduleTree is responsible for translating {@link ScheduleTreeExpression}
 * to ISLSchedule, i.e., schedule tree in ISL. The translation assumes that the
 * input TargetMapping is valid: all JNIDomains are successfully computed, and
 * syntactic restrictions (e.g., placement of ExtensionExpression) are respected.
 * 
 * Because the ISL implementation is only using structs (no classes) manipulating the 
 * tree is a bit confusing. ISLSchedule and ISLScheduleNode objects represent the 
 * tree under construction in a particular state, and the reference is meaningless as
 * soon as an operation is performed. (isl take/keep applies as usual)
 * 
 * A sub-tree may be constructed in a top-down manner for the most part, but 
 * accessing other parts of the tree requires traversing the tree. Consistency between
 * the TargetMapping structure and ISLSchedule is maintained using the path vector,
 * which keeps track of where you are in the ISLSchedule.
 * 
 */
class ConstructISLScheduleTree extends AbstractTargetMappingVisitor {
	
	private new() {}
	
	ISLSchedule schedule
	List<Integer> path
	
	/**
	 * This visitor maintains an up-to-date copy of ISLSchedule, and keeps
	 * track of the path to the node where the insertion of the next 
	 * node in the TM tree should be inserted as the tree is traversed.
	 * 
	 */
	def getCurrentNode() {
		var node = schedule.root
		for (p : path) {
			node = node.getChild(p)
		}
		return node
	}

	def static ISLSchedule construct(TargetMappingForSystemBody tm) {
		val visitor = new ConstructISLScheduleTree();
		
		visitor.accept(tm);
		
		return visitor.schedule;
	}
	
	
	override void inTargetMappingForSystemBody(TargetMappingForSystemBody tm) {
		super.inTargetMappingForSystemBody(tm);
		
		val targets = EcoreUtil2.getAllContentsOfType(tm.getTargetBody(), AlphaScheduleTarget);
		
		var domain = targets.map[t|t.constructNamedSet.toUnionSet].reduce[s1, s2|s1.union(s2)]
		
		schedule = ISLSchedule.buildFromDomain(domain)
		path = new LinkedList();
		
		path.add(0);
		
		//ContextExpression is only allowed at the root (and is optional)
		// if context expression is not the first expression, then add parameter domain as context
		// otherwise, parameter domain is intersected with the context domain at ContextExpression
		// adding 0 dimensional set dim is necessary
		// what is excepted as context in ISL sechedule tree is the space of parameter + outer scheduled dims
		// at the root, the outer scheduled dims is always 0 dimensional, but the space must still live in 
		// set space not parameters
		if (!(tm.scheduleTreeRoot instanceof ContextExpression)) {
			val paramDomain = tm.targetBody.system.parameterDomain;
			val contextDomain = paramDomain.addDims(ISLDimType.isl_dim_set, 0)
			schedule = schedule.insertContext(contextDomain)
			path.add(0);
		}
	}
	
	override inContextExpression(ContextExpression ce) {
		//specify the intersection of context domain and the parameter domain as context
		val pDom = TargetMappingUtil.getTargetSystem(ce).parameterDomain
		schedule = schedule.insertContext(ce.contextDomain.intersectParams(pDom))
		
		path.add(0);
	}
	
	override outContextExpression(ContextExpression ce) {
		path.remove(path.size-1)
	}
	
	override visitSequenceExpression(SequenceExpression se) {
		val filters = se.children.filter[c|c instanceof FilterExpression]
		val domains = filters.map[fe|(fe as FilterExpression).constructDomain]
		var unionSetList = ISLUnionSetList.build(ISLContext.getInstance(), domains.size);
		
		for (d : domains)
			unionSetList = unionSetList.add(d)
			
		var seqNode = currentNode.insertSequence(unionSetList)
		
		//Sequence may have extensions as first and/or last children. In such cases, 
		// the extension maps are grafted either before or after this sequence.
		val extensions = EcoreUtil2.getObjectsByType(se.children, TargetmappingPackage.Literals.EXTENSION_EXPRESSION)
		if (extensions.size > 1) {
			for (ex : extensions) {
				val exMap = (ex as ExtensionExpression).constructNamedExtensionMap
				val exNode = ISLScheduleExtensionNode.buildFromExtensionMap(exMap)
				
				//select graft before or after
				if (se.children.indexOf(ex) == 0) {
					val graftedNode = seqNode.graftBefore(exNode)
					seqNode = graftedNode as ISLScheduleSequenceNode
				} else if (se.children.indexOf(ex) == se.children.size-1) {
					val graftedNode = seqNode.graftAfter(exNode)
					seqNode = graftedNode as ISLScheduleSequenceNode
				} else {
					throw new RuntimeException("ExtensionExpression is not at the beginning/end of sequence")
				}
			}
			seqNode = (seqNode.parent.parent as ISLScheduleSequenceNode).spliceChild(1)
			
			path.add(0)
		}
		
		schedule = seqNode.schedule
		
		val depth = path.size
		path.add(0)
		
		for (c : se.children) {
			path.set(depth, se.children.indexOf(c))
			c.accept(this)
		}
		
		path.remove(depth)
		
		if (extensions.size> 0) {
			path.remove(depth-1)
		} 
	}
	
	override visitSetExpression(SetExpression se) {
		//The code here is a subset of the one in SequenceExpression
		// set expressions do not have to deal with ExtensionExpressions
		
		val domains = se.children.map[c|(c as FilterExpression).constructDomain]
		var unionSetList = ISLUnionSetList.build(ISLContext.getInstance(), domains.size);
		
		for (d : domains)
			unionSetList = unionSetList.add(d)
			
		val seqNode = currentNode.insertSet(unionSetList)
		schedule = seqNode.schedule
		
		val depth = path.size
		path.add(0)
		
		for (c : se.children) {
			path.set(depth, se.children.indexOf(c))
			c.accept(this)
		}
		
		path.remove(depth)
	}
	
	override inFilterExpression(FilterExpression fe) {
		//If the parent was Set/Seq, then filter is already created
		if (fe.eContainer instanceof SetExpression || fe.eContainer instanceof SequenceExpression) {
			path.add(0)
			return
		}
		
		val filterDomain = fe.constructDomain
		val filterNode = currentNode.insertFilter(filterDomain)
		schedule = filterNode.schedule
		
		path.add(0)
	}
	
	override outFilterExpression(FilterExpression fe) {
		path.remove(path.size-1)
	}
	
	override inGuardExpression(GuardExpression ge) {
		val guardNode = currentNode.insertGuard(ge.guardDomain)
		schedule = guardNode.schedule
		
		path.add(0)
	}
	
	override outGuardExpression(GuardExpression ge) {
		path.remove(path.size-1)
	}
	
	override inMarkExpression(MarkExpression me) {
		val markNode = currentNode.insertMark(ISLIdentifier.alloc(ISLContext.instance, me.identifier))
		schedule = markNode.schedule
		
		path.add(0)
	}
	
	override outMarkExpression(MarkExpression me) {
		path.remove(path.size-1)
	}
	
	override inBandExpression(BandExpression be) {
		val partialSchedule = be.bandPieces.map[constructPartialSchedule].reduce[p1, p2|p1.unionAdd(p2)]
		var bandNode = currentNode.insertPartialSchedule(partialSchedule)
		
		for (lts : be.loopTypeSpecifications) {
			bandNode = bandNode.setASTLoopType(lts.dimension, lts.loopType)
		}
		
		if (be.isolateSpecification !== null) {
			val map = ISLMap.buildFromRange(be.isolateSpecification.isolateDomain)
			val isolateOption = map.wrap.tupleName = "isolate"
			bandNode = bandNode.ASTBuildOptions = isolateOption.toUnionSet
			
			for (lts : be.isolateSpecification.loopTypeSpecifications) {
				bandNode = bandNode.setIsolateASTLoopType(lts.dimension, lts.loopType)
			}
		}
		
		schedule = bandNode.schedule
		path.add(0)
	}
	
	override outBandExpression(BandExpression be) {
		path.remove(path.size-1)
	}
	
	
	//ExtensionExpressions are handled at SetExpression
	// it translates as filter node in the tree, so the paths are updated accordingly
	override inExtensionExpression(ExtensionExpression ee) {
		path.add(0)
	}
	
	override outExtensionExpression(ExtensionExpression ee) {
		path.remove(path.size-1)
	}
	
	private def dispatch constructNamedSet(StandardEquation eq) {
		val vDom = eq.variable.domain
		return vDom.tupleName = eq.name
	}
	private def dispatch constructNamedSet(UseEquation eq) {
		//use equation should use instantiation domain -- not implemented yet
		throw new UnsupportedOperationException();
	}
	private def dispatch constructNamedSet(ExtensionTarget et) {
		val range = et.extensionMap.getRange
		return range.tupleName = et.name
	}
	
	private def constructNamedSet(ScheduleTargetRestrictDomain strd) {
		return strd.restrictDomain.tupleName = strd.scheduleTarget.name
	}
	
	private def constructDomain(FilterExpression fe) {
		return fe.filterDomains.map[constructNamedSet.toUnionSet].reduce[s1, s2|s1.union(s2)]
	}
	
	private def constructPartialSchedule(BandPiece bp) {
		val pieceDomain = bp.pieceDomain.constructNamedSet
		var partialSchedule = bp.partialSchedule.toMultiPWAff
		partialSchedule = partialSchedule.setTupleName(ISLDimType.isl_dim_in, bp.pieceDomain.scheduleTarget.name)
		partialSchedule = partialSchedule.intersectDomain(pieceDomain)
		partialSchedule.toMultiUnionPWAff
	}
	
	private def constructNamedExtensionMap(ExtensionExpression ee) {
		return ee.extensionTargets.map[constructNamedExtensionMap].reduce[p1, p2|p1.union(p2)]
	}
	
	private def constructNamedExtensionMap(ExtensionTarget et) {
		var stExMap = et.extensionMap.outputTupleName = et.name
		if (et.source !== null)
			stExMap = stExMap.inputTupleName = et.source.name
		return (stExMap as ISLMap).toUnionMap
	}
}
