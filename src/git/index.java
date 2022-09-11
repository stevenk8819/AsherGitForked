package git;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Index {
	//private boolean bool = false;
	private HashMap<String, String> hm;
	
	public Index () throws IOException {
//		File file = new File("/Users/asher/eclipse-workspace/Git Prereq");
//		//creating the directory
//		bool = file.mkdir();
		hm = new HashMap<>();
	}
	
	public void init() throws IOException {
		makeFile("/Users/asher/eclipse-workspace/Git Prereq/index.txt");
	}
	
	public void add(String fn) throws IOException {
		Blob blobby = new Blob (fn);
		hm.put(fn.substring(42), blobby.getName());
		FileWriter fw = new FileWriter("/Users/asher/eclipse-workspace/Git Prereq/index.txt");
		fw.write(fn.substring(42)+" : "+blobby.getName());
		fw.close();
	}
	
	private void makeFile(String s) throws IOException {
		Path newFilePath = Paths.get(s);
	    Files.createFile(newFilePath);
	}
}
