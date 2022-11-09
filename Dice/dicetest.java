import java.util.InputMismatchException;
import java.util.Scanner;
// CC-BY : Osanda Malith Jayathissa (@OsandaMalith)
/*
A company has four salespeople (1 to 4) who sell five different
products (1 to 5). Once a day, each salesperson passes in a slip for each different type of product sold. Each slip contains:
	a) The salesperson number
	b) The product number
	c) The total dollar value of that product sold that day
	
Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information from all of the slips for last
month is available. Write a program that will read all this information for last month’s sales and summarize the total sales by salesperson
by product. All totals should be stored in the double-subscripted array sales. After processing all the information for last
month, print the results in tabular format with each of the columns representing a particular salesperson and each of the rows representing
a particular product. Cross total each row to get the total sales of each product for last month; cross total each column to
get the total sales by salesperson for last month. Your tabular printout should include these cross totals to the right of the totaled
rows and to the bottom of the totaled columns.
Sample Run:
Enter 0 to end
Enter the SalesPerson, Product and Total Sales: 
1 1 35.2
Enter the SalesPerson, Product and Total Sales: 
1 2 15.5
Enter the SalesPerson, Product and Total Sales: 
1 3 6.2
Enter the SalesPerson, Product and Total Sales: 
1 2 56.2
Enter the SalesPerson, Product and Total Sales: 
2 1 53
Enter the SalesPerson, Product and Total Sales: 
1 4 96
Enter the SalesPerson, Product and Total Sales: 
2 3 52
Enter the SalesPerson, Product and Total Sales: 
0
|Sales | 		Products   			     |
-------+ -------+ -------+ -------+ -------+ -------+ -------+ 
|Person|       1|       2|       3|       4|       5| Total  |
-------+ -------+ -------+ -------+ -------+ -------+ -------+ 
|    1 |   35.20|   71.70|    6.20|   96.00|    0.00|  209.10|
|    2 |   53.00|    0.00|   52.00|    0.00|    0.00|  105.00|
|    3 |    0.00|    0.00|    0.00|    0.00|    0.00|    0.00|
|    4 |    0.00|    0.00|    0.00|    0.00|    0.00|    0.00|
-------+ -------+ -------+ -------+ -------+ -------+ -------+ 
| Total|   88.20|   71.70|   58.20|   96.00|    0.00|
-------+ -------+ -------+ -------+ -------+ -------+ 
*/
import java.util.*;

public class tester {
	private static Scanner in;

	public static void main(String[] args) {

		Company comp = new Company();
		in = new Scanner(System.in);
		System.out.println("Enter 0 to end");
		//comp.setSales(new double[5][6]);
		while (true) {
			try {
				System.out.println("Enter the SalesPerson, Product and the Total Sales: ");
				comp.setSalesPerson(in.nextInt());
				if (comp.getSalesPerson() == 0)	break;
				comp.setProduct(in.nextInt());
				comp.setValue(in.nextDouble());
				comp.setElements(comp.getSalesPerson() - 1, comp.getProduct() - 1, comp.getValue());
			} catch (InputMismatchException e) {
				System.out.print("Invalid input. Please reenter: ");
				break;
			}
		}
		
		comp.total(comp.getSales());
	}
}