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
	private Blob blobby;
	
	public Index (String str) throws IOException {
//		File file = new File("/Users/asher/eclipse-workspace/Git Prereq");
//		//creating the directory
//		bool = file.mkdir();
		hm = new HashMap<>();
	}
	
	public void init() throws IOException {
		makeFile("/Users/asher/eclipse-workspace/Git Prereq/index.txt");
		blobby = new Blob (fn);
		
	}
	
	public void add(String fn) throws IOException {
		hm.put(fn.substring(41), blobby.getName());
		FileWriter fw = new FileWriter("/Users/asher/eclipse-workspace/Git Prereq/index.txt");
		fw.write(fn.substring(41)+" : "+blobby.getName());
		fw.close();
	}
	
	private void makeFile(String s) throws IOException {
		Path newFilePath = Paths.get(s);
	    Files.createFile(newFilePath);
	}
}
