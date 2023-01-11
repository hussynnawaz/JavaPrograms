// Java program to Search an Element
// in a Circular Linked List
public class search {
	class Node {

		int data;
		Node next;
		public Node(int data) { this.data = data; }
	}
	// declaring head pointer as null
	public Node head = null;
	public Node tempo = null;

	// function adds new nodes at the end of list
	public void addNode(int data)
	{
		Node new1 = new Node(data);
	
		// If linked list is empty
		if (head == null) {
			head = new1;
		}
		else {
			tempo.next = new1;
		}

		tempo = new1;
	
		// last node points to first node
		tempo.next = head;
	}
	public void find(int key)
	{
		// temp will traverse the circular
		// linked list for searching element
		Node temp = head;
	
		// counter used to check if
		// element is found or not
		int f = 0;
		if (head == null) {
			System.out.println("List is empty");
		}
		else {
			do {
				if (temp.data == key) {
					System.out.println(
						"element is present");
					f = 1;
					break;
				}
				temp = temp.next;
			} while (temp != head);
			if (f == 0) {
				System.out.println(
					"element is not present");
			}
		}
	}
	public static void main(String[] args)
	{
		search s = new search();
	
		// Adds data to the list
		s.addNode(5);
		s.addNode(4);
		s.addNode(3);
		s.addNode(2);
	
		// Search for node 2 in the list
		s.find(2);
	
		// Search for node 6 in the list
		s.find(6);
	}
}
