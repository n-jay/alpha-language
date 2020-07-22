package alpha.targetmapping;

import java.io.File;

import alpha.model.AlphaModelSaver;
import alpha.targetmapping.util.TMAShow;
import alpha.targetmapping.util.TMShow;

public class TargetMappingSaver {

	public static void Save(TargetMapping tm, File file) {
		AlphaModelSaver.writeToFile(file, TMShow.print(tm).toString());
	}

	public static void ASave(TargetMapping tm, File file) {
		AlphaModelSaver.writeToFile(file, TMAShow.print(tm).toString());
	}

	public static void Save(TargetMapping tm, String filename) {
		AlphaModelSaver.writeToFile(filename, TMShow.print(tm).toString());
	}

	public static void ASave(TargetMapping tm, String filename) {
		AlphaModelSaver.writeToFile(filename, TMAShow.print(tm).toString());
	}
}
