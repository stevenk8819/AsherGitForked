package git;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Commit {
	
	private String pTree;
	private String summary;
	private String author;
	private Commit next;
	private Commit previous;

	public Commit(String pt, String sum, String a, Commit prev) {
		pTree=pt;
		summary=sum;
		author=a;
		previous = prev;
		previous.setNext(this);
		next = null;
	}
	
	public Commit (String sum, String a) {
		pTree=null;
		summary = sum;
		author = a;
	}
	
	public String getSha () {
		String str = pTree+""+summary;
		return encryptThisString (str);
	}
	
	 public static String encryptThisString(String input)
	    {
	        try {
	            // getInstance() method is called with algorithm SHA-1
	            MessageDigest md = MessageDigest.getInstance("SHA-1");
	 
	            // digest() method is called
	            // to calculate message digest of the input string
	            // returned as array of byte
	            byte[] messageDigest = md.digest(input.getBytes());
	 
	            // Convert byte array into signum representation
	            BigInteger no = new BigInteger(1, messageDigest);
	 
	            // Convert message digest into hex value
	            String hashtext = no.toString(16);
	 
	            // Add preceding 0s to make it 32 bit
	            while (hashtext.length() < 32) {
	                hashtext = "0" + hashtext;
	            }
	 
	            // return the HashText
	            return hashtext;
	        }
	 
	        // For specifying wrong message digest algorithms
	        catch (NoSuchAlgorithmException e) {
	            throw new RuntimeException(e);
	        }
	    }

	public Object getDate() { 
		return java.time.LocalDate.now(); 
	}
	
	public String getPreviousFileName() { 
		if (previous!=null) {
			return previous.getSha(); 
		}
		return null; 
	}
	
	public String getNext() { 
		if (next!=null) {
			return next.getSha(); 
		}
		return null;
	}

	private void setNext(Commit nx) { 
		next = nx; 
	}
	
//	public void writeFile () {
//		
//	}
}


