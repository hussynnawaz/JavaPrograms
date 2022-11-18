
package AllPrograms;

public class MaxandMin_No {
    
   
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
 
	// Method to find maximum and minimum in matrix
	private static void findMinAndMax(int[][] matrix){     
		int maxNum = matrix[0][0];
		int minNum = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(maxNum < matrix[i][j]){ 
					maxNum = matrix[i][j]; 
				} else if(minNum > matrix[i][j]){
					minNum = matrix[i][j];
				}
			}
		}
		System.out.println("Max number: " + maxNum + 
					" Min number: " + minNum);
	}
