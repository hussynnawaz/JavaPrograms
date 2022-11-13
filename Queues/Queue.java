package fa19_bcs_074;

public class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;
    //--------------------------------------------------------------
    public Queue(int s)         // constructor
    {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;      // Since queArray is initially empty
        nItems = 0;
    }
    //--------------------------------------------------------------
    public boolean isEmpty()    // true if queue is empty
    {
        return (nItems==0);
    }
    //--------------------------------------------------------------
    public boolean isFull()     // true if queue is full
    {
        return (nItems==maxSize);
    }
    //--------------------------------------------------------------
    public void insert(int j)   // put item at rear of queue
    {
        if (isFull()) {
            System.out.print("ERROR -- QUEUE OVERFLOW");
        }
        else {
            if(rear == maxSize-1)         // deal with wraparound
                rear = -1;
            rear = rear + 1;
            queArray[rear] = j;           // increment rear and insert
            nItems++;                     // one more item
        }
    }
    //--------------------------------------------------------------
    public int remove()         // take item from front of queue
    {

        if (isEmpty()) {
            System.out.print("ERROR -- QUEUE UNDERFLOW");
            return -1;
        }
        else {
            int temp = queArray[front];   // get value and incr front
            front = front + 1;
            if(front == maxSize)          // deal with wraparound
                front = 0;
            nItems--;                     // one less item
            return temp;
        }
    }
    //--------------------------------------------------------------
    public int peekFront()      // peek at front of queue
    {
        return queArray[front];
    }

    //--------------------------------------------------------------
    public int size()           // number of items in queue
    {
        return nItems;
    }
//
}
