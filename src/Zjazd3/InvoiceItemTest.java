/*
Author: Patryk Klimek
Summary: Test class for InvoiceItem class.
 */
package Zjazd3;

public class InvoiceItemTest {

    public static void main(String[] args) {

        InvoiceItem invoiceItem = new InvoiceItem("zupa", "grzybowa", 5, 5.0);

        System.out.println(invoiceItem.getTotal());
        System.out.println(invoiceItem.toString());

    }

}
