/*
Author: Patryk Klimek
Summary: Class DemoTurners2 for exercise 6.5
*/
package Zjazd6;

public class DemoTurners2 {
    public void DemoTurners2() {
        System.out.println("Demonstration of TurnerInterface");
        int nextClass = 0;
        while(nextClass < 3) {
            switch(nextClass) {
                case 0:
                    Engine eng = new Engine();
                    System.out.print("Engine: ");
                    eng.turn();
                    break;
                case 1:
                    Light lht = new Light();
                    System.out.print("Light: ");
                    lht.turn();
                    break;
                case 2:
                    System.out.println("That is all folks");
                    break;
            }
            nextClass++;
        }
    }
}
