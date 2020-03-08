/*
Class to create rectangle, check they are, circumference and diagonal.
Patryk Klimek
 */
package Zjazd2;

import java.lang.Math;

import static java.lang.Math.sqrt;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, int width) {
        this.length = length;
        this.width = width;
    }

    public double rectangleArea() {
        return length*width;
    }

    public double circumferenceOfRectangle() {
        return (2 * length) + (2 * width);
    }

    public double diagonalOfRectangle() {
        return sqrt((length * length) + (width * width));
    }

}
