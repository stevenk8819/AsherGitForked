package testers;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import git.Tree;

class TreeTester {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	void testTree() throws Exception {
		ArrayList<String> strs = new ArrayList<String>();
		String check="";

		strs.add("tree : 7a6ef001667f196bbd53f73f4ef2448bbb68b860 orangutan");
		strs.add("tree : 4d66eaab0e57944aca8e8b56f9fec5e31906768a ravioli");
		strs.add("blob : a131ecfc68b736a3752c410d62f4876853d7dca6 orange");
		strs.add("tree : f13b4e31340d09c061b8f89288242810e1c9bf89 poodle");
		strs.add("blob : 9226ae3a96d73e882b27cd3c34058402338b93b4 cheeto");		
		strs.add("tree : 271e0cb0a6eae52c9e56c72c1a7ec5707c49a064 spine");		
		strs.add("blob : e6829fa026e73b1f6ae9ebecfc9ef9175d3a7bf9 cheese");		
		strs.add("blob : e05673ed46f7d6cbf8634064f2870b39bf957e5f >x<");

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
		BufferedReader br = new BufferedReader (new FileReader ("objects/7694e541e12cc00ef9a75b3aa171e707eceb8d5d"));
		String contents = "";
		while (br.ready()) {
			contents+=br.readLine();
			System.out.println(contents);
			contents = ""; 
		}
		

//		if (check.equals(contents)) {
//			System.out.println(contents);
//		}

	}

}
