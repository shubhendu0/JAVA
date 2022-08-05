// Java Program to find the longest common prefix

class LongestCommonPrefix {

    // A Utility Function to find the common prefix between strings- str1 and str2
    static String comparingTwoString(String str1,String str2){
        String result = "";
        int n1 = str1.length(),n2 = str2.length();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if (str1.charAt(i) != str2.charAt(j))                                       
                break;            
            result += str1.charAt(i);
            i++;
            j++;
        }
        return (result);
    }
    
    // A Function that returns the longest common prefix from the array of strings
    static String commonPrefix(String arr[],int n){
        String prefix = arr[0];    
        for (int i = 1; i < n ; i++)        
            prefix = comparingTwoString(prefix, arr[i]);        
        return (prefix);
    }

    public static void main(String[] args){
        String arr[] = {"geeksforgeeks", "geeks","geek", "geezer","gee"};
        int n = arr.length;
        String ans = commonPrefix(arr, n);   
        if (ans.length() > 0)       
            System.out.printf("The longest common prefix is - %s",ans);       
        else        
            System.out.printf("There is no common prefix");        
    }
}
  