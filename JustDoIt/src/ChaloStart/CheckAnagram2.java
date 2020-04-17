package ChaloStart;

import java.util.Arrays;
import java.util.HashMap;

// This is using sort and equals method

public class CheckAnagram2 {
	
	
	static void isAnagram(String s1, String s2) {
		
		String copyOfs1 = s1.replaceAll("\\s","");
		String copyOfs2 = s2.replaceAll("\\s","");
		
		boolean status = true;
		
		if(copyOfs1.length()!=copyOfs2.length())
			status = false;
		
		char[] s1Array = copyOfs1.toLowerCase().toCharArray();
		char[] s2Array = copyOfs2.toLowerCase().toCharArray();
		
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		status = Arrays.equals(s1Array, s2Array);
		
		if(status) 
			System.out.println("Yes it is Anagram");
			else
			System.out.println("No it is not Anagram");
		
		
	}
	 
	// This is using java iterative method
	
	static void isAnagram2(String s1, String s2) {
		
		String copyOfs1 = s1.replaceAll("\\s","").toLowerCase();
		String copyOfs2 = s2.replaceAll("\\s","").toLowerCase();
		
		boolean status = true;
		
		if(copyOfs1.length()!=copyOfs2.length()) {
			status = false;
		}
			
		char[] s1ToArray = copyOfs1.toCharArray();
		
		for(char c : s1ToArray)
		{
			int index = copyOfs2.indexOf(c);
			if (index != -1)
			{
				copyOfs2= copyOfs2.substring(0, index) + copyOfs2.substring(index+1,copyOfs2.length());
			}
			else
				status = false;
			    break;
			
		}
		if(status) 
			System.out.println("YASSSSS");
			else
			System.out.println("NOOOOOO");
		
	}
	
	static void isAnagram3(String s1,String s2) {
		
		String copyOfs1 = s1.replaceAll("\\s","").toLowerCase();
		String copyOfs2 = s2.replaceAll("\\s","").toLowerCase();
		
		boolean status = true;
		
		if(copyOfs1.length() != copyOfs2.length()) {
			status = false;
		}
		
		else 
		{
			HashMap<Character, Integer> map = new HashMap<Character,Integer>();
			
			for(int i =0; i< copyOfs1.length(); i++)
			{
				char charAsKey = copyOfs1.charAt(i);
				
				int charCountAsValue = 0;
				
				if(map.containsKey(charAsKey))
				{
					charCountAsValue = map.get(charAsKey);
				}
				
				map.put(charAsKey, ++charCountAsValue);
				
				 charAsKey = copyOfs2.charAt(i);
				 
				 charCountAsValue = 0;
				 
				 if(map.containsKey(charAsKey))
					{
						charCountAsValue = map.get(charAsKey);
					}
					
					map.put(charAsKey, --charCountAsValue);
			} 
					for (int value: map.values())
					{
						if(value != 0)
						{
							status = false;
						}
					}
				 
			}
			if(status) 
				System.out.println("HAI");
				else
				System.out.println("NAHI HAI");
		}
			
			
		
	

	public static void main(String[] args) {
		
		isAnagram("Mother In Law", "Hitler Woman");
		isAnagram2("Mother In Law", "Hitler Woman"); 
		isAnagram3("Mother In Law", "Hitler Woman");
 
	}

}
