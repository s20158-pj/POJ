/*
Author: Patryk Klimek
Summary: Class Light for exercise 6.5
*/
package Zjazd6;

public class Light implements Turner {
    @Override
    public void turn() {
        System.out.println("Light's on");
    }
}
