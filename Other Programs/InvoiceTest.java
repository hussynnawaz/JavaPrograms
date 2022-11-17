/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labterminal;

/**
 *
 * @author fa19-bcs-074
 */
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice one = new Invoice("FA19", "CAR", 10, 1.5);
        System.out.println("Part number: " + one.getPartNumber() + "; Part description: " + one.getPartDescription() +
                "; Sold: " + one.getQuantityOfPurchased() + "; Price: " + one.getPricePreItem() + "; Invoice amount: " +
                one.getInvoiceAmount());
        one.setPartNumber("0x000");
        one.setPartDescription("IBM");
        one.setQuantityOfPurchased(1000);
        one.setPricePreItem(1500.99);
        System.out.println("After changing:");
        System.out.println("Part number: " + one.getPartNumber() + "; Part description: " + one.getPartDescription() +
                "; Sold: " + one.getQuantityOfPurchased() + "; Price: " + one.getPricePreItem() + "; Invoice amount: " +
                one.getInvoiceAmount());
    }
}
