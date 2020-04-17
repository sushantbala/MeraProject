package check2020;

public class MaxConsecutive1 {

	public static void main(String[] args) {

       int number= MaxConsc1(new int[] {1, 1, 0, 0, 1, 0, 
                1, 0, 1, 1, 1, 1});
       System.out.println(number);

	}

	private static int MaxConsc1(int [] inputArray) {
		
		int max = 0;
		int count = 0;
		
		for(int i=0;i<inputArray.length;i++) {
			if (inputArray[i]==1) {
				count++;
			}
			else if (inputArray[i]!=1 && count > max)
			
				max = count;
			
		}
		
		return max;
	}
}
