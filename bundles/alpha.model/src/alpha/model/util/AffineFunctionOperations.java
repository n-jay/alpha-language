package alpha.model.util;

import java.util.ArrayList;
import java.util.List;

import alpha.model.matrix.LinearAlgebraException;
import alpha.model.matrix.Matrix;
import alpha.model.matrix.MatrixOperations;
import alpha.model.matrix.MatrixRow;
import alpha.model.matrix.factory.MatrixUserFactory;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLBasicSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLConstraint;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMap;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLPWMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSpace;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLVal;

/**
 * This class contains operations over JNIISLMultiAff, which is the ISL view of affine functions.
 * There are some important operations over affine functions for Alpha that are not
 * available in ISL. These operations have been implemented in MatrixOperations (originally from polymodel)
 * based on the matrix view of the affine function. This class exposes methods for performing these operations
 * directly on JNI objects, taking care of the conversions to/from matrices.
 * 
 * Note that the matrix view must have everything made explicit. The affine function (i,j->i,j) in
 * Alpha notation in fact has implicit dimensions for preserving the parameters. In fact, parameters
 * are just another set of indices; if there is a parameter named N, the function is actually (N,i,j->N,i,j).
 * 
 * The matrix view is represented as instances of the Matrix class in alpha.model.matrix.
 * 
 * @author tyuki
 *
 */
public class AffineFunctionOperations {

	

	/**
	 * Converts isl_multi_aff to {@link Matrix}.
	 * 
	 * The columns are in the following order: parameters, indices, constant.
	 * 
	 * @param maff
	 * @return
	 */
	public static Matrix toMatrix(JNIISLMultiAff maff) {
		return toMatrix(maff, false);
	}
	
	public static Matrix toLinearPartOnlyMatrix(JNIISLMultiAff maff) {
		return toMatrix(maff, true);
	}
	

	/**
	 * Converts JNIISLMultiAff into Matrix. The matrix is [A|b] of the
	 * Ax + b representation of the function. When the linearPartOnly
	 * flag is true it only returns the A matrix.
	 * 
	 * @param maff
	 * @param linearPartOnly
	 * @return
	 */
	private static Matrix toMatrix(JNIISLMultiAff maff, boolean linearPartOnly) {
		final List<String> params = maff.getSpace().getNameList(JNIISLDimType.isl_dim_param);
		final List<String> indices = maff.getSpace().getNameList(JNIISLDimType.isl_dim_in);
		final int nbParam = params.size();
		final int nbIndices =  indices.size();

		Matrix mat = MatrixUserFactory.createMatrix(params, indices, linearPartOnly);
				
		final int nbColumns = mat.getNbColumns();
		
		//Add the implicit parameters
		for (int i = 0; i < nbParam; i++) {
			MatrixRow row = MatrixUserFactory.createMatrixRow(nbColumns);
			row.setValue(i, 1);
			mat.getRows().add(row);
		}
	
		for (JNIISLAff aff : maff.getAffs()) {
			//Only handles affine
			if (aff.getDenominator() != 1) throw new RuntimeException("Quasi-Affine Functions are not handled");
			if (aff.getNbDims(JNIISLDimType.isl_dim_div)>0) throw new RuntimeException("Quasi-Affine Functions are not handled");
			
			long[] row = new long[nbColumns];
			//parameters come first
			for (int pi = 0; pi < nbParam; pi++) {
				JNIISLVal val = aff.getCoefficientVal(JNIISLDimType.isl_dim_param, pi);
				row[pi] = val.asLong();
			}
			//indices next; offset by nbParam
			for (int i = 0; i < nbIndices; i++) {
				JNIISLVal val = aff.getCoefficientVal(JNIISLDimType.isl_dim_in, i);
				row[i+nbParam] = val.asLong();
			}
			//constant
			if (!linearPartOnly) {
				long constant = aff.getConstantVal().asLong();
				row[nbParam+nbIndices] = constant;
			}
			
			mat.getRows().add(MatrixUserFactory.createMatrixRow(row));
			
		}
		
		return mat;
	}
	
