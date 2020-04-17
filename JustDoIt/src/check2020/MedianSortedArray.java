package check2020;

import java.util.Arrays;

public class MedianSortedArray {

	public static void main(String[] args) {
    
	 int[] arr = {1, 3, 4, 2, 7, 5, 8, 6};
     double median =  medianArray(arr);
     System.out.println(median);

	}

	private static double medianArray(int[] inputarr) {
		Arrays.sort(inputarr);
		int len = inputarr.length;
		if(inputarr.length % 2 != 0) {
			return (double) inputarr[len/2];
		}
		else 
			return (double) (inputarr[(len-1)/2] + inputarr[len/2])/2;
	}

}
