package string.practice;

import java.util.Arrays;
import java.util.Scanner;
public class UniqueCharecter{
	   public static void main (String[]args){
	   Scanner kb = new Scanner (System.in); 
	     String word = "";
	     System.out.println("Enter a word: ");
	     word = kb.nextLine();
	     char[] strToCharArray = word.toCharArray();
	     descOrderWithUniqueChar(strToCharArray);
	}

	   static void descOrderWithUniqueChar(char[] s)  
	    { 
	        Arrays.sort(s); 
	        String strForUnique = String.valueOf(reverse(s));
	        String strForUniqueWithDec=  uniqueCharacters(strForUnique);
	        System.out.println("Reverse String -- "+strForUniqueWithDec);
	    } 
	    static char[] reverse(char[] a)  
	    { 
	        int i, n = a.length; 
	        char t; 
	        for (i = 0; i < n / 2; i++)  
	        { 
	            t = a[i]; 
	            a[i] = a[n - i - 1]; 
	            a[n - i - 1] = t; 
	        }
			return a; 
	        
	        
	    } 
	  

		public static String uniqueCharacters(String strForUnique){
	      String temp = "";
	         for (int i = 0; i < strForUnique.length(); i++){
	            if (temp.indexOf(strForUnique.charAt(i)) == - 1){
	               temp = temp + strForUnique.charAt(i);
	         }
	      }
			return temp;

	   }
	}     