	/**
	 * Detect equalities in the given set and represent it as a {@link Matrix}.
	 * 
	 * This is used for inverse in context. The only relevant information from
	 * the context is the equalities, which is computed with affine hull and then
	 * converted to matrix representation.  
	 * 
	 * @param set
	 * @return
	 */
	private static Matrix toEqualityMatrix(JNIISLSet set) {

		JNIISLBasicSet bset = set.affineHull();
		
		final List<String> params = bset.getSpace().getNameList(JNIISLDimType.isl_dim_param);
		final List<String> indices = bset.getSpace().getNameList(JNIISLDimType.isl_dim_set);
		final int nbParam = params.size();
		final int nbIndices =  indices.size();

		Matrix mat = MatrixUserFactory.createMatrix(params, indices);
		
		for (JNIISLConstraint aff : bset.getConstraints()) {
			//Only handles affine
			if (aff.getNbDims(JNIISLDimType.isl_dim_div)>0) throw new RuntimeException("Quasi-Affine Functions are not handled");
			
			long[] row = new long[mat.getNbColumns()];
			//parameters come first
			for (int pi = 0; pi < nbParam; pi++) {
				JNIISLVal val = aff.getCoefficientVal(JNIISLDimType.isl_dim_param, pi);
				row[pi] = val.asLong();
			}
			//indices next; offset by nbParam
			for (int i = 0; i < nbIndices; i++) {
				JNIISLVal val = aff.getCoefficientVal(JNIISLDimType.isl_dim_set, i);
				row[i+nbParam] = val.asLong();
			}
			//constant
			long constant = aff.getConstantVal().asLong();
			row[nbParam+nbIndices] = constant;
			
			mat.getRows().add(MatrixUserFactory.createMatrixRow(row));
			
		}
		
		return mat;
	}
	
	/**
	 * Inverse in Context computes a left inverse of the given affine function in a context.
	 * 
	 * The context is the domain where the inverse should be valid in. When the validity
	 * domain contains equations, affine functions that do not admit an inverse in the 
	 * universal domain may have inverse. When null is passed as context, it assumes 
	 * the universe. 
	 * 
	 * @param maff
	 * @param context
	 * @param names
	 * 
	 * @throws LinearAlgebraException when the function does not have an inverse
	 * 
	 * @return
	 */
	public static JNIISLMultiAff inverseInContext(JNIISLMultiAff maff, JNIISLSet context, List<String> names) {
		Matrix thisMat = toMatrix(maff);
		final int numInvIndices = thisMat.getNbRows() - thisMat.getNbParams();
		
		//Matrix form of the mapping, add the implicit identity of parameters
		int nColumn = thisMat.getNbColumns();
		assert(nColumn > 0);
		
		final long[][] invArray;
		if (context == null) {
			long[][] matArray = thisMat.toArray();
			invArray = MatrixOperations.getInverseInContext(matArray, null);
		} else {
			Matrix eqMat = toEqualityMatrix(context);
			long[][] matArray = thisMat.toArray();
			long[][] eqArray = eqMat.toArray();
			invArray = MatrixOperations.getInverseInContext(matArray, eqArray);
		}
	
		if (invArray == null) {
			throw new RuntimeException("No inverse found for function:" + maff);
		}
		if (names == null) {
			names = new ArrayList<String>(numInvIndices);
			for (int i=0; i<numInvIndices; i++) {
				names.add("x"+i);
			}
		} else if (names.size() != numInvIndices) {
			throw new RuntimeException("Number of index names for the inverse function does not match the number of dimensions.");
		}
		Matrix invMat = MatrixOperations.toMatrix(invArray, thisMat.getSpace().getParamNames(), names);
		
		
		return invMat.toMultiAff();
	}
	
	/**
	 * Tests if an affine function is uniform by first converting it to matrix form
	 * and then testing if the linear part of the matrix is identity.
	 * 
	 * @param f
	 * @return
	 */
	public static boolean isUniform(JNIISLMultiAff f) {
		if (f.getNbDims(JNIISLDimType.isl_dim_in) != f.getNbDims(JNIISLDimType.isl_dim_out))
			return false;
		
		Matrix m = toMatrix(f);
		
		boolean uniform = true;
		for (int r = 0; r < m.getNbRows(); r++) {
			for (int c = 0; c < m.getNbRows(); c++) {
				if (r==c) uniform &= m.getValue(r, c) == 1;
				else uniform &= m.getValue(r, c) == 0;
			}
		}
		
		
		return uniform;
	}
	
