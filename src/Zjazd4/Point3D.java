/*
Author: Patryk Klimek
Summary: Creating class "Point3D" from UML chart in exercise 21
 */
package Zjazd4;

import java.util.Arrays;
import java.util.List;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public List getXYZ() {
        return Arrays.asList(getX(), getY(), z);
    }

    @Override
    public String toString() {
        return "(" +
                getX() + ',' + getY() +
                ',' + z +
                ')';
    }
}
