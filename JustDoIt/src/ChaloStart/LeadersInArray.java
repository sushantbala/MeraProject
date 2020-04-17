package ChaloStart;

import java.util.Arrays;

public class LeadersInArray {
	
	static void topperInArray(int inputarray[]) {
		
		int length = inputarray.length;
		int max=inputarray[length-1];
		System.out.println("The leaders in "+Arrays.toString(inputarray)+" are : ");
		System.out.println(max);
		
		for(int i =inputarray.length-2;i>=0;i--) {
			
			if (inputarray[i] > max) {
				
				System.out.println(inputarray[i]);
				max = inputarray[i];
				
			}
		}
		
	}

	public static void main(String[] args) {
	
		topperInArray(new int[] {12, 9, 7, 14, 8, 6, 3});

		topperInArray(new int[] {8, 23, 19, 21, 15, 6, 11});
  
		topperInArray(new int[] {55, 67, 71, 57, 51, 63, 38});
  
		topperInArray(new int[] {21, 58, 44, 14, 51, 36, 23});
      
	}

}
