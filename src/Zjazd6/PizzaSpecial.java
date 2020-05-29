/*
Author: Patryk Klimek
Summary: Class PizzaSpecial for exercise 6.7
*/
package Zjazd6;

public class PizzaSpecial extends Pizza {
    private int diameter;
    private String specialIngredient;
    private boolean isVegeterian;

    public PizzaSpecial(double calories, String name, double price) {
        super(calories, name, price);
    }

    public PizzaSpecial(double calories, String name, double price, int diameter, String specialIngredient, boolean isVegeterian) {
        super(calories, name, price);
        this.diameter = diameter;
        this.specialIngredient = specialIngredient;
        this.isVegeterian = isVegeterian;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getSpecialIngredient() {
        return specialIngredient;
    }

    public boolean isVegeterian() {
        return isVegeterian;
    }
}
