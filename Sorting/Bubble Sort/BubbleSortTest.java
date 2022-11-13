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
public class BubbleSortTest {
 public static void main(String args[])
	{
		BubbleSort obj = new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		obj.bubbleSort(arr);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}
}
/* This code is contributed by Rajat Mishra */
  
