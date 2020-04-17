package check2020;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccuringChar {

	public static void main(String[] args) {

	      String str = "India is best";
	      countChars(str);
	      

		}

		private static void countChars(String str) {
			int max = 0;
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
			
			Set<Entry<Character,Integer>> charsInString = hmap.entrySet();
			
			int maxCount =0;
			char maxChar =0;
			
			for(Entry<Character,Integer> entry: hmap.entrySet()) {
				if (entry.getValue() > maxCount) {
					maxCount = entry.getValue();
					maxChar = entry.getKey();
				}
			}
			
			System.out.println(maxChar+" : "+maxCount);
		}

}
