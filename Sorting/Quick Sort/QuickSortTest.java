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
public class QuickSortTest {
    public static void main(String args[])
    
    {
        QuickSort obj = new QuickSort();
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
  
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
  
        System.out.println("sorted array");
        obj.printArray(arr);
    }
}
