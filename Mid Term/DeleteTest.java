
package fa19_bcs_183;

import fa19_bcs_183.DeleteNode.DeleteNodes;
import fa19_bcs_183.DeleteNode.LinkedList;
import java.util.LinkedList;

public class DeleteTest {
    public static void main(String[] args)
	{
	
     
        DeleteNodes = new DeleteNodes();

		llist.push(7);
		llist.push(1);
		llist.push(3);
		llist.push(2);
		llist.push(8);

		System.out.println("\nCreated Linked list is: ");
		llist.printList();

		llist.deleteNode(4); 

		System.out.println("\nLinked List after Deletion at position 4: ");
		llist.printList();
	}
}
}
