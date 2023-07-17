package alpha.model.transformation.reduction

import alpha.model.util.DomainOperations
import fr.irisa.cairn.jnimap.isl.ISLBasicSet
import fr.irisa.cairn.jnimap.isl.ISLDimType
import org.eclipse.xtend.lib.annotations.Data
import java.util.ArrayList
import java.util.Iterator
import java.math.BigInteger
import alpha.model.transformation.reduction.FaceLattice.FaceLatticeNode

/**
 * Constructs the face lattice for an <code>ISLBasicSet</code>. 
 */
class FaceLattice {
	/**
	 * The layers of the face lattice.
	 * Each layer stores all of the nodes in that layer.
	 */
	val layers = new ArrayList<ArrayList<FaceLatticeNode>>() 
	
	/**
	 * Constructs a new face lattice for the given set.
	 */
	new(ISLBasicSet givenSet) throws UnsupportedOperationException {
		// Remove any redundancies in the set.
		val startingSet = givenSet.copy().removeRedundancies()
		
		// Right now, we do not support parameterized polyhedra.
		if (startingSet.nbParams > 0) {
			throw new UnsupportedOperationException("Parameterized polyhedra are not supported at this time.")
		}
		
		// Right now, we do not support polyhedra with equality constraints.
		val equalities = DomainOperations.toISLEqualityMatrix(startingSet)
		if (equalities.nbRows > 0) {
			throw new UnsupportedOperationException("Polyhedra with equality constraints are not supported at this time.")
		}
		
		// Get all of the lattice nodes and put them into their appropriate layers.
		val powerSetIterator = new UnorderedPowerSetIterator(startingSet)
		powerSetIterator.forEach[checkAddNode]
		
		// Set up the parent-child relations between each node.
		// These relationships can only exist between adjacent layers.
		for (i: 1 ..< layers.size()) {
			val parentLayer = layers.get(i-1)
			val currentLayer = layers.get(i)

			for (parent : parentLayer) {
				for (child : currentLayer) {
					parent.checkAddChild(child)
				}
			}
		}
	}
	
	/**
	 * Checks if a node is valid to be added to the face lattice, adding it if it is.
	 */
	def private void checkAddNode(FaceLatticeNode node) {
		// Nodes may not be empty.
		if (node.basicSet.empty) {
			return
		}
		
		// Determine which layer of the lattice this node goes in.
		val layer = node.saturatedInequalityIndices.length
		
		// Make sure we have enough layers allocated, then add the node to that layer.
		while (layers.size() <= layer) {
			layers.add(new ArrayList<FaceLatticeNode>)
		}
		layers.get(layer).add(node)
	}

	//////////////////////////////////////////////////////////////
	// Internal Classes
	//////////////////////////////////////////////////////////////
	
	/**
	 * A single node of the face lattice.
	 */
	@Data
	protected static class FaceLatticeNode implements Comparable<FaceLatticeNode> {
		/**
		 * The indexes of the inequalities saturated in this node.
		 */
		int[] saturatedInequalityIndices
		
		/**
		 * The ISL basic set which is formed by saturating the inequalities.
		 */
		ISLBasicSet basicSet
		
		/**
		 * The children nodes of this node.
		 */
		val children = new ArrayList<FaceLatticeNode>

		/**
		 * Checks if this is the parent of the other node, and adds it as a child if so.
		 */
		def void checkAddChild(FaceLatticeNode other) {
			if (isParentOf(other)) {
				children.add(other)
			}
		}

		/**
		 * Determines if this node is the parent of another node.
		 */
		def private boolean isParentOf(FaceLatticeNode other) {
			// Make sure there are no indices in this node which are missing from the other.
			val thisIsSubsetOfOther = saturatedInequalityIndices.forall[other.saturatedInequalityIndices.contains(it)]
			if (!thisIsSubsetOfOther) {
				return false
			}
			
			// Make sure the other node has at least one node which is not in in this node.
			val indicesUniqueToOther = other.saturatedInequalityIndices.reject[saturatedInequalityIndices.contains(it)]
			if (indicesUniqueToOther.empty) {
				return false
			}
			
			// Make sure there is no more than 1 index in the other node which is not in this node.
			if (!indicesUniqueToOther.tail.empty) {
				return false
			}
			
			return true
		}
		
