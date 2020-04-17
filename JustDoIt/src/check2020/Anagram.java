package check2020;

import java.util.Arrays;

class Anagram { 
	  
    /* function to check whether two strings are  
    anagram of each other */
    static boolean areAnagram(String str1, String str2) 
    { 
        // Get lengths of both strings 
        int n1 = str1.length(); 
        int n2 = str2.length(); 
        
  
        
         
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false; 
      
      char[] str1Ch = str1.toLowerCase().toCharArray();
      char[] str2Ch = str2.toLowerCase().toCharArray();
        // Sort both strings 
        Arrays.sort(str1Ch); 
        Arrays.sort(str2Ch); 
  
        // Compare sorted strings 
        for (int i = 0; i < n1; i++) 
            if (str1Ch[i] != str2Ch[i]) 
                return false; 
  
        return true; 
    } 
  
    /* Driver program to test to print printDups*/
    public static void main(String args[]) 
    { 
        String str1 = "Gagan Bhagat" ; 
        String str2 = "hagat bagang"; 
        
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
} 