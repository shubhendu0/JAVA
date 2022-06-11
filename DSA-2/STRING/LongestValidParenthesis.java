package DSA2MockEasy;
//Java Program to find the max length of valid parenthesis

import java.io.*;
import java.util.*;
class LongestValidParenthesis {
    public static void main(String args[]){
        String s1="()()()(())()";
        System.out.println(lengthOfLVP(s1));
        String s2="()(())(()()";
        System.out.println(lengthOfLVP(s2));
    }
    static int lengthOfLVP(String s) 
    {
        if(s.length()==0)
            return 0;       
        Stack<Integer> st = new Stack<>();
        int maxLen = 0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='(' )
                st.push(i);  
            else{
                int top = st.peek();
                if(top!=-1 && s.charAt(top)=='('){
                    st.pop();
                    maxLen = Math.max(maxLen,i-st.peek());
                }
                else
                    st.push(i);                    
            }
        }    
        return maxLen;
    }    
}
