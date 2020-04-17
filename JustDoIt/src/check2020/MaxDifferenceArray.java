package check2020;

// Maximum difference between two elements such that larger element appears after the smaller number

public class MaxDifferenceArray {

	public static void main(String[] args) {
		
		differenceArray(new int[] {2, 1, 10, 6, 4, 8, 1});
	}

	private static void differenceArray(int[] inputArray) {
		int diff=0;
		int max=0;
		int abcd;
		for(int i=0;i<inputArray.length;i++) {
			
			for(int j=i+1;j<inputArray.length;j++) {
				
				if (inputArray[j] > inputArray[i]) {
					 
					diff = inputArray[j] - inputArray[i];
					if (diff > max)
					{
						//abcd = diff;
						max = diff;
					}
				}
			}
		}
		System.out.println(max);
		
	}

	

}
