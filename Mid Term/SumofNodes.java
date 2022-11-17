
package fa19_bcs_183;


public class SumofNodes {

 
static int sum=0;
static class Node
{
	int data;
	Node next;
}
static Node push( Node head_ref, int new_data)
{
	Node new_node = new Node();

	new_node.data = new_data;


	new_node.next = (head_ref);


	(head_ref) = new_node;
	return head_ref;
}


static void SumofNodes( Node head)
{

	if (head == null)
		return;


	SumofNodes(head.next);
	sum = sum + head.data;
}


static int sumOfNodesUtil( Node head)
{

	sum = 0;

	
	SumofNodes(head);

	
	return sum;
}
}
