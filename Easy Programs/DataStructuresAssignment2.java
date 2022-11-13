
package AllPrograms;


public class DataStructuresAssignment2 {

  
    public static void main(String[] args) {
       int [] [] arr = {
        {5, 15, 33, 36, 50},
        {45, 25, 22, 8 , 60},
        {55, 75, 37, 12, 48},
        {10, 22, 56, 47, 18},
        {88, 93, 43, 3, 5}
    };
       {
           System.out.println (arr.length);
       }
        for (int[] arr1 : arr) {
           int i, j;
            for (int j = 0; j < arr[i]; j++) 
            {
                if (arr1[j] % 3 == 0 && arr1[j] % 5 == 0) 
                {
                    System.out.println(arr1[j] + "");
                }
            }
            System.out.println();
        }
    }
    


}
        