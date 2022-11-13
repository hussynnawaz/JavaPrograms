/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Admin
 */
public class SelectionSortTest {
 
    // Driver code to test above
	public static void main(String args[])
	{
		SelectionSort obj = new SelectionSort();
		int arr[] = {64,25,33, 74, 20, 10, 5, 12,22,101};
		obj.sort(arr);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}
}
/* This code is contributed by Raj
}
