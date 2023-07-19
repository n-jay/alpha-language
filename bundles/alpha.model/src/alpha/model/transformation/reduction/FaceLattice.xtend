package alpha.model.transformation.reduction

import alpha.model.util.DomainOperations
import fr.irisa.cairn.jnimap.isl.ISLBasicSet
import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLMatrix
import fr.irisa.cairn.jnimap.isl.ISLSpace
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
	 * The container for the face lattice itself, organized into layers.
	 * Layer 0 is the top level of the lattice (highest dimensionality),
	 * which should contain only the starting set.
	 * Each successive layer has one fewer dimension than the previous layer.
	 * The last layer will be the vertices.
	 */
	val lattice = new ArrayList<ArrayList<FaceLatticeNode>>()
	
	/**
	 * The dimensionality of the given set, which is at the top of the lattice.
	 */
	final int givenSetDimensionality

	/**
	 * Constructs a new face lattice for the given set.
	 */
	new(ISLBasicSet givenSet) throws UnsupportedOperationException {
		// Remove any redundancies in the set.
		val startingSet = givenSet.copy().removeRedundancies()
		
		// Right now, we do not support parameterized polyhedra.
		if (startingSet.nbParams > 1) {
			throw new UnsupportedOperationException("Parameterized polyhedra are not supported at this time.")
		}
		
		givenSetDimensionality = dimensionality(givenSet)
		
		// Get all of the lattice nodes and put them into their appropriate layers.
		val powerSetIterator = new UnorderedPowerSetIterator(startingSet)
		powerSetIterator.forEach[checkAddNode]
		
		// Set up the parent-child relations between each node.
		// These relationships can only exist between adjacent layers.
		for (i: 1 ..< lattice.size()) {
			val parentLayer = lattice.get(i-1)
			val currentLayer = lattice.get(i)

			for (parent : parentLayer) {
				for (child : currentLayer) {
					parent.checkAddChild(child)
				}
			}
		}
	}
	
	/**
	 * Determines the dimensionality (number of free dimensions) for a set.
	 * This is defined as the number of index variables minus the number of
	 * linearly independent equality constraints which involve at least one index variable.
	 * 
	 * @keep set Keep. The set to find the dimensionality of. 
	 */
	def private static int dimensionality(ISLBasicSet set) {
		// To get the number of linearly independent equality constraints,
		// get the matrix of equality constraints for the set,
		// drop any rows which do not involve any index dimensions,
		// then calculate the rank of that matrix.
		val indexCount = indexDimensionCount(set)
		var equalityMatrix = DomainOperations.toISLEqualityMatrix(set)
		for (row: equalityMatrix.nbRows >.. 0) {
			if (!constraintInvolvesIndex(equalityMatrix, row, indexCount)) {
				equalityMatrix = equalityMatrix.dropRows(row, 1)
			}
		}

		return indexCount - equalityMatrix.rank()
	}
	
	/**
	 * Checks if a node is valid to be added to the face lattice, adding it if it is.
	 */
	def private void checkAddNode(FaceLatticeNode node) {
		// Nodes may not be empty.
		if (node.basicSet.empty) {
			return
		}
		
		// The nodes are organized into layers with the same dimensionality.
		// The layer this node should be at is the difference in dimensionality
		// between the given set (at the top of the lattice) and this set. 
		val dimensionality = dimensionality(node.basicSet)
		val layer = givenSetDimensionality - dimensionality
		
		// It seems reasonable that the layer index and the number of saturated inequalities
		// should always match, but I'm not 100% confident on this.
		// My intuition is that we should skip the node if they don't match, as it will end up being redundant
		// with a different node which saturates fewer inequalities.
		// For now, just print a warning if this is detected.
		//TODO: Investigate this further.
		if (layer != node.saturatedInequalityIndices.length()) {
			System.err.println("Node layer and saturated inequality count mismatch! Layer: " + layer + ", node: " + node.toString())
		}
		
		// Make sure we have enough layers allocated, then add the node to that layer.
		while (lattice.size() <= layer) {
			lattice.add(new ArrayList<FaceLatticeNode>)
		}
		lattice.get(layer).add(node)
	}

	/**
	 * Checks if the row of a constraint matrix has a non-zero coefficient for at least one index dimension.
	 */
	def private static constraintInvolvesIndex(ISLMatrix matrix, int row, int indexCount) {
		// The constraint matrix puts columns in the order: parameters, indexes, constant.
		// Thus, the exclusive ending index is the number of columns minus one (for the constant column).
		// Since we want to check each index, the first column to check is the end minus the number of indexes.
		val endExclusive = matrix.nbCols - 1
		val start = endExclusive - indexCount

		// The constraint at this row involves an index if any of the columns in that range
		// have a non-zero coefficient value.
		return (start ..< endExclusive).exists[col | matrix.getElement(row, col) != 0]
	}

	/**
	 * Gets the number of index dimensions in the given set.
	 */
	def private static indexDimensionCount(ISLBasicSet set) {
		return set.dim(ISLDimType.isl_dim_set)
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
		 * Prints this node's saturated inequalities.
		 * If the node has children, it also prints them.
		 * Otherwise, it prints the ISL set it represents.
		 */
		def toStringWithChildrenOrSet() {
			if (children.size() > 0) {
				return toStringWithChildren()
			} else {
				return toStringWithSet()
			}
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
		 * The space in which the generated polyhedra exist.
		 */
		final ISLSpace space
		
		/**
		 * The matrix of inequality constraints that the initial set started with.
		 */
		final ISLMatrix startingEqualities
		
		/**
		 * The matrix of inequality constraints that involve at least one index dimension
		 * that the initial set started with.
		 */
		final ISLMatrix startingIndexInequalities

		/**
		 * The matrix of inequality constraints that involve only parameter dimensions
		 * that the initial set started with.
		 */
		final ISLMatrix startingParameterInequalities

		/**
		 * The dimensionality of the starting set.
		 * The maximum number of inequalities to saturate is equal to this.
		 */
		final int startingSetDimensionality
		
		/**
		 * Creates a new iterator which will iterate the power set of all inequality constraints of the given set.
		 * The number of inequalities saturated will not exceed the dimensionality of the given set. 
		 */
		new(ISLBasicSet startingSet) {
			space = startingSet.space
			startingEqualities = DomainOperations.toISLEqualityMatrix(startingSet)
			startingSetDimensionality = dimensionality(startingSet)
			
			val bothInequalityMatrices = separateIndexInequalities(startingSet)
			startingIndexInequalities = bothInequalityMatrices.key
			startingParameterInequalities = bothInequalityMatrices.value

			// For this comment, let n be the number of inequality constraints involving at least one index,
			// and let d be the dimensionality of the starting set.
			// We can use an n-bit binary number to represent whether or not the n inequalities are saturated.
			// By doing so, we can simply iterate through numbers and use the binary representation to generate each node.
			// This will result in generating the power set of all inequality constraints.
			// However, we only want to consider sets formed by saturating d inequalities,
			// as saturating more than that will result in an empty set (its dimensionality will be negative).
			// Thus, the final number we want to generate a set for is an n-bit number starting with d 1's.
			// A number of d 1's can be calculated as (2^d)-1.
			// Then, we can left-shift this by n-d bits, resulting in the final number we want to generate a set for.
			// Any numbers larger will be saturating more than d inequalities.
			val dimensionalityMax = (new BigInteger("2")).pow(startingSetDimensionality) - BigInteger.ONE
			finalValue = dimensionalityMax.shiftLeft(startingIndexInequalities.nbRows - startingSetDimensionality)
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
			// Note: only modify the current value after generating the face lattice node,
			// as the indices to saturate won't actually be determined until it's enumerated.
			// Thus, incrementing the current value too early will result in the wrong node being generated.
			val indicesToSaturate = (0 ..< startingIndexInequalities.nbRows).filter[currentValue.testBit(it)]
			val node = toFaceLatticeNode(indicesToSaturate)
			currentValue += BigInteger.ONE
			return node
		}
		
		/**
		 * Separates the given set's inequality constraint matrix into two separate matrices:
		 * one for constraints which involve at least one index, and one for constraints involving
		 * only parameters.
		 *
		 * @keep startingSet Keep. The set to split the inequality constraints of.
		 * @return Returns a pair of ISL matrices.
		 *         The one in the "key" position contains the constraints involving at least one index.
		 *         The one in the "value" position contains the constraints involving only parameters.
		 */
		def private static separateIndexInequalities(ISLBasicSet startingSet) {
			// Start with two copies of the set's inequalities matrix.
			// One will end up containing all inequalities with at least one index,
			// and the other will end up containing all inequalities with only parameters.
			var indexConstraints = DomainOperations.toISLInequalityMatrix(startingSet)
			var parameterConstraints = indexConstraints.copy()

			// Drop rows from one matrix or the other depending on whether the row represents
			// a constraint involving an index or not.
			// Go from end to start to avoid issues with dropping rows by index.
			val indexCount = indexDimensionCount(startingSet)
			for (row : indexConstraints.nbRows >.. 0) {
				if (constraintInvolvesIndex(indexConstraints, row, indexCount)) {
					parameterConstraints = parameterConstraints.dropRows(row, 1)
				} else {
					indexConstraints = indexConstraints.dropRows(row, 1)
				}
			}

			return indexConstraints -> parameterConstraints
		}

		/**
		 * Generates a face lattice node from a set of indexes to saturate.
		 */
		def private toFaceLatticeNode(Iterable<Integer> toSaturate) {
			// Separate the index inequalities into saturated and unsaturated constraints.
			// Do so by dropping rows, going from high to low to avoid issues with dropping by index.
			var equalities = startingIndexInequalities.copy()
			var inequalities = equalities.copy()
			for (row : startingIndexInequalities.nbRows >.. 0) {
				if (toSaturate.contains(row)) {
					inequalities = inequalities.dropRows(row, 1)
				} else {
					equalities = equalities.dropRows(row, 1)
				}
			}

			// Combine the saturated inequalities with the starting equalities.
			// Combine the unsaturated inequalities with the parameter inequalities.
			// Make sure the starting matrices are copied, as concat will destroy them otherwise.
			equalities = equalities.concat(startingEqualities.copy())
			inequalities = inequalities.concat(startingParameterInequalities.copy())

			// Construct a new basic set from the new equality and inequality matrices.
			// The order of the dimension types should match those in the
			// DomainOperations.toISLEqualityMatrix() and toISLInequalityMatrix() methods. 
			val basicSet = ISLBasicSet.fromConstraintMatrices(
				space.copy(), equalities, inequalities,
				ISLDimType.isl_dim_param, ISLDimType.isl_dim_set,
				ISLDimType.isl_dim_div, ISLDimType.isl_dim_cst)

			return new FaceLatticeNode(toSaturate, basicSet)
		}
	}
}
