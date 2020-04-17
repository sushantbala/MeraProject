package check2020;

import java.util.HashMap;
import java.util.Map;

public class countOfNumbers {

	public static void main(String[] args) {

      numbersCount(new int[] {10, 20, 20, 10, 10, 20, 5, 20});

	}

	private static void numbersCount(int[] inputArray) {
		int max=0;
		int count=0;
		int res = 0;
		Map<Integer,Integer> newMap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<inputArray.length;i++) {
			 
			if(newMap.containsKey(inputArray[i])) {
				newMap.put(inputArray[i], count++);
			}
			else
				newMap.put(inputArray[i], 1);
		}
		
	  for(	Map.Entry<Integer, Integer> entry : newMap.entrySet()) {
		  System.out.println(entry.getKey() + " " + entry.getValue());  
		  
		  if (entry.getValue() > max) {
			   
			  res= entry.getKey();
			  max = entry.getValue();
		  }
			  
		  
	  }
	  System.out.println(res);
	  
	     
		
		
	}

	
	
}
