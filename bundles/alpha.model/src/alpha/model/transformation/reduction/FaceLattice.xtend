package alpha.model.transformation.reduction

import alpha.model.util.DomainOperations
import fr.irisa.cairn.jnimap.isl.ISLBasicSet
import fr.irisa.cairn.jnimap.isl.ISLDimType
import fr.irisa.cairn.jnimap.isl.ISLMatrix
import fr.irisa.cairn.jnimap.isl.ISLSpace
import java.util.ArrayList
import java.util.LinkedList
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data

/** Constructs the face lattice of a given <code>ISLBasicSet</code> */
class FaceLattice {
	/** The information about the set which forms the root of the lattice. */
	@Accessors(PUBLIC_GETTER)
	val SetInfo rootInfo
	
	/**
	 * The storage of the lattice itself.
	 * The index of each layer (the outermost list) is the dimensionality.
	 * I.e., <code>lattice[2]</code> contains all the 2D faces of the lattice.
	 * Each layer is a list of all the sets which are in that layer.
	 */
	val ArrayList<ArrayList<SetInfo>> lattice
	
	/** Constructs a new, empty lattice. */
	private new(SetInfo rootInfo) { 
		this.rootInfo = rootInfo
		lattice = new ArrayList<ArrayList<SetInfo>>
	}
	
	/** Gets the set of all children of the indicated face. */
	def getChildren(SetInfo face) {
		// If there are no layers below this face's layer,
		// or if this face's layer doesn't even exist,
		// it must not have any children.
		val faceLayer = Integer.max(0, face.dimensionality)
		if ((faceLayer == 0) || (faceLayer >= lattice.size)) {
			return new ArrayList<SetInfo>
		}
		
		// All children of the given face must be on the layer below it.
		return lattice.get(faceLayer - 1).filter[node | node.isChildOf(face)]
	}
	
	def getAllFaces() {
		return lattice.flatten
	}

	def getLattice() {
		return lattice
	}
	
	/**
	 * Checks if a face is valid to add to the lattice, and adds it if so.
	 * @returns Returns <code>true</code> if the face was valid and added, and <code>false</code> otherwise.
	 */
	def private checkAddFace(ArrayList<Integer> toSaturate) {
		// Create the proposed face by saturating the indicated inequality constraints,
		// and check whether or not this creates a valid face.
		val face = SetInfo.createFace(rootInfo, toSaturate)
		if (!face.isValidFace(rootInfo)) {
			return false
		}
		
		// Lattice layer indices match the dimensionality of the faces in that layer.
		// Be careful to avoid out of bounds accesses!
		val layerIndex = Integer.max(0, face.dimensionality)
		while (lattice.size <= layerIndex) {
			lattice.add(new ArrayList<SetInfo>)
		}
		lattice.get(layerIndex).add(face)
		return true
	}
	
	/** Creates a new face lattice for the given set. */
	def static create(ISLBasicSet root) {
		// Set up the face lattice which is rooted at the given set.
		val rootInfo = new SetInfo(root)
		val lattice = new FaceLattice(rootInfo)
		
		// The lattice will be populated by iterating through the power set of all constraints.
		// A queue of constraint combinations to check will be used to avoid recursion.
		// We will start with the top-level face which doesn't saturate any constraints (i.e., the root).
		val toSaturate = new LinkedList<ArrayList<Integer>>
		toSaturate.add(new ArrayList<Integer>)

		// While there are combinations of constraints left, try creating faces.
		while (!toSaturate.empty) {
			// Get the next set of constraints and try constructing a face from them.
			val currentConstraints = toSaturate.remove
			val isValidFace = lattice.checkAddFace(currentConstraints)
			
			// If the face was valid and the maximum number of constraints haven't been saturated,
			// queue up more sets of constraints to try saturating.
			val hasChildren = isValidFace && (currentConstraints.size < rootInfo.dimensionality)
			if (hasChildren) {
				// The next constraint sets are created by adding a single constraint to this set.
				// To avoid duplicating faces, only try saturating constraints whose index is
				// greater than the largest index of constraint already saturated.
				// Since the arrays are already sorted, we can just grab the last element and add 1.
				// If the current set of constraints is empty, any constraint is valid to saturate.
				val minimumIndex = currentConstraints.empty ? 0 : (currentConstraints.last + 1)
				for (constraint: minimumIndex ..< rootInfo.indexInequalityCount) {
					val nextSet = new ArrayList<Integer>(currentConstraints)
					nextSet.add(constraint)
					toSaturate.add(nextSet)
				}
			}
		}
		
		return lattice
	}
	
