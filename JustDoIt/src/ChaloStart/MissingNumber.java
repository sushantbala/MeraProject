package ChaloStart;

public class MissingNumber {
	
	static int missing(int[] inputArray) {
		int number=0;
		int n = inputArray.length;
		int total = (n+1)*(n+2)/2;
		 for(int i = 0;i<n;i++) {
			 total -= inputArray[i];
		 }
		
		
		return total;
	}

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,6};
		System.out.println(missing(inputArray));
	}

}
