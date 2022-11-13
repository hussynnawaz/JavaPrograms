
package AllPrograms;


public class Delete_Row_Column {
    static int MAX = 50;
 
static void Delete_Row_Column (int arr[][], int n, int x)
{
 
    for (int i = x; i < n; i++)
    {
        for (int j = x; j < n; j++)
        {
            System.out.print( arr[i][j] + " ");
        }
        System.out.println();
    }
}
 

public static void main (String[] args)
{
    
    int n = 3;
    int arr[][] = { { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 } };
 
    int x = 1;
 
}

}
