package check2020;

public class KeyElementSortedRotated {

	public static void main(String[] args) {
		
		int [] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		int key = 9;
		int h = arr.length;
		int l=0;
		int value = findKey(arr,l,h-1,key);
		System.out.println(value);

	}

	private static int findKey(int[] arr,int l,int h, int key) {
		
		
		
		int mid = (h+l)/2;
		if (arr[mid] == key)
			return mid;
		
		if(arr[l] <= arr[mid]) {
			
			if(key>= arr[l] && key <=arr[mid])
				return findKey(arr,l,mid-1,key);
			return findKey(arr,mid+1,h,key);
		}
		
		if(key >= arr[mid] && key<=arr[h]) 
			return findKey(arr,mid+1,h,key);
			return findKey(arr,l,mid-1,key);
			
		
	}

}
