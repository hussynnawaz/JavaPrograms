
package AllPrograms;


public class sum_of_numbers {
    public static void main(String[] args) {  
        int rows, cols, sumRow, sumCol;  
          
        
        int a[][] = {     
                        {1, 2, 3, 18, 47},  
                        {4, 5, 74, 28, 38},  
                        {7, 22, 13, 9, 0, 1},
                        {22, 7, 13, 20, 33},
                        {74, 61, 28, 12, 16, 12}
                    };  
            
          
          rows = a.length;  
        cols = a[0].length;  
          
        
        for(int i = 0; i < rows; i++){  
            sumRow = 0;  
            for(int j = 0; j < cols; j++){  
              sumRow = sumRow + a[i][j];  
            }  
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);  
        }  
          
    
        for(int i = 0; i < cols; i++){  
            sumCol = 0;  
            for(int j = 0; j < rows; j++){  
              sumCol = sumCol + a[j][i];  
            }  
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);  
        }  
    }  
    
}
