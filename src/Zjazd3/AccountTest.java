/*
Author: Patryk Klimek
Summary: Test class for Account class.
 */
package Zjazd3;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("account1", "Marian", 600);
        Account account2 = new Account("account2", "Zbigniew");

        System.out.println(account1.credit(200));
        System.out.println(account1.debit(1000));
        System.out.println(account1.debit(200));
        System.out.println(account1.transferTo(account2, 1000));
        System.out.println(account1.transferTo(account2, 200));
        System.out.println(account2.toString());

    }

}