	/**
	 * Returns b of the Ax + b representation.
	 * 
	 * @param f
	 * @return
	 */
	public static List<Long> getConstantVector(JNIISLMultiAff f) {
		Matrix m = toMatrix(f);
		
		List<Long> b = new ArrayList<>(m.getNbRows());
		final int lastC = m.getNbColumns()-1;
		for (MatrixRow r : m.getRows()) {
			b.add(r.getValue(lastC));
		}
		
		return b;
	}

	public static JNIISLMultiAff createUniformFunction(JNIISLSpace space, List<Long> b) {
		final List<String> params = space.getNameList(JNIISLDimType.isl_dim_param);
		final List<String> indices = space.getNameList(JNIISLDimType.isl_dim_in);
		
		Matrix mat = MatrixUserFactory.createMatrix(params, indices);
		final int nbColumns = mat.getNbColumns();
		
		for (int d=0; d<b.size(); d++) {
			MatrixRow row = MatrixUserFactory.createMatrixRow(nbColumns);
			row.setValue(d, 1);
			row.setValue(nbColumns-1, b.get(d));
			mat.getRows().add(row);
		}
		
		return mat.toMultiAff();
	}
	
	/**
	 * Computes the kernel of the given affine function.
	 * 
	 * The output is a set of basis vectors that span the null space.
	 * (Each column of the output matrix is a basis vector)
	 * 
	 * @param f
	 * @return
	 */
	public static long[][] computeKernel(JNIISLMultiAff f) {
		Matrix mat = AffineFunctionOperations.toLinearPartOnlyMatrix(f);
		long[][] array = mat.toArray();
		return MatrixOperations.nullspace(array);
	}
	
	/**
	 * Returns a function that is a negation of the input uniform function.
	 * The method checks if the function is actually uniform or not along the way.
	 * 
	 * This method does not consume f.
	 * 
	 * @param f
	 * @return
	 */
	public static JNIISLMultiAff negateUniformFunction(JNIISLMultiAff f) {
		if (f.getNbDims(JNIISLDimType.isl_dim_in) != f.getNbDims(JNIISLDimType.isl_dim_out))
			throw new RuntimeException("The input function is not uniform.");
		
		Matrix m = toMatrix(f);
		
		boolean uniform = true;
		for (int r = 0; r < m.getNbRows(); r++) {
			for (int c = 0; c < m.getNbRows(); c++) {
				if (r==c) uniform &= m.getValue(r, c) == 1;
				else uniform &= m.getValue(r, c) == 0;
			}
			int lastCol = m.getNbColumns()-1;
			m.setValue(r, lastCol, -1*m.getValue(r, lastCol));
		}
		if (!uniform) {
			throw new RuntimeException("The input function is not uniform.");
		}
		
		
		JNIISLMultiAff negF = m.toMultiAff();
		return AlphaUtil.renameIndices(negF, f.getSpace().getNameList(JNIISLDimType.isl_dim_in));
	}
	
	/**
	 * Tests if f1 is in the kernel of f2
	 * 
	 * @param f1
	 * @param f2
	 * @return
	 */
	public static boolean isInKernelOf(JNIISLMultiAff f1, JNIISLMultiAff f2) {
		if (!f1.getSpace().isEqual(f2.getSpace())) 
			throw new RuntimeException("[AffineFunctionOperations] Incompatible space given to isKernelOf: " + f1 + " " + f2);
		
		final int nbParam = f1.getNbDims(JNIISLDimType.isl_dim_param);
		long[][] f1Array = toLinearPartOnlyMatrix(f1).toArray();
		long[][] f2Array = toLinearPartOnlyMatrix(f2).toArray();
		long[][] f2Kernel = MatrixOperations.transpose(MatrixOperations.nullspace(f2Array));
		
		//add implicit parameters
		f2Kernel = MatrixOperations.rowBind(f2Kernel, MatrixOperations.submatrixRow(f1Array, 0, nbParam-1));
		
		//kernel rank + parameters is the baseline
		final int origRank = f2Kernel.length;
		
		//if rank does not increase with the dependence expressions, then the dependences are in the kernel
		f2Kernel = MatrixOperations.rowBind(f2Kernel, MatrixOperations.submatrixRow(f1Array, nbParam, f1Array.length-1));
		
		final int rank = MatrixOperations.getRank(f2Kernel);
		
		return origRank == rank;
	}

