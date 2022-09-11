package git;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Index {
	//private boolean bool = false;
	private File ind;
	
	public Index () throws IOException {
//		File file = new File("/Users/asher/eclipse-workspace/Git Prereq");
//		//creating the directory
//		bool = file.mkdir();
		makeFile("/Users/asher/eclipse-workspace/Git Prereq/objects/index.txt");
		
	}
	
	private void makeFile(String s) throws IOException {
		Path newFilePath = Paths.get(s);
	    Files.createFile(newFilePath);
	}
}
