
package AllPrograms;

import static AllPrograms.TernarySearch.TernarySearch;

public class TernarySearchTest {

	
	public static void main(String args[])
	{
		int l, r, p, key;
                TernarySearch obj = new TernarySearch();
		// Get the array
		// Sort the array if not sorted
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Starting index
		l = 0;

		// length of array
		r = 9;

		// Checking for 5

		// Key to be searched in the array
		key = 5;

		// Search the key using ternarySearch
		p = TernarySearch(l, r, key, arr);

		// Print the result
		System.out.println("Index of " + key + " is " + p);

		// Checking for 50

		// Key to be searched in the array
		key = 50;

		// Search the key using ternarySearch
		p = TernarySearch(l, r, key, arr);

		// Print the result
		System.out.println("Index of " + key + " is " + p);
	}    
}
