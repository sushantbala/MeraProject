package ChaloStart;

import java.util.Arrays;

public class MergeArray {
	
	public static void Merge(int[] inputArray1, int[] inputArray2) {
		
		int finalLength = inputArray1.length + inputArray2.length;
		int[] finalArray = new int[finalLength];
		int pos = 0;
		
		for(int element: inputArray1)
		{
			finalArray[pos] = element;
			pos++;
		}
		
		for(int element: inputArray2)
		{
			finalArray[pos] = element;
			pos++;
		}
		
		System.out.println(Arrays.toString(finalArray));
		
	}

	public static void main(String[] args) {
   	
		Merge(new int[] {1,2,3} , new int[] {4,5,6});
     
	}

}
