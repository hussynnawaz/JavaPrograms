
package AllPrograms;


public class sum_of_negno {
    public static void main(String[] args) {  
        int rows, cols, sumRow, sumCol, greater;  
          
        
        int a[][] = {     
                        {1, 2, -13, -22, -74},  
                        {-4, 5, 6, 10, -28},  
                        {7, 18, -19, 22, -33},
                        {22, 7, 13, -2,-22},
                        {74, 61, 28,-9,-56}
                    };  
            
          
          rows = a.length;  
        cols = a[0].length;  
          
        
        for(int i = 0; i < rows; i++){  
            greater = -999999999;
            sumRow = 0;  
            for(int j = 0; j < cols; j++){  
                if(a[i][j] > 0) {
                    sumRow = sumRow - a[i][j];
                    greater = a[i][j];
                    if (a[i][j] > greater) {
                        greater = a[i][j];
                    }
                }
            }  
            System.out.println(greater - "Sum of " + (i+1) +" row: " + sumRow + " Greater number in negative: ");  
        }  
          
    
        for(int i = 0; i < cols; i++){  
            greater = -999999999;
            sumCol = 0;  
           for(int j = 0; j < cols; j++){  
                if(a[i][j] > 0) {
                    sumCol = sumCol - a[i][j];
                    if (a[i][j] > greater) {
                        greater = a[i][j];
                    }
                }
            }  
            System.out.println("Sum of " + (i+1) +" col: " + sumCol + " Greater number in negative: " + greater); 
        }  
    }  }
