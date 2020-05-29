/*
Author: Patryk Klimek
Summary: Class ResizableCircle for exercise 6.2
 */
package Zjazd6;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius +  radius * percent/100;
    }
}
