package alpha.model.matrix.factory;

import java.util.Arrays;
import java.util.List;

import alpha.model.matrix.Matrix;
import alpha.model.matrix.MatrixFactory;
import alpha.model.matrix.MatrixRow;
import alpha.model.matrix.Space;

/**
 * User factory for Matrix objects. All uses of matrices should be through these methods.
 * 
 * @author tyuki
 *
 */
public class MatrixUserFactory {

	public static Matrix createMatrix(String[] paramNames, String[] indexNames) {
		return createMatrix(Arrays.asList(paramNames), Arrays.asList(indexNames));
	}
	
	/**
	 * Create a matrix with number of columns derived from the parameters and indices.
	 * Assumes that there will be an additional column for the constants.
	 * 
	 * @param paramNames
	 * @param indexNames
	 * @return
	 */
	public static Matrix createMatrix(List<String> paramNames, List<String> indexNames) {
		return createMatrix(paramNames, indexNames, false);
	}
	

	/**
	 * Create a matrix with number of columns derived from the parameters and indices.
	 * The boolean argument controls if an additional columns for constants are included or not.
	 * 
	 * @param paramNames
	 * @param indexNames
	 * @param linearPartOnly
	 * @return
	 */
	public static Matrix createMatrix(List<String> paramNames, List<String> indexNames, boolean linearPartOnly) {
		Matrix mat = MatrixFactory.eINSTANCE.createMatrix();
		Space space = MatrixFactory.eINSTANCE.createSpace();
		
		space.getParamNames().addAll(paramNames);
		space.getIndexNames().addAll(indexNames);

		mat.setSpace(space);
		mat.setLinearPartOnly(linearPartOnly);
		
		return mat;
	}
	
	/**
	 * Create a matrix row with given initial values.
	 * 
	 * @param vals
	 * @return
	 */
	public static MatrixRow createMatrixRow(long[] vals) {
		MatrixRow row = MatrixFactory.eINSTANCE.createMatrixRow();
		
		for (long v : vals) {
			row.getValues().add(v);
		}
		
		return row;
	}
	
	/**
	 * Create a zero-filled matrix row of the given size.
	 * 
	 * @param nCols
	 * @return
	 */
	public static MatrixRow createMatrixRow(int nCols) {
		MatrixRow row = MatrixFactory.eINSTANCE.createMatrixRow();
		
		for (int i = 0; i < nCols; i++) {
			row.getValues().add(0l);
		}
		
		return row;
	}
}
