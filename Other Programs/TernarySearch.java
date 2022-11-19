/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPrograms;

public class TernarySearch{
    static int TernarySearch(int l, int r, int key, int arr[])
    {
        if (r >= l) {
 
            // Find the mid1 and mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
 
            // Check if key is present at any mid
            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }
 
            // Since key is not present at mid,
            // check in which region it is present
            // then repeat the Search operation
            // in that region
 
            if (key < arr[mid1]) {
 
                // The key lies in between l and mid1
                return TernarySearch(l, mid1 - 1, key, arr);
            }
            else if (key > arr[mid2]) {
 
                // The key lies in between mid2 and r
                return TernarySearch(mid2 + 1, r, key, arr);
            }
            else {
 
                // The key lies in between mid1 and mid2
                return TernarySearch(mid1 + 1, mid2 - 1, key, arr);
            }
        }
 
        // Key not found
        return -1;
    }
 
}

