/*
Author: Patryk Klimek
Summary: Class MyRectangleTests to exercise 05.04
 */
package Zjazd5;

public class MyRectangleTests {

    public static void main(String[] args) {

        MyPoint myPoint = new MyPoint(2, 2);
        MyPoint myPoint1 = new MyPoint(3, 3);

        MyRectangle myRectangle = new MyRectangle(myPoint, myPoint1);

        System.out.println(myRectangle.toString());
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());

    }

}
