package git;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Index {
	//private boolean bool = false;
	private HashMap hm;
	String fn;
	
	public Index (String str) throws IOException {
//		File file = new File("/Users/asher/eclipse-workspace/Git Prereq");
//		//creating the directory
//		bool = file.mkdir();
		fn=str;
		hm = new 
	}
	
	public void init() throws IOException {
		makeFile("/Users/asher/eclipse-workspace/Git Prereq/index.txt");
		Blob blobby = new Blob (fn);
	}
	
	public void add() {
		
	}
	
	private void makeFile(String s) throws IOException {
		Path newFilePath = Paths.get(s);
	    Files.createFile(newFilePath);
	}
}
