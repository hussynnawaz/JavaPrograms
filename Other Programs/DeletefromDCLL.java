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
public class DeletefromDCLL {
    // Java program to delete a given key from
// circular doubly linked list.
	static class Node {
		int data;
		Node next;
		Node prev;
	};

	// Function to insert node in the list
	static Node insert(Node start, int value)
	{
		// If the list is empty, create a single node
		// circular and doubly list
		if (start == null) {
			Node new_node = new Node();
			new_node.data = value;
			new_node.next = new_node.prev = new_node;
			start = new_node;
			return start;
		}

		// If list is not empty

		// Find last node /
		Node last = (start).prev;

		// Create Node dynamically
		Node new_node = new Node();
		new_node.data = value;

		// Start is going to be next of new_node
		new_node.next = start;

		// Make new node previous of start
		(start).prev = new_node;

		// Make last previous of new node
		new_node.prev = last;

		// Make new node next of old last
		last.next = new_node;
		return start;
	}

	// Function to delete a given node from the list
	static Node deleteNode(Node start, int key)
	{
		// If list is empty
		if (start == null)
			return null;

		// Find the required node
		// Declare two pointers and initialize them
		Node curr = start, prev_1 = null;
		while (curr.data != key) {
			// If node is not present in the list
			if (curr.next == start) {
				System.out.printf("\nList doesn't have node with value = %d", key);
				return start;
			}

			prev_1 = curr;
			curr = curr.next;
		}

		// Check if node is the only node in list
		if (curr.next == start && prev_1 == null) {
			(start) = null;
			return start;
		}

		// If list has more than one node,
		// check if it is the first node
		if (curr == start) {
			// Move prev_1 to last node
			prev_1 = (start).prev;

			// Move start ahead
			start = (start).next;

			// Adjust the pointers of prev_1 and start node
			prev_1.next = start;
			(start).prev = prev_1;
		}

		// check if it is the last node
		else if (curr.next == start) {
			// Adjust the pointers of prev_1 and start node
			prev_1.next = start;
			(start).prev = prev_1;
		}
		else {
			// create new pointer, points to next of curr node
			Node temp = curr.next;

			// Adjust the pointers of prev_1 and temp node
			prev_1.next = temp;
			temp.prev = prev_1;
		}
		return start;
	}

	
	static void display(Node start)
	{
		Node temp = start;

		while (temp.next != start) {
			System.out.printf("%d ", temp.data);
			temp = temp.next;
		}
		System.out.printf("%d ", temp.data);
	}
}
