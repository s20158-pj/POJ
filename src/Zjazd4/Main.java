/*
Author: Patryk Klimek
Summary: Main class for testing other classes.
 */
package Zjazd4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Person person = new Person("Ździchu", "Żanowo");
        System.out.println(person.toString());

        Student student = new Student("Wojtek", "Żurek", "IT", 2020, 200000);
        System.out.println(student.toString());

        Staff staff = new Staff("Marian", "Mariański", "PJWSTK", 200);
        System.out.println(staff.toString());

        Point2D point2D = new Point2D(2, 3);
        System.out.println(point2D.toString());
        point2D.setXY(3, 4);
        System.out.println(point2D.getXY());
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(2, 3, 4);
        System.out.println(point3D.toString());
        point3D.setXYZ(3, 4, 5);
        System.out.println(point3D.getXYZ());
        System.out.println(point3D.toString());

        Point point = new Point(2, 3);
        System.out.println(point.toString());
        point.setXY(3, 4);
        System.out.println(point.getXY());
        System.out.println(point.toString());

        MovablePoint movablePoint = new MovablePoint(4, 5);
        System.out.println(movablePoint.toString());
        movablePoint.setSpeed(5, 6);
        System.out.println(movablePoint.getSpeed());
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());

        MovablePoint movablePoint2 = new MovablePoint(2, 3, 4, 5);
        System.out.println(movablePoint2.toString());
        movablePoint2.setSpeed(5, 6);
        System.out.println(movablePoint2.getSpeed());
        System.out.println(movablePoint2.toString());
        System.out.println(movablePoint2.move());

        Shape shape = new Shape();
        System.out.println(shape.toString());

        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        Square square = new Square();
        System.out.println(square.toString());
        square.setWidth(2.0);
        square.setLength(2.0);
        System.out.println(square.toString());

        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();
        System.out.println(armstrongNumbers.Armstrong(153));
        System.out.println(armstrongNumbers.Armstrong(123));

        DifferentWords differentWords = new DifferentWords();
        differentWords.DifWords("example");
        differentWords.DifWords("example2");

        WordCounter wordCounter = new WordCounter();
        wordCounter.CountWords("example");
        wordCounter.CountWords("example2");
        wordCounter.CountWords("hamlet");

    }
}
