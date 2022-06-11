package DSA2MockEasy;
//Java Program to check whether a word is palindrome or not.

import java.io.*; 
import java.util.*; 
public class PalindromeWord  {
	public static void main(String[] args) {
      String str="aba";
      String rev="";
      for (int i = str.length() - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
               
}
}

