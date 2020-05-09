/*
Author: Patryk Klimek
Summary: Class Main for testing other classes
 */
package Zjazd5;

public class Main {

    public static void main(String[] args) {

        MyPoint myPoint = new MyPoint(2, 2);
        MyPoint myPoint1 = new MyPoint(3, 3);

        System.out.println(myPoint.toString());
        System.out.println(myPoint.distance());
        System.out.println(myPoint.distance(4, 5));
        System.out.println(myPoint.distance(myPoint1));

        MyCircle myCircle = new MyCircle(2, 3, 4);

        System.out.println(myCircle.toString());
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());

        MyTriangle myTriangle = new MyTriangle(2, 4, 4, 2, 2, 2);

        System.out.println(myTriangle.toString());
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());

        Customer customer = new Customer(2, "Marian", 20);
        System.out.println(customer.toString());

        Invoice invoice = new Invoice(3, customer, 2000);
        System.out.println(invoice.getCustomerName());
        System.out.println(invoice.getAmountAfterDiscount());

        ChemicalElements chemicalElements1 = new ChemicalElements("Hydrogenium", "H", 1);
        ChemicalElements chemicalElements2 = new ChemicalElements("Oxygenium", "O", 8);
        ChemicalElements chemicalElements3 = new ChemicalElements("Potassium", "K", 19);
        ChemicalElements chemicalElements4 = new ChemicalElements("Zinc", "Z", 30);
        ChemicalElements chemicalElements5 = new ChemicalElements("Gallium", "Ga", 31);

        System.out.println(chemicalElements1.typeMetal());
        System.out.println(chemicalElements2.typeMetal());
        System.out.println(chemicalElements3.typeMetal());
        System.out.println(chemicalElements4.typeMetal());
        System.out.println(chemicalElements5.typeMetal());

        GradesStatistics gradesStatistics = new GradesStatistics();
        gradesStatistics.GradeStatistics();
    }

}
