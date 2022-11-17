
package AllPrograms;


public class max_no_in_matrix {
     public static void maxelement(int no_of_rows, int[][] arr) {
        int i = 0;
         
    
        
        int max = 0;
        int[] result = new int[no_of_rows];
        while (i < no_of_rows) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max =0;
            i++;
 
        }
        printArray(result);
 
    }
 
    
    private static void printArray(int[] result) {
        for (int i =0; i<result.length;i++) {
            System.out.println(result[i]);
        }
 
    }
 
  
    public static void main(String[] args) {
        int[][] arr = new int[][] { {3, 4, 1, 8, 10},
                                    {1, 4, 9, 20, 11},
                                    {76, 34, 21, 1, 40},
                                   {2, 1, 4, 5, 23} ,
                                   {18, 47, 22, 7, 13}
        };     
  
        
        maxelement(5, arr);
    }
}
