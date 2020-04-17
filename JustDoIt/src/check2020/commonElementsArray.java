package check2020;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class commonElementsArray {

	public static void main(String[] args) {

        commonElements(new int[] {6,8,7,15,6,8,9,9,10});
        Integer[] inputArray1 = {1, 2, 3, 4, 5, 4};
        
        Integer[] inputArray2 = {3, 4, 5, 6, 7, 4};
        
        intersectionOfTwoArrays(inputArray1,inputArray2);
	}

	private static void commonElements(int[] inputArray) {
		 
		 HashSet<Integer> abc = new HashSet<Integer>();
		 HashSet<Integer> duplicate = new HashSet<Integer>();
		 for(int i=0;i < inputArray.length;i++) {
			 if(abc.contains(inputArray[i])) {
				 duplicate.add(inputArray[i]);
			 }
		 abc.add(inputArray[i]);
		 } 
		 System.out.println("Duplicate numbers in an array is : " +duplicate+" " );
	 }
	 
	 private static void intersectionOfTwoArrays(Integer[] inputArray1 , Integer[] inputArray2)
	 {
		 HashSet<Integer> abc = new HashSet<>(Arrays.asList(inputArray1));
		 HashSet<Integer> cde = new HashSet<>(Arrays.asList(inputArray2));
		 abc.retainAll(cde);
		 System.out.println("Duplicate numbers in an array is : " +abc+" " );
		 
	 }
	 
	 
}
