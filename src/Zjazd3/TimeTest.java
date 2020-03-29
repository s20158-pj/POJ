/*
Author: Patryk Klimek
Summary: Test class for Time class.
 */
package Zjazd3;

public class TimeTest {

    public static void main(String[] args) {

        Time time = new Time(20, 13, 44);

        System.out.println(time.toString());
        time.setTime(12, 16, 20);
        System.out.println(time.toString());
        time.nextSecond();
        System.out.println(time.toString());
        time.previousSecond();
        System.out.println(time.toString());
        time.setTime(23, 59, 59);
        System.out.println(time.toString());
        time.nextSecond();
        System.out.println(time.toString());

    }

}
