package check2020;

import java.util.Arrays;

public class ThreeNoProduct {

	public static void main(String[] args) {
		
		int arr [] = {-10, -3, 5, 6, -20};
		int n = arr.length;
		System.out.println(checkMax(arr,n)); 

	}

	private static int checkMax(int[] arr, int n) {
		
		Arrays.sort(arr);
		 if(n<3)
			 return -1;
		 
		 return Math.max(arr[n-1]*arr[n-2]*arr[n-3],arr[0]*arr[1]*arr[n-1]);	
	}

}
