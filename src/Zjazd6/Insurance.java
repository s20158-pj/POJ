/*
Author: Patryk Klimek
Summary: Class Insurance for exercise 6.3
*/
package Zjazd6;

public abstract class Insurance {
    protected String insuranceType;
    protected double monthlyPrice;

    public Insurance(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public abstract void setCost();

    public abstract void display();
}
