package git;

import java.io.IOException;

public class tester {

	public static void main(String[] args) throws IOException {
		Blob b = new Blob (".\\Git Prereq\\something.txt");
		System.out.println(b.encryptThisString("abcdefg"));

	}

}
