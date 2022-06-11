// JAVA program tp print all the substring of a given string
import java.util.*;

class PrintAllSubstrings{

static void printSubStrings1(String str)
{
	for (int i = 0; i < str.length(); i++) {
		String subStr="";	
		for (int j = i; j < str.length(); j++) {
			subStr+= str.charAt(j);
			System.out.print(subStr +"  ");
		}
	}
    System.out.println();
}

static void printSubStrings2(String s) 
{   
    int n=s.length();
    char str[]=new char[n];
    for(int i=0;i<n;i++){
        str[i]=s.charAt(i);
    }
    for (int len=1; len<=n; len++) { 
        for (int i=0; i<=n-len; i++) {  
            for (int k=i; k<=i+len-1; k++) {  
                System.out.print(str[k]);
            }
            System.out.print(" ");
        }
    }
    System.out.println();
}

    
public static void main(String[] args)
{
	String str = "abcd";
	printSubStrings1(str);
    printSubStrings2(str);
}
}