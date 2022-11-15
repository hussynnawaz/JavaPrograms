
package fa19_bcs_183;


public class DeleteNode {
    
    Node head;  
  
    
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
  
    
    public void push(int new_data)
    {
        
        Node new_node = new Node(new_data);
  
        
        new_node.next = head;
  
       
        head = new_node;
    }
  
  
    void deleteNode(int position)
    {
        
        if (head == null)
            return;
  
        
        Node temp = head;
  
        
        if (position == 0)
        {
            head = temp.next;   
            return;
        }
  
       
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
  
       
        if (temp == null || temp.next == null)
            return;
  
       
        Node next = temp.next.next;
  
        temp.next = next; 
    }
  
    
    public void PrintList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
 