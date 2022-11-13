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
public class RadixSortTest {
    public static void main(String[] args)
	{ 
            RadixSort obj = new RadixSort();
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		int n = arr.length;
		
		obj.RadixSort();
		System.out.println(arr, n);
	}
}
