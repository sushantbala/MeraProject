package check2020;

import java.util.Arrays;

public class ArrayRotation {
	  
	
	private static void rightRotation(int[]inputarray,int n) {
		
		System.out.println("Input Array before rotation :");
		System.out.println(Arrays.toString(inputarray));
		  int temp;
		  
		  for (int j = 0 ; j < n ; j ++) {
			  temp = inputarray[inputarray.length-1];
				for (int i=inputarray.length-1;i > 0; i--){	
					inputarray[i]= inputarray[i-1];			
				}
			   inputarray[0] = temp;  
		  }
		  System.out.println("Input Array before right rotation by "+n+" position: " );
		  System.out.println(Arrays.toString(inputarray));
		  
	}
	
	static void leftRotation(int[]inputarray, int n) {
		
		System.out.println("Input Array before rotation :");
		System.out.println(Arrays.toString(inputarray));
		  int temp;
		  
		 for (int j = 0 ; j < n ; j ++) {
			  temp = inputarray[0];
				for (int i=0;i < inputarray.length-1; i++){	
					inputarray[i]= inputarray[i+1];			
				}
			   inputarray[inputarray.length-1] = temp;  
		  }
		  System.out.println("Input Array before left rotation by "+n+" position: " );
		  System.out.println(Arrays.toString(inputarray));
		  
	}
	

	public static void main(String[] args) {

      leftRotation(new int[] {1,2,3,4,5,6,7},2);
      System.out.println("--------------------------------------------------");
      rightRotation(new int[] {1,2,3,4,5,6,7},2);

	}

}
