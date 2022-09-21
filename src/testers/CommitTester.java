package testers;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import git.Commit;

class CommitTester {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		String pt = "objects/a2171e373994fc81baaf616df0c4a9c8b3566048.txt";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	void test() throws IOException {
		String pt = "objects/a2171e373994fc81baaf616df0c4a9c8b3566048.txt";
		Commit c1 = new Commit (pt, "summary 1", "Asher", null);
		Commit c2 = new Commit (pt, "summary 2", "ARoss", c1);
		System.out.println (c2.getDate());
		c1.writeFile();
	}

}