	/**
	 * Check if Ker(f1) \in Ker(f2).
	 * Throw an exception if Ker(f1) and Ker(f2) lives on different space
	 */
	public static boolean kernelInclusion(JNIISLMultiAff f1, JNIISLMultiAff f2) {
		if (!f1.getDomainSpace().isEqual(f2.getDomainSpace())) 
			throw new RuntimeException("[AffineFunctionOperations] Incompatible space given to kernelInclusion: " + f1 + " " + f2);

		long[][] f1Array = toLinearPartOnlyMatrix(f1).toArray();
		long[][] f2Array = toLinearPartOnlyMatrix(f2).toArray();
		
		return MatrixOperations.inclusionKernel(f1Array, f2Array);
	}
	
	/**
	 * Given a matrix representing basis vectors, constructs an affine function that have the given space
	 * as its kernel. The input kernel is assumed to be in the transposed form where each row is a vector.
	 * This method also requires the list of parameters and index names to be provided.
	 * 
	 * @param params
	 * @param indices
	 * @param kernelT
	 * @return
	 */
	public static JNIISLMultiAff constructAffineFunctionWithSpecifiedKernel(List<String> params, List<String> indices, long[][] kernelT) {
		if (kernelT == null || kernelT.length == 0)
			throw new IllegalArgumentException("[AffineFunctionOperations] Expecting non-trivial kernel.");
		if (params == null || indices == null || params.size() + indices.size() < kernelT[0].length)
			throw new IllegalArgumentException("[AffineFunctionOperations] Required parameter and/or index names are not provided.");
		
		final int ncols = kernelT[0].length - params.size();
		long[][] paramIdentity = MatrixOperations.createIdentity(params.size(), kernelT[0].length);
		long[][] exSEp = MatrixOperations.rowBind(paramIdentity, kernelT);
		long[][] fp = MatrixOperations.transpose(MatrixOperations.nullspace(exSEp));
		Matrix mat = MatrixOperations.toMatrix(fp, params, indices.subList(0, ncols), true, true);
		return (mat).toMultiAff();
	}
	
	/**
	 * Computes the projection of the domain of f by the projection function p.
	 * This requires ker(p) \in ker(f) to be valid.
	 * 
	 * Since the dimension names after projection are set to null by ISL, 
	 * default index names are set to avoid null dimension names.
	 * 
	 * @param f
	 * @param p
	 * @return
	 */
	public static JNIISLMultiAff projectFunctionDomain(JNIISLMultiAff f, JNIISLMultiAff p) {
		JNIISLMap projectedF = f.toMap().applyDomain(p.toMap());
		for (int i = 0; i < projectedF.getNbIns(); i++) {
			projectedF = projectedF.setDimName(JNIISLDimType.isl_dim_in, i, "i"+i);
		}
		return AffineFunctionOperations.mapToMultiAff(projectedF);
	}
	
	/**
	 * Checks the map corresponds to a function and returns the function.
	 * This method should be moved to JNIISL with the next update.
	 * FIXME
	 * 
	 * @param map
	 * @return
	 */
	private static JNIISLMultiAff mapToMultiAff(JNIISLMap map) {
		JNIISLPWMultiAff pwmaff = map.toPWMultiAff();
		if (pwmaff.getNbPieces() != 1)
			throw new IllegalArgumentException("[AffineFunctionOperations] Expecting map with a single piece.");
		
		return pwmaff.getPiece(0).getMaff();
	}
}
