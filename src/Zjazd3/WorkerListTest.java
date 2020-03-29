/*
Author: Patryk Klimek
Summary: Test class for WorkerList class.
 */
package Zjazd3;

import java.util.ArrayList;

import static Zjazd3.WorkerList.workerData;

public class WorkerListTest {

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