	/** Indicates whether or not the set used as the root of the lattice is simplicial (hyper-triangular) or not. */
	def isSimplicial() {
		// Empty and unbounded sets can never be null.
		if (rootInfo.isEmpty) {
			return false
		}
		if (!rootInfo.isBounded) {
			return false
		}
		
		// A set of dimensionality n is a simplex if and only if it has exactly n+1 vertices.
		// Note: dimensionality is calculated such that it indicates the fewest dimensions needed
		// to express the set. I.e., if the set is a 2D surface in 3D space, the dimensionality will be 2.
		val zeroFaces = lattice.get(0)
		if (zeroFaces === null) {
			return false
		}
		if (zeroFaces.size != rootInfo.dimensionality + 1) {
			return false
		}
		return true
	}
	
	/** Contains useful information about a set. */
	@Data
	static class SetInfo {
		/** The dimensionality of the set. */
		int dimensionality
		
		/** The equality constraints defining the set. */
		ISLMatrix equalities
		
		/** The number of index variables in the set's space. */
		int indexCount
		
		/** The inequality constraints which involve at least one index variable. */
		ISLMatrix indexInequalities
		
		/** The number of index inequalities. */
		int indexInequalityCount
		
		/** Whether or not the set is bounded, or unbounded. */
		boolean isBounded
		
		/** Whether or not the set is empty, or contains at least one point. */
		boolean isEmpty
		
		/** The number of equality constraints which involve only parameter variables. */
		int parameterEqualityCount
		
		/** The inequality constraints which only involve parameter variables. */
		ISLMatrix parameterInequalities
		
		/** The indices of the inequalities which were saturated to form this set. */
		ArrayList<Integer> saturatedInequalityIndices
		
		/** The space that the set resides in. */
		ISLSpace space
		
		/** Extract the information from the given set, assuming that no constraints were saturated to form it. */
		new(ISLBasicSet basicSet) { this(basicSet, new ArrayList<Integer>(0)) }
		
		/** Extract the information from the given set. */
		new(ISLBasicSet basicSet, ArrayList<Integer> saturatedInequalityIndices) {
			equalities = DomainOperations.toISLEqualityMatrix(basicSet)
			indexCount = basicSet.dim(ISLDimType.isl_dim_set)
			indexInequalities = getInequalities(basicSet, indexCount, true)
			indexInequalityCount = indexInequalities.nbRows
			isBounded = basicSet.bounded
			isEmpty = basicSet.empty
			parameterEqualityCount = countParameterConstraints(equalities, indexCount)
			parameterInequalities = getInequalities(basicSet, indexCount, false)
			this.saturatedInequalityIndices = saturatedInequalityIndices
			space = basicSet.space 

			dimensionality = dimensionality(equalities, indexCount)
		}
		
		/** Saturates the given index inequalities from the ancestor to form a potential face. */
		def static createFace(SetInfo ancestor, ArrayList<Integer> toSaturate) {
			// Create the new equalities matrix by taking the ancestor's index inequality constraints,
			// dropping any which are not to be saturated (leaving only the ones to saturate),
			// then combining it with the ancestor's equality constraints.
			val saturatedInequalities =
				(ancestor.indexInequalityCount >.. 0)
				.reject[row | toSaturate.contains(row)]
				.fold(ancestor.indexInequalities.copy, [mat, row | mat.dropRows(row, 1)])
			val equalities = ancestor.equalities.copy.concat(saturatedInequalities)
			
			// Create the new inequalities matrix by taking the acestor's index inequality constraints
			// and dropping any which were saturated, leaving only the non-saturated ones,
			// then combining it with the ancestor's parameter inequality constraints.
			val indexInequalities =
				(ancestor.indexInequalities.nbRows >.. 0)
				.filter[row | toSaturate.contains(row)]
				.fold(ancestor.indexInequalities.copy, [mat, row | mat.dropRows(row, 1)])
			val inequalities = indexInequalities.concat(ancestor.parameterInequalities.copy)
			
			// Construct a basic set from these matrices, plus info from the ancestor,
			// and use that to extract the desired information.
			val basicSet = ISLBasicSet.fromConstraintMatrices(
					ancestor.space.copy, equalities, inequalities,
					ISLDimType.isl_dim_param, ISLDimType.isl_dim_set,
					ISLDimType.isl_dim_div, ISLDimType.isl_dim_cst)
				.removeRedundancies
			return new SetInfo(basicSet, toSaturate)
		}
		
