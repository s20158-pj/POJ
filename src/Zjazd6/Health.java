/*
Author: Patryk Klimek
Summary: Class Health for exercise 6.3
*/
package Zjazd6;

public class Health extends Insurance {
    public Health() {
        super("Health");
        setCost();
    }

    @Override
    public void setCost() {
        this.monthlyPrice = 196;
    }

    @Override
    public void display() {
        System.out.printf("Insurance: %s \nCosts: $%.2f per month\n" , this.insuranceType,this.monthlyPrice);
    }
}
