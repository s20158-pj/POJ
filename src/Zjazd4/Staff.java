/*
Author: Patryk Klimek
Summary: Creating class "Staff" from UML chart in exercise 20
 */
package Zjazd4;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" +
                "Person[" +
                "name=" + getName() +
                ",address=" + getAddress() + ']' +
                ",school=" + school +
                ",pay=" + pay +
                ']';
    }
}