		/** Returns <code>true</code> if this set is a child face of the given set, and <code>false</code> otherwise. */
		def isChildOf(SetInfo other) {
			// This set must saturate exactly one more constraint than the other set.
			if (saturatedInequalityIndices.size != 1 + other.saturatedInequalityIndices.size) {
				return false
			}
			
			// All constraints saturated by the other set must also be saturated in this set.
			if (!other.saturatedInequalityIndices.forall[saturatedInequalityIndices.contains(it)]) {
				return false
			}
			
			// There must only be exactly one constraint in this set which is not saturated by the other set.
			val notSaturatedCount = saturatedInequalityIndices.reject[other.saturatedInequalityIndices.contains(it)].size
			if (notSaturatedCount != 1) {
				return false
			}
			
			return true
		}
		
		/** Returns <code>true</code> if this set is a valid face of the given set, and <code>false</code> otherwise. */
		def isValidFace(SetInfo startingSetInfo) {
			// Faces cannot be empty.
			if (isEmpty) {
				return false
			}

			// Faces cannot have more equality constraints involving only parameters than the starting set.
			if (parameterEqualityCount > startingSetInfo.parameterEqualityCount) {
				return false
			}
						
			return true
		}
		
		/** Creates a basic set from this information. */
		def toBasicSet() {
			val allInequalities = indexInequalities.copy.concat(parameterInequalities.copy)
			return ISLBasicSet.fromConstraintMatrices(
					space.copy, equalities.copy, allInequalities,
					ISLDimType.isl_dim_param, ISLDimType.isl_dim_set,
					ISLDimType.isl_dim_div, ISLDimType.isl_dim_cst)
				.removeRedundancies
		}
		
		/** Returns a string indicating which inequalities were saturated to form this face. */
		override toString() { return "{" + saturatedInequalityIndices.join(',') + "}" }
		
		/** Checks if the row of a constraint matrix has a non-zero coefficient for at least one index dimension. */
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
		
		/** Counts the number of constraints which involve only parameter variables. */
		def private static countParameterConstraints(ISLMatrix matrix, int indexCount) {
			return (0 ..< matrix.nbRows)
				.reject[row | constraintInvolvesIndex(matrix, row, indexCount)]
				.size
		}
		
		/** Returns the dimensionality of a set using the equality constraints and number of index variables. */
		def private static dimensionality(ISLMatrix equalities, int indexCount) {
			// The dimensionality of a set is defined as the number of index variables
			// minus the number of linearly independent equality constraints which involve
			// at least one index variable (the rank of said matrix).
			
			// Take the set of equality constraints,
			// drop any rows which do not involve at least one constraint,
			// then compute the rank of the remaining matrix.
			val linearlyIndependentIndexEqualities =
				(equalities.nbRows >.. 0)
				.reject[row | constraintInvolvesIndex(equalities, row, indexCount)]
				.fold(equalities.copy(), [mat, row | mat.dropRows(row, 1)])
				.rank

			return indexCount - linearlyIndependentIndexEqualities
		}
		
		/**
		 * Gets a matrix of inequality constraints from a set.
		 * Retrieves either only the constraints which involve at least one index variable,
		 * or only the constraints which only involve parameter variables.
		 */
		def private static getInequalities(ISLBasicSet startingSet, int indexCount, boolean getIndexConstraints) {
			// Start with a list of all rows of the inequality matrix.
			// This must be in reverse order so dropping rows doesn't affect how they are numbered. 
			// Skip any rows that we want to keep.
			// For example, if we want to keep the index rows, skip it if the row contains an index.
			// Finally, starting with the original matrix, drop all necessary rows.
			val inequalities = DomainOperations.toISLInequalityMatrix(startingSet)
			return (inequalities.nbRows >.. 0)
				.filter[row | getIndexConstraints != constraintInvolvesIndex(inequalities, row, indexCount)]
				.toList
				.fold(inequalities, [mat, row | mat.dropRows(row, 1)])
		}
	}
}
