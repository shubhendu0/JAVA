package DSA2MockEasy;
// JAVA program to check whether two strings are anagrams of each other

import java.io.*;
import java.util.*;
public class Anagram {
    public static void main(String args[]){        
        String str1="teap" ;
        String str2="eatp";      
        if (areAnagram(str1, str2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    static boolean areAnagram(String str1, String str2){
        int n1 = str1.length();
        int n2 = str2.length(); 
        // If length of both strings is not same,then they cannot be anagram
        if (n1 != n2)
            return false;
        char s1[]=new char[n1];
        char s2[]=new char[n1];
        for (int i = 0; i < n1; i++){
            s1[i]=str1.charAt(i);
            s2[i]=str2.charAt(i);
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i = 0; i < n1; i++)
            if (s1[i] != s2[i])
                return false; 
        return true;
    }
}
