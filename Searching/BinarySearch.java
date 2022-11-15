
package searchtypes;


public class BinarySearch {
 
	// Returns index of x if it is present in arr[l..
	// r], else return -1
	int BinarySearch(int arr[], int l, int r, int x)
	{
		if (r>=l)
		{
			int mid = l + (r - l)/2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
			return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
			return BinarySearch(arr, l, mid-1, x);

			// Else the element can only be present
			// in right subarray
			return BinarySearch(arr, mid+1, r, x);
		}

		return -1;
	}
}

