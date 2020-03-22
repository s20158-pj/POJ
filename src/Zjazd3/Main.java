/*
Author: Patryk Klimek
Summary: Main class for testing other classes.
 */
package Zjazd3;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(2, "Marian", "Zbigniewski", 600);

        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee.getSalary());
        System.out.println(employee.toString());
    }
}
