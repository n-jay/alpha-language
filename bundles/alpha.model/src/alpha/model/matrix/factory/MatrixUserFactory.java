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
	 * 
	 * @param paramNames
	 * @param indexNames
	 * @return
	 */
	public static Matrix createMatrix(List<String> paramNames, List<String> indexNames) {
		Matrix mat = MatrixFactory.eINSTANCE.createMatrix();
		Space space = MatrixFactory.eINSTANCE.createSpace();
		
		space.getParamNames().addAll(paramNames);
		space.getIndexNames().addAll(indexNames);

		mat.setSpace(space);
		
		return mat;
	}

	public static Matrix createLinearPartOnlyMatrix(String[] paramNames, String[] indexNames) {
		return createLinearPartOnlyMatrix(Arrays.asList(paramNames), Arrays.asList(indexNames));
	}

	public static Matrix createLinearPartOnlyMatrix(List<String> paramNames, List<String> indexNames) {
		Matrix mat = createMatrix(paramNames, indexNames);
		mat.setLinearPartOnly(true);
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
