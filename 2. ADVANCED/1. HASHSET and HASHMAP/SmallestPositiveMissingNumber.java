package DSA1MockMedium;

import java.util.HashSet;

class SmallestPositiveMissingNumber
{
	public static int missing(int[] arr){
     HashSet<Integer> Ar = new HashSet<Integer>();
	 for(int i: arr){
		 Ar.add(i);
	 }
     for(int i=0; i <=arr.length;i++){
		 if(!Ar.contains(i)){
			return i;
		 }
	 }
         return -1;
     }
	public static void main (String[] args) 
	{
	 	int [] arr ={9,-8,6,4,2,3,-5,0,1,5,7,8,10};	 
	    System.out.print(missing(arr)); 
	}
}