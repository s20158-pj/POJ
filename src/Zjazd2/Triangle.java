/*
Class to create triangles, check they are and side, and if they are equilateral, isosceles or scalene.
Patryk Klimek
Sprawdzić wzór Herona
 */
package Zjazd2;

import static java.lang.Math.sqrt;

public class Triangle {

    private double siteA;
    private double siteB;
    private double siteC;

    public Triangle(double siteA, double siteB, double siteC) {
        this.siteA = siteA;
        this.siteB = siteB;
        this.siteC = siteC;
    }
    public double triangleArea() {
        double halfOfBase = siteC / 2;
        double heightOfTriangle = sqrt((siteB * siteB) - (halfOfBase * halfOfBase));
        return (siteC * heightOfTriangle) / 2;
    }

    public double sideOfTriangle () {
        return siteA + siteB + siteC;
    }

    public boolean isEquilateral () {
        return siteA == siteB && siteB == siteC;
    }

    public boolean isIsosceles () {
        return siteA == siteB;
    }

    public boolean isScalene () {
        return siteA != siteB && siteB != siteC;
    }
}

