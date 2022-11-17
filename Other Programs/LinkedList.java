/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labterminal;

/**
 *
 * @author fa19-bcs-074
 */
public class LinkedList {
    // A complete working Java program to demonstrate all insertion methods
// on linked list
	Node head; // head of list

    void append(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Inserts a new node after the given prev_node. */
	public void insertAfter(Node prev_node, int new_data)
	{
		/* 1. Check if the given Node is null */
		if (prev_node == null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}

		/* 2 & 3: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 4. Make next of new Node as next of prev_node */
		new_node.next = prev_node.next;

		
		prev_node.next = new_node;
	}
	
	
	public void append (int new_data)
	{
		
		Node new_node = new Node(new_data);

		
		if (head == null)
		{
			head = new Node(new_data);
			return;
		}

		
		new_node.next = null;

		
		Node last = head;
		while (last.next != null)
			last = last.next;

	
		last.next = new_node;
		return;
	}

	
	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}

	
}	