		/**
		 * Compares two nodes to see which one comes in lexicographical order.
		 * Intended to be used only for sorting nodes so they're easier for a human to read.
		 */
		override compareTo(FaceLatticeNode other) {
			// If a node has fewer saturated inequalities, it comes first.
			if (saturatedInequalityIndices.length < other.saturatedInequalityIndices.length) {
				return -1
			}
			if (saturatedInequalityIndices.length > other.saturatedInequalityIndices.length) {
				return 1
			}
			
			// Check the saturated inequality indexes. If they differ at any point,
			// the one with the lower index comes first.
			for (i: 0 ..< saturatedInequalityIndices.length) {
				val thisIndex = saturatedInequalityIndices.get(i)
				val otherIndex = other.saturatedInequalityIndices.get(i)
				
				if (thisIndex < otherIndex) {
					return -1
				}
				
				if (thisIndex > otherIndex) {
					return 1
				}
			}

			return 0
		}
		
		/**
		 * Prints the indexes of the inequalities that this node saturates.
		 */
		override toString() {
			return "{" + String.join(',', saturatedInequalityIndices.map[it.toString()]) + "}"
		}
		
		/**
		 * Prints this node's saturated inequalities and children.
		 */
		def toStringWithChildren() {
			return toString() + ": " + String.join(", ", children.sort().map[it.toString()])
		}
		
		/**
		 * Prints this node's saturated inequalities and the ISL string for the basic set it creates.
		 */
		def toStringWithSet() {
			return toString() + ": " + basicSet.toString()
		}
	}
	
	/**
	 * Iterates through the power set of all inequality constraints of a given set.
	 */
	protected static class UnorderedPowerSetIterator implements Iterable<FaceLatticeNode>, Iterator<FaceLatticeNode> {
		/**
		 * Since each inequality can be saturated or not, we can use the bits of an integer
		 * to determine at each step which constraints to saturate.
		 */
		BigInteger currentValue = BigInteger.ZERO
		
		/**
		 * The final value to use for generating members of the power set.
		 * If there are n constraints, this should be (2^n)-1 (n bits of all 1's).
		 */
		final BigInteger finalValue
		
		/**
		 * The set being used to generate the power set of inequality constraints.
		 */
		final ISLBasicSet startingSet
		
		/**
		 * The number of inequality constraints in the starting set.
		 */
		final int constraintCount;
		
		/**
		 * Creates a new iterator which will iterate the power set of all
		 * inequality constraints of the given set.
		 */
		new(ISLBasicSet startingSet) {
			this.startingSet = startingSet
			constraintCount = startingSet.constraints.reject[it.isEquality()].size()

			// We want to use one bit per inequality. A number formed by n 1's has a value of (2^n)-1. 
			finalValue = (new BigInteger("2")).pow(constraintCount) - BigInteger.ONE
		}
		
		/**
		 * Gets a new iterator for the power set of all inequality constraints of a given set.
		 * Warning: this is only intended to be used once per instance of this class.
		 */
		override iterator() {
			return this
		}

		/**
		 * Returns true if there are any more nodes to iterate through and false otherwise.
		 */
		override hasNext() {
			return currentValue <= finalValue
		}
		
		/**
		 * Returns a face lattice node in the power set of all constraints to saturate.
		 */
		override next() {
			// The bits of the current value indicate whether or not a constraint is saturated.
			val indicesToSaturate = (0 ..< constraintCount).filter[currentValue.testBit(it)]
			currentValue += BigInteger.ONE
			return toFaceLatticeNode(indicesToSaturate)
		}
		
		/**
		 * Generates a face lattice node from a set of indexes to saturate.
		 */
		def private toFaceLatticeNode(Iterable<Integer> toSaturate) {
			// Separate the inequalities into saturated and unsaturated constraints.
			// Do so by dropping rows, going from high to low to avoid issues with dropping by index.
			var saturated = DomainOperations.toISLInequalityMatrix(startingSet)
			var unsaturated = saturated.copy()
			for (row : constraintCount >.. 0) {
				if (toSaturate.contains(row)) {
					unsaturated = unsaturated.dropRows(row, 1)
				} else {
					saturated = saturated.dropRows(row, 1)
				}
			}
			
			// Combine the equalities with the saturated inequalities.
			val updatedEqualities = DomainOperations.toISLEqualityMatrix(startingSet).concat(saturated)
			
			// Construct a new basic set from the equalities and the unsaturated inequalities.
			// The order of the dimension types should match those in the
			// DomainOperations.toISLEqualityMatrix() and toISLInequalityMatrix() methods. 
			val basicSet = ISLBasicSet.fromConstraintMatrices(
				startingSet.space, updatedEqualities, unsaturated, 
				ISLDimType.isl_dim_param, ISLDimType.isl_dim_set,
				ISLDimType.isl_dim_div, ISLDimType.isl_dim_cst)
				
			return new FaceLatticeNode(toSaturate, basicSet)
		}
	}
}
