package check2020;

import java.util.HashSet;

public class ArraySumMatch {

	public static void main(String[] args) {

     sumArray(new int[] {1,2,5,3,4,0},5);

	}

	
	private static void sumArray(int[] inputArray, int sum) {
		int temp;
		HashSet<Integer> abc = new HashSet<Integer>();
		for(int i= 0; i<inputArray.length;i++) {
			temp=sum - inputArray[i];
			if(abc.contains(temp)) {
				System.out.println("Pair of numbers which add to " + sum + " is (" + inputArray[i] +" , "+temp+")");
			}
			abc.add(inputArray[i]);
		}
		
		
	}
}
