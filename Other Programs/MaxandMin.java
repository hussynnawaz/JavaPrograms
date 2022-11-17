
package labterminal;

import java.util.Scanner;

public class MaxandMin{
    
   
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of rows and columns in the matrix : ");
		int row = in.nextInt();
		int column = in.nextInt();

		System.out.print("Enter elements of Matrix : ");
		int matrix[][] = new int[row][column];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				matrix[i][j] = in.nextInt();
			}
		}
		System.out.println("Entered Matrix : " );
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				System.out.print(" " +matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		findMinAndMax(matrix);
	}
}
	

