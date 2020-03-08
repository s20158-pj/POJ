/*
Class to create object of human with age, weight, height, name, sex, index number and foot size.
Patryk Klimek
 */
package Zjazd2;

public class Human {

    private int age;
    private double weight;
    private double height;
    private String name;
    private boolean male;
    private int indexNumber;
    private int footSize;

    public Human(int age, double weight, double height, String name, boolean male, int indexNumber, int footSize) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.male = male;
        this.indexNumber = indexNumber;
        this.footSize = footSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }
}
