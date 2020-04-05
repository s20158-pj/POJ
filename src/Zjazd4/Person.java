/*
Author: Patryk Klimek
Summary: Creating class "Person" from UML chart in exercise 20
 */
package Zjazd4;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name +
                ",address=" + address +
                ']';
    }
}
