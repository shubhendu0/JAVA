// Java Program to convert Roman Numerals to Numbers

import java.util.Map;
import java.util.HashMap;
class RomanToInteger{
	
static  Map<Character,Integer> roman = new HashMap<>()
{{
	put('I', 1);
	put('V', 5);
	put('X', 10);
	put('L', 50);
	put('C', 100);
	put('D', 500);
	put('M', 1000);
}};
 
static int romanToInt(String s) {
	int sum = 0;
	int n = s.length();	
	for(int i = 0; i < n; i++){	
		if (i!=n-1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i+1)))
		{
			sum += roman.get(s.charAt(i+1)) - roman.get(s.charAt(i));
			i++;
		}
		else
			sum += roman.get(s.charAt(i));		
	}
	return sum;
}

public static void main(String[] args){	
	String input = "MCMIV";	
	System.out.print("Integer form of MCMIV is " + romanToInt(input));
}
}