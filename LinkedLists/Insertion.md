Add a node at the front: (4 steps process) 
Approach: The new node is always added before the head of the given Linked List. And newly added node becomes the new head of the Linked List. For example, if the given Linked List is 10->15->20->25 and we add an item 5 at the front, then the Linked List becomes 5->10->15->20->25. Let us call the function that adds at the front of the list is push(). The push() must receive a pointer to the head pointer because the push must change the head pointer to point to the new node
Complexity Analysis:

Time Complexity: O(1), We have a pointer to the head and we can directly attach a node and change the pointer. So the Time complexity of inserting a node at the head position is O(1) as it does a constant amount of work.
Auxiliary Space: O(1)
Add a node after a given node: (5 steps process) 
Approach: We are given a pointer to a node, and the new node is inserted after the given node.

Follow the steps to add a node after a given node:

Firstly, check if the given previous node is NULL or not.
Then, allocate a new node and
Assign the data to the new node
And then make the next of new node as the next of previous node. 
Finally, move the next of the previous node as a new node.
Complexity Analysis: 

Time complexity: O(1), since prev_node is already given as argument in a method, no need to iterate over list to find prev_node
Auxiliary Space: O(1) since using constant space to modify pointers

Add a node at the end: (6 steps process) 
The new node is always added after the last node of the given Linked List. For example if the given Linked List is 5->10->15->20->25 and we add an item 30 at the end, then the Linked List becomes 5->10->15->20->25->30. 
Since a Linked List is typically represented by the head of it, we have to traverse the list till the end and then change the next to last node to a new node.
