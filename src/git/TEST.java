package git;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class TEST {
private static Index index;
private static File file, file1, file2;
	

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

//	@Test
//	void testCommit() throws IOException {
//		String pt = "objects/a2171e373994fc81baaf616df0c4a9c8b3566048.txt";
//		Commit c1 = new Commit (pt, "summary 1", "Asher", null);
//		Commit c2 = new Commit (pt, "summary 2", "ARoss", c1);
//		c1.writeFile();
//	}
//	
//	@Test
//	void testBlob() throws NoSuchAlgorithmException, IOException {
//		Blob blob = new Blob("file.txt");
//		String Sha = blob.getName();
//		assertTrue(new File("tester/objects/" + Sha).exists());
//	}
//	
//	@Test
//	void testInit() {
//		assertTrue(new File("tester/objects").exists() && new File("tester/index.txt").exists());
//	}
//	
//	@Test
//	void testIndex() throws Exception {
//		Index i = new Index();
//		i.init();
//		i.add ("file.txt");
//		//Blob blobby = new Blob ("file.txt");
//		//String fileSha = blobby.getName();
//	
//		i.add("file1.txt");
//		//Blob blo = new Blob ("file1.txt");
//		//String fileSha1 = blo.getName();
//	
//		i.add ("file2.txt");
//		//Blob b = new Blob ("file2.txt");
//		//String fileSha2 = b.getName();
//	}

//	
//	//File folder = new File("tester/Objects");
//	//ArrayList<String> fileNames = new ArrayList<String>();
//	//ArrayList<String> fileNames = new ArrayList<String>();
////	if (!fileNames.contains(fileSha) || !fileNames.contains(fileSha1) ||!fileNames.contains(fileSha2))
////	{
////		fail ("fail");
////	}
//	
//	
//	Index.remove("file.txt");
//	
//	
//	//File fol = new File("tester/objects");
//	//ArrayList<String> fileNam = new ArrayList<String>();
//	//fileNam.contains(fileSha);
//	
////	Scanner scanner = new Scanner("tester/index.txt");
////	int count = 3;
////	while (scanner.hasNextLine()) {
////		count= count - 1;
////		scanner.nextLine();
////	}
////	scanner.close();
////	if (count!=1) {
////		fail("fail");
////	}
	
	@Test
	
	void testTree() throws Exception {
		ArrayList<String> strs = new ArrayList<String>();
		String check="";
		
		strs.add("tree : 7a6ef001667f196bbd53f73f4ef2448bbb68b860");
		strs.add("tree : 4d66eaab0e57944aca8e8b56f9fec5e31906768a");
		strs.add("blob : a131ecfc68b736a3752c410d62f4876853d7dca6");
		strs.add("tree : f13b4e31340d09c061b8f89288242810e1c9bf89");
		strs.add("blob : 9226ae3a96d73e882b27cd3c34058402338b93b4");		
		strs.add("tree : 271e0cb0a6eae52c9e56c72c1a7ec5707c49a064");		
		strs.add("blob : e6829fa026e73b1f6ae9ebecfc9ef9175d3a7bf9");		
		strs.add("blob : e05673ed46f7d6cbf8634064f2870b39bf957e5f");
		
		for (int i = strs.size()-1; i>=0; i--) {
			check+=strs.get(i);
			if (i-1!=0) {
				check+="\n";
			}
		}
		
		Tree t = new Tree(strs);
		
		if (t.getFN().equals("977c519ee897a9606a835cfec54313da864731b3")) {
			System.out.println("name");
		}
		BufferedReader br = new BufferedReader (new FileReader ("objects/977c519ee897a9606a835cfec54313da864731b3"));
		String contents = "";
		while (br.ready()) {
			contents+=br.readLine();
		}
		
		if (check.equals(contents)) {
			System.out.println("contents");
		}
		
	}
}

