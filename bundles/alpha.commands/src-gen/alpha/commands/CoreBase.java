package alpha.commands;

/*PROTECTED REGION ID(CoreBase_Imports) ENABLED START*/
//Add custom imports here
import java.io.IOException;
import alpha.model.AlphaModelLoader;
/*PROTECTED REGION END*/

import alpha.model.AlphaRoot;
import java.util.List;
import alpha.model.AlphaRoot;
import alpha.model.AlphaVisitable;


public class CoreBase {
	public static AlphaRoot ReadAlpha(String file) {
		/*PROTECTED REGION ID(Core.ReadAlpha_) ENABLED START*/
		try {
			AlphaRoot root = AlphaModelLoader.loadModel(file);
			return root;
		} catch (IOException e) {
			throw new RuntimeException("IOException: " + e.getMessage());
		}
		/*PROTECTED REGION END*/
	}
	public static List<AlphaRoot> ReadAlphaBundle(String file) {
		/*PROTECTED REGION ID(Core.ReadAlphaBundle_) ENABLED START*/
		try {
			List<AlphaRoot> roots = AlphaModelLoader.loadModelDir(file);
			return roots;
		} catch (IOException e) {
			throw new RuntimeException("IOException: " + e.getMessage());
		}
		/*PROTECTED REGION END*/
	}
	public static void Show(AlphaVisitable node) {
		/*PROTECTED REGION ID(Core.Show_) ENABLED START*/
		CharSequence s = alpha.model.util.Show.print(node);
		System.out.println(s);
		/*PROTECTED REGION END*/
	}
	public static void AShow(AlphaVisitable node) {
		/*PROTECTED REGION ID(Core.AShow_) ENABLED START*/
		CharSequence s = alpha.model.util.AShow.print(node);
		System.out.println(s);
		/*PROTECTED REGION END*/
	}
	public static void Save(AlphaRoot root, String filename) {
		/*PROTECTED REGION ID(Core.Save_) ENABLED START*/
		Utility.WriteToFile(filename, alpha.model.util.Show.print(root));
		/*PROTECTED REGION END*/
	}
	public static void ASave(AlphaRoot root, String filename) {
		/*PROTECTED REGION ID(Core.ASave_) ENABLED START*/
		Utility.WriteToFile(filename, alpha.model.util.AShow.print(root));
		/*PROTECTED REGION END*/
	}
	public static void Normalize(AlphaVisitable node) {
		/*PROTECTED REGION ID(Core.Normalize_) ENABLED START*/
		alpha.model.transformation.Normalize.apply(node, false);
		/*PROTECTED REGION END*/
	}
	public static void DeepNormalize(AlphaVisitable node) {
		/*PROTECTED REGION ID(Core.DeepNormalize_) ENABLED START*/
		alpha.model.transformation.Normalize.apply(node, true);
		/*PROTECTED REGION END*/
	}
}
