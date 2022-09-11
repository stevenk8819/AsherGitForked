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
	private Blob blobby;
	
	public Index (String str) throws IOException {
//		File file = new File("/Users/asher/eclipse-workspace/Git Prereq");
//		//creating the directory
//		bool = file.mkdir();
		makeFile("/Users/asher/eclipse-workspace/Git Prereq/index.txt");
		blobby = new Blob (str);
	}
	
	private void makeFile(String s) throws IOException {
		Path newFilePath = Paths.get(s);
	    Files.createFile(newFilePath);
	}
}
