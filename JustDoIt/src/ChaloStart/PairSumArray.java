package ChaloStart;

import java.util.Arrays;

public class PairSumArray {
	
	//Time Complexity of this solution is O(n^2)
	
	public static void sumArray(int[] inputArray,int n) {
		
		System.out.println("Input Array is :" + Arrays.toString(inputArray));
		System.out.println("Sum looking for from pair of elements is : " +n);
		
		for(int i = 0;i<inputArray.length;i++) {
			
			for(int j =i+1;j<inputArray.length;j++) {
				
				int sum = inputArray[i] + inputArray[j];
				
				if(sum == n ) {
					
				int[] outputArray = {inputArray[i],inputArray[j]};
					System.out.println(Arrays.toString(outputArray));
					
				}
			}
		}
	}
	
	
	public static void sumArray1(int[] inputArray,int n) {
		
		
		System.out.println("Input Array is :" + Arrays.toString(inputArray));
		System.out.println("Sum looking for from pair of elements is : " +n);
		Arrays.sort(inputArray);
		
		int i = 0 ; int j = inputArray.length-1;
		
		while(i<j) {
			
			if(inputArray[i] + inputArray[j] == n) {
				System.out.println(inputArray[i] + " , " + inputArray[j]);
				i++;
				j--;
			}  
				else if(inputArray[i] + inputArray[j] < n) {
					i++;
					}
				else if(inputArray[i] + inputArray[j] > n) {
					j--;
				}
				
			
		}
	}

	public static void main(String[] args) {
		
	//	sumArray(new int[] {0,7,4,5,3,6,1,9,8} , 9);
		sumArray1(new int[] {0,7,4,5,3,6,1,9,8} , 9);
	}

}
