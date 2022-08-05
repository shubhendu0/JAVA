package DSA1MockMedium;
// Print a given array in wave form, i.e.,
// arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4].. ,  or
// arr[0] <= arr[1] >= arr[2] <= arr[3] >= arr[4].. 
import java.util.*;

class WaveArray
{
	// A utility method to swap two numbers.
	public static void swap(int arr[], int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void sortInWave1(int arr[], int n)
	{
		Arrays.sort(arr);
		// Swap adjacent elements
		for (int i=0; i<n-1; i += 2) // if int i=0 mid is low 
			swap(arr, i, i+1);
	}
	public static void sortInWave2(int arr[], int n)
	{
		Arrays.sort(arr);
		// Swap adjacent elements
		for (int i=1; i<n-1; i += 2) // if int i=1 mid is high
			swap(arr, i, i+1);
	}

	public static void main(String args[])
	{		
		int arr[] = {10, 90, 49, 2, 1, 5, 23};
		int n = arr.length;
		
		System.out.println("Array in Wave form-1 : ");
		sortInWave1(arr, n);
		for (int i : arr)
			System.out.print(i + " ");

		System.out.println("\nArray in Wave form-2 : ");					
		sortInWave2(arr, n);
		for (int i : arr)
			System.out.print(i + " ");
	}
}
