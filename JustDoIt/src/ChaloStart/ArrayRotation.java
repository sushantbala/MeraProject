package ChaloStart;

import java.util.Arrays;

public class ArrayRotation {
	
	private static void leftRotate(int[] inputArray, int n) {
		System.out.println("Array elements before rotation");
		System.out.println(Arrays.toString(inputArray));
	
    int temp;
    
    for(int i=0; i<n; i++) {
    	 
    	temp = inputArray[0];
    	
    	for (int j=0; j<inputArray.length-1;j++) {
    		
    		inputArray[j] = inputArray[j+1];
    	}
    	
    	inputArray[inputArray.length-1] = temp;
    }
    System.out.println("Array elements after rotation");
	System.out.println(Arrays.toString(inputArray));
		
	}
	
    private static void rightRotate(int[] inputArray, int n) {
    	System.out.println("Array elements before rotation");
		System.out.println(Arrays.toString(inputArray));
	
		int temp;
		
		for(int i=0; i<n;i++) {
			
			temp = inputArray[inputArray.length-1];
			
			for(int j=inputArray.length-1;j>0;j--) {
				
				inputArray[j] = inputArray[j-1];
			}
			
			inputArray[0]=temp;
		}
		System.out.println("Array elements after rotation");
		System.out.println(Arrays.toString(inputArray));
		
    }
	
	
	public static void main(String[] args) {
		
		rightRotate(new int[] {10, 50,73,45,62},2 );
	}

}
