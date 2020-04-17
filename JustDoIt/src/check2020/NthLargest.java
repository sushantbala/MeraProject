package check2020;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NthLargest {

	public static void main(String[] args) {
		
		Integer [] arr = {1, 23, 12, 9, 
                30, 2, 50};
		int k=3;
		nLargest(arr,k);

	}

	private static void nLargest(Integer[] arr,int k) {
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(arr[k-1]);
			
		
	}

}
