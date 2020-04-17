package check2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String str = "Facebook is boring";
		duplicate(str);

	}

	private static void duplicate(String str) {
		int count =0;
		String str1 =str.replaceAll("\\s","").toLowerCase();
		//System.out.println(str1);
		char[] ch = str1.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(char c:ch) {
			
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}
			else
				hmap.put(c, 1);
		}
		
		Set<Character> charsInString = hmap.keySet();
		
		for(Character ch1:charsInString ) {
			if(hmap.get(ch1) >1) {
				System.out.println(ch1);
			}
		
		}
		
	}

}
