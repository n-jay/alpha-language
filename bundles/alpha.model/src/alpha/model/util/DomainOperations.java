package alpha.model.util;

import alpha.model.matrix.MatrixOperations;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLBasicSet;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMatrix;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;

public class DomainOperations {
	
	private DomainOperations() {}

	

	public static JNIISLMatrix toISLEqualityMatrix(JNIISLBasicSet bset) {
		return bset.getEqualityMatrix(
				JNIISLDimType.isl_dim_param, 
				JNIISLDimType.isl_dim_set,
				JNIISLDimType.isl_dim_div, 
				JNIISLDimType.isl_dim_cst);
	}
	
	public static JNIISLMatrix toISLEqualityMatrix(JNIISLSet set) {
		if (set.getNbBasicSets() != 1)
			throw new IllegalArgumentException("[DomainOperations] toISLEqualityMatrix assumes a single polyhedron.");
		
		JNIISLBasicSet bset = set.getBasicSetAt(0);
		
		return toISLEqualityMatrix(bset);
	}
	
	public static JNIISLMatrix toISLInequalityMatrix(JNIISLBasicSet bset) {
		return bset.getInequalityMatrix(
				JNIISLDimType.isl_dim_param, 
				JNIISLDimType.isl_dim_set,
				JNIISLDimType.isl_dim_div, 
				JNIISLDimType.isl_dim_cst);
	}
	
	public static JNIISLMatrix toISLInequalityMatrix(JNIISLSet set) {
		if (set.getNbBasicSets() != 1)
			throw new IllegalArgumentException("[DomainOperations] toISLInequalityMatrix assumes a single polyhedron.");
		
		JNIISLBasicSet bset = set.getBasicSetAt(0);
		
		return toISLInequalityMatrix(bset);
	}

	public static long[][] kernelOfLinearPart(JNIISLBasicSet bset) {
		if (bset.getNbDims(JNIISLDimType.isl_dim_div) != 0)
			throw new IllegalArgumentException("[DomainOperations] kernelOfLinearPart assumes a domain with out div dimensions.");

		JNIISLMatrix ineqMat = toISLInequalityMatrix(bset);
		JNIISLMatrix eqMat = toISLEqualityMatrix(bset);
		long[][] ineqArray = toLongArray(ineqMat, true);
		long[][] eqArray = toLongArrayFromEqualityMatrix(eqMat, true);
		
		long[][] array = MatrixOperations.rowBind(ineqArray, eqArray);
		
		return MatrixOperations.nullspace(array);
	}
	
	public static long[][] kernelOfLinearPart(JNIISLSet set) {
		if (set.getNbBasicSets() != 1)
			throw new IllegalArgumentException("[DomainOperations] kernelOfLinearPart assumes a single polyhedron.");
		
		JNIISLBasicSet bset = set.getBasicSetAt(0);
		
		return kernelOfLinearPart(bset);
	}
	
	public static long[][] toLongArray(JNIISLMatrix mat, boolean linearPartOnly) {
		final int nbcols = linearPartOnly?mat.getNbCols()-1:mat.getNbCols();
		
		long[][] array = new long[mat.getNbRows()][nbcols];
		for (int r = 0; r < mat.getNbRows(); r++) {
			for (int c = 0; c < nbcols; c++) {
				array[r][c] = mat.getElement(r, c);
			}
		}
		
		return array;
	}
	
	public static long[][] toLongArrayFromEqualityMatrix(JNIISLMatrix mat, boolean linearPartOnly) {
		long[][] pos = toLongArray(mat, linearPartOnly);
		
		if (pos.length == 0)
			return pos;
		
		long[][] array = MatrixOperations.rowBind(pos, MatrixOperations.scalarMultiplication(pos, -1));
		
		return array;
	}
	
}
