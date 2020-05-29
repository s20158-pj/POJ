/*
Author: Patryk Klimek
Summary: Class Life for exercise 6.3
*/
package Zjazd6;

public class Life extends Insurance {
    public Life() {
        super("Life");
        setCost();
    }

    @Override
    public void setCost() {
        this.monthlyPrice = 36;
    }

    @Override
    public void display() {
        System.out.printf("Insurance: %s \nCosts: $%.2f per month\n", this.insuranceType, this.monthlyPrice);
    }
}
