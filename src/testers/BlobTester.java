package testers;

import java.io.*;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import git.Blob;





class BlobTester {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		File file = new File("file.txt");
		FileWriter f = new FileWriter (file);
		f.write ("hello file zero how are you doing");
		f.close();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		File f = new File ("file.txt");
		f.delete();
	}

	@Test
	void testBlob() throws NoSuchAlgorithmException, IOException {
		Blob blob = new Blob("file.txt");
		String Sha = blob.getName();
		assertTrue(new File("tester/objects/" + Sha).exists());
	}

}
