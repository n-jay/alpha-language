package alpha.model.util;

import alpha.model.matrix.MatrixOperations;
import fr.irisa.cairn.jnimap.isl.ISLBasicSet;
import fr.irisa.cairn.jnimap.isl.ISLDimType;
import fr.irisa.cairn.jnimap.isl.ISLMatrix;
import fr.irisa.cairn.jnimap.isl.ISLSet;

public class DomainOperations {
	
	private DomainOperations() {}

	

	public static ISLMatrix toISLEqualityMatrix(ISLBasicSet bset) {
		return bset.getEqualityMatrix(
				ISLDimType.isl_dim_param, 
				ISLDimType.isl_dim_set,
				ISLDimType.isl_dim_div, 
				ISLDimType.isl_dim_cst);
	}
	
	public static ISLMatrix toISLEqualityMatrix(ISLSet set) {
		if (set.getNbBasicSets() != 1)
			throw new IllegalArgumentException("[DomainOperations] toISLEqualityMatrix assumes a single polyhedron.");
		
		ISLBasicSet bset = set.getBasicSetAt(0);
		
		return toISLEqualityMatrix(bset);
	}
	
	public static ISLMatrix toISLInequalityMatrix(ISLBasicSet bset) {
		return bset.getInequalityMatrix(
				ISLDimType.isl_dim_param, 
				ISLDimType.isl_dim_set,
				ISLDimType.isl_dim_div, 
				ISLDimType.isl_dim_cst);
	}
	
	public static ISLMatrix toISLInequalityMatrix(ISLSet set) {
		if (set.getNbBasicSets() != 1)
			throw new IllegalArgumentException("[DomainOperations] toISLInequalityMatrix assumes a single polyhedron.");
		
		ISLBasicSet bset = set.getBasicSetAt(0);
		
		return toISLInequalityMatrix(bset);
	}

	public static long[][] kernelOfLinearPart(ISLBasicSet bset) {
		if (bset.dim(ISLDimType.isl_dim_div) != 0)
			throw new IllegalArgumentException("[DomainOperations] kernelOfLinearPart assumes a domain with out div dimensions.");

		ISLMatrix ineqMat = toISLInequalityMatrix(bset);
		ISLMatrix eqMat = toISLEqualityMatrix(bset);
		long[][] ineqArray = toLongArray(ineqMat, true);
		long[][] eqArray = toLongArrayFromEqualityMatrix(eqMat, true);
		
		long[][] array = MatrixOperations.rowBind(ineqArray, eqArray);
		
		return MatrixOperations.nullspace(array);
	}
	
	public static long[][] kernelOfLinearPart(ISLSet set) {
		if (set.getNbBasicSets() != 1)
			throw new IllegalArgumentException("[DomainOperations] kernelOfLinearPart assumes a single polyhedron.");
		
		ISLBasicSet bset = set.getBasicSetAt(0);
		
		return kernelOfLinearPart(bset);
	}
	
	public static long[][] toLongArray(ISLMatrix mat, boolean linearPartOnly) {
		final int nbcols = linearPartOnly?mat.getNbCols()-1:mat.getNbCols();
		
		long[][] array = new long[mat.getNbRows()][nbcols];
		for (int r = 0; r < mat.getNbRows(); r++) {
			for (int c = 0; c < nbcols; c++) {
				array[r][c] = mat.getElement(r, c);
			}
		}
		
		return array;
	}
	
	public static long[][] toLongArrayFromEqualityMatrix(ISLMatrix mat, boolean linearPartOnly) {
		long[][] pos = toLongArray(mat, linearPartOnly);
		
		if (pos.length == 0)
			return pos;
		
		long[][] array = MatrixOperations.rowBind(pos, MatrixOperations.scalarMultiplication(pos, -1));
		
		return array;
	}
	
}
