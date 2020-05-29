/*
Author: Patryk Klimek
Summary: Class Main to test classes from exercises 6.*
 */
package Zjazd6;

public class Main {

    public static void main(String[] args) throws UsedCarException {

        MovablePoint movablePoint = new MovablePoint(2, 2, 2, 2);
        System.out.println(movablePoint.toString());
        movablePoint.moveDown();
        movablePoint.moveRight();
        System.out.println(movablePoint.toString());
        movablePoint.moveUp();
        movablePoint.moveLeft();
        System.out.println(movablePoint.toString());

        MovableRectangle movableRectangle = new MovableRectangle(2, 2, 4, 4, 2, 2);
        System.out.println(movableRectangle.toString());
        movableRectangle.moveDown();
        movableRectangle.moveRight();
        System.out.println(movableRectangle.toString());
        movableRectangle.moveUp();
        movableRectangle.moveLeft();
        System.out.println(movableRectangle.toString());

        Circle circle = new Circle(3);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(3);
        resizableCircle.resize(50);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());

        UseInsurance useInsurance = new UseInsurance();
        useInsurance.UseInsurance();

        System.out.println("Class DemoRunner");
        DemoRunners demoRunners = new DemoRunners();
        demoRunners.DemoRunners();

        System.out.println("Class DemoTurners Ex. 06.05");
        DemoTurners demoTurners = new DemoTurners();
        demoTurners.DemoTurners();
        System.out.println("");

        DemoTurners2 demoTurners2 = new DemoTurners2();
        demoTurners2.DemoTurners2();

        System.out.println("CreateLoans Class");

        CreateLoans createLoans = new CreateLoans();
        createLoans.CreateLoans();

        Menu menus = new Menu();
        menus.Menu();

        ThrowUsedCarException2 what = new ThrowUsedCarException2();
        what.ThrowUsedCarException2();
    }
}
