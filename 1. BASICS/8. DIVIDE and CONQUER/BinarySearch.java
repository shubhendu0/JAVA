package BinarySearch;
//Time complexity-> O(log n).

public class BinarySearch {
	public static int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
            else    
			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}

	public static void main(String args[])
	{
		int arr[] = { 2, 3, 4,7,8, 10,11,15,20, 40,50 };
		int n = arr.length;
		int x = 10;
		int result = binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "+ result);
	}
}