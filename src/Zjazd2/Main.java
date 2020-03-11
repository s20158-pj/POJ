/*
Main class used to create object of human with my parameters.
Patryk Klimek
 */
package Zjazd2;

public class Main {

    public static void main(String[] args) {

        Human ja = new Human(26, 100, 193, "Patryk", true, 20158, 46);

        Rectangle rectangle = new Rectangle(10, 10);

        System.out.println(rectangle.rectangleArea());
        System.out.println(rectangle.circumferenceOfRectangle());
        System.out.println(rectangle.diagonalOfRectangle());

        Triangle triangle = new Triangle(3, 3, 5);

        System.out.println(triangle.triangleArea());
        System.out.println(triangle.sideOfTriangle());
        System.out.println(triangle.isEquilateral());
        System.out.println(triangle.isIsosceles());
        System.out.println(triangle.isScalene());

        Caesar caesar = new Caesar("Patryk Klimek");

    }

}
