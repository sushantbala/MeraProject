package check2020;

import java.util.HashMap;
import java.util.Map;

//Given an array of positive integers. 
//All numbers occur even number of times except one number which occurs odd number of times
public class OddNumberOftTimes {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		
		oddNoOfTimes(arr);

	}

	private static void oddNoOfTimes(int[] inputArray) {
         int count=0;
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        
		for(int i =0;i<inputArray.length;i++) {
			
			if (hmap.containsKey(inputArray[i])) {
				count = hmap.get(inputArray[i]);
				hmap.put(inputArray[i], count+1);
			}
				 
			else
				hmap.put(inputArray[i], 1);
				
		}
		
		for(Integer a :hmap.keySet()) {
			
			if(hmap.get(a) % 2 != 0)
				System.out.println(a);
			
		}
	}

}
