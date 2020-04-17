package check2020;

import java.util.Arrays;

public class MissingInAnArray {

	public static void main(String[] args) {

         int missingNumber =  missingNumber(new int[] {1,2,4,6,3,7});
         System.out.println(missingNumber);
	}

	private static int missingNumber(int[] inputArray) {
		
		int n = inputArray.length;
		int x1 = inputArray[0];
		int x2 = 1;
		for (int i =1; i<inputArray.length;i++)  
			 x1= x1 ^ inputArray[i];
		
		for (int j =2; j<=n+1;j++) 
			 x2 = x2 ^ j;
			
		return (x1 ^ x2);
		 
		
	}
}
