
package AllPrograms;

public class Divisibleby3_and_5 {
    public static void main(String[] args) {
    boolean isDivisable = false;
    int matrix[][] = {{1,3,30},
        {2,15,8},
        {7,3,45}
    };
        for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j<matrix[i].length; j++){
                 isDivisable = false;
                if(matrix[i][j] % 3 == 0 && matrix[i][j] % 5 ==0) {
                    isDivisable = true;
                }
                 if (isDivisable) {
                    System.out.println(matrix[i][j] + " is a Divisable by 3 and 5");
                } 
             }

               
            }
        }
    
}
