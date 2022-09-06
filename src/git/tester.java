package git;

import java.io.IOException;

public class tester {

	public static void main(String[] args) throws IOException {
		Blob b = new Blob ("/Users/asher/eclipse-workspace/Git Prereq");
		System.out.println(b.encryptThisString("abcdefg"));

	}

}
