package alpha.testframework;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import alpha.model.AlphaModelLoader;
import alpha.model.AlphaNameUniquenessChecker;
import alpha.model.AlphaRoot;
import alpha.model.util.PrintAST;

public class Driver {
	
	
	public static void main(String[] args) {
//	@Test
//	public void test() {
		
//		singleFile("resources/src-alpha/basic/ANN.alpha");
//		directory("resources/src-alpha/basic/matmult.unit");
		singleFile("resources/src-alpha/domain/domain4.alpha");
		
	}
	
	private static void singleFile(String filename) {
		try {
			AlphaRoot root = AlphaModelLoader.loadModel(filename);
			//AlphaRoot root = AlphaModelLoader.loadModel("/Users/tyuki/projects/Alpha/alpha-language/bundles/alpha.testframework/resources/src-alpha/basic/ANN.alpha");
			
			System.out.println(PrintAST.print(root));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private static void directory(String dirname) {
		try {
			List<AlphaRoot> roots = AlphaModelLoader.loadModelDir(dirname);
			AlphaNameUniquenessChecker.check(roots);
			
			for (AlphaRoot root : roots) {
				System.out.println(PrintAST.print(root));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
