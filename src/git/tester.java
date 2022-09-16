package git;

import java.io.IOException;

public class tester {

	public static void main(String[] args) throws IOException {
		//Blob b = new Blob ("/Users/asher/eclipse-workspace/Git Prereq/something.txt");
//		System.out.println(b.encryptThisString("abcdefg"));
		Index i = new Index();
		i.init();
		i.add("/Users/asher/eclipse-workspace/Git Prereq/something.txt");
		i.remove("/Users/asher/eclipse-workspace/Git Prereq/something.txt");
	}

}
