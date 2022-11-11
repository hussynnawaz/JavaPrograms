/* This function is in LinkedList class. Inserts a
new Node at front of the list. This method is
defined inside LinkedList class shown above */
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

/* This function is in LinkedList class.
Inserts a new node after the given prev_node. This method is
defined inside LinkedList class shown above */
public void insertAfter(Node prev_node, int new_data)
{
	/* 1. Check if the given Node is null */
	if (prev_node == null) {
		System.out.println(
			"The given previous node cannot be null");
		return;
	}

	/* 2. Allocate the Node &
	3. Put in the data*/
	Node new_node = new Node(new_data);

	/* 4. Make next of new Node as next of prev_node */
	new_node.next = prev_node.next;

	/* 5. make next of prev_node as new_node */
	prev_node.next = new_node;
}
