
package AllPrograms;

import java.util.Scanner;

public class primeno {
    public static void main(String args[]) {

        int i, s, j, p;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array:");
        s = sc.nextInt();

        System.out.print("Enter array elements:");
        for (i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("All prime numbers are:");

        for (i = 0; i < s; i++) {
            j = 2;
            p = 1;
            while (j < arr[i]) {
                if (arr[i] % j == 0) {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) {
                System.out.print(" " + arr[i]);
            }
        }

    }
    
}
