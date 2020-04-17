package check2020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstDuplicateElem {

	public static void main(String[] args) {
		
		int arr [] = {10, 5, 3, 4, 3, 5, 6};
		System.out.println(findNumber(arr));
		

	}

	private static int findNumber(int[] arr) {
		
		HashSet<Integer> hset = new HashSet<>();
		
		int min = -1;
		for(int i = arr.length-1; i >=0;i--) {
			if(hset.contains(arr[i]))
				min = i;
			else
			hset.add(arr[i]);
		}
		return arr[min];
		
		
	}
	
}
