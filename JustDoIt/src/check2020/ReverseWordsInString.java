package check2020;

public class ReverseWordsInString {
	
    static void  reverseString(String Origstr){
    	
    	String[] str1 = Origstr.split("\\s");
    	String reverseString="";
    	for (int i=0;i<str1.length;i++) {
    		if(i==str1.length-1)	
    		reverseString=	str1[str1.length-1] + reverseString;
    		else
    		reverseString =" "+ str1[i] + reverseString;
    		
    	}
    	 System.out.println(reverseString);
     }

	public static void main(String[] args) {

    reverseString("India is Awesome");

	}

}
