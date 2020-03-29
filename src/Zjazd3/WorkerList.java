/*
Author: Patryk Klimek
Summary: Class which create ArrayList to which you can add workers with their name, salary and date of start of work
in company, and method which show list of all elements(workers) in ArrayList.
 */
package Zjazd3;

import java.time.LocalDate;
import java.util.ArrayList;

public class WorkerList {

    private String name;
    private int salary;
    private LocalDate hireDay;

    public WorkerList(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public static void workerData(ArrayList<WorkerList> list) {
        for (WorkerList e : list) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "name:" + name +
                ", salary:" + salary +
                ", hireDay:" + hireDay;
    }

}
