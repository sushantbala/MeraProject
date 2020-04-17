package check2020;

import java.util.HashMap;
import java.util.Map;

public class CountOfChars {

	public static void main(String[] args) {

      String str = "India is best";
      countChars(str);
      

	}

	private static void countChars(String str) {
		int count =0;
		String inputStr = str.replaceAll("\\s","").toLowerCase();
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		char[] ch = inputStr.toCharArray();
		for(Character ch1 :ch) {
			if(hmap.containsKey(ch1)) 
				hmap.put(ch1, hmap.get(ch1)+1);
				else
					hmap.put(ch1, 1);	
		}
		
		for(Map.Entry<Character, Integer> entry : hmap.entrySet() ) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
