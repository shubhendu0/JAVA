// Java Program to find the product of number given in string
import java.util.*;
public class MultiplyStrings {
    public static void main(String args[]){
        String s1="121";
        String s2="2";
        System.out.println(multiply(s1, s2));
    }

    static String multiply(String s1,String s2){
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int res=n1*n2;
        String result=Integer.toString(res);
        return result;
    }
}
