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

    public static void main(String[] args) {

        ArrayList<WorkerList> list = new ArrayList<>();

        list.add(new WorkerList("Zenek", 2000, 2012, 5, 2));
        list.add(new WorkerList("Jurek", 3000, 1999, 4, 22));
        list.add(new WorkerList("Mariusz", 1200, 1998, 12, 12));
        list.add(new WorkerList("Ździsiek", 12000, 1988, 11, 20));
        list.add(new WorkerList("Marian", 2400, 1995, 10, 15));
        list.add(new WorkerList("Wojtek", 4000, 1993, 9, 7));
        list.add(new WorkerList("Igor", 6000, 1990, 3, 28));
        list.add(new WorkerList("Daniel", 4000, 1999, 4, 22));

        workerData(list);
    }
}
