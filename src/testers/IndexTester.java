package testers;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import git.Index;

class IndexTester {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		File file = new File("file.txt");
		FileWriter f = new FileWriter (file);
		f.write ("hello file zero how are you doing");
		f.close();
		
		File file1 = new File("file1.txt");
		FileWriter fi = new FileWriter (file1);
		fi.write ("hello file one how are you doing");
		fi.close();
		
		File file2 = new File("file2.txt");
		FileWriter fil = new FileWriter (file2);
		fil.write ("hello file two how are you doing");
		fil.close();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		File f = new File ("file.txt");
		f.delete();
		File f1 = new File ("file1.txt");
		f1.delete();
		File f2 = new File ("file2.txt");
		f2.delete();
	}

	@Test
	void testInit() {
		assertTrue(new File("tester/objects").exists() && new File("tester/index.txt").exists());
	}
	
	@Test
	void testIndex() throws Exception {
		Index i = new Index();
		i.init();
		i.add ("file.txt");
//		Blob blobby = new Blob ("file.txt");
		//String fileSha = blobby.getName();
	
		i.add("file1.txt");
		//Blob blo = new Blob ("file1.txt");
		//String fileSha1 = blo.getName();
	
		i.add ("file2.txt");
		//Blob b = new Blob ("file2.txt");
		//String fileSha2 = b.getName();
	}

}
