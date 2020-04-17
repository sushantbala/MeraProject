package ChaloStart;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesInAString {
	
	public static void duplicateString(String inputString) {
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.replaceAll("\\s", "").toCharArray();
		
		
		for(char c:strArray) {
			
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else 
				charCountMap.put(c, 1);
		}
		
		Set<Character> charInString = charCountMap.keySet();
		
		for(Character ch:charInString) {
			
			System.out.println(ch + ":" + charCountMap.get(ch));
		//	if(charCountMap.get(ch) > 1)
		//	{
		//		System.out.println(ch + " " + charCountMap.get(ch));
			//}
		}
	}

	public static void main(String[] args) {
		
           duplicateString("RAKSHA");
	}

}
