package check2020;

public class ConvertToAscii {
	
	public static void StringToAscii(String str){
		int convert;
		int n1 = str.length();
		for(int i=0;i<n1;i++) {
		convert = str.charAt(i);
		System.out.println(convert);
		
		}
		
	}

	public static void main(String[] args) {
		
		StringToAscii("Aa");
	}

}
