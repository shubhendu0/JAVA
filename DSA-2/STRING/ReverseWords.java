package DSA2MockEasy;
//Java Program to reverse the order of words in a string.

import java.io.*;
import java.util.*;
public class ReverseWords {
	public static void main(String[] args) {
        String a="i study at newton school";
        String s[]=a.split(" ");
        for(int i=s.length-1;i>=0;i--)
            System.out.print(s[i]+" ");               
    }
}

