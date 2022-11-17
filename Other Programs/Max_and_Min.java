
 
package AllPrograms;

import java.util.Scanner;


public class Max_and_Min {
     public static void main(String[] args) {
  int rows; 
  int columns;
  Scanner scanner = new Scanner (System.in);
  System.out.println("Enter the number of rows: ");
  rows = scanner.nextInt(); 
  
  System.out.println("Enter the number of columns: "); 
  columns = scanner.nextInt(); 
  
  int[][] matrix = new int [rows][columns];
  
  System.out.println("Enter the elements of the rows:  "); 
  for (int i = 0; i < rows; i++) {
   System.out.println("Enter the elements of columns  - " + (i+1)  ); 
   for (int j = 0; j < columns; j++) {
    matrix[i][j] = scanner.nextInt();
   }
  }
  scanner.close();
  System.out.println("The Matrix entered ");
         for (int[] matrix1 : matrix) {
             System.out.println();
             for (int j = 0; j < matrix1.length; j++) {
                 System.out.print(matrix1[j] + " ");
             }
         }
  System.out.println();
  Max_and_Min (matrix);
 }
 
 private static void Max_and_Min(int[][] matrix){

  int maxNum = matrix[0][0];
  int minNum = matrix[0][0];
         for (int[] matrix1 : matrix) {
             for (int j = 0; j < matrix1.length; j++) {
                 if (maxNum < matrix1[j]) {
                     maxNum = matrix1[j];
                 } else if (minNum > matrix1[j]) {
                     minNum = matrix1[j];
                 }
             }
         }
  System.out.println("Maximum number: " 
    + maxNum + " Minimum number: " + minNum);
 }
}
