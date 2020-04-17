package check2020;

public class middleCharString {

	public static void main(String[] args) {

     String str1 = "Indian";
     String str2 = "India";
      middleChar(str1);
      middleChar(str2);
	}

	private static void middleChar(String str) {
		
	    int length = str.length();
		if (length%2==0) {
			System.out.print(str.charAt((length/2)-1));
			System.out.println(str.charAt(length/2));
		}
		else
			System.out.println(str.charAt(length/2));
	}

}
