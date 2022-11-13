/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPrograms;

/**
 *
 * @author Admin
 */
public class DoublyTest {
     
  public static void main(String[] args) {
    Doubly llist = new Doubly();

    llist.insertAtEnd(074);
    llist.insertAtBeginning(2001);
    llist.insertAtBeginning(300);
    llist.insertAtEnd(400);
    llist.insertAfter(llist.head.next, 5);

    System.out.println("Linked list: ");
    llist.printList();

    System.out.println("\nAfter deleting an element: ");
    llist.deleteNode(3);
    llist.printList();

    System.out.println();
    int item_to_find = 3;
    if (llist.search(llist.head, item_to_find))
      System.out.println(item_to_find + " is found");
    else
      System.out.println(item_to_find + " is not found");

    llist.sortLinkedList(llist.head);
    System.out.println("\nSorted List: ");
    llist.printList();
  }
}