/*
Author: Patryk Klimek
Summary: Class Machine for exercise 6.4
*/
package Zjazd6;

import static java.lang.Thread.sleep;

public class Machine implements Runner {
    private String name;

    public Machine(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Would you like some " + this.name + " ?");
            sleep(2000);
            System.out.println("I'll make some anyway");
            double timer = 500;
            StringBuilder sb = new StringBuilder("=");

            for (int i = 0; i < 10; i++) {
                sleep((long) timer);
                System.out.printf("[%-10s]\n", sb.toString());
                sb.append("=");
                timer = timer * 1.15;
            }
            System.out.println("Freshly brewed " +this.name);
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
