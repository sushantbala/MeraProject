package ChaloStart;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ConvertStringToInteger {
	
	static void convertString(String inputString) {
		int asciiOfA = (int) 'a';
		byte asciiOfB = 'B';
	    System.out.println(asciiOfA);
	    System.out.println(asciiOfB);
	    
	    // Method 1 
	    
	    StringBuilder sb = new StringBuilder();
	    char[] letters = inputString.toCharArray();
	    for(char ch:letters) {
	    	sb.append((byte)ch);
	    }
	    System.out.println(sb.toString());
	    
	    // Method 2
	    
	    byte[] characters = inputString.getBytes(StandardCharsets.US_ASCII);
	    String asciiString = Arrays.toString(characters);
	    System.out.println(asciiString);
	    
	}
		

	public static void main(String[] args) {
		
         convertString("ABHI");
	}

}
