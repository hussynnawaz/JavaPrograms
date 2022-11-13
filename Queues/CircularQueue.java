
package fa19bcs074;


public class CircularQueue {
      public static void main(String[] args) {
        
        CircularQueue<Integer> circularQueue = new CircularQueue(8);

        circularQueue.enqueue(6);
        circularQueue.enqueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(15);
        circularQueue.enqueue(20);
        circularQueue.enqueue(25);
        circularQueue.enqueue(30);
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.enqueue(35);
        circularQueue.enqueue(40);

        System.out.println("Full Circular Queue" + circularQueue);

        System.out.print("Dequeued following element from circular Queue ");
        System.out.println(circularQueue.dequeue() + " ");
        circularQueue.enqueue(23);
        System.out.println("After enqueueing circular queue with element having value 23");
        System.out.println(circularQueue);
    }
    
}