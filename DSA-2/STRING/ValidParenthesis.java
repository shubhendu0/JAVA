package DSA2MockEasy;
import java.util.*;
/*Java Program to find whether the given sequense of parenthesis is valid or not.
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.*/

class ValidParenthesis {
    public static void main(String[] args){
        String str1="({[)}]";
        System.out.println(isValid(str1));
        String str2="({[]})";
        System.out.println(isValid(str2));
    }
    static boolean isValid(String str) {
        Stack<Character> s = new Stack<Character>();
        for(char x: str.toCharArray()) {
            if (    x=='['  ||  x=='{'  ||  x=='('   )
                s.push(x);
            
            else if(!s.isEmpty() && ( x==']' && s.peek()=='[' 
                                        || x==')' && s.peek()=='(' 
                                            || x=='}' && s.peek()=='{' ))            
                s.pop();
             
            else             
                return false;            
        }
        return s.isEmpty();        
    }
}