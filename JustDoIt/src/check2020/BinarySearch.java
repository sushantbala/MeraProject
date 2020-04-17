package check2020;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {2, 3, 4, 10, 40};
		int key = 10;
		int index =searchNumber(arr,key);
		System.out.println(index);

	}

	private static int searchNumber(int[] arr, int key) {
		int high = arr.length-1;int low=0;
		while(low < high)
		{
			int mid = (low+high)/2;
			
			if (arr[mid]==key)
				return mid;
			
			if (arr[mid] < key) 
				low = mid+1;
				else 
				high = mid-1;
			
		}
		return -1;
		
		
	}

}
