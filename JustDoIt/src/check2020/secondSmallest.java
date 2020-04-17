package check2020;

public class secondSmallest {

	public static void main(String[] args) {

        secondSmallestNumber(new int [] {5,7,3,1,8});
       

	}

	
	 private static void  secondSmallestNumber(int [] inputArray) {
		 int temp;
		 for(int i = 0;i<inputArray.length;i++) {
			 for(int j = i+1;j<inputArray.length;j++) {
				 
				 if (inputArray[i] > inputArray[j]) {
					 
					 temp = inputArray[i];
					 inputArray[i] = inputArray[j];
					 inputArray[j] = temp;
					 
				 }
			 }
		 }
		 System.out.println(inputArray[1]);
	 }
		
}