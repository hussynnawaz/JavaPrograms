/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa19bcs074;

import java.util.*; 
public class Queue {

  
    public static void main(String args[])  { 

        PriorityQueue<String> numQueue = new PriorityQueue<String>(); 
        numQueue.add("Hussain"); 
        numQueue.add("Sanan"); 
        numQueue.add("Inaam"); 
        numQueue.add("Bilal"); 
        numQueue.add("Urooj");
        numQueue.add("Laiba");
        numQueue.add("Aliya");
        numQueue.add("Maryam");
   
        System.out.println("Head element using peek method:"  + numQueue.peek()); 
   
        System.out.println("\n\nThe PriorityQueue elements:"); 
        Iterator iter1 = numQueue.iterator(); 
        while (iter1.hasNext()) 
            System.out.print(iter1.next() + " "); 
   
    
        numQueue.poll(); 
        System.out.println("\n\nAfter removing an element"); 
        Iterator<String> iter2 = numQueue.iterator(); 
        while (iter2.hasNext()) 
            System.out.print(iter2.next() + " "); 
   
       
        numQueue.remove("Seven"); 
        System.out.println("\n\nElement with" + " remove function:"); 
        Iterator<String> iter3 = numQueue.iterator(); 
        
      while (iter3.hasNext()) 
            System.out.print(iter3.next() + " "); 
   
        
        boolean ret_val = numQueue.contains("Five"); 
        System.out.println("\n\nPriority queue contains 'Aliya' " + "or not?: " + ret_val); 
   
     
        Object[] numArr = numQueue.toArray(); 
        System.out.println("\nArray Contents: "); 
        for (int i = 0; i < numArr.length; i++) 
            System.out.print(numArr[i].toString() + " "); 
    } 
}
