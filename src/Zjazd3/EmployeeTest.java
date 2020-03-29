/*
Author: Patryk Klimek
Summary: Test class for Employee class.
 */
package Zjazd3;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(2, "Marian", "Zbigniewski", 600);

        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getSalary());
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee.toString());

    }

}
