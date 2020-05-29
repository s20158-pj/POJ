/*
Author: Patryk Klimek
Summary: Class Pizza for exercise 6.7
*/
package Zjazd6;

public class Pizza implements Comparable{
    private double calories;
    private String name;
    private double price;

    public Pizza(double calories, String name, double price) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        Pizza pizza = (Pizza) o;
        if (this.price > pizza.price) return 1;
        else if (this.price < pizza.price) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Pizza[" +
                "[Calories]= " + calories +
                " [Name]= " + name +
                " [Price]= " + price +
                "]";
    }
}
