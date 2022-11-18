
package fa19_bcs_183;

import fa19_bcs_183.SumofNodes.Node;
import static fa19_bcs_183.SumofNodes.push;


public class EvenOddTest {
    public static void main(String[] args)
{
	Node head = null;
	

	push(head, 4);
	push(head, 5);
	push(head, 7);
	push(head, 2);
	push(head, 9);
	push(head, 6);
	push(head, 1);
	push(head, 2);
	push(head, 0);
	push(head, 5);
	push(head, 5);
	int check = LinkedListLength(head);
	
	if(check == 0)
	{
		System.out.println("Odd");
	}
	else
	{
		System.out.println("Even");
	}
}

    private static int LinkedListLength(Node head) {
        return 0;
       
}
