package git;

import java.math.BigInteger;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.*;

public class Tree {
 
private	ArrayList<String> strings = new ArrayList<String>();
	
	public Tree (ArrayList<String> input) throws Exception{
		this.strings = input;
		File file = new File("tester/objects"); 
		file.mkdir();
		createFile();
	}
	
	
	public String encryptThisString (String value) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		 MessageDigest md = MessageDigest.getInstance("SHA-1");
         md.reset();
         md.update(value.getBytes("UTF-8"));
         return new BigInteger (1, md.digest()).toString(16);
	}
	
	public void createFile() throws Exception {
		String file = "";
		String file1 ="";
		
		
		for (int i = strings.size(); i > 0; i--) {
			file = file + strings.get(i);
			if (i - 1 != 0) {
				file += "\n";
			}
			
					}
		
		
		String stSha = encryptThisString(file);
		File file3 = new File("tester/objects/" + stSha);
		
		PrintWriter pw = new PrintWriter(file3);
		 
		
		for (int i = strings.size(); i > 0; i--) {
			pw.println(strings.get(i));
		}
		pw.close();
		
	}
	

	
	
	public static void main (String[]args) throws Exception{
		
		ArrayList<String> strs = new ArrayList<String>();
		
		strs.add("tree : 7a6ef001667f196bbd53f73f4ef2448bbb68b860");
		
		strs.add("tree : 4d66eaab0e57944aca8e8b56f9fec5e31906768a");
		
		strs.add("blob : a131ecfc68b736a3752c410d62f4876853d7dca6");
		
		strs.add("tree : f13b4e31340d09c061b8f89288242810e1c9bf89");
	
		strs.add("blob : 9226ae3a96d73e882b27cd3c34058402338b93b4");
		
		strs.add("tree : 271e0cb0a6eae52c9e56c72c1a7ec5707c49a064");
		
		strs.add("blob : e6829fa026e73b1f6ae9ebecfc9ef9175d3a7bf9");
		
		strs.add("blob : e05673ed46f7d6cbf8634064f2870b39bf957e5f");
		
		
		Tree TREE = new Tree(strs);
	
		
		
		
	}
}