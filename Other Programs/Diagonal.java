
package AllPrograms;


public class Diagonal {
    static int productDiagonals(int arr[][], int n)
{
 
    int product = 1;
    for (int i = 0; i < n; i++)
    {
 
 
        product = product * arr[i][i];
 

    }
 
    if (n % 2 == 1)
    {
        product = product / arr[n / 2][n / 2];
    }
 
    return product;
}
 
public static void main(String[] args)
{
    int arr1[][] = {    { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 7, 4, 2 },
                        { 2, 2, 2, 1 } };
    System.out.print("Product of diagonal elements " + productDiagonals(arr1, 4) + "\n");
 
  
}
}
