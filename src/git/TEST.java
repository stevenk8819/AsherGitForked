package git;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TEST {
private static Path path;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		File file = new File("file.txt");
		path = file.toPath();
		File writer fi = new FileWriter (file);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		Files.delete(path);
	}

	
	

	@Test
	void test() {
		fail("Not yet implemented");
	

	Blob blobby = new Blob ("file.txt");
	Blob blo = new Blob ("axewgwggksjjk");
	Blob b = new Blob ("axek");
	Index i = new Index ();
	i.init();
	File folder = new File("Objects");
	ArrayList<String> fileNames = new ArrayList<String>(Arrays.asList(folder.list()));
	fileNames.contains("Objects");
	
	String blobby = blobby.getName();
	String blob = blo.getName();
	String b = b.getName()
	i.add(blobby);
	
	
	File fo = new File(blob);
	ArrayList<String> fileNams = new ArrayList<String>(Arrays.asList(fo.list()));
	fileNams.contains(blob);
}

	
	i.add(blo);
	i.add(b);
	
	i.remove(blo);
	
	File fol = new File(blo);
	ArrayList<String> fileNam = new ArrayList<String>(Arrays.asList(fo.list()));
	fileNams.contains(blo);
}
