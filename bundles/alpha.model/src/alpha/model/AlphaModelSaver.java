package alpha.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import alpha.model.util.AShow;
import alpha.model.util.Show;

public class AlphaModelSaver {

	public static void Save(AlphaRoot root, File file) {
		writeToFile(file, Show.print(root));
	}
	public static void ASave(AlphaRoot root, File file) {
		writeToFile(file, AShow.print(root));
	}
	public static void Save(AlphaRoot root, String filename) {
		writeToFile(filename, Show.print(root));
	}
	public static void ASave(AlphaRoot root, String filename) {
		writeToFile(filename, AShow.print(root));
	}
	

	
	public static void writeToFile(String filename, String content) {
        String fname = filename;
        if (!filename.startsWith("/") && !filename.startsWith("./") && !filename.startsWith("../")) {
                fname = "./"+filename;
        }   

        File file = new File(fname);
        writeToFile(file, content);
	}
	
	public static void writeToFile(File file, String content) {
        if (!file.exists() && !(new File(file.getParent()).exists())) {
                new File(file.getParent()).mkdirs();
        }   
        try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write(content);
                bw.flush();
                bw.close();
        } catch (IOException e) {
                throw new RuntimeException("Error while writing to " + file);
        }  
	}
}
