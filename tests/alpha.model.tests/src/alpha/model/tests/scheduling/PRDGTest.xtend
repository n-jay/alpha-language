package alpha.model.tests.scheduling

import alpha.model.prdg.PRDG
import alpha.model.AlphaModelLoader
import org.junit.Test
import static org.junit.Assert.*
import alpha.model.prdg.PRDGNode
import fr.irisa.cairn.jnimap.isl.ISLSet
import fr.irisa.cairn.jnimap.isl.ISLContext
import alpha.model.prdg.PRDGEdge
import fr.irisa.cairn.jnimap.isl.ISLMultiAff
import alpha.model.prdg.PRDGGenerator
import java.util.List
import java.util.Set
import java.util.HashSet
import java.util.Arrays
import alpha.model.AlphaSystem
import alpha.model.Variable
import fr.irisa.cairn.jnimap.isl.ISLUnionSet
import fr.irisa.cairn.jnimap.isl.ISLDimType
import java.util.HashMap
import java.util.ArrayList

class PRDGTest {
	/*Whether the dependence edge from a reduction's result variable to its body is flipped
	If 'true', the edge is flipped, to conform to old AlphaZ specifications
	If this is ever changed, this value can simply be set to false to maintain test correctness*/
	val boolean RESULT_BODY_EDGE_FLIPPED = true
	val ISLContext ctx = ISLContext.getInstance
	val ISLSet arbitrarySet = ISLSet.buildFromString(ctx, "{:}")
	var PRDG prdg
	var AlphaSystem sys
	
	def readFile(String file) {
		var root = AlphaModelLoader.loadModel(file)
		sys = root.systems.get(0)
		prdg = PRDGGenerator.apply(sys)
	}
	
	def void composeReductionEdges() {
		var reductionEdges = new HashMap<PRDGNode, ArrayList<PRDGEdge>>
		for(PRDGEdge edge : prdg.getEdges.filter[edge | edge.getSource.isReductionNode]) {
			if(!reductionEdges.containsKey(edge.getSource)) reductionEdges.put(edge.getSource, new ArrayList<PRDGEdge>)
			reductionEdges.get(edge.getSource).add(edge)
		}
		var Iterable<PRDGEdge> workingEdges = prdg.getEdges.filter[edge | edge.getDest.isReductionNode && !edge.getSource.isReductionNode]
		while(!workingEdges.isEmpty) {
			var nextEdges = new ArrayList<PRDGEdge>
			for(PRDGEdge edge1 : workingEdges) {
				for(PRDGEdge edge2 : reductionEdges.get(edge1.getDest)) {
					println(edge1)
					println(ISLMultiAff.buildFromString(ctx, edge2.getFunction.copy.toMap.reverse.toString))
					var newEdge = new PRDGEdge(
						edge1.getSource,
						edge2.getDest,
						arbitrarySet,
						edge1.getFunction.copy.pullback(edge2.isReductionEdge ? 
							edge2.getFunction.copy : 
							edge2.getFunction.copy
						)
					)
					if(newEdge.getDest.isReductionNode) nextEdges.add(newEdge)
					else prdg.addEdge(newEdge)
					println(newEdge)
				}
			}
			workingEdges = nextEdges
		}
		
		prdg.setEdges(prdg.getEdges.filter[edge | !edge.getDest.isReductionNode && !edge.getSource.isReductionNode].toSet) 
	}
	
	def void assertEdgeDomsInVariable(Iterable<ISLSet> outgoingDoms, Variable variable) {
		outgoingDoms.forEach[dom | assertTrue(dom.copy.isSubset(variable.getDomain.copy))]
	}

	def void assertEdgeDomsCoverVariable(Iterable<ISLSet> outgoingDoms, Variable variable) {
		//val ISLUnionSet reconstructedDomain = ISLUnionSet.buildFromSets(outgoingDoms.map[dom | dom.copy])
		//buildFromSets is bugged and throws an error when given more than 2 sets
		//Who wrote this garbage?
		if(outgoingDoms.isEmpty) {
			assertTrue(variable.getDomain.isEmpty)
			return
		}
		var ISLUnionSet reconstructedDomain = ISLUnionSet.buildEmpty(outgoingDoms.get(0).getSpace)
		for(ISLSet dom : outgoingDoms) {
			reconstructedDomain = reconstructedDomain.union(dom.copy.toUnionSet)
		}
		if(!variable.getDomain.copy.toUnionSet.isSubset(reconstructedDomain)) {
			println("Variable " + variable.getName + " is not covered by edge domains.")
			println("Remainder space: " + variable.getDomain.copy.toUnionSet.subtract(reconstructedDomain))
			assertTrue(false)
		}
	}
	
