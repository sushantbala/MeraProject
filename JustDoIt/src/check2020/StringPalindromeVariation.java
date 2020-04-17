package check2020;

public class StringPalindromeVariation {

	public static void main(String[] args) {
		String str ="EMADAM";
		checkChar(str);
		
		
	}

	private static void checkChar(String str) {
		char ch=0;
		char ch1=0;
		int len = str.length();
		int mid = len/2;
		int j=len-1;
		for(int i=0;i<mid-1;i++) {
			
			
			if(str.charAt(i)==str.charAt(j)) {
				System.out.println("ThatsOk");
			} 
			else 
			{	
				if(str.charAt(i)!=str.charAt(j)) {
					ch =str.charAt(i);
					ch1=str.charAt(j);
				}
			 if(str.charAt(i)!=str.charAt(j-1)) 
					System.out.println(ch);
				
			 if(str.charAt(j)!=str.charAt(i+1)) 
					System.out.println(ch1);
			}	
			j=j-1;
			
		}
		
		
	}

}
