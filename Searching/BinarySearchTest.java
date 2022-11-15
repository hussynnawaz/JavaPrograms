
package searchtypes;


public class BinarySearchTest {

	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = {2,3,4,10,40};
		int n = arr.length;
		int x = 10;
		int result = ob.BinarySearch(arr,0,n-1,x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " +
												result);
	}    
}