	def void assertEdgeDomsDisjoint(Iterable<ISLSet> outgoingDoms) {
		if(outgoingDoms.isEmpty) return
		var ISLUnionSet otherDoms = ISLUnionSet.buildEmpty(outgoingDoms.get(0).getSpace)
		for(ISLSet dom : outgoingDoms) {
			assertTrue(otherDoms.isDisjoint(dom.copy.toUnionSet))
			otherDoms = otherDoms.union(dom.copy.toUnionSet)
		}
	}

	def void assertEdgeDomsPartitionVariables() {
		for(Variable variable : sys.getVariables) {
			val Iterable<PRDGEdge> outgoing = prdg.getEdges.filter[edge | edge.getSource.getName == variable.getName]
			val Iterable<ISLSet> outgoingDoms = outgoing.map[edge | edge.getDomain.copy]
			
			assertEdgeDomsInVariable(outgoingDoms, variable)
			if(!variable.isInput) {
				//assertEdgeDomsDisjoint(outgoingDoms)
				//assertEdgeDomsCoverVariable(outgoingDoms, variable)
			}
		}
	}
	
	def void assertEdgeRangesInVariables() {
		for(Variable variable : sys.getVariables) {
			val Iterable<PRDGEdge> incoming = prdg.getEdges.filter[edge | edge.getDest.getName == variable.getName]
			val Iterable<ISLSet> incomingDoms = incoming.map[edge | edge.getDomain.apply(edge.getFunction.toMap)]
			
			assertEdgeDomsInVariable(incomingDoms, variable)
		}
	}
	
	def void assertEdgeDimensionsCorrect() {
		for(PRDGEdge edge : prdg.getEdges) {
			var Variable sourceVar = sys.getVariable(edge.getSource.getName)
			var Variable destVar = sys.getVariable(edge.getDest.getName)
			
			
			if(edge.isReductionEdge && RESULT_BODY_EDGE_FLIPPED) {
				val Variable temp = sourceVar
				sourceVar = destVar
				destVar = temp
			}
				
			if(sourceVar !== null) {
				val int nSourceParams = sourceVar.getDomain.dim(ISLDimType.isl_dim_param)
				val int nSourceIdxs = sourceVar.getDomain.dim(ISLDimType.isl_dim_all) - nSourceParams
				val int nEdgeDomParams = edge.getDomain.dim(ISLDimType.isl_dim_param)
				val int nEdgeDomIdxs = edge.getDomain.dim(ISLDimType.isl_dim_all) - nEdgeDomParams
				val int nEdgeFunParams = edge.getFunction.dim(ISLDimType.isl_dim_param)
				val int nEdgeFunIn = edge.getFunction.dim(ISLDimType.isl_dim_in)
				
				assertEquals(nSourceParams, nEdgeDomParams) 
				assertEquals(nSourceIdxs, nEdgeDomIdxs) 
				assertEquals(nSourceParams, nEdgeFunParams)
				assertEquals(nSourceIdxs, nEdgeFunIn)
			}
			if(destVar !== null) {
				val int nDestParams = destVar.getDomain.dim(ISLDimType.isl_dim_param)
				val int nDestIdxs = destVar.getDomain.dim(ISLDimType.isl_dim_all) - nDestParams
				val int nEdgeFunParams = edge.getFunction.dim(ISLDimType.isl_dim_param)
				val int nEdgeFunOut = edge.getFunction.dim(ISLDimType.isl_dim_out)
				
				assertEquals(nDestParams, nEdgeFunParams)
				assertEquals(nDestIdxs, nEdgeFunOut)
				 
			}
		}
	}
	
	def void assertNodeDomainsCorrect() {
		for(PRDGNode node : prdg.getNodes) {
			var Variable variable = sys.getVariable(node.getName)
			if(variable !== null) {
				assertTrue(variable.getDomain.copy.isSubset(node.getDomain.copy))
				assertTrue(node.getDomain.copy.isSubset(variable.getDomain.copy))
			}
		}
	}
	
	def void assertNodesComplete() {
		for(Variable variable : sys.getVariables()) {
			if(!variable.isInput) {
				assertFalse(prdg.getNodes.filter[node | node.name == variable.name].isEmpty)
			}
		}
	}
	
	def void assertPRDGValid() {
		/*
		 * Can't validate that edge functions match dependence functions without a visitor
		 * Which would be redundant, since that's how they're generated
		 * So that goes unchecked
		 */
		//composeReductionEdges
		assertEdgeDimensionsCorrect
		assertEdgeDomsPartitionVariables
		assertEdgeRangesInVariables
		assertNodeDomainsCorrect
		assertNodesComplete
	}
	
	@Test
	def void testDot() {
		readFile("resources/src-valid/basic/matmult.unit/dot.alpha")
		assertPRDGValid
	} 
	
	@Test
	def void testBPMax() {
		readFile("resources/src-valid/kernels/bpmax.alpha")
		assertPRDGValid
	}
	
	@Test
	def void testCholesky() {
		readFile("resources/src-valid/kernels/cholesky.alpha")
		assertPRDGValid
	}
}