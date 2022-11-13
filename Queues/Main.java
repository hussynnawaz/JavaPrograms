package fa19_bcs_074;

public class Main {

    public static void main(String[] args) {

        Queue theQueue = new Queue(5);  // queue holds 5 items
        int x;

        theQueue.insert(10);            // insert 4 items
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        x=theQueue.remove();              // remove 3 items
        x=theQueue.remove();              //    (10, 20, 30)
        x=theQueue.remove();

        theQueue.insert(50);            // insert 4 more items
        theQueue.insert(60);            //    (wraps around)
        theQueue.insert(70);
        theQueue.insert(80);

        while( !theQueue.isEmpty() )    // remove and display
        {                            //    all items
            int n = theQueue.remove();   // (40, 50, 60, 70, 80)
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }  // end main()
    }

