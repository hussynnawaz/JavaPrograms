
package fa19_bcs_183;

import java.io.*;
public class EvenOdd {



static class Node
{
	int data;
	Node next;
}
static int LinkedListLength(Node head)
{
	while (head != null && head.next != null)
	{
		head = head.next.next;
	}
	if (head == null)
		return 0;
	return 1;
}
	

static void push(Node head, int info)
{

	Node node = new Node();
	
	
	node.data = info;
	
	node.next = (head);

	
	(head) = node;
}
}