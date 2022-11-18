
package AllPrograms;


public class Prime_No {
   public static void main(String[] args) {
    int rows, cols, remainder;
    boolean isPrime = true;
    int matrix[][] = {{1,3,5},
        {2,5,8},
        {7,3,5}
    };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                for (int k = 2; k <= matrix[i][j] / 2; k++) {
                    remainder = matrix[i][j] % k;
                    if (remainder == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(matrix[i][j] + " is a Prime number");
                } else
                    System.out.println(matrix[i][j] + " is not a Prime number");
            }
        }
   }

}