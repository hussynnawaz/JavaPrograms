Applications, Advantages and Disadvantages of Linked List
Difficulty Level : Easy
Last Updated : 29 Sep, 2022
Read
Discuss

A Linked List is a linear data structure that is used to store a collection of data with the help of nodes. A linked list is made up of two items that are data and a reference to the next node. A reference to the next node is given with the help of pointers and data is the value of a node. Each node contains data and links to the other nodes. It is an ordered collection of data elements called a node and the linear order is maintained by pointers. It has an upper hand over the array as the number of nodes i.e. the size of the linked list is not fixed and can grow and shrink as and when required, unlike arrays. Some of the features of the linked list are as follows:
The consecutive elements are connected by pointers.
The size of a linked list is not fixed.
The last node of the linked list points to null.
Memory is not wasted but extra memory is consumed as it also uses pointers to keep track of the next successive node.
The entry point of a linked list is known as the head. 
The various types of linked lists are as follows:

Singly Linked List: It is the most basic linked list in which traversal is unidirectional i.e. from the head node to the last node.
Doubly Linked List: In this linked list, traversal can be done in both ways, and hence it requires an extra pointer.
Circular Linked List: This linked list is unidirectional but in this list, the last node points to the first i.e. the head node and hence it becomes circular in nature.
Circular Doubly Linked List: The circular doubly linked list is a combination of the doubly linked list and the circular linked list. It means that this linked list is bidirectional and contains two pointers and the last pointer points to the first pointer.
Linked Lists are most commonly used for:
Linked Lists are mostly used because of their effective insertion and deletion. 
Insertion and deletion in the linked list are very effective and take less time complexity as compared to the array data structure. 
This data structure is simple and can be also used to implement a stack, queues, and other abstract data structures.   
Applications of Linked Lists:
Linked Lists are used to implement stacks and queues.
It is used for the various representations of trees and graphs.
It is used in dynamic memory allocation( linked list of free blocks).
It is used for representing sparse matrices.
It is used for the manipulation of polynomials.
It is also used for performing arithmetic operations on long integers.
It is used for finding paths in networks.
Applications of Linked Lists in real world: 
The list of songs in the music player are linked to the previous and next songs. 
In a web browser, previous and next web page URLs are linked through the previous and next buttons.
In image viewer, the previous and next images are linked with the help of the previous and next buttons.
Switching between two applications is carried out by using “alt+tab” in windows and “cmd+tab” in mac book. It requires the functionality of circular linked list.
In mobile phones, we save the contacts of the people. The newly entered contact details will be placed at the correct alphabetical order. This can be achieved by linked list to set contact at correct alphabetical position.
The modifications that we make in documents are actually created as nodes in doubly linked list. We can simply use the undo option by pressing Ctrl+Z to modify the contents. It is done by the functionality of linked list.
Advantages of Linked Lists:
Insertion and deletion in linked lists are very efficient.
Linked list can be expanded in constant time.
For implementation of stacks and queues and for representation of trees and graphs.
Linked lists are used for dynamic memory allocation which means effective memory utilization hence, no memory wastage.
Disadvantages of Linked Lists:
Use of pointers is more in linked lists hence, complex and requires more memory.
Searching an element is costly and requires O(n) time complexity.
Traversing is more time consuming and reverse traversing is not possible in singly linked lists.
Random access is not possible due to dynamic memory allocation.
Recommended