/*
Author: Patryk Klimek
Summary: Test class for Date class.
 */
package Zjazd3;

public class DateTest {

    public static void main(String[] args) {

        Date date = new Date(5, 3, 1986);

        System.out.println(date.toString());
        date.setDate(6, 2, 1998);
        System.out.println(date.toString());

    }

}
