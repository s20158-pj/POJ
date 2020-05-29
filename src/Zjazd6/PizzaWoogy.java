/*
Author: Patryk Klimek
Summary: Class PizzaWoogy for exercise 6.7
*/
package Zjazd6;

public class PizzaWoogy extends Pizza {
    private int diameter;
    private String woogyIngredient;
    private boolean isVegeterian;

    public PizzaWoogy(double calories, String name, double price) {
        super(calories, name, price);
    }

    public PizzaWoogy(double calories, String name, double price, int diameter, String woogyIngredient, boolean isVegeterian) {
        super(calories, name, price);
        this.diameter = diameter;
        this.woogyIngredient = woogyIngredient;
        this.isVegeterian = isVegeterian;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getWoogyIngredient() {
        return woogyIngredient;
    }

    public boolean isVegeterian() {
        return isVegeterian;
    }
}
