/*
BMI Calculator
Patryk Klimek
 */
import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {

        System.out.println("Podaj swoja masę w kilogramach:");
        Scanner scanner = new Scanner(System.in);
        double mass = scanner.nextDouble();
        System.out.println("Podaj swój wzrost w metrach:");
        double heigth = scanner.nextDouble();
        double BMI = mass/(heigth*heigth);
        System.out.println("Twoje BMI wynosi " + BMI);
        if (BMI<18.5){
            System.out.println("Masz niedowagę.");
        } else if (BMI<25) {
            System.out.println("Twoja waga jest w normie.");
        } else {
            System.out.println("Masz nadwagę.");
        }
    }

}
