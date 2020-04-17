package check2020;

public class LeadersInArray {

	public static void main(String[] args) {

        leaderArray(new int[] {16,17,4,3,5,2});
        leaderArray2(new int[] {16,17,4,3,5,2});
	}

	private static void leaderArray(int[] inputArray) {
		
		for(int i =0; i<inputArray.length;i++) {
			int j;
			for(j=i;j<inputArray.length;j++) {
				if(inputArray[i] < inputArray[j]) 
			    	 break;	
			}
		     
			if(j==inputArray.length)
				System.out.print(inputArray[i] + " ");
				
		}
	}
	
private static void leaderArray2(int[] inputArray) {
		
		int max = inputArray[inputArray.length-1];
	//	int i = inputArray.length-2;
		int x = 2;
		for(int i =inputArray.length-x;i<inputArray.length-1;x++) {
			if (inputArray[i] < max)
				break;
			else max = inputArray[i];
		}
		System.out.println(max);
	}
}
