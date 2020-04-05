/*
Author: Patryk Klimek
Summary: Creating class "MovablePoint" from UML chart in exercise 22
 */
package Zjazd4;

import java.util.Arrays;
import java.util.List;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public List getSpeed() {
        return Arrays.asList(xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "(" +
                getX() + ',' + getY() +
                "),speed=(" +
                xSpeed + ',' + ySpeed + ')';
    }

    public MovablePoint move() {
        this.xSpeed = getX() + xSpeed;
        this.ySpeed = getY() + ySpeed;
        return this;
    }
}
