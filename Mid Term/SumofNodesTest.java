
package fa19_bcs_183;

import fa19_bcs_074.SumofNodes.Node;
import static fa19_bcs_183.SumofNodes.push;
import static fa19_bcs_183.SumofNodes.sumOfNodesUtil;

public class SumofNodesTest {
    public static void main(String args[])
{
	Node head = null;

	//values used are real 
        //uniqueness for my code is all values pushed in the List 
         
	head = push(head, 74); //this is registration no
	head = push(head, 2001); // this is dob, for uniqueness using this value
	head = push(head, 3); // month=march
	head = push(head, 7); //day of birth 
	head = push(head, 1346); //last 4 digits of phone no
        head = push(head, 5); 
        head = push(head, 10);
        

	System.out.println( "Sum of nodes = "	+ sumOfNodesUtil(head));
}
}
    