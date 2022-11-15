/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labterminal;

/**
 *
 * @author fa19-bcs-074
 */
public class BubbleSortTest {
    // Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90, 10, 58, 98, 58, 74};
		ob.BubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
        }
}
