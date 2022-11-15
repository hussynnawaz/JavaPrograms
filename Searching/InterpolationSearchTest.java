/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchtypes;

import static searchtypes.InterpolationSearch.InterpolationSearch;

/**
 *
 * @author Admin
 */
public class InterpolationSearchTest {
    
    // Driver Code
	public static void main(String[] args)
	{

		// Array of items on which search will
		// be conducted.
		int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
					22, 23, 24, 33, 35, 42, 47 };

		int n = arr.length;

		// Element to be searched
		int x = 18;
		int index = InterpolationSearch(arr, 0, n - 1, x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at index "
							+ index);
		else
			System.out.println("Element not found.");
	}
}
