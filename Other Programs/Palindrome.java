

package fa19bcs074;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Palindrome {
    public static int isPalindrome(int item)
        {
            int rev = 0;
            int rem = 0;
            int num = item;

            while (num > 0)
            {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            if (rev == item)
                return 1;
            else
                return 0;
        }
	public static void main(String[] args) {
        int [][]array=new int[13][17];
        System.out.println("Enter upper limit");
        Scanner sc = new Scanner(System.in);
        int upperLimit = sc.nextInt();
        int randomNumber;
        for(int row=0; row<13; row++)
        {
            for(int col=0; col<17; col++)
            {
                randomNumber = ThreadLocalRandom.current().nextInt(11, upperLimit + 1);
                array[row][col] = randomNumber;
            }

        }
        
        for(int row=0; row<13; row++)
        {
            for(int col=0; col<17; col++)
            {
                System.out.print(array[row][col] + " ");
            }
            System.out.print(" ---> ");
            for(int col=0; col<17; col++)
            {
                if(isPalindrome(array[row][col])==1)
                    System.out.print(array[row][col] + " ");
            }
            System.out.println();

        }

	}
}

