/*
Author: Patryk Klimek
Summary: Main class for testing other classes.
 */
package Zjazd3;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(2, "Marian", "Zbigniewski", 600);

        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee.getSalary());
        System.out.println(employee.toString());

        InvoiceItem invoiceItem = new InvoiceItem("zupa", "grzybowa", 5, 5.0);

        System.out.println(invoiceItem.getTotal());
        System.out.println(invoiceItem.toString());

        Account account1 = new Account("account1", "Marian", 600);
        Account account2 = new Account("account2", "Zbigniew");

        System.out.println(account1.credit(200));
        System.out.println(account1.debit(1000));
        System.out.println(account1.debit(200));
        System.out.println(account1.transferTo(account2, 1000));
        System.out.println(account1.transferTo(account2, 200));
        System.out.println(account2.toString());

        Date date = new Date(5, 3, 1986);

        System.out.println(date.toString());
        date.setDate(6, 2, 1998);
        System.out.println(date.toString());

        Time time = new Time(20, 13, 44);

        System.out.println(time.toString());
        time.setTime(12, 16, 20);
        System.out.println(time.toString());
        time.nextSecond();
        System.out.println(time.toString());
        time.previousSecond();
        System.out.println(time.toString());

    }
}
