/*
Author: Patryk Klimek
Summary: Class PoliticalCandidate for exercise 6.4
*/
package Zjazd6;

public class PoliticalCandidate implements Runner {
    private String name;

    public PoliticalCandidate(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("My name is " + this.name);
        System.out.println("and I will be running for president in next elections!");
    }
}
