/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labterminal;

import static labterminal.DCLL.display;
import static labterminal.DCLL.insertAfter;
import static labterminal.DCLL.insertBegin;
import static labterminal.DCLL.insertEnd;
import labterminal.LinkedList.Node;

/**
 *
 * @author fa19-bcs-074
 */
public class DCLLTest {

public static void main(String[] args)
{
	
	Node start = null;

	
	insertEnd(5);

	insertBegin(4);

	
	insertEnd(7);

	
	insertEnd(8);

	
	insertAfter(6, 5);

	System.out.printf("Created circular doubly linked list is: ");
	display();
}
}

