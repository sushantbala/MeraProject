package ChaloStart;

public class SecondSmallestInteger {
	
	static void smallest2integer(int arr[]) {
		
		int first,second,arr_size=arr.length; 
		first = second = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < first) {
				second = first;
				first = arr[i];
				}
			
			else if(arr[i] < second && arr[i]!=first) {
				second = arr[i];
			}
		}
			
			if (second == Integer.MAX_VALUE) {
				System.out.println("There is no second smallest value");
			}
			
			else
				System.out.println("Smallest number is:" +first + " Second smallest number is " +second);
			
		
		
	}

	public static void main(String[] args) {
		
		smallest2integer(new int[] {1,3,1,10,20});
		
	}

}
